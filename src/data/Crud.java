package data;

public interface Crud {
    public boolean incluir(Object obj);
    public boolean alterar(Object obj);
    public boolean excluir(int id);
    
    // public Object buscarPorId(int id);
    // public Object[] buscarTodos();
}
