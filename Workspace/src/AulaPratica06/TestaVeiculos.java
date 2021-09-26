package AulaPratica06;

public class TestaVeiculos {
    public static void main(String[] args) {
        Veiculo[] vet = new Veiculo[2];
        vet[0] = new Onibus("POO123", 2021, 120);
        vet[1] = new Caminhao("POO321", 2020, 9);
        System.out.println("Dados do Onibus: ");
        vet[0].ExibirDados();
        System.out.println("Dados do Caminhao: ");
        vet[1].ExibirDados();
    }
}
