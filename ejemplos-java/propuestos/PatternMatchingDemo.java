public class PatternMatchingDemo {
    public static void main(String[] args) {
        Object obj = 42.5;

        // Forma tradicional
        if (obj instanceof Double) {
            Double val = (Double) obj;
            System.out.println("Tradicional: " + val.doubleValue());
        }

        // Forma abreviada (Pattern Matching instanceof)
        if (obj instanceof Double val) {
            System.out.println("Abreviado: " + val.doubleValue());
        }
    }
}
