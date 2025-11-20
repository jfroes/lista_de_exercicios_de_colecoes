import java.util.*;

public class Ex_07 {
//    Exercicío 07: Crie um HashSet e adicione nomes repetidos (observe o resultado).

    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();



        nomes.add("José");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("José");
        nomes.add("Bruna");

        nomes.forEach(System.out::println);
    }
}
