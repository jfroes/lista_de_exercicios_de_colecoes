import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex_08 {
//    Exercicío 08: Crie um TreeSet para ordenar automaticamente.

    public static void main(String[] args) {
        Set<String> nomes = new TreeSet<>();



        nomes.add("José");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("José");
        nomes.add("Bruna");

        nomes.forEach(System.out::println);
    }
}
