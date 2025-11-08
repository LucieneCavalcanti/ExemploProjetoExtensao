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
//    StatusData DAO = new StatusData();
//    Status s1 = new Status();
//    Scanner ler = new Scanner(System.in);
//    System.out.println("Digite a descrição do status:"); 
//    s1.setDescricao(ler.next());
//    if(DAO.incluir(s1)){
//        System.out.println("Status incluído com sucesso!");
//    } else {
//        System.out.println("Erro ao incluir status.");
//    }

//    System.out.println("Digite o ID do status a ser excluído:");
//     int idExcluir = ler.nextInt();
//     if(DAO.excluir(idExcluir)){
//         System.out.println("Status excluído com sucesso!");
//     } else {
//         System.out.println("Erro ao excluir status.");
//     }
//MENU
    int opcao = 0;
    do{
        System.out.println("---- MENU PRINCIPAL ---- ");
        System.out.println("-- STATUS");
        System.out.println("11 - Cadastrar novo status");
        System.out.println("12 - Excluir status");
        System.out.println("13 - Listar todos os status");
        System.out.println("14 - Consultar status por ID");
        System.out.println("15 - Editar status");
        System.out.println("------------------------");
        System.out.println("2 - CLIENTE");
        System.out.println("3 - FUNCIONÁRIO");
        System.out.println("4 - USUÁRIO");
        System.out.println("5 - PRODUTO");  
        System.out.println("6 - PEDIDO");
        System.out.println("7 - SAIR");
        System.out.print("Escolha uma opção: ");
        Scanner ler = new Scanner(System.in);
        opcao = ler.nextInt();
        switch (opcao) {
            case 11:
                Status status = new Status();
                System.out.println("---- CADASTRO DE STATUS ---- ");
                System.out.print("Digite a descrição do status: ");
                String descricao = ler.next();
                status.setDescricao(descricao);
                StatusData statusData = new StatusData();
                if(statusData.incluir(status)){
                    System.out.println("Status incluído com sucesso!");
                } else {
                    System.out.println("Erro ao incluir status.");
                }
                break;
            case 12:
                System.out.println("---- EXCLUSÃO DE STATUS ---- ");
                System.out.print("Digite o ID do status a ser excluído: ");
                int idExcluir = ler.nextInt();
                StatusData statusDataExcluir = new StatusData();
                if(statusDataExcluir.excluir(idExcluir)){
                    System.out.println("Status excluído com sucesso!");
                } else {
                    System.out.println("Erro ao excluir status.");
                }
                break;
            case 13:
                System.out.println("---- LISTA DE STATUS ---- ");
                StatusData statusDataListar = new StatusData();
                for(Status s : statusDataListar.listar()){
                    System.out.println("ID: " + s.getId() + 
                     " - Descrição:" + s.getDescricao());
                }
                break;
            default:
                break;
        }
    } while (opcao!=7);
}
}
