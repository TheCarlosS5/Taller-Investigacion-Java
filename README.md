# Taller de Investigación - Métodos Abreviados y Sintaxis Comprimidas en Java

Este repositorio contiene los entregables del taller de investigación sobre la evolución de la sintaxis y características modernas de Java (desde Java 8 hasta Java 22+).

## Contenido del Repositorio

*   [Taller_Investigacion_Java.pdf](Taller_Investigacion_Java.pdf): Informe final en formato PDF redactado en tono de aprendizaje, explicando 20 temas de sintaxis en Java con sus pros, contras, casos de uso y ejemplos comparativos.
*   [Taller_Sintaxis_Java_v2.docx](Taller_Sintaxis_Java_v2.docx): Archivo fuente de Word para revisión de formato.
*   [ejemplos-java/propuestos/](ejemplos-java/propuestos/): Carpeta con los 15 ejemplos de código del listado propuesto por el instructor.
*   [ejemplos-java/autonomos/](ejemplos-java/autonomos/): Carpeta con los 5 ejemplos de las características avanzadas investigadas de forma autónoma.

## Ejemplos Programados y Explicación

Para este taller se programaron quince ejemplos para los temas del instructor y cinco para los temas autónomos. En los propuestos, OperadorTernarioDemo.java realiza asignación simple con ? y :; AsignacionCompuestaDemo.java demuestra operadores acumuladores (+=, -=, etc.); IncrementoDecrementoDemo.java utiliza los operadores unitarios (++ y --); ForEachDemo.java recorre colecciones con la estructura mejorada; InferenciaVarDemo.java declara variables locales con var; ExpresionesLambdaDemo.java evita clases anónimas usando flechas ->; ReferenciaMetodosDemo.java utiliza la notación :: para abreviar lambdas; ApiStreamsDemo.java procesa colecciones de forma declarativa con streams; ClaseOptionalDemo.java previene errores de puntero nulo usando envolturas; SwitchExpressionDemo.java asigna valores sin usar break; TextBlocksDemo.java maneja cadenas multilínea con tres comillas; RecordsDemo.java define clases de datos compactas e inmutables; PatternMatchingDemo.java realiza cast automático en instanceof; ListOfDemo.java crea listas inmutables de manera optimizada; y RemoveIfDemo.java filtra colecciones de forma atómica. En los autónomos, VariablesSinNombreDemo.java descarta parámetros obligatorios con el guion bajo _; CastingInterseccionDemo.java permite serializar lambdas usando cast con &; InferenciaClaseAnonimaDemo.java conserva miembros de clases anónimas declarándolas con var; StreamGatherersDemo.java agrupa elementos en streams por ventanas fijas; y LabeledBreakDemo.java salta bloques garantizando la limpieza en finally sin excepciones.

## Instrucciones para Compilar y Ejecutar

Para compilar y probar los programas, abra la consola dentro del directorio de la carpeta correspondiente:

### 1. Ejercicios Propuestos
Navegar a la carpeta `ejemplos-java/propuestos` y ejecutar:
```bash
javac *.java
```
Ejecutar los ejemplos individuales:
- Operador Ternario: `java OperadorTernarioDemo`
- Asignación Compuesta: `java AsignacionCompuestaDemo`
- Incremento/Decremento: `java IncrementoDecrementoDemo`
- Ciclo For-each: `java ForEachDemo`
- Inferencia con var: `java InferenciaVarDemo`
- Expresiones Lambda: `java ExpresionesLambdaDemo`
- Referencias a Métodos: `java ReferenciaMetodosDemo`
- API Streams: `java ApiStreamsDemo`
- Clase Optional: `java ClaseOptionalDemo`
- Switch Expression: `java SwitchExpressionDemo`
- Bloques de Texto: `java TextBlocksDemo`
- Records: `java RecordsDemo`
- Pattern Matching: `java PatternMatchingDemo`
- Factoría List.of(): `java ListOfDemo`
- Eliminación removeIf(): `java RemoveIfDemo`

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
