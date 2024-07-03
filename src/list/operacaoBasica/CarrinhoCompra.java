package list.operacaoBasica;

import java.util.*;

public class CarrinhoCompra {
    private List<Item> item;

    public CarrinhoCompra() {
        this.item = new ArrayList<>();
    }

    public void AdicionarItem(String nome, double preco, int quantidade) {
        item.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> removerItem = new ArrayList<>();
        for (Item t : item) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                removerItem.add(t);
            }
        }
        item.removeAll(removerItem);
    }

    public void CalcularValorTotal() {
        double soma = 0;

        for (Item items : item) {
            soma += items.getPreco();
        }
        System.out.println("O valor total da compra é de R$: " + soma);

    }


    public void exibirItem() {
        System.out.println(item);
    }

    public static void main(String[] args) {
        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();

        carrinhoCompra.AdicionarItem("feijao", 8, 1);
        carrinhoCompra.AdicionarItem("feijao", 50, 1);
        carrinhoCompra.AdicionarItem("feijao4", 48, 1);
        carrinhoCompra.AdicionarItem("feijao7", 90, 1);
        carrinhoCompra.AdicionarItem("feijao9", 70, 1);


        carrinhoCompra.CalcularValorTotal();
        carrinhoCompra.removerItem("feijao");
        carrinhoCompra.exibirItem();

    }
}
