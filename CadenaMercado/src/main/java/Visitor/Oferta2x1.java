package Visitor;

import Modelo.ModeloLinea;
import Modelo.ModeloTicket;

public class Oferta2x1 implements IVisitor {

    @Override
    public double visitarLinea(ModeloLinea modelo) {
        double unidadesCobrar;
        double cantidad = modelo.getLinea().getCantidad();
                
        if(cantidad % 2 == 0){
            return modelo.subtotal() / 2;
        }else{
            unidadesCobrar = Math.ceil(cantidad / 2);
        }
        return modelo.getProducto().getPrecio() * unidadesCobrar;
    }

    @Override
    public void visitarTicket(ModeloTicket modelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
