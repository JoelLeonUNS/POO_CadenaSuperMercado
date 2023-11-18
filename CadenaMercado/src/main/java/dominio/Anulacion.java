package dominio;

public class Anulacion extends Linea{

    public Anulacion() {
        anulable = false;
    }

    @Override
    public double calcularSubtotal() {
        return this.producto.getPrecio() * this.cantidad;
    }
}
