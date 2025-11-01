package data;

import java.sql.PreparedStatement;

import model.Status;

public class StatusData extends Conexao { //implements Crud {

    public boolean incluir(Status obj) {
        String sql = "INSERT INTO tbStatus (descricao) VALUES (?)";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, obj.getDescricao());
            //var ps = getConnection().prepareStatement(sql);
            //ps.setString(1, ((Status)obj).getDescricao());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Erro ao incluir status: " + e.getMessage());
            return false;
        }
        return true;
    }

    public boolean alterar(Object obj) {
        return true;
    }

    public boolean excluir(int id) {
        String sql = "DELETE FROM tbStatus WHERE id = ?";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            //var ps = getConnection().prepareStatement(sql);
            //ps.setString(1, ((Status)obj).getDescricao());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Erro ao excluir status: " + e.getMessage());
            return false;
        }
       return true;
    }


}
