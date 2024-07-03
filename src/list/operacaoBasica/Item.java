package list.operacaoBasica;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;


    public Item(String nome, double preco, int quantidade) {
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return String.format("Item{nome='%s', preco=%.2f, quantidade=%d}", nome, preco, quantidade);
//        return nome + preco + quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
