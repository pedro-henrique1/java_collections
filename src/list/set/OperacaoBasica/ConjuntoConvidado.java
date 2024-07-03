package list.set.OperacaoBasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo) {
        convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removeConvidadoCodigo(int codigoConvite) {
        Convidado convidadoRemover = null;

        for (Convidado i : convidadoSet) {
            if (i.getCodigo() == codigoConvite) {
                convidadoRemover = i;
                break;
            }
        }
        convidadoSet.remove(convidadoRemover);
    }

    public int contarConvidado() {
        return convidadoSet.size();
    }

    public void exibirConvidado() {
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

        conjuntoConvidado.adicionarConvidado("pedro1", 332);
        conjuntoConvidado.adicionarConvidado("pedro2", 3325);
        conjuntoConvidado.adicionarConvidado("pedro3", 332);
        conjuntoConvidado.adicionarConvidado("pedro4", 332);

        conjuntoConvidado.exibirConvidado();
        conjuntoConvidado.removeConvidadoCodigo(3325);
        conjuntoConvidado.exibirConvidado();

    }
}
