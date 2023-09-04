
package models.list;


public interface List<Type> {
    public boolean agregar(Type obj);
    public boolean eliminar(Type obj);
    public Type buscar(int num);
    
}
