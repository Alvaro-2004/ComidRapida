/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package models;

import controller.Controlador;
import views.FrmAtencion;
import views.FrmPedido;


public class NewMain {

    public static void main(String[] args) {
        Controlador control;
        control=new Controlador();
        
        FrmPedido frm1 = new FrmPedido();
        frm1.setControl(control);
        frm1.setVisible(true);
        
        FrmAtencion frm2 = new FrmAtencion();
        frm2.setControl(control);
        frm2.setVisible(true);
    }
    
}
