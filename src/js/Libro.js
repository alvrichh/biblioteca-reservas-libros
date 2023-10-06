/**
 * Clase que representa un libro.
 * @class
 */
class Libro {
    /**
     * Constructor de la clase Libro.
     * @constructor
     * @param {string} titulo - Título del libro.
     * @param {string} autor - Autor del libro.
     * @param {string} isbn - Número de identificación del libro (ISBN).
     * @param {Estado} estado - Estado del libro (DISPONIBLE o RESERVADO).
     */
    constructor(titulo, autor, isbn, estado) {
        this.setTitulo(titulo);
        this.autor = autor;
        this.isbn = isbn;
        this.estado = estado;
    }

    /**
     * Obtiene el título del libro.
     * @returns {string} El título del libro.
     */
    getTitulo() {
        return this.titulo;
    }

    /**
     * Establece el título del libro.
     * @param {string} titulo - El nuevo título del libro.
     */
    setTitulo(titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     * @returns {string} El autor del libro.
     */
    getAutor() {
        return this.autor;
    }

    /**
     * Establece el autor del libro.
     * @param {string} autor - El nuevo autor del libro.
     */
    setAutor(autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el ISBN del libro.
     * @returns {string} El ISBN del libro.
     */
    getIsbn() {
        return this.isbn;
    }

    /**
     * Establece el ISBN del libro.
     * @param {string} isbn - El nuevo ISBN del libro.
     */
    setIsbn(isbn) {
        this.isbn = isbn;
    }

    /**
     * Obtiene el estado del libro.
     * @returns {Estado} El estado del libro (DISPONIBLE o RESERVADO).
     */
    getEstado() {
        return this.estado;
    }

    /**
     * Establece el estado del libro.
     * @param {Estado} estado - El nuevo estado del libro.
     */
    setEstado(estado) {
        this.estado = estado;
    }
}

/**
 * Enumerado para representar el estado de disponibilidad de un libro.
 * @enum {string}
 */
const Estado = {
    DISPONIBLE: 'DISPONIBLE',
    RESERVADO: 'RESERVADO'
};

// Export the Libro class y Estado enum
export default {
    Libro,
    Estado
};
