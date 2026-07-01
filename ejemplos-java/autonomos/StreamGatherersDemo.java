import java.util.List;
import java.util.stream.Gatherers;

public class StreamGatherersDemo {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        
        System.out.println("Lista original: " + numeros);
        
        // Mapeo por lotes fijos usando Gatherers (ventana fija de tamaño 3)
        // Nota: requiere compilar y ejecutar con --enable-preview si es una característica en vista previa.
        try {
            var resultadoAgrupado = numeros.stream()
                                           .gather(Gatherers.windowFixed(3))
                                           .toList();
            System.out.println("Lista agrupada en ventanas de 3: " + resultadoAgrupado);
        } catch (Throwable e) {
            System.out.println("Error al ejecutar Stream Gatherers: " + e.getMessage());
        }
    }
}
