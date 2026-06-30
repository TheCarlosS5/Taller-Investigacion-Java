# Ejemplos Funcionales: Sintaxis Comprimidas y Métodos Abreviados en Java

Este repositorio contiene una colección de ejemplos de código en Java que demuestran la evolución sintáctica del lenguaje, comparando la escritura tradicional frente a las características modernas (introducidas desde Java 8 hasta Java 22+) que permiten código más limpio, legible y mantenible.

## Contenido del Repositorio

El repositorio incluye 5 clases demostrativas listas para compilar y ejecutar de forma independiente:

1. **Operador Ternario (`OperadorTernarioDemo.java`)**
   - **Tradicional:** Sentencia condicional `if-else` para asignar un valor.
   - **Moderno:** Expresión compacta `(?:)` para asignación directa en una sola línea.

2. **Inferencia de Tipos Locales con var (`InferenciaVarDemo.java`)**
   - **Tradicional:** Declaración explícita de tipos genéricos anidados muy verbosos.
   - **Moderno:** Inferencia estática mediante `var` (Java 10+), reduciendo ruido visual.

3. **Expresiones Lambda (`ExpresionesLambdaDemo.java`)**
   - **Tradicional:** Implementación verbosa de interfaces mediante clases internas anónimas.
   - **Moderno:** Notación de flecha `() ->` (Java 8+) para instanciación concisa de interfaces funcionales.

4. **Clase Optional (`ClaseOptionalDemo.java`)**
   - **Tradicional:** Estructuras condicionales anidadas para control preventivo de nulos (`if (x != null)`).
   - **Moderno:** Contenedor monádico `Optional` (Java 8+) con métodos de flujo declarativo como `.map()` y `.orElse()`.

5. **Switch Expressions (`SwitchExpressionDemo.java`)**
   - **Tradicional:** Sentencias `switch` clásicas con caída de control que exigen múltiples `break;`.
   - **Moderno:** Switch como expresión (Java 14+) con notación `->`, libre de `break` y con garantía de exhaustividad.

---

## Requisitos
- **JDK (Java Development Kit) 14 o superior** (requerido para ejecutar las expresiones `switch` y métodos avanzados).

---

## Cómo Compilar y Ejecutar

Puedes compilar y probar cada ejemplo directamente desde tu terminal de comandos (por ejemplo, PowerShell o CMD):

### 1. Operador Ternario
```bash
javac OperadorTernarioDemo.java
java OperadorTernarioDemo
```

### 2. Inferencia de Tipos con var
```bash
javac InferenciaVarDemo.java
java InferenciaVarDemo
```

### 3. Expresiones Lambda
```bash
javac ExpresionesLambdaDemo.java
java ExpresionesLambdaDemo
```

### 4. Clase Optional
```bash
javac ClaseOptionalDemo.java
java ClaseOptionalDemo
```

### 5. Switch Expression
```bash
javac SwitchExpressionDemo.java
java SwitchExpressionDemo
```
