package map.operacaoBasica;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private final Map<String, Integer> agendaContaoMap;


    public AgendaContatos() {
        this.agendaContaoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContaoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContaoMap.isEmpty()) {
            agendaContaoMap.remove(nome);
        }
    }


    public void exibirContato() {
        System.out.println(agendaContaoMap);
    }

    public Integer pesquisaPorContato(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContaoMap.isEmpty()) {
            agendaContaoMap.get(nome);
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos  agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("con1", 1111);
        agendaContatos.adicionarContato("con2", 1111);
        agendaContatos.adicionarContato("con3", 1111);
        agendaContatos.adicionarContato("con4", 1111);
        agendaContatos.exibirContato();
        agendaContatos.removerContato("con1");
        agendaContatos.exibirContato();


    }
}