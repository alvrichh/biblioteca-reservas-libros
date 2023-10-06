/**
 * Clase que representa una reserva.
 * @class
 */
class Reserva {
    /**
     * Constructor de la clase Reserva.
     * @constructor
     * @param {string} usuario - Usuario que realiza la reserva.
     * @param {Libro} libro - Libro reservado.
     * @param {Date} fechaReserva - Fecha de reserva.
     * @param {Date} fechaDevolucion - Fecha de devolución.
     */
    constructor(usuario, libro, fechaReserva, fechaDevolucion) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaReserva = fechaReserva;
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * Obtiene el usuario que realizó la reserva.
     * @returns {string} El usuario que realizó la reserva.
     */
    getUsuario() {
        return this.usuario;
    }

    /**
     * Establece el usuario que realizó la reserva.
     * @param {string} usuario - El nuevo usuario que realizó la reserva.
     */
    setUsuario(usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene el libro reservado.
     * @returns {Libro} El libro reservado.
     */
    getLibro() {
        return this.libro;
    }

    /**
     * Establece el libro reservado.
     * @param {Libro} libro - El nuevo libro reservado.
     */
    setLibro(libro) {
        this.libro = libro;
    }

    /**
     * Obtiene la fecha de reserva.
     * @returns {Date} La fecha de reserva.
     */
    getFechaReserva() {
        return this.fechaReserva;
    }

    /**
     * Establece la fecha de reserva.
     * @param {Date} fechaReserva - La nueva fecha de reserva.
     */
    setFechaReserva(fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    /**
     * Obtiene la fecha de devolución.
     * @returns {Date} La fecha de devolución.
     */
    getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    /**
     * Establece la fecha de devolución.
     * @param {Date} fechaDevolucion - La nueva fecha de devolución.
     */
    setFechaDevolucion(fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}

// Exporta la clase Reserva
export default Reserva;
