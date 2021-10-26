package TrabalhoPOOI;

public class Consulta extends Agendamento{
    private String[] medicamentos;
    private String receita;
    private ListaDeExames lista;
    private static int nroConsultas;
    private static int minConsultas;
    private double valorConsulta;

    public Consulta(String nomePaciente, String cpfPaciente, String nomeMedico,
                    String dataConsulta, String horaConsulta, String[] medicamentos,
                    String receita, double valorConsulta) {
        super(nomePaciente, cpfPaciente, nomeMedico, dataConsulta, horaConsulta);
        setMedicamentos(medicamentos);
        setReceita(receita);
        setValorConsulta(valorConsulta);
        setNroConsultas();
    }

    public Consulta(String[] meds, String receita) {
        for(int i = 0; i < meds.length; i++) {
                medicamentos[i] = meds[i];
        }
        this.receita = receita;
        setNroConsultas();
    }

    public void getMedicamentos() {
        for(int i = 0; i < medicamentos.length; i++)
            System.out.println(medicamentos[i] + ", ");
    }
    public String getMedicamentos(int i){
        return medicamentos[i];
    }
    public int Medsize(){
        return medicamentos.length;
    }

    public void setMedicamentos(String[] medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public static void setNroConsultas() {
        nroConsultas += 1;
    }

    public static int getNroConsultas() {
        return nroConsultas;
    }

    public static void setMinConsultas(int minConsultas) {
        Consulta.minConsultas = minConsultas;
    }

    public static int getMinConsultas() {
        return minConsultas;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public static void zeraNroConsultas(){
        nroConsultas = 0;
    }

    public Consulta RealizarConsulta(String nomePaciente, String cpfPaciente, String nomeMedico, String dataConsulta, String horaConsulta, String[] medicamentos, String receita, double valorConsulta){
        return new Consulta(nomePaciente,cpfPaciente,nomeMedico,dataConsulta,horaConsulta,medicamentos,receita,valorConsulta);
    }

    public void mostraDados(){
        System.out.println("Dados da Consulta: ");
        System.out.println("Nome do Paciente: " + this.getNomePaciente());
        System.out.println("CPF do Paciente: " + this.getCpfPaciente());
        System.out.println("Nome do Médico que realizará a Consulta: " + this.getNomeMedico());
        System.out.println("Data da Consulta: " + this.getDataConsulta());
        System.out.println("Hora da Consulta: " + this.getHoraConsulta());
        System.out.println("Medicamentos : "); this.getMedicamentos();
        System.out.println("Receita: " + this.getReceita());
        System.out.println("Valor da Consulta: " + this.getValorConsulta());
    }
}
