import java.util.HashMap;
import java.util.Map;

public class Ex_13 {
//    Exercicío 13: Verifique se uma chave existe no mapa.

    public static void main(String[] args) {
        Map<String, Integer> pessoas = new HashMap<>();

        pessoas.put("Jorge", 29);
        pessoas.put("Juliane", 30);
        pessoas.put("Alex", 76);
        pessoas.put("bob", 59);

        System.out.println(pessoas.containsKey("Jaime"));

        pessoas.forEach((nome, idade) -> System.out.println(nome + ": "+ idade));
    }
}
