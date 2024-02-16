public class projetoCarro {


        public static void main(String args[]) {
            System.out.println("Bem vindo");
            cliente cliente = new cliente();
            cliente.setNome("Caio");
            System.out.println(cliente.getNome());
            cliente.setCarro("Polo");
            System.out.println(cliente.getCarro());
            cliente.imprimirMarca();



        }
}
