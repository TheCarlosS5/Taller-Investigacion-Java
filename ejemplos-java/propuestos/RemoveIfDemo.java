import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveIfDemo {
    public static void main(String[] args) {
        // Forma tradicional
        List<Integer> listTrad = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Iterator<Integer> iter = listTrad.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) {
                iter.remove();
            }
        }

        // Forma abreviada
        List<Integer> listAbbr = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        listAbbr.removeIf(n -> n % 2 == 0);

        System.out.println("Tradicional: " + listTrad);
        System.out.println("Abreviado: " + listAbbr);
    }
}
