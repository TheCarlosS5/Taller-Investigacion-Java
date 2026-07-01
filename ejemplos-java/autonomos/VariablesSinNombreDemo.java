public class VariablesSinNombreDemo {
    public static void main(String[] args) {
        String textoInvalido = "abc";
        
        // Forma tradicional
        try {
            int numero = Integer.parseInt(textoInvalido);
        } catch (NumberFormatException ignorado) {
            System.out.println("Forma tradicional: Error al convertir el numero (ignorado).");
        }

        // Forma con variable sin nombre (Java 22+)
        try {
            int numero = Integer.parseInt(textoInvalido);
        } catch (NumberFormatException _) {
            System.out.println("Forma moderna: Error al convertir el numero (usando _).");
        }
    }
}
