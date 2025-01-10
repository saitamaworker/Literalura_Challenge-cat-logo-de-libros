# LiterAlura

LiterAlura es una aplicación de consola desarrollada en Java que permite a los usuarios registrar y consultar libros en una base de datos. Utiliza una API externa (Gutendex) para obtener información sobre los libros y almacenarla en una base de datos PostgreSQL.

## Stack Tecnológico

- **Java 17**: Lenguaje de programación utilizado para desarrollar la aplicación.
- **Spring Boot 3.4.1**: Framework para crear aplicaciones Java de manera rápida y sencilla.
- **Spring Data JPA**: Abstracción de persistencia que facilita el acceso a bases de datos relacionales.
- **PostgreSQL**: Sistema de gestión de bases de datos relacional utilizado para almacenar la información de los libros.
- **Hibernate**: Framework de mapeo objeto-relacional utilizado para interactuar con la base de datos.
- **Jackson**: Biblioteca para procesar JSON, utilizada para manejar las respuestas de la API externa.

## Propósito

El propósito de LiterAlura es proporcionar un catálogo de libros donde los usuarios puedan buscar información sobre libros por título, registrar nuevos libros en la base de datos, y consultar libros ya registrados. La aplicación interactúa con la API de Gutendex para obtener datos actualizados sobre los libros.

## Uso

### Requisitos Previos

- **Java 17**: Asegúrate de tener Java 17 instalado en tu sistema.
- **PostgreSQL**: Instala PostgreSQL y crea una base de datos llamada `literalura_db`.
- **Maven**: Utilizado para gestionar las dependencias del proyecto.

### Configuración

1. **Clonar el Repositorio**

   ```bash
   git clone https://github.com/tu-usuario/literalura.git
   cd literalura
