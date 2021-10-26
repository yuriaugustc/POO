package TrabalhoPOOI;

import java.util.ArrayList;

public class Medico extends Funcionario implements Especialidades{
    private ArrayList<PlanoDeSaude> planosAtendidos = new ArrayList<PlanoDeSaude>();
    private String CRM;
    private String nomeEspecialidade;
    private String descricaoEspecialidade;
    private static double SomaConsultaMes = 0;

    public Medico(String nome, String data_nascimento, String sexo, String CPF, String RG, String estado_civil, String rua, int nro, String complemento, String bairro, String cep, String cidade,  String admissao, int matricula, String cargo, double salario, String login, String senha) {
        super(nome, data_nascimento, sexo, CPF, RG, estado_civil, rua, nro, complemento, bairro, cep, cidade, admissao, matricula, cargo, salario, login, senha);
    }

    public Medico(String CPF, PlanoDeSaude[] planoDeSaude){
        setCPF(CPF);
        for(int i = 0; i < planoDeSaude.length; i++)
            planosAtendidos.add(planoDeSaude[i]);
    }

    public Medico(){
    }

    public ArrayList<PlanoDeSaude> getPlanosAtendidos() {
        return planosAtendidos;
    }

    public void setPlanosAtendidos(ArrayList<PlanoDeSaude> planosAtendidos) {
        this.planosAtendidos = planosAtendidos;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public static void acumula_consulta(double valor){
        SomaConsultaMes += valor;
    }

    @Override
    public void CalcularSalario(double sal) {
        super.setSalario((SomaConsultaMes));
    }

    public static void zeraSomaConsulta(){
        SomaConsultaMes = 0;
    }

    @Override
    public void AlteraCargo(String cargo) {
        setCargo("Medico");
    }

    @Override
    public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    @Override
    public void setNomeEspecialidade(String nome){
        this.nomeEspecialidade = nome;
    }

    @Override
    public String getDescricao(){
        return descricaoEspecialidade;
    }

    @Override
    public void setDescricao(String descricao){
        this.descricaoEspecialidade = descricao;
    }
}
