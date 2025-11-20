import java.util.HashMap;
import java.util.Map;


public class Ex_19 {
//    Exercicío 19: Crie um Map e ordene por valor (usando stream() + sorted).

    public static void main(String[] args) {
        Map<String, Integer> stacks = new HashMap<>();

        stacks.put("Java", 30);
        stacks.put("Javascript", 28);
        stacks.put("Python", 23);

        stacks.entrySet()
              .stream()
              .sorted((a, b) -> Integer.compare(a.getValue(), b.getValue()))
              .forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));

    }
}
