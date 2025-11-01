package model;

public final class Cliente extends Usuario {
    private String endereco;
    private String telefone;
    //sobrescrita de método setNome da classe Usuario
    public void setNomeCliente(String nome) {
        super.setNome(nome.toUpperCase());//usuario
    }

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

    @Override
    public void cadastrar() {
        System.out.println("Cliente - método cadastrar"); 
    }

}
