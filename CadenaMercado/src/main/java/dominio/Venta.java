package dominio;

public class Venta extends Linea {

    public Venta() {
        anulable = true;
    }

    @Override
    public double calcularSubtotal() {
        this.cantidad = 1;
        return this.producto.getPrecio() * this.cantidad;
    }
}
