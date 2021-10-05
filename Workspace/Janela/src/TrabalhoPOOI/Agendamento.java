package TrabalhoPOOI;

public class Agendamento {
    private String nomePaciente;
    private String nomeMedico;
    private String dataConsulta;
    private String horaConsulta;
    private Consulta consulta;

    public Agendamento(String nomePaciente, String nomeMedico, String dataConsulta, String horaConsulta){
        setNomePaciente(nomePaciente);
        setNomeMedico(nomeMedico);
        setDataConsulta(dataConsulta);
        setHoraConsulta(horaConsulta);
    }

    public Agendamento(){}

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }
}
