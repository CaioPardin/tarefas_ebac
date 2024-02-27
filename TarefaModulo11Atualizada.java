import java.util.Arrays;
import java.util.Scanner;

public class projeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes femininos e masculinos separados por vírgula:");
        String input = scanner.nextLine();

        // Dividindo os nomes usando a vírgula como delimitador
        String[] nomes = input.split(",");

        // Removendo espaços em branco dos nomes
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        // Ordenando os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Exibindo os nomes ordenados
        System.out.println("\nNomes ordenados em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}