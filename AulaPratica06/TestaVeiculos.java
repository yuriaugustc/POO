package AulaPratica06;

public class TestaVeiculos {
    public static void main(String[] args) {
        Onibus v1 = new Onibus("POO123", 2021, 120);
        System.out.println("Dados do onibus: ");
        v1.ExibirDados();
        System.out.println("Dados do caminhao: ");
        Caminhao v2 = new Caminhao("POO321", 2020, 9);
        v2.ExibirDados();
    }
}
