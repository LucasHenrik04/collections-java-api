package Array.carrinhoDeCompras;

public class Item {
    //atributo
    private String nome;
    private double preco;
    int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return nome + preco + quantidade;
    }
}
