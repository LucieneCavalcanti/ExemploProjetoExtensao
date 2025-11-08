package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

    public boolean alterar(Status obj) {
        String sql = "update tbStatus set descricao=? where id=?";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, obj.getDescricao());
            ps.setInt(2, obj.getId());
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
    public ArrayList<Status> listar() {
        ArrayList<Status> lista = new ArrayList<>();
        String sql = "SELECT * FROM tbStatus order by descricao";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Status status = new Status();
                status.setId(rs.getInt("id"));
                status.setDescricao(rs.getString("descricao"));
                lista.add(status);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("Erro ao listar status: " + e.getMessage());
        }
        return lista;
    }

}
