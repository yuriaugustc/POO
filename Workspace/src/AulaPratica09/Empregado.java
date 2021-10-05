package AulaPratica09;

/*public class Empregado implements Comparable<Empregado>{
    private String CPF;
    private String anoNascimento = "00/00/0000";
    private double salario;

    public Empregado(String CPF, String anoNascimento, double salario) {
        this.CPF = CPF;
        this.anoNascimento = anoNascimento;
        this.salario = salario;
    }

    public Empregado() {
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(String anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int[] converteString(String ano){
        int[] data = new int[3];
        data[0] = Integer.parseInt(ano.substring(0,1));
        data[1] = Integer.parseInt(ano.substring(3,4));
        data[2] = Integer.parseInt(ano.substring(6,9));
        return data;
    }

    @Override
    public int compareTo(Empregado e1) {
        int ano[] = converteString(this.anoNascimento);
        int ano1[] = converteString(e1.anoNascimento);
        if(ano[2] > ano1[2])
            if(ano[1] > ano1[1])
                if(ano[0] > ano[0])
                    return 1;
        return 0;
    }
}*/
