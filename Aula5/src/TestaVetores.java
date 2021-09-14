import java.util.Scanner;

public class TestaVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[] = new int[5];
		Scanner entrada = new Scanner(System.in);
		for(int i = 0; i < c.length; i++) {
			//int count = 0;
			System.out.println("Entre com o "+(i+1)+"o elemento");
			c[i] = entrada.nextInt();
			//count++;
		}
		for(int i = 0; i < c.length; i++) {
			//int count = 0;
			System.out.println(c[i]);
			//count++;
		}
	}

}
