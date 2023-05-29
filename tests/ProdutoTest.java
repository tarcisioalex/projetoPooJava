package tests;

import src.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ProdutoTest {
    @Test
    public void equalsReturnsTrueTest(){
        Produto p1 = new Produto("teste", 1234, 20.0);
        Produto p2 = new Produto("teste2", 1234, 20.0);

        assertTrue("O método equals está com erros", p1.equals(p2));
    }

    @Test
    public void equalsReturnsFalseTest(){
        Produto p1 = new Produto("teste", 124, 20.0);
        Produto p2 = new Produto("teste2", 1234, 20.0);

        assertFalse("O método equals está com erros", p1.equals(p2));
    }

    @Test
    public void hashCodeTest(){
        Produto p1 = new Produto("teste", 1234, 20.0);
        Produto p2 = new Produto("teste2", 1234, 20.0);

        assertEquals(p1.hashCode(), p2.hashCode());
    }
}
