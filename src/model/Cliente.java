package model;

public class Cliente extends Usuario {
    private String endereco;
    private String telefone;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente() {
        super();
        endereco = new String();
        telefone = new String();
    }

    public Cliente(int cpf, String nome, String email, String senha, Status status, String endereco, String telefone) {
        super(cpf, nome, email, senha, status);
        this.endereco = endereco;
        this.telefone = telefone;
    }

}
