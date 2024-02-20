public class CalculoMedia {

    public static void main(String args[]) {

        calculoMedia();
}

    private static void calculoMedia() {
        // Se a Média final do aluno for Maior ou igual a 7 o aluno esta aprovado.
        int MediaNecessaria = 7;
        System.out.println("Media para Aprovacao:" + MediaNecessaria);
        int Media1 = 9;
        System.out.println("Media primeiro semestre:" + Media1);
        int Media2 = 8;
        System.out.println("Media segundo semestre:" + Media2);
        int Media3 = 4;
        System.out.println("Media terceiro semestre:" + Media3);
        int Media4 = 10;
        System.out.println("Media quarto semestre:" + Media4);

        // Total das medias
        int MediaFinal = Media1 + Media2 + Media3 + Media4;
        System.out.println("total:" + MediaFinal);

        // Sua Média anual é
        int Resultado = MediaFinal /4;
        System.out.println("Sua média Final é:" + Resultado);

        // Se o Resultado final
        boolean Aprovacao = Resultado >= MediaNecessaria;
        System.out.println("Parabéns você foi APROVADO!");



    }
    }
