import java.util.*;


public class Ex_16 {
//    Exercicío 16: Transforme uma lista em um Set para remover duplicatas.

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("José");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("José");
        nomes.add("Bruna");

        Set<String> removeDuplicate = new HashSet<>(nomes);

        removeDuplicate.forEach(System.out::println);
    }
}
