package list.set.ordenacao;

import java.awt.desktop.PreferencesEvent;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;

    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(51575,"prod1", 55.2,6);
        cadastroProduto.adicionarProduto(52545,"prod2", 52.2,6);
        cadastroProduto.adicionarProduto(53450,"prod3", 35.2,6);
        cadastroProduto.adicionarProduto(55279,"prod4", 65.2,6);

        System.out.println(cadastroProduto.exibirProdutoPorNome());
        System.out.println(cadastroProduto.exibirProdutoPorPreco());
    }

}
