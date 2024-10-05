
# Gestión de Ventas y Reservas de Cine

## 📄 Descripción - Enunciado del Ejercicio

Este repositorio contiene varios ejercicios que forman parte de un proyecto de gestión de ventas y reservas de cine. Se implementan clases y excepciones personalizadas para manejar correctamente los posibles errores que puedan surgir durante el proceso, como ventas vacías o reservas incorrectas.

El proyecto está dividido en tres niveles de complejidad, desde la creación de clases básicas hasta la implementación de una aplicación completa para la reserva de butacas en un cine.

### Enunciado:

- Usa Eclipse o IntelliJ para todos los ejercicios.
- Sigue las buenas prácticas especificadas en el Sprint 0 para las entregas de GitHub.
- Puedes construir proyectos Maven, Gradle o simplemente Java.
- El código debe estar en inglés.

### Ejercicios:

**Nivel 1**: Creación de las clases `Producto` y `Venta`, y manejo de la excepción personalizada `VentaBuidaException`.

**Nivel 2**: Creación de la clase `Entrada` para controlar excepciones al ingresar datos desde el teclado mediante la clase `Scanner`.

**Nivel 3**: Desarrollo de una aplicación de gestión de reservas de cine con múltiples clases, excepciones personalizadas, y un sistema de menú para realizar diversas operaciones.

---

## 💻 Tecnologías Utilizadas

- **Java SE 17**: Lenguaje principal utilizado en el desarrollo.
- **IntelliJ IDEA**: Entorno de desarrollo integrado (IDE).
- **Maven**: Sistema de gestión de dependencias y construcción del proyecto.
- **JUnit 5**: Librería utilizada para las pruebas unitarias.
- **Git**: Control de versiones.
- **GitHub**: Repositorio para la gestión y alojamiento del proyecto.

---

## 📋 Requisitos

Para ejecutar este proyecto, es necesario tener instalado lo siguiente:

- **Java SE 17** o superior
- **Maven** (opcional, si se elige un proyecto Maven)
- **IntelliJ IDEA** o **Eclipse** como IDE recomendado
- **Git** para clonar y gestionar el repositorio

---

## 🛠️ Instalación

1. Clona el repositorio en tu máquina local utilizando Git:
   ```bash
   git clone https://github.com/CatalinBarsan/1.2-Exceptions.git
   ```
2. Abre el proyecto en **IntelliJ IDEA** o **Eclipse**.
3. Si estás usando **Maven**, asegúrate de que las dependencias se descarguen correctamente:
   ```bash
   mvn clean install
   ```
4. Verifica que el proyecto compile y que no haya errores de configuración.

---

## ▶️ Ejecución

1. Ejecuta la clase principal `Main` desde el IDE.
2. La aplicación te pedirá introducir el número de filas y asientos en el cine.
3. Usa el menú interactivo para gestionar las reservas y ventas:

   - Opción 1: Mostrar todas las butacas reservadas.
   - Opción 2: Mostrar butacas reservadas por persona.
   - Opción 3: Reservar un asiento.
   - Opción 4: Anular la reserva de un asiento.
   - Opción 5: Anular todas las reservas de una persona.
   - Opción 0: Salir de la aplicación.

---

## 🌐 Despliegue

Para desplegar el proyecto en un entorno de producción o servidor, se recomienda:

1. Asegurarse de que todas las dependencias estén actualizadas.
2. Realizar pruebas unitarias para verificar el funcionamiento del sistema.
3. Utilizar un entorno de servidor compatible con Java SE 17 o superior.

---

## 🤝 Contribuciones

Las contribuciones a este proyecto son bienvenidas. Para contribuir:

1. Haz un **fork** del repositorio.
2. Crea una nueva rama con el nombre de la funcionalidad o corrección que quieres añadir:
   ```bash
   git checkout -b nueva-funcionalidad
   ```
3. Realiza tus cambios y **haz commit**:
   ```bash
   git commit -m "Añadir nueva funcionalidad"
   ```
4. Haz **push** a la rama:
   ```bash
   git push origin nueva-funcionalidad
   ```
5. Abre un **pull request** en GitHub.

---
