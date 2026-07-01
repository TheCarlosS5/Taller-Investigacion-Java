import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> ciudades = List.of("Bogota", "Medellin", "Cali");

        // Forma tradicional
        System.out.println("Tradicional:");
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println(ciudades.get(i));
        }

        // Forma abreviada
        System.out.println("Abreviado (For-each):");
        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }
    }
}
