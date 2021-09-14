package AulaPratica05;

public class Pizza {
    private String molho, recheio, borda;
    private float custo;
    private float venda;
    private String tempo;

    public int pede_pizza(String molho, String recheio, String borda) {
        this.molho = molho;
        this.recheio = recheio;
        this.borda = borda;
        return 1;
    }
}
