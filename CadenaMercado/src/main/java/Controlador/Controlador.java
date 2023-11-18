package Controlador;

import Modelo.ModeloLinea;
import Modelo.ModeloTicket;
import Vista.VistaMain;
import Vista.VistaOneInput;
import Vista.VistaThreeInput;
import Vista.VistaTwoInput;
import dominio.Linea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;

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
    private String tipoLinea;

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

    private void switchCaso1(boolean b) {
        vista.bttn_iniciar.setEnabled(!b);
        vista.bttn_devolver.setEnabled(b);
        vista.bttn_comprar.setEnabled(b);
        vista.bttn_repetir.setEnabled(b);
    }

    private void switchCaso2(boolean b) {
        vista.bttn_devolver.setEnabled(!b);
        vista.bttn_anular.setEnabled(b);
        vista.bttn_descontar.setEnabled(b);
        vista.bttn_finalizar.setEnabled(b);
    }

    private void switchCaso3(boolean b) {
        vista.bttn_anular.setEnabled(!b);
        vista.bttn_comprar.setEnabled(!b);
        vista.bttn_repetir.setEnabled(!b);
        vista.bttn_finalizar.setEnabled(b);
    }

    private void switchCaso4(boolean b) {
        vista.bttn_anular.setEnabled(!b);
        vista.bttn_descontar.setEnabled(!b);
        vista.bttn_comprar.setEnabled(!b);
        vista.bttn_repetir.setEnabled(!b);
        vista.bttn_finalizar.setEnabled(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            // Botones Vista Principal
            case "INICIAR" -> {
                vista.txtAr.setText("");
                mTicket.setFecha(LocalDate.now());
                mTicket.setHora(LocalTime.now());
                vista.visualizar(mTicket, mLinea);
                iniciarVistaThreeInput();
                switchCaso1(true);
            }
            case "COMPRAR" -> {
                vista.bttn_devolver.setEnabled(false);
                mLinea.crearLinea("VENTA");
                tipoLinea = "VENTA";
                vOneInput.setLabel("Código de Barras");
                iniciarVistaOneInput();
                switchCaso2(true);
            }
            case "DEVOLVER" -> {
                mLinea.crearLinea("DEVOLUCION");
                iniciarVistaTwoInput();
                switchCaso4(true);
            }
            case "REPETIR" -> {
                vista.bttn_devolver.setEnabled(false);
                mLinea.crearLinea("REPETICION");
                iniciarVistaTwoInput();
                switchCaso2(true);
            }
            case "ANULAR" -> {
                mLinea.crearLinea("ANULACION");
                tipoLinea = "ANULACION";
                vOneInput.setLabel("Nro. de Línea");
                iniciarVistaOneInput();
            }
            case "DESCONTAR" -> {
                vOneInput.setLabel("Código de Descuento");
                iniciarVistaOneInput();
                switchCaso3(true);
            }
            case "FINALIZAR" -> {
                switchCaso1(false);
                mTicket.finalizar();
                vista.imprimir(mTicket);
            }
            // Botones Ventanas Emergentes
            case "ACEPTAR_UNO" -> { // aceptar para un input
                vista.setEnabled(true);
                if (tipoLinea.equals("ANULACION")) {
                    Linea linea = mTicket.getLinea(Integer.valueOf(vOneInput.txtFld_primero.getText()) - 1);
                    if(linea.getClass().getSimpleName().equals("Anulacion")){
                        System.out.println("No se puede anular esta linea");
                    }else{
                        mLinea.setCantidad(linea.getCantidad());
                        mLinea.agregarProducto(linea.getProducto().getCodigo());
                        procesar();
                    }
                } else {
                    mLinea.setCantidad(1);
                    mLinea.agregarProducto(vOneInput.txtFld_primero.getText());
                    procesar();
                }
                vOneInput.dispose();
            }
            case "ACEPTAR_DOS" -> { // aceptar para dos inputs
                vista.setEnabled(true);
                mLinea.setCantidad(Integer.valueOf(vTwoInput.txtFld_segundo.getText()));
                mLinea.agregarProducto(vTwoInput.txtFld_primero.getText());
                procesar();
                vTwoInput.dispose();
            }
            case "AGREGAR" -> { // Agregar cliente (tres inputs)
                vista.setEnabled(true);
                mTicket.agregarCliente(vThreeInput.txtFld_nombre.getText(), vThreeInput.txtFld_apellido.getText(), vThreeInput.txtFld_dni.getText());
                vThreeInput.dispose();
            }
        }
    }
    
    private void procesar(){
        mLinea.actualizarStock();
        mTicket.agregarLinea(mLinea.getLinea());
        mTicket.calcularTotal();
        vista.visualizar(mTicket, mLinea);
    }

}
