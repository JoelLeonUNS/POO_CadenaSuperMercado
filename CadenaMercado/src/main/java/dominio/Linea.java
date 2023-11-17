
package dominio;

public abstract class Linea {
    protected int id;
    protected int cantidad;
    protected Producto producto;

    public abstract void calcularSubtotal();
}
