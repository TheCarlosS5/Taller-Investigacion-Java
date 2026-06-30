public class OperadorTernarioDemo {
    public static void main(String[] args) {
        int score = 85;

        // Forma tradicional
        String resultTrad;
        if (score >= 70) {
            resultTrad = "Aprobado";
        } else {
            resultTrad = "Reprobado";
        }

        // Forma abreviada
        String resultAbbr = (score >= 70) ? "Aprobado" : "Reprobado";

        System.out.println("Resultado Tradicional: " + resultTrad);
        System.out.println("Resultado Abreviado (Ternario): " + resultAbbr);
    }
}
