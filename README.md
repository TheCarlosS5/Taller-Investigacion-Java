# Taller de Investigación - Métodos Abreviados y Sintaxis Comprimidas en Java

Este repositorio contiene los entregables del taller de investigación sobre la evolución de la sintaxis y características modernas de Java (desde Java 8 hasta Java 22+).

## Contenido del Repositorio

*   [Taller_Investigacion_Java.pdf](Taller_Investigacion_Java.pdf): Informe final en formato PDF redactado en tono de aprendizaje, explicando 20 temas de sintaxis en Java con sus pros, contras, casos de uso y ejemplos comparativos.
*   [Taller_Sintaxis_Java_v2.docx](Taller_Sintaxis_Java_v2.docx): Archivo fuente de Word para revisión de formato.
*   [ejemplos-java/](ejemplos-java/): Carpeta con los códigos fuente funcionales en Java.

## Ejemplos Programados y Explicación

Para este taller se programaron cinco ejemplos prácticos que demuestran el uso de la sintaxis abreviada frente a la tradicional en Java. En el archivo OperadorTernarioDemo.java se implementó una asignación rápida en una línea usando los caracteres ? y : en vez de un bloque if-else completo. En InferenciaVarDemo.java se utilizó var para declarar un mapa de estructura compleja, dejando que el compilador deduzca el tipo de dato y reduciendo el código repetido a la izquierda de la línea. En ExpresionesLambdaDemo.java se simplificó la creación de un hilo usando la flecha -> para pasar la lógica de inmediato sin necesidad de programar una clase anónima entera. En ClaseOptionalDemo.java se envolvió un texto en un contenedor para aplicarle métodos seguros como orElse, lo que evita que el programa falle con excepciones de puntero nulo en caso de recibir valores vacíos. Finalmente, en SwitchExpressionDemo.java se reemplazó el switch antiguo por una expresión de switch con flechas, la cual no necesita la instrucción break para detener el flujo y permite asignar el resultado directamente a una variable.

## Instrucciones para Compilar y Ejecutar

Para compilar y ejecutar los ejemplos, se debe abrir la consola dentro de la carpeta ejemplos-java y correr los siguientes comandos:

Compilar todos los archivos:
```bash
javac *.java
```

Ejecutar cada programa:
- Operador Ternario: `java OperadorTernarioDemo`
- Inferencia con var: `java InferenciaVarDemo`
- Expresiones Lambda: `java ExpresionesLambdaDemo`
- Clase Optional: `java ClaseOptionalDemo`
- Switch Expression: `java SwitchExpressionDemo`
