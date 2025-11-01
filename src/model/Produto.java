package model;

public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidade;
    private String categoria;
    private Status status;
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Produto(int codigo, String descricao, double preco, int quantidade, String categoria, Status status) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.status = status;
    }
    public Produto() {
        codigo = 0;
        descricao = new String();
        preco = 0.0;
        quantidade = 0;
        categoria = new String();
        status = new Status();
    }
    
}
