
package models;

public class Pedidos {
    public static int num;
    private int numero;
    private String descripcion;

    public Pedidos(String descripcion) {
        num++;
        this.descripcion = descripcion;
        this.numero=num;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
