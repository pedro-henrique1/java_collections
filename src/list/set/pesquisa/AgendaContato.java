package list.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private  Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarContato(String nome) {
        Set<Contato> contatoNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoNome.add(c);
            }
        }
        return contatoNome;

    }


    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualzado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualzado = c;
                break;
            }
        }
        return contatoAtualzado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContato();
        agendaContato.adicionarContato("con1", 1221);
        agendaContato.adicionarContato("con2", 1231);

        agendaContato.exibirContato();
        agendaContato.atualizarNumeroContato("con1", 12223);
        agendaContato.exibirContato();


    }
}
