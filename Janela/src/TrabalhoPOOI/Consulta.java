package TrabalhoPOOI;

public class Consulta extends Agendamento{
    private String medicamentos[];
    private String receita;
    private ListaDeExames lista;
    private static int nroConsultas;
    private static int minConsultas;
    private double valorConsulta;

    public Consulta(String nomePaciente, String nomeMedico, String dataConsulta, String horaConsulta, String[] medicamentos, String receita, double valorConsulta) {
        super(nomePaciente, nomeMedico, dataConsulta, horaConsulta);
        setMedicamentos(medicamentos);
        setReceita(receita);
        setValorConsulta(valorConsulta);
        setNroConsultas();
    }

    public Consulta(String[] meds, String receita) {
        for(int i = 0; i < meds.length; i++)
            medicamentos[i] = meds[i];
        this.receita = receita;
        setNroConsultas();
    }

    public String[] getMedicamentos() {
        return medicamentos;
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

    public Consulta RealizarConsulta(String nomePaciente, String nomeMedico, String dataConsulta, String horaConsulta, String[] medicamentos, String receita, double valorConsulta){
        Consulta consulta = new Consulta(nomePaciente,nomeMedico,dataConsulta,horaConsulta,medicamentos,receita,valorConsulta);
        return consulta;
    }
}
