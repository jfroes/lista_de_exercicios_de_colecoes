import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Ex_17 {
//    Exercicío 17: Combine duas listas e remova duplicatas.

    public static void main(String[] args) {
        List<String> nomes1 = new ArrayList<>();
        nomes1.add("José");
        nomes1.add("Maria");
        nomes1.add("Carlos");
        nomes1.add("José");
        nomes1.add("Bruna");

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("José");
        nomes2.add("Claudia");
        nomes2.add("Roberta");
        nomes2.add("Fernanda");
        nomes2.add("Emma");

        nomes1.addAll(nomes2);

        nomes1.forEach(System.out::println);

        Set<String> removeDuplicate = new HashSet<>(nomes1);
        List<String> result = new ArrayList<>(removeDuplicate);
        System.out.println("--------------Remove Duplicados----------------");
        result.forEach(System.out::println);
    }
}
