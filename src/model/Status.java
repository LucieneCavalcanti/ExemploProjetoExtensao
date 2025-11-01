package model;
public class Status {
    private int id;
    private String descricao;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Status() {
        id = 0;
        descricao = new String();
    }
    public Status(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
}
