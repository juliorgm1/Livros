public class Usuario {
    private String nome;
    private String rg;
    private String enderco;

    public Usuario(String nome, String rg, String enderco) {
        this.nome = nome;
        this.rg = rg;
        this.enderco = enderco;
    }

    @Override
    public String toString() {
        return nome + " " + rg;
    }
}
