import java.util.HashMap;
import java.util.Map;

public class Ex_11 {
//    Exercicío 11: Atualize o valor de uma chave existente.

    public static void main(String[] args) {
        Map<String, Integer> pessoas = new HashMap<>();

        pessoas.put("Jorge", 29);
        pessoas.put("Juliane", 30);
        pessoas.put("Alex", 76);
        pessoas.put("bob", 59);

        pessoas.replace("bob", 69);

        pessoas.forEach((nome, idade) -> System.out.println(nome + ": "+ idade));
    }
}
