package TrabalhoPOOI;

import java.util.Locale;

public class Pessoa {
    private String nome;
    private String data_nascimento;
    private String sexo;
    private String CPF;
    private String RG;
    private byte estado_civil;
    private Endereco endereco;

    public Pessoa(String nome, String data_nascimento, String sexo, String CPF, String RG, String estado_civil, String rua, int nro, String complemento, String bairro, String cep, String cidade) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        if(ValidaCPF.isCPF(CPF))
            this.CPF = CPF;
        this.RG = RG;
        setEstado_civil(estado_civil);
        setEndereco(rua, nro, complemento, bairro, cep, cidade);
    }

    public Pessoa(){}

    public void setEndereco(String rua, int nro, String complemento, String bairro, String cep, String cidade) {
        endereco.setRua(rua);
        endereco.setNro(nro);
        endereco.setComplemento(complemento);
        endereco.setBairro(bairro);
        endereco.setCep(cep);
        endereco.setCidade(cidade);
    }

    public void mostraDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nascimento: " + this.getData_nascimento());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("CPF: " + this.getCPF());
        System.out.println("RG: " + this.getRG());
        System.out.println("Estado Civil: " + this.getEstado_civil());
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("--------------------------------------------------");
    }

    public String getEndereco(){
        return endereco.getEndereco();
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public int setCPF(String CPF) {
        if(ValidaCPF.isCPF(CPF)){
            this.CPF = CPF;
            return 0;
        }
        else
            return -1;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
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

    public void setEstado_civil(String estado_civil) {
        estado_civil = estado_civil.toLowerCase();
        if(estado_civil.equals("solteiro"))
            this.estado_civil = 0;
        else if(estado_civil.equals("casado"))
            this.estado_civil = 1;
        else if(estado_civil.equals("divorciado"))
            this.estado_civil = 2;
    }
}
