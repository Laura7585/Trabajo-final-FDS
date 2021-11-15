/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.dto.Producto;

/**
 *
 * @author Laura
 */
public class ProductoDao {

    private ArrayList<Producto> listaProductos;

    public ProductoDao() {
        listaProductos = new ArrayList<>();
    }

    public void crear(Producto producto) {
        listaProductos.add(producto);
        JOptionPane.showMessageDialog(null, "Se creó un nuevo producto con exito!");

    }

    public Producto buscar(int codigo) {

        Producto p = null;
        for (Producto producto : listaProductos) {
            if (producto.getProductCode() == codigo) {
                p = producto;
                break;
            }
        }
        return p;
    }

    public void eliminar(Producto producto) {
        listaProductos.remove(producto);
        JOptionPane.showMessageDialog(null, "Se borró el producto con exito!");
    }

    public ArrayList<Producto> consultarTodos() {

        return null;
    }

    
}
