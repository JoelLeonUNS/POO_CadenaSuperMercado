package Modelo;

import AccesoDatos.ProductoDAO;
import Visitor.Descuento;
import Visitor.FabricaVisitor;
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
    private IVisitor visitor = new Descuento(0.5);

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
        this.visitor = FabricaVisitor.fabricarVisitor(codigoBarra);
    }
    
    public double subtotal(){
        return this.linea.calcularSubtotal();
    }
    
    
    // luego de obtener el producto actulizado por el set()
    public void actualizarStock() {
        linea.getProducto().setStock(linea.getProducto().getStock() - linea.getCantidad());
        pDAO.update(linea.getProducto());
    }
    
    public double aceptarVisitor(){
        return visitor.visitarLinea(this);
    }
}
