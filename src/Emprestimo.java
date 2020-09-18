import java.util.List;

public class Emprestimo {
    private Usuario usuario;
    private List<Livro> livroList;
    private String data;

    public Emprestimo(Usuario usuario, List<Livro> livroList, String data) {
        this.usuario = usuario;
        this.livroList = livroList;
        this.data = data;
    }

    public void imprimeImprestimo(){
        System.out.println(usuario);
        for(Livro livro : livroList) System.out.println(livro);
    }
}
