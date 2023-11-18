package dominio;

public class Devolucion extends Linea{

    public Devolucion() {
        anulable = true;
    }

    @Override
    public double calcularSubtotal() {
        return this.producto.getPrecio() * this.cantidad;
    }
}
