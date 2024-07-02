package list.operacaoBasica;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descicao) {
        tarefaList.add(new Tarefa(descicao));
    }

    public void removerTarefa(String descicao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();

        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descicao)) {
                tarefasRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasRemover);
    }

    public int obterNumeroTarefas() {
        return tarefaList.size();
    }

    public void  obterDescricaoTarefa() {
        System.out.println(tarefaList);
    }


    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();


        System.out.println("O numero total de elemnto na lista é: " + listaTarefa.obterNumeroTarefas());
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 1");

        System.out.println("O numero total de elemnto na lista é: " + listaTarefa.obterNumeroTarefas());

//        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("O numero total de elemnto na lista é: " + listaTarefa.obterNumeroTarefas());
        listaTarefa.obterDescricaoTarefa();

    }
}
