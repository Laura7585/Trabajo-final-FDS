/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.dao.ProductoDao;
import modelo.dto.Producto;
import ui.UiProducto;

/**
 * Esta clase
 *
 * @author Laura
 */
public class ControllerProducto implements ActionListener {

    private UiProducto uiProducto;
    private Producto producto;
    private ProductoDao modeloP;

    //Recibe por agregación de una clase externa
    public ControllerProducto(UiProducto uiProducto) {
        //AGREGACIÓN
        this.uiProducto = uiProducto;
        //COMPOSICIÓN
        this.modeloP = new ProductoDao();
        this.uiProducto.btnBuscar.addActionListener(this);
        this.uiProducto.btnCrearProducto.addActionListener(this);
        this.uiProducto.btnBorrar.addActionListener(this);
        this.uiProducto.btnEditar.addActionListener(this);
        //HACE VISIBLE EL FORMULARIO DE PRODUCTO
        this.uiProducto.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(this.uiProducto.btnCrearProducto)) {
            //evento
            int codigo = Integer.valueOf(this.uiProducto.codProducto.getText());
            String descripcion = this.uiProducto.desProducto.getText();
            long precio = Integer.valueOf(this.uiProducto.precioUProducto.getText());
            int cantidad = Integer.valueOf(this.uiProducto.cantidadProducto.getText());

            producto = new Producto();
            producto.setProductCode(codigo);
            producto.setTotalAmount(cantidad);
            producto.setDescription(descripcion);
            producto.setUnitPrice(precio);
            
            // Llama a la función crear del Dao y envía el objeto producto
            modeloP.crear(producto);
        }

        if (ae.getSource().equals(this.uiProducto.btnBuscar)) {
            int codigo = Integer.valueOf(this.uiProducto.codProducto.getText());
            Producto productos = modeloP.buscar(codigo);

            if (productos == null) {
                JOptionPane.showMessageDialog(null, "El código no se encontró");
            } else {
                this.uiProducto.desProducto.setText(productos.getDescription());
                this.uiProducto.precioUProducto.setText(String.valueOf(productos.getUnitPrice()));
                this.uiProducto.cantidadProducto.setText(String.valueOf(productos.getTotalAmount()));
            }
        }
        
        if(ae.getSource().equals(this.uiProducto.btnBorrar)){
            int codigo = Integer.valueOf(this.uiProducto.codProducto.getText());
            Producto productos1 = modeloP.buscar(codigo);
            if (productos1 == null){
                JOptionPane.showMessageDialog(null, "El código no se encontró");
            } else {
               modeloP.eliminar(productos1);
            }
        }
        
        if (ae.getSource().equals(this.uiProducto.btnEditar)){
            int codigo = Integer.valueOf(this.uiProducto.codProducto.getText());
            Producto productos2 =modeloP.buscar(codigo);
            if (productos2 == null){
                JOptionPane.showMessageDialog(null,  "El código no se encontró");
            }
            else{
            productos2.setDescription(this.uiProducto.desProducto.getText());
            productos2.setTotalAmount(Integer.valueOf(this.uiProducto.cantidadProducto.getText()));
            productos2.setUnitPrice(Integer.valueOf(this.uiProducto.precioUProducto.getText()));
             JOptionPane.showMessageDialog(null,  "Se actualizó el producto con exito!");
            }            
        }
    }    
   
}
