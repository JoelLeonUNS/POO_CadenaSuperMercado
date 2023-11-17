package dominio;

public class Venta extends Linea{

    @Override
    public double calcularSubtotal() {
        this.cantidad = 1;
        return this.producto.getPrecio() * this.cantidad;
    }

}
