package Visitor;

import Modelo.ModeloLinea;
import Modelo.ModeloTicket;

public class Descuento implements IVisitor{
    
    private double porcentaje;

    public Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    @Override
    public double visitarLinea(ModeloLinea modelo) {
        return modelo.subtotal() * (1 - porcentaje);
    }

    @Override
    public void visitarTicket(ModeloTicket modelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
