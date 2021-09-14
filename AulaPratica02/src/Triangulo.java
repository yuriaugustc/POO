
public class Triangulo {
	private double Lado1;
	private double Lado2;
	private double Lado3;
	private double Perimetro;
	private String Triangulo;

	public void SetTriangulo(double l1,double l2,double l3){
		if(l1 < 0)
			Lado1 = 0;
		else
			Lado1 = l1;
		if(l2 < 0)
			Lado2 = 0;
		else
			Lado2 = l2;
		if(l3 < 0)
			Lado3 = 0;
		else
			Lado3 = l3;
	}
	public double GetLado1(){
		return Lado1;
	}
	public double GetLado2(){
		return Lado2;
	}
	public double GetLado3(){
		return Lado3;
	}
	public double GetPerimetro(){
		Perimetro = Lado1+Lado2+Lado3;
		return Perimetro;
	}
	public String devolveTriangulo() {
		if((Lado1==Lado2) && (Lado2==Lado3))
			Triangulo = "Equilatero";
		if((Lado1==Lado2 && Lado2 != Lado3) || (Lado1==Lado3 && Lado1 != Lado3) || (Lado1 != Lado2) && (Lado2 == Lado3))
			Triangulo = "Isoceles";
		else
			Triangulo = "Escaleno";
		return Triangulo;
	}
}