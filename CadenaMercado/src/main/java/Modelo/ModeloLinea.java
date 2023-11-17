package Modelo;

import AccesoDatos.ProductoDAO;
import Visitor.IVisitor;
import dominio.Anulacion;
import dominio.Devolucion;
import dominio.Linea;
import dominio.Producto;
import dominio.Repeticion;
import dominio.Venta;

public class ModeloLinea {
    private Producto producto;
    private Linea linea;
    private ProductoDAO pDAO;
    
    public Linea crearLinea(String linea){
        switch(linea){
            case "VENTA" -> {
                return new Venta();
            }
            case "REPETICION" -> {
                return new Repeticion();
            }
            case "ANULACION" -> {
                return new Anulacion();
            }
            case "DEVOLUCION" -> {
                return new Devolucion();
            }
        }
        return null;
    }

    public Producto getProducto() {
        return linea.getProducto();
    }

    public void setProducto(Producto producto) {
        this.linea.setProducto(producto);
    }

    public Linea getLinea() {
        return linea;
    }

    public void setLinea(Linea linea) {
        this.linea = linea;
    }
    
    public double subtotal(){
        return this.linea.calcularSubtotal();
    }
    
    
    // luego de obtener el producto actulizado por el set()
    public void actualizarStock() {
        pDAO.update(linea.getProducto());
    }
    
//    public void aplicarDescuento(double monto){
//        
//    }
    
    public void aceptarVisitor(IVisitor visitor){
        visitor.visitarLinea(this);
    }
}
