package AulaPratica05;

public class Pizza extends Sanduba{
    private String molho, recheio, borda;
    private int custo = 30;
    private int venda = 60;
    private String tempo = "70";

    public Pizza(String molho, String recheio, String borda) {
        this.molho = molho;
        this.recheio = recheio;
        this.borda = borda;
    }
    public Pizza(){
    }
    public int getCusto_P() {
        return custo;
    }
    public int getVenda_P() {
        return venda;
    }
    public String getTempo_P() {
        return tempo;
    }
    public String getMolho() {
        return molho;
    }
    public String getRecheio() {
        return recheio;
    }
    public String getBorda() {
        return borda;
    }
}
