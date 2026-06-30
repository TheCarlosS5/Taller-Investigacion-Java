# Taller de Investigación - Métodos Abreviados y Sintaxis Comprimidas en Java

¡Hola! Este es mi repositorio para el taller de investigación sobre la evolución de la sintaxis y las cosas modernas que tiene Java (desde Java 8 hasta Java 22+). Aquí subí todo el trabajo que nos pidió el instructor.

## 📂 ¿Qué hay en este repositorio?

*   **[Taller_Investigacion_Java.pdf](Taller_Investigacion_Java.pdf)**: Este es el informe final en PDF. Lo redacté en un tono sencillo de estudiante, explicando 20 temas de sintaxis de Java (15 de la lista y 5 que investigué por mi cuenta), con sus pros, contras y ejemplos.
*   **[Taller_Sintaxis_Java_v2.docx](Taller_Sintaxis_Java_v2.docx)**: El archivo editable de Word por si se necesita revisar el formato original.
*   **[ejemplos-java/](ejemplos-java/)**: Es la carpeta donde programé los ejemplos funcionales para 5 de los temas que investigué. 

---

## 💻 Explicación de los Ejemplos Programados

Para cumplir con el entregable, programé 5 ejemplos sencillos donde comparo cómo se hacía antes el código (la forma larga tradicional) y cómo se hace ahora (la forma abreviada moderna). Esto fue lo que hice en cada uno:

### 1. Operador Ternario (`OperadorTernarioDemo.java`)
*   **¿Qué hace?**: Compara si una nota de examen (85) es suficiente para pasar (mayor o igual a 70).
*   **Cómo ayuda**: En vez de escribir un bloque `if-else` que ocupa como 6 líneas, usé el símbolo `?` y `:` para hacer la pregunta y guardar el resultado ("Aprobado" o "Reprobado") en una sola línea.
*   **Código clave**: `String resultAbbr = (score >= 70) ? "Aprobado" : "Reprobado";`

### 2. Inferencia de tipos con var (`InferenciaVarDemo.java`)
*   **¿Qué hace?**: Crea un mapa para guardar información de la ficha de ADSO.
*   **Cómo ayuda**: Escribir `Map<String, List<String>>` al principio y al final de la línea da mucha pereza y cansa la vista. Usando `var` a la izquierda, Java es lo suficientemente inteligente para adivinar el tipo de datos por el valor de la derecha, haciendo el código mucho más corto y limpio.
*   **Código clave**: `var mapAbbr = new HashMap<String, List<String>>();`

### 3. Expresiones Lambda (`ExpresionesLambdaDemo.java`)
*   **¿Qué hace?**: Crea un hilo secundario (`Runnable`) para imprimir un mensaje en consola.
*   **Cómo ayuda**: Antes tocaba crear una clase anónima entera con un montón de código repetido como `@Override public void run()`. Con las Lambdas, usamos una flechita `->` para pasarle la acción directamente al hilo en una sola línea. También lo probé con un `.forEach` para recorrer una lista de ciudades rápido.
*   **Código clave**: `Runnable runnerAbbr = () -> System.out.println("Corriendo hilo con Lambda...");`

### 4. Clase Optional (`ClaseOptionalDemo.java`)
*   **¿Qué hace?**: Recibe un texto y lo convierte a mayúsculas de forma segura, evitando que falle si el texto llega a ser nulo (vacío).
*   **Cómo ayuda**: Si un dato viene en `null`, los programas de Java normalmente se rompen con un error feo llamado `NullPointerException`. Con `Optional` envolvemos el dato y le decimos: *"si viene vacío, ponle este valor por defecto"*, evitando que el programa se caiga.
*   **Código clave**: `String resAbbr = Optional.ofNullable(baseValue).map(String::toUpperCase).orElse("VACIO");`

### 5. Switch Expression (`SwitchExpressionDemo.java`)
*   **¿Qué hace?**: Recibe un día de la semana y decide si es un día laboral o de fin de semana.
*   **Cómo ayuda**: El switch viejo usa dos puntos (`:`) y requiere poner un `break;` al final de cada caso. Si se te olvida el `break`, el código se sigue derecho y hace cosas raras. La nueva versión usa flechas `->`, no necesita `break`, y permite devolver el valor directamente para guardarlo en una variable de una vez.
*   **Código clave**: `String tipoDiaAbbr = switch (dia) { case LUNES, MARTES, MIERCOLES, JUEVES, VIERNES -> "Laboral"; case SABADO, DOMINGO -> "Fin de semana"; };`

---

## 🛠️ Cómo compilar y probar los códigos

Para probar que todo funciona bien, abre la consola (PowerShell o CMD) dentro de la carpeta `ejemplos-java` y corre estos comandos:

1. **Compilar todos los archivos:**
   ```bash
   javac *.java
   ```
2. **Ejecutar el ejemplo que quieras ver:**
   - Para el ternario: `java OperadorTernarioDemo`
   - Para var: `java InferenciaVarDemo`
   - Para lambdas: `java ExpresionesLambdaDemo`
   - Para Optional: `java ClaseOptionalDemo`
   - Para el switch: `java SwitchExpressionDemo`
