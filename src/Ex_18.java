import java.util.*;


public class Ex_18 {
//    Exercicío 18: Conte a frequência de cada palavra em uma frase (usando Map).

    public static void main(String[] args) {
        String frase = "abobora melancia banana abobora banana laranja abobora pera laranja abobora mirtilo banana goiaba caqui goiaba caqui abobora pera mirtilo banana abacaxi";
        String[] palavras = frase.split(" ");

        Map<String, Integer> frequencia = new HashMap<>();

        for (String palavra : palavras){
            frequencia.put(palavra, frequencia.getOrDefault(palavra, 0) + 1);
        }

        frequencia.entrySet().stream()
                        .sorted((a, b) -> Integer.compare(a.getValue(), b.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }
}
