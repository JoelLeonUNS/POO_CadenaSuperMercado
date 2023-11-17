package Visitor;

import Modelo.ModeloLinea;
import Modelo.ModeloTicket;

public interface IVisitor {
    public double visitarLinea(ModeloLinea modelo);
    public void visitarTicket(ModeloTicket modelo);
}
