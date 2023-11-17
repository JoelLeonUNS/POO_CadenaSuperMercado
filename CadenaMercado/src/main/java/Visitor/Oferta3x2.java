package Visitor;

import Modelo.ModeloLinea;
import Modelo.ModeloTicket;

public class Oferta3x2 implements IVisitor {

    @Override
    public double visitarLinea(ModeloLinea modelo) {
        int unidadesCobrar;
        int cantidad = modelo.getLinea().getCantidad();
        
        if(cantidad % 3 == 0){
            unidadesCobrar = cantidad / 3 * 2;
        }else{            
            unidadesCobrar = cantidad - (int) Math.floor(cantidad/3);
        }
        return modelo.getProducto().getPrecio() * unidadesCobrar;
    }

    @Override
    public void visitarTicket(ModeloTicket modelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
