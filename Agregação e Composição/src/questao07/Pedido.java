package questao07;

import java.util.ArrayList;

public class Pedido {
    class ItemPedido {
        String nomeProduto;
        int quantidade;
        double precoUnitario;

        ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        double subtotal() {
            return quantidade * precoUnitario;
        }
    }

    ArrayList<ItemPedido> itens = new ArrayList<>();

    void adicionarItem(String nomeProduto, int quantidade, double preco) {
        ItemPedido item = new ItemPedido(nomeProduto, quantidade, preco);
        itens.add(item);
    }

    double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.subtotal();
        }
        return total;
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarItem("Teclado", 2, 150.0);
        pedido.adicionarItem("Mouse", 1, 80.0);

        System.out.println("Valor do pedido total: R$ " + pedido.valorTotal());
    }
}
