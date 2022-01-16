package TrabalhoPOOI;

import java.io.Serializable;

public class Paciente extends Pessoa implements Serializable {
	private String data_cadastro;
	private String ultima_consulta;

	public Paciente(String nome, String data_nascimento, String sexo, String CPF, String RG, String estado_civil,
			String rua, int nro, String complemento, String bairro, String cep, String cidade) {
		super(nome, data_nascimento, sexo, CPF, RG, estado_civil, rua, nro, complemento, bairro, cep, cidade);
	}

	public Paciente() {
	}

	public String getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public String getUltima_consulta() {
		return ultima_consulta;
	}

	public void setUltima_consulta(String ultima_consulta) {
		this.ultima_consulta = ultima_consulta;
	}
}
