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
    private Linea linea;
    private ProductoDAO pDAO;

    public ModeloLinea() {
        pDAO = new ProductoDAO();
    }
       
    public void crearLinea(String tipo){
        switch(tipo){
            case "VENTA" -> {
                this.linea = new Venta();
            }
            case "REPETICION" -> {
                this.linea = new Repeticion();
            }
            case "ANULACION" -> {
                this.linea = new Anulacion();
            }
            case "DEVOLUCION" -> {
                this.linea = new Devolucion();
            }
            default -> {
                this.linea = null;
            }
        }
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
    
    public void agregarProducto(String codigoBarra) {
        for (Producto producto: pDAO.listado()) {
            if (producto.getCodigo().equals(codigoBarra)) {
                linea.setProducto(producto);
                break;
            } else {
                linea.setProducto(null);
            }
        }
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
