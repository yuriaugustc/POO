package AulaPratica07;

public class TestaFuncionarios implements ImprimeFuncionarios{
    public static void main(String[] args) {
        Funcionario[] vet = new Funcionario[5];
        vet[0] = new Gerente("Josias", "10", 1200);
        vet[1] = new Vendedor("Josué", "100", 1200, 100);
        //vet[2] = new Vendedor("Manoel", "101", 1200, 100);
        vet[2] = new Assistente("José", "1", 1200);
        //vet[4] = new Assistente("João", "2", 1200);

    }

    @Override
    public void mostraDados(Funcionario[] vet) {
        System.out.println("Folha Salarial:");
        System.out.println("Gerente " + vet[0].getNome() + ": " + vet[0].calculaSalario());
        System.out.println("Vendedor " + vet[1].getNome() + ": " + vet[1].calculaSalario());
        System.out.println("Assistente " + vet[2].getNome() + ": " + vet[2].calculaSalario());
    }
}
