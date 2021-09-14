package AulaPratica05;

public class Pedido extends Pizza{
    private String CPF;
    private String data;
    private int taxa_servico, total_prato, total_pedido;
    private Pizza[] pratoP = new Pizza[5];
    private Sanduba[] pratoS = new Sanduba[5];
    private int contP = 0, contS = 0;

    public Pedido(String cpf, String data){
        this.CPF = cpf;
        this.data = data;
    }

    public int pedir_pizza(String molho, String recheio, String borda){
        if(contP == 5)
            return -1;
        else
        pratoP[contP] = new Pizza(molho, recheio, borda);
        contP++;
        return 0;
    }
    public int pedir_sanduba(String pao, String carne, String salada){
        if(contS == 5)
            return -1;
        else
        pratoS[contS] = new Sanduba(pao, carne, salada);
        contS++;
        return 0;
    }
    public int getTotal_prato(){
        int aux = getVenda_P();
        int aux2 = getVenda_S();
        int total = (aux * contP)+(aux2 * contS);
        return total;
    }
    public double getTaxa_servico(){
        int taxa_serv = getTotal_prato();
        return taxa_serv * 0.10;
    }
    public double total_pedido(){
        int prato = getTotal_prato();
        double taxa = getTaxa_servico();
        return prato+taxa;
    }
    public int getContP() {
        return contP;
    }
    public int getContS() {
        return contS;
    }
}
