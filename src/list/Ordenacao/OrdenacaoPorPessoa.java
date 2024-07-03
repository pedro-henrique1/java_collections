package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPorPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPorPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void AdicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenacaoPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenacaoPorAltura() {
        List<Pessoa> ordenacaoPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(ordenacaoPorAltura, new ComparatorPorAltura());
        return ordenacaoPorAltura;

    }

    public static void main(String[] args) {
        OrdenacaoPorPessoa ordenacaoPorPessoa = new OrdenacaoPorPessoa();
        ordenacaoPorPessoa.AdicionarPessoa("nome1", 21,2.54);
        ordenacaoPorPessoa.AdicionarPessoa("nome2", 31,2.04);
        ordenacaoPorPessoa.AdicionarPessoa("nome3", 26,2.22);
        ordenacaoPorPessoa.AdicionarPessoa("nome4", 78,2.58);
        ordenacaoPorPessoa.AdicionarPessoa("nome5", 29,2.90);


//        System.out.println(ordenacaoPorPessoa.ordenacaoPorIdade());
        System.out.println(ordenacaoPorPessoa.ordenacaoPorAltura());
    }

}
