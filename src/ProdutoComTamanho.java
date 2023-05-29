package src;

import java.util.Objects;

public class ProdutoComTamanho extends Produto{

    private int tamanho;

    public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho){
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public void setTamanho(int value){
        this.tamanho = value;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProdutoComTamanho produtoComTamanho = (ProdutoComTamanho) o;

        if (Objects.equals(this.getCodigo(), produtoComTamanho.getCodigo()) && Objects.equals(this.getTamanho(), produtoComTamanho.getTamanho())){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getCodigo(), this.getTamanho());
    }


}
