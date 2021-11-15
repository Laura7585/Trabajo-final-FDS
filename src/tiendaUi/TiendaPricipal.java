/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaUi;

import controller.ControllerProducto;
import ui.UiProducto;


/**
 *
 * @author Laura
 */
public class TiendaPricipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Agregación porque está enviando un objeto.
       ControllerProducto controllerP = new ControllerProducto(new UiProducto());
    }
}
