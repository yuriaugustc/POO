package AulaPratica09;

import java.util.ArrayList;

public class DadosEmpregado extends Empregado{
    private ArrayList<Empregado> empregados;

    public DadosEmpregado(String CPF, String anoNascimento, double salario) {
        super(CPF, anoNascimento, salario);
    }

    public DadosEmpregado() {
    }

    public void setEmpregados(Empregado[] emp) {
        for (int i = 0; i < emp.length; i++)
            empregados.add(emp[i]);
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
        for ( Empregado emp : empregados) {
            String aux = emp.getCPF();
            if(aux == cpf){
                System.out.println(emp.getCPF());
                System.out.println(emp.getAnoNascimento());
                System.out.println(emp.getSalario());
                break;
            }
        }
    }

    public void pesquisaSalario(double salario){
        for ( Empregado emp : empregados) {
            double aux = emp.getSalario();
            if(aux > salario){
                System.out.println(emp.getCPF());
                System.out.println(emp.getAnoNascimento());
                System.out.println(emp.getSalario());
            }
        }
    }

}
