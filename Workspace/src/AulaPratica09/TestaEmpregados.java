package AulaPratica09;

import java.util.Scanner;

public class TestaEmpregados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String cpf, nascimento;
        double sal;
        Empregado emp = new Empregado();
        DadosEmpregado empregados = new DadosEmpregado();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o CPF do empregado nro" + (i+1) + ":");
            cpf = leitor.next();
            System.out.println("Digite a data de nascimento do empregado: (utilize barra de separacao : dd/mm/aaaa)");
            nascimento = leitor.next();
            System.out.println("Digite o salario do empregado: ");
            sal = leitor.nextDouble();
            empregados.setEmpregados(cpf,nascimento, sal);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Empregado nro " + (i+1) + ":");
            System.out.println("CPF: " + empregados.getEmpregados(i).getCPF());
            System.out.println("Data de Nascimento: " + empregados.getEmpregados(i).getAnoNascimento());
            System.out.println("Salário: " + empregados.getEmpregados(i).getSalario());
        }
    }
}