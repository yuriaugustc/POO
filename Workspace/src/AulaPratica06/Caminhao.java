package AulaPratica06;

public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(){

    }
    public Caminhao(String placa, int ano, int eixos){
        setPlaca(placa);
        setAno(ano);
        this.eixos = eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public int getEixos() {
        return eixos;
    }
    public void ExibirDados(){
        super.ExibirDados();
        System.out.println("EIXOS: " + getEixos());
    }
}
