package Array.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemlist;

    public CarrinhoDeCompras() {
        this.itemlist = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemlist.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i : itemlist){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        itemlist.removeAll(itemParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemlist.isEmpty()) {
            for (Item item : itemlist) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
        }
        return valorTotal;
    }

    public void exibirItem(){
        if(!itemlist.isEmpty()){
            System.out.println(this.itemlist);
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemlist=" + itemlist +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        //exibindo item
        carrinhoDeCompras.exibirItem();

        //Removendo item
        carrinhoDeCompras.removerItem("Lápis");

        //exibindo os itens autualizados no carrinho
        carrinhoDeCompras.exibirItem();

        //calculando e exibindo o valor total de compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}


