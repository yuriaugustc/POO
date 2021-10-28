package TrabalhoPOOI;

public class Agendamento {
    private String nomePaciente;
    private String cpfPaciente;
    private String nomeMedico;
    private String dataConsulta;
    private String horaConsulta;
    private Consulta consulta;

    public Agendamento(String nomePaciente, String cpfPaciente, String nomeMedico, String dataConsulta, String horaConsulta){
        setNomePaciente(nomePaciente);
        setCpfPaciente(cpfPaciente);
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

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public int setCpfPaciente(String cpfPaciente) {
        if(ValidaCPF.isCPF(cpfPaciente)) {
            this.cpfPaciente = cpfPaciente;
            return 0;
        }else
            return -1;
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

    public void getConsulta() {
        consulta.mostraDados();
    }

    public void setConsulta(String nomePaciente, String cpfPaciente, String nomeMedico, String dataConsulta, String horaConsulta, String[] medicamentos, String receita, double valorConsulta){
        this.consulta = new Consulta(nomePaciente, cpfPaciente, nomeMedico, dataConsulta, horaConsulta, medicamentos, receita, valorConsulta);
    }
}
