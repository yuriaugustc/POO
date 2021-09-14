
public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Yuri";
		p1.idade = 25;
		p1.contador = 1;
		System.out.println("Contador:  " + p1.contador);
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Joao";
		p2.idade = 30;
		p2.contador = p2.contador+1;
		System.out.println("Contador:  "+ p2.contador);
		System.out.println("Contador:  "+ p1.contador);
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
		p1.IncIdade();
		System.out.println(p1.idade);
		
		System.out.println(p2.nome);
		System.out.println(p2.idade);

	}

}
