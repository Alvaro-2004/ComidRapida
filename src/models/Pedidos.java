
package models;

public class Pedidos {
    public static int num = 0;
    private int numero;
    private String descripcion;

    public Pedidos(String descripcion) {
        this.descripcion = descripcion;
        this.numero=num;
        num++;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
