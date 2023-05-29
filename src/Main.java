package src;

public class Main{
    public static void main(String args[]){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Produto p1 = new Produto("Travesseiro", 123, 20.0);
        Produto p2 = new Produto("Vinho", 124, 30.0);
        ProdutoComTamanho p3 = new ProdutoComTamanho("sapato preto", 12345, 60.0, 12);
        ProdutoComTamanho p4 = new ProdutoComTamanho("sapato branco", 13456, 50.0, 11);

        carrinho.adicionaProduto(p1, 2);
        carrinho.adicionaProduto(p2, 1);
        carrinho.adicionaProduto(p3, 3);
        carrinho.adicionaProduto(p4, 2);

        carrinho.removeProduto(p3, 1);

        carrinho.mostrarValorTotalCompra();
    }
}