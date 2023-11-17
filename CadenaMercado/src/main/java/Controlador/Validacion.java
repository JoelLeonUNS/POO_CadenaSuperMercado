package Controlador;


import javax.swing.JOptionPane;

public class Validacion {

    public boolean checkInteger(String entrada) {
        boolean valido = false;
        int x = 0;
        try {
            x = Integer.parseInt(entrada);
            valido = true;
        } catch (NumberFormatException nfe) {
            this.showError("Error: No es número");
        }
        return valido;
    }

    public void showError(String s) {
        JOptionPane.showMessageDialog(null, s);
    }
}
