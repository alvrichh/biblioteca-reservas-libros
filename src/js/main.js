/**
 * Autor: Álvaro Rodríguez
 * Versión: 0.0
 * Enlace a GitHub: <a href="https://github.com/alvrichh">GitHub</a>
 */

/**
 * Clase principal que contiene el punto de entrada para la aplicación.
 * Permite al usuario interactuar con un menú para mostrar información de los
 * libros o escribir una reseña.
 */
class Main {
    /**
     * Punto de entrada para la aplicación. Permite al usuario interactuar con un
     * menú para mostrar información de los libros o escribir una reseña.
     *
     * @param {Array} args - Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    static main(args) {
        // Crear un array para almacenar libros
        const libros = [];

        // Crear un par de libros
        const libro1 = new Libro("El gran Gatsby", "F. Scott Fitzgerald", "978-3-16-148410-0", Libro.Estado.DISPONIBLE);
        const libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0-307-27778-0",
            Libro.Estado.DISPONIBLE);

        libros.push(libro1);
        libros.push(libro2);

        // Crear una reserva
        const fechaReserva = new Date(); // Fecha actual
        const fechaDevolucion = new Date(fechaReserva.getTime() + 7 * 24 * 60 * 60 * 1000); // Fecha de reserva + 7 días
        const reserva = new Reserva("alvrich", libro1, fechaReserva, fechaDevolucion);

        // Mostrar información de los libros
        console.log("Información de los libros:");
        mostrarInformacionLibro(libro1);
        mostrarInformacionLibro(libro2);

        // Mostrar información de la reserva
        console.log("\nInformación de la reserva:");
        mostrarInformacionReserva(reserva);
    }

    /**
     * Muestra la información de un libro.
     * 
     * @param {Libro} libro - El libro a mostrar.
     */
    static mostrarInformacionLibro(libro) {
        console.log("Título: " + libro.getTitulo());
        console.log("Autor: " + libro.getAutor());
        console.log("ISBN: " + libro.getIsbn());
        console.log("Estado: " + libro.getEstado());
        console.log();
    }

    /**
     * Muestra la información de una reserva.
     * 
     * @param {Reserva} reserva - La reserva a mostrar.
     */
    static mostrarInformacionReserva(reserva) {
        console.log("Usuario: " + reserva.getUsuario());
        console.log("Libro reservado: " + reserva.getLibro().getTitulo());
        console.log("Fecha de reserva: " + reserva.getFechaReserva());
        console.log("Fecha de devolución: " + reserva.getFechaDevolucion());
    }
}
