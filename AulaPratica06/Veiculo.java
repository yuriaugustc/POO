package AulaPratica06;

public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo(){
    }
    public Veiculo(String placa, int ano){
        setPlaca(placa);
        setAno(ano);
    }
    public void ExibirDados(){
        System.out.println("PLACA: " + getPlaca());
        System.out.println("ANO: " + getAno());
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setAno(String ano) {
        //this.ano = ano;
    }
}
