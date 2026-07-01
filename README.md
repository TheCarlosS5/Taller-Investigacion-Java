# Taller de Investigación - Métodos Abreviados y Sintaxis Comprimidas en Java

Este repositorio contiene los entregables del taller de investigación sobre la evolución de la sintaxis y características modernas de Java (desde Java 8 hasta Java 22+).

## Contenido del Repositorio

*   [Taller_Investigacion_Java.pdf](Taller_Investigacion_Java.pdf): Informe final en formato PDF redactado en tono de aprendizaje, explicando 20 temas de sintaxis en Java con sus pros, contras, casos de uso y ejemplos comparativos.
*   [Taller_Sintaxis_Java_v2.docx](Taller_Sintaxis_Java_v2.docx): Archivo fuente de Word para revisión de formato.
*   [ejemplos-java/propuestos/](ejemplos-java/propuestos/): Carpeta con los 5 ejemplos de código del listado propuesto por el instructor.
*   [ejemplos-java/autonomos/](ejemplos-java/autonomos/): Carpeta con los 5 ejemplos de las características avanzadas investigadas de forma autónoma.

## Ejemplos Programados y Explicación

Para este taller se programaron diez ejemplos prácticos organizados en dos carpetas según su origen. En los ejemplos propuestos, el archivo OperadorTernarioDemo.java muestra una asignación rápida usando ? y : en vez de if-else; InferenciaVarDemo.java simplifica la declaración de colecciones complejas usando var; ExpresionesLambdaDemo.java implementa un hilo secundario sin clases anónimas usando la flecha ->; ClaseOptionalDemo.java evita caídas por valores nulos usando envoltorios seguros con orElse; y SwitchExpressionDemo.java elimina el uso de break implementando asignación directa mediante flechas. En cuanto a los ejemplos autónomos investigados por cuenta propia, VariablesSinNombreDemo.java utiliza el guion bajo _ para descartar parámetros y excepciones obligatorios pero inútiles; CastingInterseccionDemo.java combina interfaces funcionales y serializables usando & para transmisión de lambdas por red; InferenciaClaseAnonimaDemo.java permite acceder a miembros específicos de clases anónimas locales declarándolas con var; StreamGatherersDemo.java realiza agrupaciones por bloques en streams mediante operaciones personalizadas; y LabeledBreakDemo.java realiza saltos estructurados para abortar bloques try-finally garantizando la ejecución de su bloque de limpieza sin usar excepciones costosas.

## Instrucciones para Compilar y Ejecutar

Para compilar y probar los programas, abra la consola dentro del directorio de la carpeta correspondiente:

### 1. Ejercicios Propuestos
Navegar a la carpeta `ejemplos-java/propuestos` y ejecutar:
```bash
javac *.java
```
Ejecutar los ejemplos individuales:
- Operador Ternario: `java OperadorTernarioDemo`
- Inferencia con var: `java InferenciaVarDemo`
- Expresiones Lambda: `java ExpresionesLambdaDemo`
- Clase Optional: `java ClaseOptionalDemo`
- Switch Expression: `java SwitchExpressionDemo`

### 2. Ejercicios Autónomos
Navegar a la carpeta `ejemplos-java/autonomos` y ejecutar:
```bash
javac --enable-preview --release 26 *.java
```
Ejecutar los ejemplos individuales (usando la bandera de previsualización para Stream Gatherers):
- Variables sin Nombre: `java VariablesSinNombreDemo`
- Casting de Intersección: `java CastingInterseccionDemo`
- Inferencia en Clases Anónimas: `java InferenciaClaseAnonimaDemo`
- Stream Gatherers: `java --enable-preview StreamGatherersDemo`
- Labeled Break: `java LabeledBreakDemo`
