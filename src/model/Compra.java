package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compra {
    private int id;//PK
    private Cliente cliente;
    private LocalDate data;
    private double valorTotal;
    private double desconto;
    private String observacoes;
    private String metodoPagamento;
    private ArrayList<ItemCompra> itens = new ArrayList<>();
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    public String getMetodoPagamento() {
        return metodoPagamento;
    }
    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    public ArrayList<ItemCompra> getItens() {
        return itens;
    }
    public void setItens(ArrayList<ItemCompra> itens) {
        this.itens = itens;
    }
    
    public Compra(int id, Cliente cliente, LocalDate data, double valorTotal, double desconto, String observacoes,
            String metodoPagamento, ArrayList<ItemCompra> itens) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
        this.observacoes = observacoes;
        this.metodoPagamento = metodoPagamento;
        this.itens = itens;
    }
    public Compra() {
        id = 0;
        cliente = new Cliente();
        data = LocalDate.now();
        valorTotal = 0.0;
        desconto = 0.0;
        observacoes = new String();
        metodoPagamento = new String();
        itens = new ArrayList<>();
    }


}
