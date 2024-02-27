
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class projeto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes separados por vírgula e marque o gênero com -m (masculino) ou -f (feminino):");
        String input = scanner.nextLine();

        // Dividindo os nomes usando a vírgula como delimitador
        String[] nomes = input.split(",");

        // Criando listas para armazenar os nomes por gênero
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        // Separando os nomes por gênero
        for (String nome : nomes) {
            if (nome.contains("-m")) {
                masculinos.add(nome.replace("-m", "").trim());
            } else if (nome.contains("-f")) {
                femininos.add(nome.replace("-f", "").trim());
            }
        }

        // Ordenando os nomes em ordem alfabética
        masculinos.sort(String::compareTo);
        femininos.sort(String::compareTo);

        // Exibindo os nomes por gênero
        System.out.println("\nNomes masculinos:");
        masculinos.forEach(System.out::println);

        System.out.println("\nNomes femininos:");
        femininos.forEach(System.out::println);
    }
}