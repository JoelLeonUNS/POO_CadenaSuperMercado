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
    private ModeloLinea mLinea;
    private ModeloTicket mTicket;
    // Vistas
    private VistaMain vista;
    private VistaOneInput vOneInput;
    private VistaTwoInput vTwoInput;
    private VistaThreeInput vThreeInput;
    // Atributos
    

    public Controlador() {
        // Inicializar Modelos
        mLinea = new ModeloLinea();
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
    
    private void switchBotones(boolean b) {
        vista.bttn_iniciar.setEnabled(!b);
        vista.bttn_anular.setEnabled(b);
        vista.bttn_comprar.setEnabled(b);
        vista.bttn_devolver.setEnabled(b);
        vista.bttn_descontar.setEnabled(b);
        vista.bttn_repetir.setEnabled(b);
        vista.bttn_finalizar.setEnabled(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            // Botones Vista Principal
            case "INICIAR" -> {
                vista.txtAr.setText("");
                iniciarVistaThreeInput();
                switchBotones(true);
            }
            case "COMPRAR" -> {
                mLinea.crearLinea("VENTA");
                vOneInput.setLabel("Código de Barras");
                iniciarVistaOneInput();
            }
            case "DEVOLVER" -> {
                mLinea.crearLinea("DEVOLUCION");
                iniciarVistaTwoInput();
            }
            case "REPETIR" -> {
                mLinea.crearLinea("REPETICION");
                iniciarVistaTwoInput();
            }
            case "ANULAR" -> {
                mLinea.crearLinea("ANULACION");
                vOneInput.setLabel("Nro. de Línea");
                iniciarVistaOneInput();
            }
            case "DESCONTAR" -> {
                vOneInput.setLabel("Código de Descuento");
                iniciarVistaOneInput();
            }
            case "FINALIZAR" -> {
                switchBotones(false);
                // impresión
            }
            // Botones Ventanas Emergentes
            case "ACEPTAR_UNO" -> { // aceptar para un input
                vista.setEnabled(true);
                mLinea.getLinea().setCantidad(1);
                mLinea.agregarProducto(vOneInput.txtFld_primero.getText());
                mLinea.actualizarStock();
                vista.visualizar(mTicket.nroLineas(), mLinea);
                vOneInput.dispose();
            }
            case "ACEPTAR_DOS" -> { // aceptar para dos inputs
                vista.setEnabled(true);
                mLinea.getLinea().setCantidad(Integer.valueOf(vTwoInput.txtFld_segundo.getText()));
                mLinea.agregarProducto(vTwoInput.txtFld_primero.getText());
                mLinea.actualizarStock();
                vista.visualizar(mTicket.nroLineas(), mLinea);
                vTwoInput.dispose();
            }
            case "AGREGAR" -> { // Agregar cliente (tres inputs)
                vista.setEnabled(true);
                mTicket.agregarCliente(vThreeInput.txtFld_nombre.getText(), vThreeInput.txtFld_apellido.getText(), vThreeInput.txtFld_dni.getText());
                vista.txtAr.append(mTicket.visualizarCliente() + "\n");
                vThreeInput.dispose();
            }
        }
    }

}
