package TrabalhoPOOI;

import java.io.Serializable;

public class PacienteSemPlano extends PacienteComPlano implements Serializable{
    private int desconto_especial;
    private double valor_ult_consulta;

    public PacienteSemPlano(String nome, String data_nascimento, String sexo, String CPF, String RG, String estado_civil, String rua, int nro, String complemento, String bairro, String cep, String cidade, int desconto_especial, double valor_ult_consulta) {
        super(nome, data_nascimento, sexo, CPF, RG, estado_civil, rua, nro, complemento, bairro, cep, cidade);
        this.setDesconto_especial(desconto_especial);
        this.setValor_ult_consulta(valor_ult_consulta);
    }

    public int getDesconto_especial() {
        return desconto_especial;
    }

    public void setDesconto_especial(int desconto_especial) {
        this.desconto_especial = desconto_especial;
    }

    public double getValor_ult_consulta() {
        return valor_ult_consulta;
    }

    public void setValor_ult_consulta(double valor_ult_consulta) {
        this.valor_ult_consulta = valor_ult_consulta;
    }
}

