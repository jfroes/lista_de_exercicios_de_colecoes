import java.util.HashMap;
import java.util.Map;

public class Ex_12 {
//    Exercicío 12: Remova um elemento do mapa.

    public static void main(String[] args) {
        Map<String, Integer> pessoas = new HashMap<>();

        pessoas.put("Jorge", 29);
        pessoas.put("Juliane", 30);
        pessoas.put("Alex", 76);
        pessoas.put("bob", 59);

        pessoas.remove("Alex");

        pessoas.forEach((nome, idade) -> System.out.println(nome + ": "+ idade));
    }
}
