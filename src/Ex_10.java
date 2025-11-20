import java.util.HashMap;
import java.util.Map;

public class Ex_10 {
//    Exercicío 10: Itere sobre o mapa exibindo chave e valor.

    public static void main(String[] args) {
        Map<String, Integer> pessoas = new HashMap<>();

        pessoas.put("Jorge", 29);
        pessoas.put("Juliane", 30);
        pessoas.put("Alex", 76);
        pessoas.put("bob", 59);

        pessoas.forEach((nome, idade) -> System.out.println(nome + ": "+ idade));
    }
}
