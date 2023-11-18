package dominio;

public class Repeticion extends Linea{
    
    public Repeticion() {
        anulable = true;
    }
    
    @Override
    public double calcularSubtotal() {
        return this.producto.getPrecio() * this.cantidad;
    }
}
