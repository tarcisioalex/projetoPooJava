package tests;

import src.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ProdutoComTamanhoTest {
    @Test
    public void equalsReturnsTrueTest(){
        ProdutoComTamanho p1 = new ProdutoComTamanho("teste", 1234, 20.0, 12);
        ProdutoComTamanho p2 = new ProdutoComTamanho("teste2", 1234, 20.0, 12);

        assertTrue("O método equals está com erros", p1.equals(p2));
    }

    @Test
    public void equalsReturnsFalseTest(){
        ProdutoComTamanho p1 = new ProdutoComTamanho("teste", 1234, 20.0, 12);
        ProdutoComTamanho p2 = new ProdutoComTamanho("teste2", 1234, 20.0, 11);

        assertFalse("O método equals está com erros", p1.equals(p2));
    }

    @Test
    public void hashCodeTest(){
        ProdutoComTamanho p1 = new ProdutoComTamanho("teste", 1234, 20.0, 12);
        ProdutoComTamanho p2 = new ProdutoComTamanho("teste2", 1234, 20.0, 12);

        assertEquals(p1.hashCode(), p2.hashCode());
    }
}

