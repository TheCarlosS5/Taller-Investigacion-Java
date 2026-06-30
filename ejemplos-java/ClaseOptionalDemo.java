import java.util.Optional;

public class ClaseOptionalDemo {
    public static void main(String[] args) {
        String baseValue = "hola mundo";

        // Forma tradicional (verificación de nulidad)
        String resTrad;
        if (baseValue != null) {
            resTrad = baseValue.toUpperCase();
        } else {
            resTrad = "VACIO";
        }

        // Forma abreviada (Optional)
        String resAbbr = Optional.ofNullable(baseValue)
                                 .map(String::toUpperCase)
                                 .orElse("VACIO");

        System.out.println("Resultado Tradicional (null-check): " + resTrad);
        System.out.println("Resultado Abreviado (Optional): " + resAbbr);
    }
}
