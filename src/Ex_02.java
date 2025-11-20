import java.util.ArrayList;
import java.util.List;

public class Ex_02 {
//    Exercicío 02: Remova um nome específico da lista.

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("José");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("Fernanda");
        nomes.add("Bruna");

        nomes.remove("Maria");
    }
}
