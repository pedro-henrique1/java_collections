package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProduto;

    public EstoqueProduto() {
        this.estoqueProduto = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProduto.put(cod, new Produto(nome, preco, quantidade));
    }


    public void exibirProduto() {
        System.out.println(estoqueProduto);
    }

    public double calcularValorEstoque() {
        double total = 0;
        if (!estoqueProduto.isEmpty()) {
            for (Produto produto : estoqueProduto.values()) {
                total += produto.getQuantidade() * produto.getPreco();
            }
        }
        return total;
    }

    public Produto obterProdutoCaro() {
        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProduto.isEmpty()) {
            for (Produto produto : estoqueProduto.values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;

    }

    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();
        estoqueProduto.exibirProduto();

        estoqueProduto.adicionarProduto(5555, "sd", 2, 254);
        estoqueProduto.adicionarProduto(55455, "kjh", 452, 88741.0);
        estoqueProduto.adicionarProduto(5554355, "ajhgas", 3543, 68);
        estoqueProduto.adicionarProduto(6654, "aaghfs", 53, 8458.0);
        estoqueProduto.adicionarProduto(876, "gfd", 453, 8548.0);

        estoqueProduto.exibirProduto();
        estoqueProduto.obterProdutoCaro();
    }
}
