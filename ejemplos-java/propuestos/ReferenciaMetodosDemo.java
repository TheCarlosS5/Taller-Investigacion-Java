import java.util.List;

public class ReferenciaMetodosDemo {
    public static void main(String[] args) {
        List<String> marcas = List.of("Intel", "AMD", "Nvidia");

        // Forma tradicional (lambda explícita)
        System.out.println("Lambda tradicional:");
        marcas.forEach(marca -> System.out.println(marca));

        // Forma abreviada (referencia a método)
        System.out.println("Referencia a metodo:");
        marcas.forEach(System.out::println);
    }
}
