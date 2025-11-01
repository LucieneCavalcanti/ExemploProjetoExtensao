import java.util.Scanner;

import data.Conexao;
import data.StatusData;
import model.Cliente;
import model.Funcionario;
import model.Status;
import model.Usuario;

public class TesteExecucao {
public static void main(String[] args) {
    //Usuario u1 = new Usuario(); // classe é abstract
    // Funcionario f1 = new Funcionario();
    // Cliente c1 = new Cliente();
    // c1.setNome("Maria");
    // c1.setCpf(121212122);
    // System.out.println("Nome do cliente: " + c1.getNome());

   // Conexao con = new Conexao();
   StatusData DAO = new StatusData();
   Status s1 = new Status();
   Scanner ler = new Scanner(System.in);
   System.out.println("Digite a descrição do status:"); 
   s1.setDescricao(ler.next());
   if(DAO.incluir(s1)){
       System.out.println("Status incluído com sucesso!");
   } else {
       System.out.println("Erro ao incluir status.");
   }

   System.out.println("Digite o ID do status a ser excluído:");
    int idExcluir = ler.nextInt();
    if(DAO.excluir(idExcluir)){
        System.out.println("Status excluído com sucesso!");
    } else {
        System.out.println("Erro ao excluir status.");
    }
}
}
