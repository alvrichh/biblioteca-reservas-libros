/**
 * @author álvaro Rodríguez
 * @version 0.0
 * @see <a href = "https://github.com/alvrichh" /> GitHub </a>
 */

package javafile;

import java.util.ArrayList;
import java.util.Date;

/**
 * Clase principal que contiene el punto de entrada para la aplicacion.
 * Permite al usuario interactuar con un menú para mostrar informacion de los
 * libros o escribir una reseña.
 */
public class Main {
    /**
     * Punto de entrada para la aplicacion. Permite al usuario interactuar con un
     * menu
     * para mostrar información de los libros o escribir una resenya.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este
     *             programa).
     */
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar libros
        ArrayList<Libro> libros = new ArrayList<>();

        // Crear un par de libros
        Libro libro1 = new Libro("El gran Gatsby", "F. Scott Fitzgerald", "978-3-16-148410-0", Libro.Estado.DISPONIBLE);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0-307-27778-0",
                Libro.Estado.DISPONIBLE);

        libros.add(libro1);
        libros.add(libro2);

        // Crear una reserva
        Date fechaReserva = new Date(); // Fecha actual
        Date fechaDevolucion = new Date(fechaReserva.getTime() + 7 * 24 * 60 * 60 * 1000); // Fecha de reserva + 7 días
        Reserva reserva = new Reserva("alvrich", libro1, fechaReserva, fechaDevolucion);

        // Mostrar información de los libros
        System.out.println("Información de los libros:");
        mostrarInformacionLibro(libro1);
        mostrarInformacionLibro(libro2);

        // Mostrar información de la reserva
        System.out.println("\nInformación de la reserva:");
        mostrarInformacionReserva(reserva);
    }

    /**
     * Muestra la informacion de un libro.
     * 
     * @param libro El libro a mostrar.
     */
    private static void mostrarInformacionLibro(Libro libro) {
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Estado: " + libro.getEstado());
        System.out.println();
    }

    /**
     * Muestra la informacion de una reserva.
     * 
     * @param reserva La reserva a mostrar.
     */
    private static void mostrarInformacionReserva(Reserva reserva) {
        System.out.println("Usuario: " + reserva.getUsuario());
        System.out.println("Libro reservado: " + reserva.getLibro().getTitulo());
        System.out.println("Fecha de reserva: " + reserva.getFechaReserva());
        System.out.println("Fecha de devolución: " + reserva.getFechaDevolucion());
    }
}
