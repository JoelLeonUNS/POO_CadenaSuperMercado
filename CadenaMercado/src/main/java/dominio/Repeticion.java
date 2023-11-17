package dominio;

public class Repeticion extends Linea{

    @Override
    public double calcularSubtotal() {
        return this.producto.getPrecio() * this.cantidad;
    }

    
}
