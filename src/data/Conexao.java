package data;

import java.sql.Connection;

public class Conexao {
    private Connection connection;
    public Connection getConnection() {
        return connection;
    }
    public Conexao(){
        String url = "jdbc:sqlserver://LAB01-Prof:1433;databaseName=bdProjetoExemplo;encrypt=false;trustServerCertificate=true";
        String user = "aluno";   
        String password = "dba";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = java.sql.DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
