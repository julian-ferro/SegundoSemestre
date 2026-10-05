public class Libro {
    // atributos
    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;
    private boolean disponible;

    // constructor
    public Libro(String titulo, String autor, String isbn, int anioPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;   
    }

    // getter y setters 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }
    //prestar
    public void prestar(){
        disponible = false;
    }
    // devolver 
    public void devolver(){
        disponible = true;
    }
    //estadisponible
    public boolean estaDisponible(){
    return disponible;
    }
    // toString
    public String toString() {
        return "Libro [titulo: " + titulo + ", autor: " + autor + ", isbn: " + isbn +
                ", anioPublicacion: " + anioPublicacion + ", disponible: " + disponible + "]";
    }

}