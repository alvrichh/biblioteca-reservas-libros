/**
 * @author álvaro Rodríguez
 * @version 0.0
 * @see <a href = "https://github.com/alvrichh" /> GitHub </a>
 */

package javafile;
/**
 * Clase que representa un libro.
 */
public class Libro {
    /**
     * Enumerado de los estados posibles de un libro.
     */
    public enum Estado {
        DISPONIBLE, RESERVADO
    }

    // VARIABLES
    /**
     * Título del libro
     */
    private String titulo;
    /**
     * Autor del libro
     */
    private String autor;
    /**
     * Número de identidicación del libro
     */
    private String isbn;
    /**
     * Estado del libro
     */
    private Estado estado;

    // CONSTRUCTOR PRINCIPAL
    /**
     * Constructor principal de la clase Libro.
     * @param titulo Titulo del libro.
     * @param autor  Autor del libro.
     * @param isbn   Número de identificación del libro (ISBN).
     * @param estado Estado del libro (DISPONIBLE o RESERVADO).
     */
    public Libro(String titulo, String autor, String isbn, Estado estado) {
        setTitulo(titulo);
        setAutor(autor);
        setIsbn(isbn);
        setEstado(estado);
    }

    // GETERS Y SETTERS
    /**
     * Obtiene el titulo del libro.
     * @return El titulo del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el titulo del libro.
     * @param titulo El nuevo titulo del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro.
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el ISBN del libro.
     * @return El ISBN del libro.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Establece el ISBN del libro.
     * @param isbn El nuevo ISBN del libro.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Obtiene el estado del libro.
     * @return El estado del libro.
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Establece el estado del libro.
     * @param estado El nuevo estado del libro.
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}