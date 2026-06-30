import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InferenciaVarDemo {
    public static void main(String[] args) {
        // Forma tradicional
        Map<String, List<String>> mapTrad = new HashMap<String, List<String>>();
        mapTrad.put("ADSO", List.of("Carlos", "Stiven"));

        // Forma abreviada (var)
        var mapAbbr = new HashMap<String, List<String>>();
        mapAbbr.put("ADSO", List.of("Carlos", "Stiven"));

        System.out.println("Mapa Tradicional: " + mapTrad);
        System.out.println("Mapa Abreviado (var): " + mapAbbr);
    }
}
