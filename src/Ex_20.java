import java.util.HashMap;
import java.util.Map;


public class Ex_20 {
//    Exercicío 20: Simule um ranking (Map de jogador → pontuação).

    public static void main(String[] args) {
        Map<String, Integer> raking = new HashMap<>();

        raking.put("Juliane", 1178);
        raking.put("José", 1200);
        raking.put("Kel", 1055);

        raking.entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " pontos"));


    }
}
