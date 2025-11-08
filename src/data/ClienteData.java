package data;

import java.sql.PreparedStatement;

import model.Cliente;

public class ClienteData extends Conexao
implements Crud{
    public ClienteData() {
        super();
    }

    @Override
    public boolean incluir(Cliente obj) throws Exception {
        String sql="insert into tbusuarios(cpf,nome,email,senha,idstatus) values (?,?,?,?,?)";
        PreparedStatement ps = getConnection().prepareStatement(sql);
        ps.setInt(1, obj.getCpf());
        ps.setString(2, obj.getNome());
        ps.setString(3, obj.getEmail());
        ps.setString(4, obj.getSenha());
        ps.setInt(5, obj.getStatus().getId());
        if(ps.executeUpdate()>0){
            String sql2="insert into tbclientes(cpf,endereco,telefone) values (?,?,?)";
            PreparedStatement ps2 = getConnection().prepareStatement(sql2);
            ps2.setInt(1, obj.getCpf());
            ps2.setString(2, obj.getEndereco());
            ps2.setString(3, obj.getTelefone());
            return ps2.executeUpdate()>0;
        }
        return false;
    }

    @Override
    public boolean alterar(Object obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterar'");
    }

    @Override
    public boolean excluir(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

}
