package AulaPratica09;

import static java.lang.System.*;

public class Empregado implements Comparable {
    private String CPF;
    private String anoNascimento;
    private double salario;

    public Empregado(String CPF, String anoNascimento, double salario) {
        setCPF(CPF);
        setAnoNascimento(anoNascimento);
        setSalario(salario);
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

    public int[] converteString(String ano) {
        int[] data = new int[3];
        int aux = (ano.charAt(0) - 48);
        if(aux == 0)
            data[0] = (ano.charAt(1) - 48);
        else
            data[0] = Integer.parseInt(ano.substring(0, 1));
        aux = (ano.charAt(3) - 48);
        if(aux == 0)
            data[0] = (ano.charAt(4) - 48);
        else
            data[1] = Integer.parseInt(ano.substring(3, 4));
        data[2] = Integer.parseInt(ano.substring(6, 9));
        return data;
    }

    @Override
    public int compareTo(Empregado e1) {
        int[] ano = converteString(this.getAnoNascimento());
        int[] ano1 = converteString(e1.getAnoNascimento());
        if (ano[2] < ano1[2])
            out.println("O empregado de CPF " + this.getCPF() + " eh mais velho que o empregado de CPF " + e1.getCPF());
        else if (ano[2] == ano1[2]) {
            if (ano[1] < ano1[1])
                out.println("O empregado de CPF " + this.getCPF() + " eh mais velho que o empregado de CPF " + e1.getCPF());
            else if(ano1[1] < ano[1])
                out.println("O empregado de CPF " + e1.getCPF() + " eh mais velho que o empregago de CPF " + this.getCPF());
            else if (ano[1] == ano1[1]) {
                if (ano[0] < ano1[0])
                    out.println("O empregado de CPF " + this.getCPF() + " eh mais velho que o empregado de CPF " + e1.getCPF());
                else
                    out.println("O empregado de CPF " + e1.getCPF() + " eh mais velho que o empregado de CPF " + this.getCPF());
            }
        }
        else
            out.println("O empregado de CPF " + e1.getCPF() + " eh mais velho que o empregago de CPF " + this.getCPF());
        return 0;
    }
}