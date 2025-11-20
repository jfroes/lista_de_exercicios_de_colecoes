import java.util.HashMap;
import java.util.Map;

public class Ex_14 {
//    Exercicío 14: Use Map.of() para criar um mapa imutável.

    public static void main(String[] args) {
        Map<String, Integer> pessoas = Map.of(
                "José", 29,
                "Rafael", 16,
                "Breno", 32,
                "Orlando", 61
        );
    }
}
