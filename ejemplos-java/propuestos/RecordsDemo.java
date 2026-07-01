public class RecordsDemo {
    public static void main(String[] args) {
        // Forma tradicional (objeto POJO inmutable clásico)
        PuntoTradicional p1 = new PuntoTradicional(10, 20);
        
        // Forma abreviada (Record)
        PuntoRecord p2 = new PuntoRecord(10, 20);

        System.out.println("Tradicional: x=" + p1.getX() + ", y=" + p1.getY());
        System.out.println("Record: " + p2);
    }

    // Clase tradicional
    static class PuntoTradicional {
        private final int x;
        private final int y;
        public PuntoTradicional(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() { return x; }
        public int getY() { return y; }
    }

    // Record abreviado (Java 16+)
    record PuntoRecord(int x, int y) {}
}
