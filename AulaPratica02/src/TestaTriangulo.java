
public class TestaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo t1 = new Triangulo();	
		t1.SetTriangulo(3, 4, 5);
		System.out.println("Triângulo 1: ");
		System.out.println("Lado1: " + t1.GetLado1());
		System.out.println("Lado2: " + t1.GetLado2());
		System.out.println("Lado3: " + t1.GetLado3());
		System.out.println("Perimetro: " + t1.GetPerimetro());
		System.out.println("Tipo: " + t1.devolveTriangulo() + "\n");
		
		Triangulo t2 = new Triangulo();
		t2.SetTriangulo(2, 3, 3);
		System.out.println("Triângulo 2: ");
		System.out.println("Lado1: " + t2.GetLado1());
		System.out.println("Lado2: " + t2.GetLado2());
		System.out.println("Lado3: " + t2.GetLado3());
		System.out.println("Perimetro: " + t2.GetPerimetro());
		System.out.println("Tipo: " + t2.devolveTriangulo() + "\n");
		
		Triangulo t3 = new Triangulo();
		t3.SetTriangulo(3.0, 3.0, 3.0);
		t3.devolveTriangulo();
		System.out.println("Triângulo 3: ");
		System.out.println("Lado1: " + t3.GetLado1());
		System.out.println("Lado2: " + t3.GetLado2());
		System.out.println("Lado3: " + t3.GetLado3());
		System.out.println("Perimetro: " + t3.GetPerimetro());
		System.out.println("Tipo: " + t3.devolveTriangulo() + "\n");
		// não consegui por nada nesse mundo fazer devolver equilatero, receio que seja por
		// ser o tipo double, se bem que o isoceles fez a comparaçaõ certa... 
		// sinceramente, nao sei oq aconteceu kkkk
	}
}
