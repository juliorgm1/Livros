public class Usuario {
    private String nome;
    private String rg;
    public String enderco;

    public Usuario(){}

    public Usuario(String nome, String rg, String enderco) {
        this.nome = nome;
        this.rg = rg;
       //
    }

    public String imprimeUsuario(String mensagem, double idade){
        return mensagem;
    }

    public String imprimeUsuario(String mensagem, int idade){
        return mensagem;
    }

    @Override
    public String toString() {
        return nome + " " + rg;
    }
}
