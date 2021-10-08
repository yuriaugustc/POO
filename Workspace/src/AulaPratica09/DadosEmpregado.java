package AulaPratica09;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class DadosEmpregado extends Empregado{
    private ArrayList<Empregado> empregados = new ArrayList<>();

    public DadosEmpregado(String CPF, String anoNascimento, double salario) {
        setEmpregados(CPF, anoNascimento, salario);
    }

    public DadosEmpregado() {
    }

    public void setEmpregados(String CPF, String anoNascimento, double salario) {
            empregados.add(new Empregado(CPF, anoNascimento, salario));
    }

    public Empregado getEmpregados(int i) {
        return empregados.get(i);
    }

    public void removeEmpregados(String cpf){
        for ( Empregado emp : empregados) {
            String aux = emp.getCPF();
            if(aux == cpf){
                empregados.remove(emp);
                break;
            }
        }
    }
    public void pesquisaCPF(String cpf){
        int i;
        for (i = 0; i < empregados.size(); i++) {
            String aux = empregados.get(i).getCPF();
            if(Objects.equals(aux, cpf)){
                System.out.println("CPF: " + empregados.get(i).getCPF());
                System.out.println("Nascimento: " + empregados.get(i).getAnoNascimento());
                System.out.println("Salario: " + empregados.get(i).getSalario());
                break;
            }
        }
    }

    public int pesquisaSalario(double salario){
        int i;
        for (i = 0; i < empregados.size(); i++) {
            double aux = empregados.get(i).getSalario();
            if(aux == salario){
                System.out.println("CPF: " + empregados.get(i).getCPF());
                System.out.println("Nascimento: " + empregados.get(i).getAnoNascimento());
                System.out.println("Salario: " + empregados.get(i).getSalario());
                break;
            }
        }
        return 0;
    }

    public void write(String texto){
        BufferedWriter writer = null;
        try{
            writer = new BufferedWriter(
                        new FileWriter("Text"));
            writer.write(texto);
            writer.flush();
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public int tamanho(){
        return empregados.size();
    }
}
