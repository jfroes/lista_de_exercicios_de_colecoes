import java.util.ArrayList;
import java.util.List;


public class Ex_15 {
//    Exercicío 15: Crie uma lista de números e remova todos os pares.

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        for(int i = 1; i <= 20; i++){
            numeros.add(i);
        }

        numeros.stream().filter(numero -> numero % 2 != 0).forEach(System.out::println);
    }
}
