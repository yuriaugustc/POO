package TrabalhoPOOI;

public class OutrosFuncionarios extends Medico{
    private static double gratificacao;
    private Consulta consulta;

    public OutrosFuncionarios(String nome, String data_nascimento, String sexo, int CPF, int RG, char estado_civil, String rua, int nro, String complemento, String bairro, String cep, String cidade,  String admissao, int matricula, String cargo, double salario, String login, String senha) {
        super(nome, data_nascimento, sexo, CPF, RG, estado_civil, rua, nro, complemento, bairro, cep, cidade, admissao, matricula, cargo, salario, login, senha);
    }

    @Override
    public void CalcularSalario(double salario) {
        int minConsultas = consulta.getMinConsultas();
        int nroConsultas = consulta.getNroConsultas();
        if(nroConsultas >= minConsultas)
            super.setSalario(salario*gratificacao);
        else
            super.setSalario(salario);
    }

    public static double getGratificacao() {
        return gratificacao;
    }

    public static void setGratificacao(double gratificacao) {
        OutrosFuncionarios.gratificacao = gratificacao;
    }
}
