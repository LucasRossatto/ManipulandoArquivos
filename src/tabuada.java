import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número para criar a tabuada");
		int numero = sc.nextInt();

		System.out.println("Sua tabuada será do numero: " + numero + " Até qual número?");
		int multiplicador = sc.nextInt();

		StringBuilder strB = new StringBuilder();
		for (int i = 1; i <= multiplicador; i++) {
			int resultado = numero * i;
			strB.append(numero).append(" x ").append(i).append(" = ").append(resultado).append("\n");
		}

		writeToFile("tabuada.txt", strB.toString());

		String content = readFromFile("tabuada.txt");
		System.out.println("Conteúdo lido do arquivo: ");
		System.out.println(content);
	}

	public static void writeToFile(String fileName, String content) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			writer.write(content);
			System.out.println("Conteúdo escrito no arquivo com sucesso");
		} catch (IOException e) {
			System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
		}
	}

	private static String readFromFile(String fileName) {
		StringBuilder content = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				content.append(line).append("\n");
			}
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
		return content.toString();
	}
}

