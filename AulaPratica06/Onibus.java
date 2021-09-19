package AulaPratica06;

public class Onibus extends Veiculo{
    private int assentos;

    public Onibus(){
    }
    public Onibus(String placa, int ano, int assentos){
        super(placa, ano);
        setAssentos(assentos);
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getAssentos() {
        return assentos;
    }
    public void ExibirDados(){
        super.ExibirDados();
        System.out.println("ASSENTOS: " + getAssentos());
    }
}
