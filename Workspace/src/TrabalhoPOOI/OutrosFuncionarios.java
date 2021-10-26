package TrabalhoPOOI;

import java.util.ArrayList;

public abstract class OutrosFuncionarios extends Funcionario{
    private static double gratificacao;

    public OutrosFuncionarios(String nome, String data_nascimento, String sexo, String CPF, String RG, String estado_civil, String rua, int nro, String complemento, String bairro, String cep, String cidade,  String admissao, int matricula, String cargo, double salario, String login, String senha) {
        super(nome, data_nascimento, sexo, CPF, RG, estado_civil, rua, nro, complemento, bairro, cep, cidade, admissao, matricula, cargo, salario, login, senha);
    }

    @Override
    public void CalcularSalario(double salario) {
        int minConsultas = Consulta.getMinConsultas();
        int nroConsultas = Consulta.getNroConsultas();
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
