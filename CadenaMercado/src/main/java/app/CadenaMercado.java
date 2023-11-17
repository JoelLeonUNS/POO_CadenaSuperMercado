package app;

import AccesoDatos.ProductoDAO;
import Controlador.Controlador;
import dominio.Producto;

public class CadenaMercado {

    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        productosPorDefectos();
        controlador.iniciarVistaMain();
    }
    
    private static void productosPorDefectos() {
        ProductoDAO pDAO = new ProductoDAO();
        pDAO.create(new Producto(1, "1", "Agua Mineral", 1.99, 10));
        pDAO.create(new Producto(2, "2", "Atún enlatado", 2.49, 20));
        pDAO.create(new Producto(3,"3", "Cereal de Avena", 3.00, 15));
        pDAO.create(new Producto(4,"4","Leche desnatada", 1.79, 40));
        pDAO.create(new Producto(5,"5","Filete de pollo", 5.99, 15));
        pDAO.create(new Producto(6,"6","Manzanas", 0.99, 60));
        pDAO.create(new Producto(7,"7","Pan de centeno", 2.29, 25));
        pDAO.create(new Producto(8,"8","Detergente líquido",4.99, 10));
        pDAO.create(new Producto(9,"9","Jabón de manos", 1.49, 35));
        pDAO.create(new Producto(10,"10","Sal marina", 0.79, 50));
        pDAO.create(new Producto(11,"11","Cereales de trigo", 3.49, 33));
        pDAO.create(new Producto(12,"12","Leche entera", 1.99, 45));
        pDAO.create(new Producto(13,"13","Jugo de naranja", 2.29, 40));
        pDAO.create(new Producto(14,"14","Limpiador multiusos", 3.99, 20));
    }
}
