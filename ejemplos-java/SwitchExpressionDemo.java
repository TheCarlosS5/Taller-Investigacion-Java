public class SwitchExpressionDemo {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.LUNES;

        // Forma tradicional (switch clásico con break)
        String tipoDiaTrad;
        switch (dia) {
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                tipoDiaTrad = "Laboral";
                break;
            case SABADO:
            case DOMINGO:
                tipoDiaTrad = "Fin de semana";
                break;
            default:
                tipoDiaTrad = "Desconocido";
        }

        // Forma abreviada (switch expression con flechas ->)
        String tipoDiaAbbr = switch (dia) {
            case LUNES, MARTES, MIERCOLES, JUEVES, VIERNES -> "Laboral";
            case SABADO, DOMINGO -> "Fin de semana";
        };

        System.out.println("Switch Tradicional: " + tipoDiaTrad);
        System.out.println("Switch Moderno (Expression): " + tipoDiaAbbr);
    }

    enum DiaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }
}
