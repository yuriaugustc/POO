package AulaPratica09;

import java.util.Scanner;

public class TestaEmpregados {
    public static void main(String[] args) {
        Scanner leitor;
        Empregado[] emp = new Empregado[5];
        emp[0] = new Empregado("12345678910", "12/02/1989", 1251.66);
        emp[1] = new Empregado("67890238798", "23/12/2005", 5389.90);
        emp[2] = new Empregado("23092032031", "01/01/2001", 2396.52);
        emp[3] = new Empregado("09876543219", "02/06/1989", 6560.45);
        emp[4] = new Empregado("02917374212", "27/04/1999", 5120.32);
        emp[0].compareTo(emp[3]);
        emp[4].compareTo(emp[1]);
        DadosEmpregado empregados = new DadosEmpregado(emp);
        for (int i = 0; i < 5; i++) {
            System.out.println(empregados.getEmpregados(i).getCPF());
            System.out.println(empregados.getEmpregados(i).getAnoNascimento());
            System.out.println(empregados.getEmpregados(i).getSalario());
        }
    }
}