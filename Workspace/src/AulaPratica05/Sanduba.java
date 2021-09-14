package AulaPratica05;

public class Sanduba{
    private String pao, carne, salada;
    private int custo = 15;
    private int venda = 30;
    private String tempo = "30";

    public Sanduba(String pao, String carne, String salada){
        this.pao = pao;
        this.carne = carne;
        this.salada = salada;
    }
    public Sanduba(){
    }
    public int getVenda_S() {
        return venda;
    }
    public int getCusto_S() {
        return custo;
    }
    public String getTempo_S() {
        return tempo;
    }
    public String getPao() {
        return pao;
    }
    public String getCarne() {
        return carne;
    }
    public String getSalada() {
        return salada;
    }
}
