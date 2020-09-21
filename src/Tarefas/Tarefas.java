package Tarefas;

public class Tarefas {
    private String descricao;
    private String data;

    public Tarefas(String descricao, String data){
        this.descricao = descricao;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString(){
        return "Descricação: " + descricao + " data: " + data;
    }
}
