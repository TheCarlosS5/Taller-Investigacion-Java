import java.util.ArrayList;
import java.util.List;

public class ApiStreamsDemo {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        // Forma tradicional
        List<Integer> doblesTrad = new ArrayList<>();
        for (Integer n : numeros) {
            if (n % 2 == 0) {
                doblesTrad.add(n * 2);
            }
        }

        // Forma abreviada (Streams)
        List<Integer> doblesStreams = numeros.stream()
                                             .filter(n -> n % 2 == 0)
                                             .map(n -> n * 2)
                                             .toList();

        System.out.println("Tradicional: " + doblesTrad);
        System.out.println("Streams: " + doblesStreams);
    }
}
