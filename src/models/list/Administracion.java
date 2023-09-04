
package models.list;

import java.util.ArrayList;
import models.Pedidos;

public class Administracion implements List<Pedidos>{
    private ArrayList<Pedidos> array;

    public Administracion() {
        array = new ArrayList<>();
    }
    
    

    @Override
    public boolean agregar(Pedidos obj) {
        return array.add(obj);
        }

    @Override
    public boolean eliminar(Pedidos obj) {
        int num = obj.getNumero();
        if (this.buscar(num).equals(obj)){
            return array.remove(obj);
        }
        return false;
    }

    @Override
    public Pedidos buscar(int num) {
        for (Pedidos pedido : array){
           if (pedido.getNumero()==num){
               return pedido;
           }
        }
        return null;
    }
}
