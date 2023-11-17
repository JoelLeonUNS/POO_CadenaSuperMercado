package Modelo;

import AccesoDatos.ProductoDAO;
import dominio.Producto;

public class ModeloLinea {
    private Producto producto;
    private ProductoDAO pDAO;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    // luego de obtener el producto actulizado por el set()
    public void actualizarStock() {
        pDAO.update(producto);
    }
}
