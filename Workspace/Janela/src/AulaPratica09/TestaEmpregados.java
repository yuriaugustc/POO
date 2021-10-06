package AulaPratica09;

//import java.util.Scanner;

public class TestaEmpregados {
    public static void main(String[] args) {
        //Scanner leitor;
        Empregado[] emp = new Empregado[5];
        int aux;
        emp[0] = new Empregado("12345678910", "12/02/1999", 1251);
        emp[1] = new Empregado("67890238798", "23/12/2005", 5389);
        emp[2] = new Empregado("23092032031", "01/01/2001", 2396);
        emp[3] = new Empregado("09876543219", "02/06/1989", 6560);
        emp[4] = new Empregado("02917374212", "27/04/1999", 5120);
        aux = emp[0].compareTo(emp[1]);
        if(aux == -1)
            System.out.println("O empregado de CPF: " + emp[1].getCPF() + " é mais velho do que " + emp[0].getCPF());
        aux = emp[1].compareTo(emp[2]);
        if(aux == -1)
            System.out.println("O empregado de CPF: " + emp[1].getCPF() + " é mais velho do que " + emp[2].getCPF());
        if(aux == -1)
            System.out.println("O empregado de CPF: " + emp[1].getCPF() + " é mais velho do que " + emp[2].getCPF());
        DadosEmpregado empregados = new DadosEmpregado();
        empregados.setEmpregados(emp);
        for (int i = 0; i < 5; i++) {
            System.out.println(empregados.getEmpregados(i));
        }
    }
}