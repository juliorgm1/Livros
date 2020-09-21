package Tarefas;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Tarefas tarefas = new Tarefas("Jogar o lixo fora","21/09");

        List<Tarefas> tarefasList = new ArrayList<>();

        tarefasList.add(tarefas);
        tarefasList.add(new Tarefas("Jogar o lixo fora","21/09"));
        tarefasList.add(new Tarefas("Jogar o lixo fora","21/09"));
        tarefasList.add(new Tarefas("Jogar o lixo fora","21/09"));
        tarefasList.add(new Tarefas("Jogar o lixo fora","21/09"));

        for(Tarefas tarefa: tarefasList){
            System.out.println(tarefa);
        }

        System.out.println(tarefasList.get(1).getDescricao());
        tarefasList.get(1).setData("30/09");

        System.out.println(tarefasList.get(1));

        tarefasList.remove(0);

        for (Tarefas tarefa: tarefasList){
            System.out.println(tarefa);
        }
    }
}
