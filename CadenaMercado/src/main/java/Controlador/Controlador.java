package Controlador;

import Modelo.ModeloLinea;
import Modelo.ModeloTicket;
import Vista.VistaMain;
import Vista.VistaOneInput;
import Vista.VistaThreeInput;
import Vista.VistaTwoInput;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    // Modelos
    private ModeloLinea mProducto;
    private ModeloTicket mTicket;
    // Vistas
    private VistaMain vista;
    private VistaOneInput vOneInput;
    private VistaTwoInput vTwoInput;
    private VistaThreeInput vThreeInput;

    public Controlador() {
        // Inicializar Modelos
        mProducto = new ModeloLinea();
        mTicket = new ModeloTicket();
        // Inicializar Vistas
        vista = new VistaMain();
        vOneInput = new VistaOneInput();
        vTwoInput = new VistaTwoInput();
        vThreeInput = new VistaThreeInput();
        // Botones Vista Principal
        vista.bttn_iniciar.addActionListener(this); // botón iniciar
        vista.bttn_comprar.addActionListener(this); // botón comprar
        vista.bttn_devolver.addActionListener(this); // botón devolver
        vista.bttn_repetir.addActionListener(this); // botón repetir
        vista.bttn_anular.addActionListener(this); // botón anular
        vista.bttn_descontar.addActionListener(this); // botón descontar
        vista.bttn_finalizar.addActionListener(this); // botón finalizar
        // Botones Ventanas Emergentes
        vOneInput.bttn_aceptar.addActionListener(this); // botón aceptar (un input)
        vTwoInput.bttn_aceptar.addActionListener(this); // botón aceptar (dos inputs)
        vThreeInput.bttn_agregar.addActionListener(this); // botón aceptar (tres inputs)
    }
    
    public void iniciarVistaMain() {
        vista.setTitle("Cadena de Supermercado");
        vista.setLocationRelativeTo(null);
        vista.setResizable(false);
        vista.setVisible(true);
    }
    
    public void iniciarVistaOneInput() {
        vOneInput.setTitle("Ingresar Datos");
        vOneInput.setLocationRelativeTo(null);
        vOneInput.setResizable(false);
        vOneInput.setVisible(true);
        vista.setEnabled(false);
    }
    
    public void iniciarVistaTwoInput() {
        vTwoInput.setTitle("Ingresar Datos");
        vTwoInput.setLocationRelativeTo(null);
        vTwoInput.setResizable(false);
        vTwoInput.setVisible(true);
        vista.setEnabled(false);
    }
    
    public void iniciarVistaThreeInput() {
        vThreeInput.setTitle("Ingresar Cliente");
        vThreeInput.setLocationRelativeTo(null);
        vThreeInput.setResizable(false);
        vThreeInput.setVisible(true);
        vista.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            // Botones Vista Principal
            case "INICIAR" -> {
                iniciarVistaThreeInput();
            }
            case "COMPRAR" -> {
                vOneInput.setLabel("Código de Barras");
                iniciarVistaOneInput();
            }
            case "DEVOLVER" -> {
                iniciarVistaTwoInput();
            }
            case "REPETIR" -> {
                iniciarVistaTwoInput();
            }
            case "ANULAR" -> {
                vOneInput.setLabel("Nro. de Línea");
                iniciarVistaOneInput();
            }
            case "DESCONTAR" -> {
                vOneInput.setLabel("Código de Descuento");
                iniciarVistaOneInput();
            }
            case "FINALIZAR" -> {
                
            }
            // Botones Ventanas Emergentes
            case "ACEPTAR_UNO" -> { // aceptar para un input
                vista.setEnabled(true);
                vOneInput.dispose();
            }
            case "ACEPTAR_DOS" -> { // aceptar para dos inputs
                vista.setEnabled(true);
                vTwoInput.dispose();
            }
            case "AGREGAR" -> { // Agregar cliente (tres inputs)
                vista.setEnabled(true);
                vThreeInput.dispose();
            }
        }
    }

}
