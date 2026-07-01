public class LabeledBreakDemo {
    public static void main(String[] args) {
        boolean mantenimientoActivo = true;

        System.out.println("Inicio del proceso:");

        // Un bloque etiquetado arbitrario try-finally
        bloqueProceso: try {
            System.out.println("  Paso 1: Abriendo conexion transaccional...");
            
            if (mantenimientoActivo) {
                System.out.println("  Paso 2: Mantenimiento detectado. Abortando bloque...");
                break bloqueProceso; // Aborta y salta fuera del bloque etiquetado
            }

            System.out.println("  Paso 3: Esta linea no se ejecuta si hay mantenimiento.");
        } finally {
            System.out.println("  Bloque Finally: Garantizando el cierre de conexiones (siempre se ejecuta).");
        }

        System.out.println("Fin del proceso, fuera del bloque.");
    }
}
