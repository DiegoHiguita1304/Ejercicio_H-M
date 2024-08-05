# Proyecto de Beneficios de Clientes en H&M

Este proyecto implementa un sistema para calcular descuentos en las compras de clientes de las tiendas H&M, clasificados en tres grupos según sus beneficios:

- **Grupo 1**: 10% de descuento por cada 1,000,000 en compras.
- **Grupo 2**: 5% de descuento por cada 500,000 en compras.
- **Grupo 3**: 2.5% de descuento por cada 200,000 en compras.

## Estructura del Proyecto

El proyecto está dividido en las siguientes clases:

### Clase `Cliente`
Clase abstracta que representa a un cliente y contiene los métodos y atributos comunes a todos los clientes.

### Clases `GrupoUno`, `GrupoDos`, `GrupoTres`
Clases que extienden la clase `Cliente` y que implementan el método `descontar` para aplicar los descuentos específicos según el grupo al que pertenecen.

## Uso del Proyecto

Para ejecutar el proyecto, asegúrate de tener Java instalado y sigue los siguientes pasos:

1. Compila el proyecto:

    ```bash
    javac -d bin src/**/*.java
    ```

2. Ejecuta el proyecto:

    ```bash
    java -cp bin org.example.Main
    ```

## Requisitos

- Java 8 o superior.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, sigue el flujo de trabajo de GitHub para contribuir a este proyecto.




