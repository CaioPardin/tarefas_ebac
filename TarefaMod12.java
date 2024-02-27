import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TarefaMod12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                nomesMasculinos.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
            }
        }

        // Ordenando os nomes em ordem alfabética digitando sair ele ordena
        Collections.sort(nomesMasculinos);
        Collections.sort(nomesFemininos);

        System.out.println("\nNomes masculinos em ordem alfabética:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("\nNomes femininos em ordem alfabética:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }
    }
}
