package TrabalhoPOOI;

public class Agendamento {
	private String dataConsulta;
	private String horaConsulta;
	private Paciente paciente;
	private Medico medico;
	private Funcionario funcionario;

	public Agendamento(String nomeP, String data_nascimentoP, String sexoP, String CPFP, String RGP,
			String estado_civilP, String ruaP, int nroP, String complementoP, String bairroP, String cepP,
			String cidadeP, String nomeM, String CRMM, String nomeF, int matriculaF, String dataConsulta,
			String horaConsulta) {
		setPaciente(nomeP, data_nascimentoP, sexoP, CPFP, RGP, estado_civilP, ruaP, nroP, complementoP, bairroP, cepP,
				cidadeP);
		setMedico(nomeM, CRMM);
		setFuncionario(nomeF, matriculaF);
		setDataConsulta(dataConsulta);
		setHoraConsulta(horaConsulta);
	}

	public Agendamento() {
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(String nomePaciente, String data_nascimentoP, String sexoP, String CPFP, String RGP,
			String estado_civilP, String ruaP, int nroP, String complementoP, String bairroP, String cepP,
			String cidadeP) {
		paciente.setNome(nomePaciente);
		paciente.setData_nascimento(data_nascimentoP);
		paciente.setCPF(CPFP);
		paciente.setRG(RGP);
		paciente.setEndereco(ruaP, nroP, complementoP, bairroP, cepP, cidadeP);
		paciente.setEstado_civil(estado_civilP);
		paciente.setSexo(sexoP);
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(String nomeM, String CRMM) {
		medico.setNome(nomeM);
		medico.setCRM(CRMM);
	}

	public void setFuncionario(String nomeF, int matriculaF) {
		funcionario.setNome(nomeF);
		funcionario.setMatricula(matriculaF);
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
