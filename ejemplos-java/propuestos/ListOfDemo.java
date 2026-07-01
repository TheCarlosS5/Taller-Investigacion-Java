import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfDemo {
    public static void main(String[] args) {
        // Forma tradicional
        List<String> diasTrad = new ArrayList<>();
        diasTrad.add("Lunes");
        diasTrad.add("Martes");
        List<String> inmutableTrad = Collections.unmodifiableList(diasTrad);

        // Forma abreviada
        List<String> inmutableAbbr = List.of("Lunes", "Martes");

        System.out.println("Tradicional: " + inmutableTrad);
        System.out.println("Abreviado: " + inmutableAbbr);
    }
}
