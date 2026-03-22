# 🏙️ Simulador de Ciudad en Consola (Java)

## 📌 Descripción

Este proyecto es un juego desarrollado en **Java** (usando **Eclipse**) que simula la gestión de una ciudad desde la consola. El jugador debe construir diferentes tipos de edificios para mantener y mejorar los indicadores clave de la ciudad: **felicidad**, **dinero** y **energía**.

El objetivo principal es **mantener la ciudad funcionando el mayor tiempo posible** sin que la felicidad de la población llegue a 0, ya que eso provoca el fin de la partida.

---

## ⚙️ Reglas del Juego

* Empiezas con una cantidad inicial de:

  * Felicidad 
  * Dinero 
  * Energía 

* Cada turno puedes construir un edificio (si tienes recursos suficientes).

* Las decisiones afectan directamente al equilibrio de la ciudad.

* **Si la felicidad llega a 0 → GAME OVER**

---

## Codificación por Hash de contraseñas

Nuestro programa trae una función Hash que codifica la contraseña introducida por el usuario.

**Proceso de Encriptación**

El algoritmo sigue estos cuatro pasos fundamentales:

* Conversión a ASCII: Se recorre la contraseña carácter por carácter y se obtiene su valor decimal único según el estándar Unicode/ASCII (por ejemplo, 'a' se convierte en 97).

* Normalización a 3 Dígitos: Para asegurar la integridad al desencriptar, cada valor se normaliza a un bloque de 3 dígitos. Si el valor es menor a 100, se le añade un 0 a la izquierda (por ejemplo, 97 se convierte en 097).

* Inversión Posicional: En lugar de añadir los números al final, cada nuevo bloque se inserta en la posición 0 (al principio) del constructor de cadenas (StringBuilder). Esto invierte el orden de la contraseña original, añadiendo una capa básica de ofuscación.

* Generación de Hash Numérico: Finalmente, la cadena de texto resultante se parsea a un objeto BigInteger, permitiendo que la "firma" de la contraseña se almacene como un único valor numérico gigante, evitando los límites de memoria de los tipos int o long convencionales.

---

##  Tecnologías utilizadas

* Java
* Eclipse IDE
* Programación orientada a objetos (POO)

---

##  Cómo ejecutar el proyecto

1. Abrir Eclipse
2. Importar el proyecto:

   * `File → Import → Existing Java Project`
3. Ejecutar la clase principal
4. Jugar desde la consola

