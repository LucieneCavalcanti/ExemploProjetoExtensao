import model.Cliente;
import model.Funcionario;
import model.Usuario;

public class TesteExecucao {
public static void main(String[] args) {
    //Usuario u1 = new Usuario(); // classe é abstract
    Funcionario f1 = new Funcionario();
    Cliente c1 = new Cliente();
    c1.setNome("Maria");
    c1.setCpf(121212122);
    System.out.println("Nome do cliente: " + c1.getNome());
}
}
