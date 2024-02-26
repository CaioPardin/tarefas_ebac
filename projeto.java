import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class projeto {

    public static void main(String args[]) {
        Cliente();
    }



    private static void Cliente() {


            System.out.println("****** Nomes ******");
            List<String> lista = new ArrayList<String>();
            lista.add("karol");
            lista.add("Antonio");
            lista.add("Maju");
            lista.add("Caio");
            System.out.println("Nomes: " + lista);
            // lista ordenada
            Collections.sort(lista);
            System.out.println("nome em ordem: " + lista);
            System.out.println("");

        }



}
