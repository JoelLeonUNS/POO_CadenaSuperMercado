
package dominio;

public abstract class Linea {
    protected int id;
    protected int cantidad;
    protected double subtotalNeto;
    protected Producto producto;

    public abstract double calcularSubtotal();
        
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotalNeto() {
        return subtotalNeto;
    }

    public void setSubtotalNeto(double subtotalNeto) {
        this.subtotalNeto = subtotalNeto;
    }

}
