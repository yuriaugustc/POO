package TrabalhoPOOI;

public class PacienteSemPlano extends PacienteComPlano{
    private int desconto_especial;
    private double valor_ult_consulta;

    public PacienteSemPlano(String nome, String data_nascimento, String sexo, int CPF, int RG, char estado_civil, String rua, int nro, String complemento, String bairro, String cep, String cidade) {
        super(nome, data_nascimento, sexo, CPF, RG, estado_civil, rua, nro, complemento, bairro, cep, cidade);
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

