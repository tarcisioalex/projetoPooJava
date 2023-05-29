package src;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    Map<Produto, Integer> carrinhoCompras = new HashMap<Produto, Integer>();
    double valorTotal = 0;

    public void adicionaProduto(Produto produto, int quantidade){
        boolean produtoEncontrado = false;

        for (Produto itemCarrinho : carrinhoCompras.keySet()){
            if (produto.equals(itemCarrinho)){
                produtoEncontrado = true;
                break;
            }
        }

        if (produtoEncontrado){
            carrinhoCompras.put(produto, carrinhoCompras.get(produto) + quantidade);
        }else{
            carrinhoCompras.put(produto, quantidade);
        }
    }

    public void removeProduto(Produto produto, int quantidade){
        for (Produto itemCarrinho : carrinhoCompras.keySet()){
            if (produto.equals(itemCarrinho)){
                carrinhoCompras.put(produto, carrinhoCompras.get(produto) - quantidade);

                if (carrinhoCompras.get(produto) <= 0){
                    carrinhoCompras.remove(produto);
                }
                break;
            }
        }
    }

    public double mostrarValorTotalCompra(){
        carrinhoCompras.forEach((key, value) -> {
            System.out.println("--------------------------------------------");
            System.out.println("Código do produto: " + key.getCodigo() + " | quantidade: " + value);
            valorTotal += key.getPreco() * value;
        });

        System.out.println("--------------------------------------------");
        System.out.println("Valor total da compra: R$" + valorTotal);

        return valorTotal;
    }
}
