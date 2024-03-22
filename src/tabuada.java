import java.util.Scanner; // Importa a classe Scanner do pacote java.util para entrada de dados
import java.io.FileReader; // Importa a classe FileReader do pacote java.io para leitura de arquivos
import java.io.FileWriter; // Importa a classe FileWriter do pacote java.io para escrita em arquivos
import java.io.BufferedReader; // Importa a classe BufferedReader do pacote java.io para leitura eficiente de arquivos
import java.io.BufferedWriter; // Importa a classe BufferedWriter do pacote java.io para escrita eficiente em arquivos
import java.io.IOException; // Importa a classe IOException do pacote java.io para lidar com exceções de entrada/saída

public class tabuada {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número para criar a tabuada"); 
        int numero = sc.nextInt(); 
        
        System.out.println("Sua tabuada será do numero: " + numero + " Até qual número?"); 
        int multiplicador = sc.nextInt(); 
        
        // Cria um objeto StringBuilder para armazenar a tabuada
        StringBuilder strB = new StringBuilder(); 
        
        for (int i = 1; i <= multiplicador; i++) { // Loop para calcular a tabuada
            int resultado = numero * i; // Calcula o resultado da multiplicação
            strB.append(numero).append(" x ").append(i).append(" = ").append(resultado).append("\n"); // Adiciona a linha da tabuada ao StringBuilder
        }
        
        writeToFile("tabuada.txt", strB.toString()); // Chama o método para escrever a tabuada em um arquivo
        
        String content = readFromFile("tabuada.txt"); // Chama o método para ler o conteúdo do arquivo
        System.out.println("Conteúdo lido do arquivo: "); // Exibe uma mensagem indicando que o conteúdo do arquivo será exibido
        System.out.println(content); // Exibe o conteúdo lido do arquivo
    }

    public static void writeToFile(String fileName, String content) { // Método para escrever em um arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) { // Abre o arquivo para escrita
            writer.write(content); // Escreve o conteúdo no arquivo
            System.out.println("Conteúdo escrito no arquivo com sucesso"); // Exibe uma mensagem indicando que a operação foi bem-sucedida
        } catch (IOException e) { // Captura exceções de entrada/saída
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage()); // Exibe uma mensagem de erro caso ocorra uma exceção
        }
    }

    private static String readFromFile(String fileName) { // Método para ler de um arquivo
        StringBuilder content = new StringBuilder(); // Cria um objeto StringBuilder para armazenar o conteúdo do arquivo
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) { // Abre o arquivo para leitura
            String line; // Declara uma variável para armazenar cada linha lida do arquivo
            while ((line = reader.readLine()) != null) { // Lê cada linha do arquivo até o final
                content.append(line).append("\n"); // Adiciona a linha lida ao StringBuilder
            }
        } catch (IOException e) { // Captura exceções de entrada/sa

			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
		return content.toString();
	}
}

