package Visitor;

import Modelo.ModeloLinea;
import Modelo.ModeloTicket;

public interface IVisitor {
    public void visitarLinea(ModeloLinea modelo);
    public void visitarTicket(ModeloTicket modelo);
}
