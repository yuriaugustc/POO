package TrabalhoPOOI;

public class PacienteComPlano extends Paciente{
    private PlanoDeSaude planoAtivo;
    private int nroCarteirinha;
    private int DataIngresso;
    private Boolean carencia;

    public PacienteComPlano(String nome, String data_nascimento, String sexo, int CPF, int RG, char estado_civil, String rua, int nro, String complemento, String bairro, String cep, String cidade) {
        super(nome, data_nascimento, sexo, CPF, RG, estado_civil, rua, nro, complemento, bairro, cep, cidade);
    }

    public PlanoDeSaude getPlanoAtivo() {
        return planoAtivo;
    }

    public void setPlanoAtivo(PlanoDeSaude planoAtivo) {
        this.planoAtivo = planoAtivo;
    }

    public int getNroCarteirinha() {
        return nroCarteirinha;
    }

    public void setNroCarteirinha(int nroCarteirinha) {
        this.nroCarteirinha = nroCarteirinha;
    }

    public int getDataIngresso() {
        return DataIngresso;
    }

    public void setDataIngresso(int dataIngresso) {
        DataIngresso = dataIngresso;
    }

    public Boolean getCarencia() {
        return carencia;
    }

    public void setCarencia(Boolean carencia) {
        this.carencia = carencia;
    }
}
