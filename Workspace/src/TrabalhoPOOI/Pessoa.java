package TrabalhoPOOI;

public class Pessoa {
    private String nome;
    private String data_nascimento;
    private byte sexo;
    private int CPF;
    private int RG;
    private byte estado_civil;
    private Endereco endereco;

    public Pessoa(String nome, String data_nascimento, byte sexo, int CPF, int RG, char estado_civil, String rua, int nro, String complemento, String bairro, String cep, String cidade) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.CPF = CPF;
        this.RG = RG;
        setEstado_civil(estado_civil);
        setEndereco(rua, nro, complemento, bairro, cep, cidade);
    }

    public void setEndereco(String rua, int nro, String complemento, String bairro, String cep, String cidade) {
        endereco.setRua(rua);
        endereco.setNro(nro);
        endereco.setComplemento(complemento);
        endereco.setBairro(bairro);
        endereco.setCep(cep);
        endereco.setCidade(cidade);
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if(nome.length() > 0) {
            this.nome = nome;
            return true;
        }
        else
            return false;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public boolean setData_nascimento(String data_nascimento) {
        if(data_nascimento.length() > 0) {
            this.data_nascimento = data_nascimento;
            return true;
        }
        else
            return false;
    }

    public byte getSexo() {
        return sexo;
    }

    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public String getEstado_civil() {
        if(estado_civil == 0)
            return "Solteiro";
        else if(estado_civil == 1)
            return "Casado";
        else
            return "Divorciado";
    }

    public void setEstado_civil(char estado_civil) {
        if(estado_civil == 's' || estado_civil == 'S')
            this.estado_civil = 0;
        else if(estado_civil == 'c' || estado_civil == 'C')
            this.estado_civil = 1;
        else
            this.estado_civil = 2;
    }
}
