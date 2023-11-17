package Controlador;

import Modelo.ModeloLinea;
import Modelo.ModeloTicket;
import Vista.VistaMain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    private ModeloLinea mProducto;
    private ModeloTicket mTicket;

    private VistaMain vista;

    public Controlador() {
        mProducto = new ModeloLinea();
        mTicket = new ModeloTicket();

        vista.bttn_iniciar.addActionListener(this); // botón iniciar
        vista.bttn_comprar.addActionListener(this); // botón comprar
        vista.bttn_devolver.addActionListener(this); // botón devolver
        vista.bttn_repetir.addActionListener(this); // botón repetir
        vista.bttn_anular.addActionListener(this); // botón anular
        vista.bttn_descontar.addActionListener(this); // botón descontar
        vista.bttn_finalizar.addActionListener(this); // botón finalizar
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "INICIAR" -> {
                
            }
            case "COMPRAR" -> {
                
            }
            case "DEVOLVER" -> {
                
            }
            case "REPETIR" -> {
                
            }
            case "ANULAR" -> {
                
            }
            case "DESCONTAR" -> {
                
            }
            case "FINALIZAR" -> {
                
            }
        }
    }

}
