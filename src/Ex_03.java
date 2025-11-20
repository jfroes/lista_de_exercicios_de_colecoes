import java.util.ArrayList;
import java.util.List;

public class Ex_03 {
//    Exercicío 03: Verifique se um nome está contido na lista.

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("José");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("Fernanda");
        nomes.add("Bruna");

        nomes.contains("Roberto");
    }
}
