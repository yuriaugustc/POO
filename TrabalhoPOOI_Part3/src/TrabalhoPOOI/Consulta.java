package TrabalhoPOOI;

import java.io.Serializable;

public class Consulta extends Agendamento implements Serializable {
	private String[] medicamentos;
	private String receita;
	private ListaDeExames lista;
	private static int nroConsultas;
	private static int minConsultas;
	private double valorConsulta;

	public Consulta(String nomeP, String data_nascimentoP, String sexoP, String CPFP, String RGP, String estado_civilP,
			String ruaP, int nroP, String complementoP, String bairroP, String cepP, String cidadeP, String nomeM,
			String CRMM, String nomeF, int matriculaF, String dataConsulta, String horaConsulta) {
		this.setPaciente(nomeP, data_nascimentoP, sexoP, CPFP, RGP, estado_civilP, ruaP, nroP, complementoP, bairroP,
				cepP, cidadeP);
		this.setMedico(nomeM, CRMM);
		this.setFuncionario(nomeF, matriculaF);
		setDataConsulta(dataConsulta);
		setHoraConsulta(horaConsulta);
		setValorConsulta(valorConsulta);
		setNroConsultas();
	}

	public Consulta() {
	};

	public Consulta(String[] meds, String receita) {
		for (int i = 0; i < meds.length; i++) {
			this.medicamentos[i] = meds[i];
		}
		this.receita = receita;
		setNroConsultas();
	}

	public void getMedicamentos() {
		for (int i = 0; i < this.medicamentos.length; i++)
			System.out.println(this.medicamentos[i] + ", ");
	}

	public String getMedicamentos(int i) {
		return this.medicamentos[i];
	}

	public int Medsize() {
		return this.medicamentos.length;
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

	public static void setMinConsultas(int min) {
		minConsultas = min;
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

	public static void zeraNroConsultas() {
		nroConsultas = 0;
	}

	public int RealizarConsulta(String cpf, String hora, String data, double valor, String medicamentos[],
			String receita) {
		setDataConsulta(data);
		setHoraConsulta(hora);
		setMedicamentos(medicamentos);
		setReceita(receita);
		return 0;
	}

	public void mostraDados() {
		System.out.println("Dados da Consulta: ");
		System.out.println("Nome do Paciente: " + this.getPaciente().getNome());
		System.out.println("CPF do Paciente: " + this.getPaciente().getCPF());
		System.out.println("Nome do Medico que realizara a Consulta: " + this.getMedico().getNome());
		System.out.println("Data da Consulta: " + this.getDataConsulta());
		System.out.println("Hora da Consulta: " + this.getHoraConsulta());
		System.out.println("Medicamentos : ");
		this.getMedicamentos();
		System.out.println("Receita: " + this.getReceita());
		System.out.println("Valor da Consulta: " + this.getValorConsulta());
	}
}
