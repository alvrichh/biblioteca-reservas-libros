/**
 * @author álvaro Rodríguez
 * @version 0.0
 * @see <a href = "https://github.com/alvrichh" /> GitHub </a>
 */

package javafile;

import java.util.Date;

/**
 * Clase que representa una reserva.
 */
public class Reserva {
    /**
     * Usuario que realiza la reserva.
     */
    private String usuario;

    /**
     * Libro reservado.
     */
    private Libro libro;

    /**
     * Fecha de reserva.
     */
    private Date fechaReserva;

    /**
     * Fecha de devolucion.
     */
    private Date fechaDevolucion;

    /**
     * Constructor de la clase Reserva.
     * 
     * @param usuario         El usuario que realiza la reserva.
     * @param libro           El libro reservado.
     * @param fechaReserva    La fecha de reserva.
     * @param fechaDevolucion La fecha de devolución.
     */
    public Reserva(String usuario, Libro libro, Date fechaReserva, Date fechaDevolucion) {
        setUsuario(usuario);
        setLibro(libro);
        setFechaReserva(fechaReserva);
        setFechaDevolucion(fechaDevolucion);
    }

    /**
     * Obtiene el usuario que realizo la reserva.
     *
     * @return El usuario que realizo la reserva.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Establece el usuario que realizo la reserva.
     *
     * @param usuario El nuevo usuario que realizo la reserva.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene el libro reservado.
     *
     * @return El libro reservado.
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Establece el libro reservado.
     *
     * @param libro El nuevo libro reservado.
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * Obtiene la fecha de reserva.
     *
     * @return La fecha de reserva.
     */
    public Date getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Establece la fecha de reserva.
     *
     * @param fechaReserva La nueva fecha de reserva.
     */
    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    /**
     * Obtiene la fecha de devolucion.
     *
     * @return La fecha de devolucion.
     */
    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Establece la fecha de devolucion.
     *
     * @param fechaDevolucion La nueva fecha de devolucion.
     */
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
