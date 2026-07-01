import java.io.Serializable;

public class CastingInterseccionDemo {
    public static void main(String[] args) {
        // Enviar una lambda que ejecute un Runnable y además sea Serializable
        Object tarea = (Runnable & Serializable) () -> System.out.println("Corriendo tarea serializable!");

        if (tarea instanceof Serializable) {
            System.out.println("La tarea es serializable (implementa Serializable).");
        }
        if (tarea instanceof Runnable) {
            System.out.println("La tarea es ejecutable (implementa Runnable).");
            ((Runnable) tarea).run();
        }
    }
}
