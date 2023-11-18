package Modelo;

import AccesoDatos.ProductoDAO;
import dominio.Producto;

public class ModeloProducto {
    private ProductoDAO pDAO;

    public ModeloProducto() {
        pDAO = new ProductoDAO();
    }
    
    public boolean verificarStock(int cantidad, String codigoBarra) {
        for (Producto producto : pDAO.listado()) {
            if (producto.getCodigo().equals(codigoBarra)) {
                System.out.println("Producto Disponible");
                return (producto.getStock() >= cantidad);
            }
        }
        return false;
    }
    
    
}
