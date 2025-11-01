package model;

public final  class Funcionario extends Usuario {
    private String setor;
    private String cargo;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario() {
        super();
        setor = new String();
        cargo = new String();
    }

    public Funcionario(int cpf, String nome, String email, String senha, Status status, String setor, String cargo) {
        super(cpf, nome, email, senha, status);
        this.setor = setor;
        this.cargo = cargo;
    }

    @Override
    public void cadastrar() {
        System.out.println("teste cadastro no funcionário");  }

}
