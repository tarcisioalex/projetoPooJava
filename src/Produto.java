package src;

import java.util.Objects;

public class Produto{

    private String nome;
    private int codigo;
    private double preco;

    public Produto(String nome, int codigo, double preco){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String value){
        this.nome = value;
    }
    
    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int value){
        this.codigo = value;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double value){
        this.preco = value;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(this.codigo, produto.getCodigo());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.codigo);
    }


}