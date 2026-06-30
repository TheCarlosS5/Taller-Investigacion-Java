import java.util.ArrayList;
import java.util.List;

public class ExpresionesLambdaDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Bogota", "Medellin", "Cali"));

        // Forma tradicional (clase anónima)
        Runnable runnerTrad = new Runnable() {
            @Override
            public void run() {
                System.out.println("Corriendo hilo tradicional (clase anonima)...");
            }
        };

        // Forma abreviada (expresión lambda)
        Runnable runnerAbbr = () -> System.out.println("Corriendo hilo con Lambda...");

        runnerTrad.run();
        runnerAbbr.run();
        
        // Otro ejemplo con foreach
        System.out.println("Imprimiendo ciudades con lambda:");
        names.forEach(name -> System.out.println("Ciudad: " + name));
    }
}
