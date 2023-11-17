package dominio;

public class Anulacion extends Linea{

    @Override
    public double calcularSubtotal() {
        return -this.producto.getPrecio() * this.cantidad;
    }

    

}
