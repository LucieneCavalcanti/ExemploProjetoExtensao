package model;

public class ItemCompra {
    private Compra compra; //FK
    private Produto produto; //FK
    private int quantidade;
    private double preco;
    private double desconto;

    
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public ItemCompra(Produto produto, int quantidade, double preco, double desconto, Compra compra) {
        this.compra = compra;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.desconto = desconto;
    }
    public ItemCompra() {
        compra = new Compra();
        produto = new Produto();
        quantidade = 0;
        preco = 0.0;
        desconto = 0.0;
    }
    public Compra getCompra() {
        return compra;
    }
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    
}
