
package Visitor;

public class FabricaVisitor {
    
    public static IVisitor fabricarVisitor(String codigo){
        switch(codigo){
            case "4" -> {
                //Descuento para el producto 1
                return new Descuento(0.5);
            }
            case "5" -> {
                //Producto 2 esta en 2x1
                return new Oferta2x1();
            }
            case "6" -> {
                //Producto 3 está en 3x2
                return new Oferta3x2();
            }
        }
        return new Normal();
    }
}
