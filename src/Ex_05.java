import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex_05 {
//    Exercicío 05: Inverta a ordem dos elementos.

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("José");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("Fernanda");
        nomes.add("Bruna");

        Collections.sort(nomes, Collections.reverseOrder());

        nomes.forEach(System.out::println);
    }
}
