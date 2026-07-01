public class TextBlocksDemo {
    public static void main(String[] args) {
        // Forma tradicional
        String sqlTrad = "SELECT id, nombre, email\n" +
                         "FROM usuarios\n" +
                         "WHERE activo = 1\n" +
                         "ORDER BY nombre ASC;";

        // Forma abreviada (Text Blocks)
        String sqlAbbr = """
                         SELECT id, nombre, email
                         FROM usuarios
                         WHERE activo = 1
                         ORDER BY nombre ASC;
                         """;

        System.out.println("Tradicional:\n" + sqlTrad);
        System.out.println("Text Block:\n" + sqlAbbr);
    }
}
