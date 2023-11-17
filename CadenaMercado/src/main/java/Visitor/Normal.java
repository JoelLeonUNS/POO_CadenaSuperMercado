
package Visitor;

import Modelo.ModeloLinea;
import Modelo.ModeloTicket;

public class Normal implements IVisitor {

    @Override
    public double visitarLinea(ModeloLinea modelo) {
        return modelo.subtotal();
    }

    @Override
    public void visitarTicket(ModeloTicket modelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
