public class Livro {
    private String titulo;
    private String autor;
    private String isbn;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor;
    }
}
