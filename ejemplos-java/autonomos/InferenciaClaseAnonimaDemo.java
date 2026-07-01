public class InferenciaClaseAnonimaDemo {
    public static void main(String[] args) {
        // Usando var para instanciar una clase anónima y conservar sus atributos específicos
        var tuplaCalculo = new Object() {
            double valorConvertido = 450.75;
            long latenciaMs = 120L;
            void imprimirDetalle() {
                System.out.println("Valor: " + valorConvertido + " | Latencia: " + latenciaMs + "ms");
            }
        };

        // Accedemos directamente a los miembros de la clase anónima (con Object esto no compilaría)
        System.out.println("Acceso desde var:");
        System.out.println("Valor: " + tuplaCalculo.valorConvertido);
        tuplaCalculo.imprimirDetalle();
    }
}
