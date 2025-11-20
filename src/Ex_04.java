import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex_04 {
//    Exercicío 04: Ordene uma lista de strings alfabeticamente.

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("José");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("Fernanda");
        nomes.add("Bruna");

        Collections.sort(nomes);

        nomes.forEach(System.out::println);
    }
}
