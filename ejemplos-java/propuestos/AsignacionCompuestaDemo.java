public class AsignacionCompuestaDemo {
    public static void main(String[] args) {
        // Forma tradicional
        short balanceTrad = 100;
        balanceTrad = (short) (balanceTrad + 50);

        // Forma abreviada
        short balanceAbbr = 100;
        balanceAbbr += 50;

        System.out.println("Tradicional: " + balanceTrad);
        System.out.println("Abreviado: " + balanceAbbr);
    }
}
