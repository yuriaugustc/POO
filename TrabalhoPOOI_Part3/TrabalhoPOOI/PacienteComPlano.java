package TrabalhoPOOI;

import java.io.Serializable;

public class PacienteComPlano extends Paciente implements Serializable {
	private PlanoDeSaude planoAtivo;
	private int nroCarteirinha;
	private int DataIngresso;
	private Boolean carencia;

	public PacienteComPlano(String nome, String data_nascimento, String sexo, String CPF, String RG,
			String estado_civil, String rua, int nro, String complemento, String bairro, String cep, String cidade) {
		super(nome, data_nascimento, sexo, CPF, RG, estado_civil, rua, nro, complemento, bairro, cep, cidade);
	}

	public PacienteComPlano(String nome, String data_nascimento, String sexo, String CPF, String RG,
			String estado_civil, String rua, int nro, String complemento, String bairro, String cep, String cidade,
			String nomePlano, String cnpj, String ruaP, int nroP, String complementoP, String bairroP, String cepP,
			String cidadeP) {
		super(nome, data_nascimento, sexo, CPF, RG, estado_civil, rua, nro, complemento, bairro, cep, cidade);
		setPlanoAtivo(nomePlano, cnpj, ruaP, nroP, complementoP, bairroP, cepP, cidadeP);
	}

	public PacienteComPlano() {
	}

	public PlanoDeSaude getPlano() {
		return planoAtivo;
	}
	
	public String getPlanoAtivo() {
		return "\nNome: " + planoAtivo.getNome() + "\nCNPJ: " + planoAtivo.getCNPJ() + "\nEndereco: "
				+ planoAtivo.getEndereco();
	}

	public void setPlanoAtivo(String nomePlano, String cnpj, String ruaP, int nroP, String complementoP, String bairroP,
			String cepP, String cidadeP) {
		planoAtivo.setNomePlano(nomePlano);
		planoAtivo.setCNPJ(cnpj);
		planoAtivo.setEndereco(ruaP, nroP, complementoP, bairroP, cepP, cidadeP);
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
