import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class ManipulationFIle {

	public static void main(String[] args) {
		// Escreve "Olá Mundo" no arquivo fileData.txt
		writeToFile("fileData.txt", "Olá Mundo");

		// Lê o conteúdo do arquivo fileData.txt
		String content = readFromFile("fileData.txt");
		System.out.println("Conteúdo lido do arquivo: " + content);
	}

	private static String readFromFile(String fileName) {
		// Cria um StringBuilder para armazenar o conteúdo do arquivo
		StringBuilder content = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			// loop para ler cada linha do arquivo enquanto for difetente de null
			// e a adiciona ao StringBuilder
			while ((line = reader.readLine()) != null) {
				content.append(line).append("\n");
			}
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
		// Retorna o conteúdo lido do arquivo
		return content.toString();
	}

	// Método para escrever conteúdo em um arquivo
	public static void writeToFile(String fileName, String content) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			writer.write(content);
			System.out.println("Conteúdo escrito no arquivo com sucesso");
		} catch (IOException e) {
			System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
		}
	}
}
