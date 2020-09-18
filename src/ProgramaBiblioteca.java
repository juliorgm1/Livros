import java.util.ArrayList;
import java.util.List;

public class ProgramaBiblioteca {
    public static void main(String[] args) {
        List<Livro> livros = createLivros();
        List<Usuario> usuarios = createUsuarios();

        List<Livro> livrosEmprestimo = new ArrayList<>();
        List<Emprestimo> emprestimoList = new ArrayList<>();

        //Emprestimo 1
        livrosEmprestimo.add(livros.get(3));
        livrosEmprestimo.add(livros.get(5));
        emprestimoList.add(new Emprestimo(usuarios.get(3),livrosEmprestimo,"14/09/2020"));

        //Emprestimo 2
        //Emprestimo 1
        livrosEmprestimo.add(livros.get(8));
        livrosEmprestimo.add(livros.get(10));
        livrosEmprestimo.add(livros.get(0));
        emprestimoList.add(new Emprestimo(usuarios.get(4),livrosEmprestimo,"14/09/2020"));

    }

    public static  List<Livro> createLivros(){
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Como Ter Uma Memória Superpoderosa","Harry Lorayne"));
        livros.add(new Livro("Contos de Eva Luna","Isabel Allende"));
        livros.add(new Livro("Corações Irlandeses","Nora Roberts"));
        livros.add(new Livro("Crer ou Não Crer","Leandro Karnal e Padre Fábio de Melo"));
        livros.add(new Livro("Estações Havana","Leonardo Padura"));
        livros.add(new Livro("Família Donovan","Nora Roberts pdf ou"));
        livros.add(new Livro("Mordomia, Motivações do Coração","John H. H. Mathews"));
        livros.add(new Livro("Mordomia, Motivações do Coração","John H. H. Mathews"));
        livros.add(new Livro("Muito Além do Inverno","Isabel Allende"));
        livros.add(new Livro("Muito Além do Inverno","Isabel Allende"));
        livros.add(new Livro("Muito Além do Inverno","Isabel Allende"));
        livros.add(new Livro("Não Espere Pelo Epitáfio","Mario Sérgio Cortella"));
        livros.add(new Livro("Não Espere Pelo Epitáfio","Mario Sérgio Cortella"));
        livros.add(new Livro("O Amante","Marguerite Duras"));
        livros.add(new Livro("O Ar que Ele Respira","Brittainy C. Cherry"));
        livros.add(new Livro("O Círculo","Nora Roberts"));
        livros.add(new Livro("O Nome da Rosa","Umberto Eco"));
        livros.add(new Livro("O Poder Supremo","Marion Zimmer Bradley"));
        livros.add(new Livro("O que Te Faz Mais Forte","Jeff Bauman & Bret Witter"));
        livros.add(new Livro("Presságio de Fogo","Marion Zimmer Bradley"));
        livros.add(new Livro("Presságio de Fogo","Marion Zimmer Bradley"));
        livros.add(new Livro("Procura-se Um Marido","Carina Rissi"));
        livros.add(new Livro("Procura-se Um Marido","Carina Rissi"));
        livros.add(new Livro("Reino de Cordina","Nora Roberts pdf"));
        livros.add(new Livro("Saga Crepúsculo","Stephenie Meyer pdf"));
        livros.add(new Livro("Sem Promessa, Sem Compromisso","Nora Roberts"));
        livros.add(new Livro("Trilogia da Magia","Nora Roberts doc ou"));
        livros.add(new Livro("Trilogia do Coração","Nora Roberts doc ou"));
        livros.add(new Livro("Trilogia no Jardim","Nora Roberts doc"));
        livros.add(new Livro("Virtude Indecente","Nora Roberts"));
        livros.add(new Livro("Zorro, O Começo da Lenda","Isabel Allende"));

        return livros;
    }

    public static List<Usuario> createUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Jeff","123","Rua X"));
        usuarios.add(new Usuario("Anna","324","Rua A"));
        usuarios.add(new Usuario("Lua","433","Rua B"));
        usuarios.add(new Usuario("Rui","332","Rua C"));
        usuarios.add(new Usuario("Sol","543","Rua A"));

        return usuarios;
    }
}
