package tests;

import src.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarrinhoDeComprasTest {
    @Test
    public void adicionaProdutoTest(){
        CarrinhoDeCompras carrinhoTest = new CarrinhoDeCompras();
        
        ProdutoComTamanho p1 = new ProdutoComTamanho("teste", 1234, 20.0, 12);
        ProdutoComTamanho p2 = new ProdutoComTamanho("teste2", 1254, 30.0, 12);

        carrinhoTest.adicionaProduto(p1, 3);
        carrinhoTest.adicionaProduto(p2, 2);


        assertEquals(120.0 , carrinhoTest.mostrarValorTotalCompra(), 0);
    }

    @Test
    public void removeProdutoTest(){
        CarrinhoDeCompras carrinhoTest = new CarrinhoDeCompras();
        
        ProdutoComTamanho p1 = new ProdutoComTamanho("teste", 1234, 20.0, 12);
        ProdutoComTamanho p2 = new ProdutoComTamanho("teste2", 1254, 30.0, 12);

        carrinhoTest.adicionaProduto(p1, 3);
        carrinhoTest.adicionaProduto(p2, 2);

        carrinhoTest.removeProduto(p2, 1);


        assertEquals(90.0 , carrinhoTest.mostrarValorTotalCompra(), 0);
    }

    @Test
    public void mostrarValorTotalCompraTest(){
        CarrinhoDeCompras carrinhoTest = new CarrinhoDeCompras();
        
        ProdutoComTamanho p1 = new ProdutoComTamanho("teste", 1234, 20.0, 12);
        ProdutoComTamanho p2 = new ProdutoComTamanho("teste2", 1254, 30.0, 12);
        Produto p3 = new Produto("teste3", 1287, 100.0);

        carrinhoTest.adicionaProduto(p1, 3);
        carrinhoTest.adicionaProduto(p2, 2);
        carrinhoTest.adicionaProduto(p3, 5);

        assertEquals(620.0 , carrinhoTest.mostrarValorTotalCompra(), 0);
    }
}


