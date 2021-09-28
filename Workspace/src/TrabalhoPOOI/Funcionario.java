package TrabalhoPOOI;

public class Funcionario extends Pessoa{
    private String data_admissao;
    private int matricula;
    private String cargo;

    public Funcionario(String nome, String data_nascimento, byte sexo, int CPF, int RG, char estado_civil, String rua, int nro, String complemento, String bairro, String cep, String cidade) {
        super(nome, data_nascimento, sexo, CPF, RG, estado_civil, rua, nro, complemento, bairro, cep, cidade);
    }

    public String getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
