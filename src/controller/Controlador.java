package controller;

import java.util.ArrayList;
import models.Pedidos;
import models.list.Administracion;

public class Controlador {
    
    private Administracion adm;
    
    public Controlador() {
        adm= new Administracion();
    }
    
    public void crear(String desc){
        Pedidos pedidos = new Pedidos(desc);
        adm.agregar(pedidos);
    }
    
    public Pedidos buscar(){
        return adm.siguiente();
    }
    
    public ArrayList getArray(){
        return adm.getArray();
    }
}
