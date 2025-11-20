import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ex_06 {
//    Exercicío 06: Crie uma LinkedList e compare performance com ArrayList.

    public static void main(String[] args) {
        List<String> nomesArrayList = new ArrayList<>();
        List<String> nomesLinkedList = new LinkedList<>();

        long tempoInicialAddArrayList = System.nanoTime();
        nomesArrayList.add("José");
        nomesArrayList.add("Maria");
        nomesArrayList.add("Carlos");
        nomesArrayList.add("Fernanda");
        nomesArrayList.add("Bruna");
        long tempofinalAddArrayList = System.nanoTime();


        long tempoInicialAddLinkedList = System.nanoTime();
        nomesLinkedList.add("José");
        nomesLinkedList.add("Maria");
        nomesLinkedList.add("Carlos");
        nomesLinkedList.add("Fernanda");
        nomesLinkedList.add("Bruna");
        long tempoFinalAddLinkedList = System.nanoTime();

        long tempoInicialLerArrayList = System.nanoTime();
        nomesArrayList.forEach(System.out::println);
        long tempoFinalalLerArrayList = System.nanoTime();

        long tempoInicialLerLinkedList = System.nanoTime();
        nomesLinkedList.forEach(System.out::println);
        long tempoFinalLerLinkedList = System.nanoTime();

        long tempoDecorridoAddArrayList =  tempofinalAddArrayList - tempoInicialAddArrayList;
        long tempoDecorridoAddLinkedList = tempoFinalAddLinkedList - tempoInicialAddLinkedList;
        long tempoDecorridoLerArrayList = tempoInicialLerArrayList - tempoFinalalLerArrayList;
        long tempoDecorridoLerLinkedList = tempoInicialLerLinkedList - tempoFinalLerLinkedList;


        System.out.println("Tempo para adicionar elementos no ArrayList: " + tempoDecorridoAddArrayList);
        System.out.println("Tempo para adicionar elementos no LinkedList: "+ tempoDecorridoAddLinkedList);
        System.out.println("Tempo para ler os elementos do ArrayList: " + tempoDecorridoLerArrayList);
        System.out.println("Tempo para ler os elementos do LinkedList: " + tempoDecorridoLerLinkedList);
    }
}
