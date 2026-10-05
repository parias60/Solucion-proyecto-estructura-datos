# Solucion-proyecto-estructura-datos

## Integrantes del proyecto:
Pablo Daniel Arias Yucuma
Samuel Alejandro Jaime Rodriguez
Sergio Enrique Herrera Galvis
Simón Peñaranda Fajardo
Jose Santiago Dominguez Ortiz

### Lenguaje de programación: Java

## Descripción del problema: RESIDENCIAS UNAL

La Universidad Nacional cuenta con residencias universitarias para apoyar a estudiantes que requieren alojamiento durante sus estudios. Debido a la alta demanda, se propone un sistema que permita gestionar de manera eficiente y priorizada la asignación de cupos, utilizando el puntaje socioeconómico como criterio de prioridad, donde un menor puntaje representa una mayor necesidad.

El sistema permitirá registrar estudiantes mediante su ID, nombre y puntaje socioeconómico, consultar y modificar su información, eliminarlos y mantenerlos ordenados según su puntaje. Además, permitirá administrar los cupos disponibles, asignarlos prioritariamente y consultar los estudiantes que obtuvieron una residencia y aquellos que permanecen en espera.

# Decisiones de implementación:
Lista doblemente enlazada para almacenar a los estudiantes ordenados por puntaje socioeconómico, permitiendo insertar y eliminar nodos sin desplazar elementos.
Pila para almacenar las referencias a los últimos estudiantes registrados para implementar la función de deshacer en O(1).
Cola circular para gestionar las solicitudes de mantenimiento en orden de llegada (FIFO), evitando desplazamientos de elementos.

## Estructura del proyecto:

