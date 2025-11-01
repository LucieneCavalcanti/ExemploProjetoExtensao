package model;

public class Usuario {
    private int cpf;
    private String nome;
    private String email;
    private String senha;
    private Status status;
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public Usuario() {
        cpf = 0;
        nome = new String();
        email = new String();
        senha = new String();
        status = new Status();//?????
    }
    public Usuario(int cpf, String nome, String email, String senha, Status status) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.status = status;
    }
    
}
