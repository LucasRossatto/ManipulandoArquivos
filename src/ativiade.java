import java.util.Scanner;

public class ativiade {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número para criar a tabuada");
		int numero = sc.nextInt();
		
		System.out.println("Sua tabuada será do numero: " + numero + " Até qual número?");
		int multiplicador = sc.nextInt();
		
		  System.out.println("--------------------");
		  System.out.println("---Tabudada do "+numero+"---");
		  System.out.println("--------------------");
		for (int i = numero; i <= multiplicador; i++) {

			  System.out.println(numero * i);
			}
		
		
	}
	
}
