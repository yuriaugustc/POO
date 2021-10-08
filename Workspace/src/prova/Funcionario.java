package prova;

public class Funcionario {
    private String CPF;
    private String RG;
    private String matricula;

    public Funcionario(String CPF, String RG, String matricula) {
        this.CPF = CPF;
        this.RG = RG;
        this.matricula = matricula;
    }

    public Funcionario() {
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
