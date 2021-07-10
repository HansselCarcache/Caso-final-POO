/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hanss
 */
public class Bodega {
    private int Id;
    private String nombre;
    private String descripcion;
    private List<Productos> productos = new ArrayList();

    public Bodega() {
    }

    @Override
    public String toString() {
        return "Bodega{" + "Id=" + Id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", productos=" + productos + '}';
    }

    public Bodega(int Id, String nombre, String descripcion) {
        this.Id = Id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
