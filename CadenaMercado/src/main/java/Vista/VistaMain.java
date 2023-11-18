package Vista;

import Modelo.ModeloLinea;
import Modelo.ModeloTicket;

public class VistaMain extends javax.swing.JFrame {

    public VistaMain() {
        lookAndFeel();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAr = new javax.swing.JTextArea();
        bttn_iniciar = new javax.swing.JButton();
        bttn_comprar = new javax.swing.JButton();
        bttn_repetir = new javax.swing.JButton();
        bttn_anular = new javax.swing.JButton();
        bttn_devolver = new javax.swing.JButton();
        bttn_descontar = new javax.swing.JButton();
        bttn_finalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        txtAr.setEditable(false);
        txtAr.setColumns(20);
        txtAr.setRows(5);
        txtAr.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane1.setViewportView(txtAr);

        bttn_iniciar.setText("Iniciar");
        bttn_iniciar.setActionCommand("INICIAR");
        bttn_iniciar.setMargin(new java.awt.Insets(6, 12, 6, 12));
        bttn_iniciar.setPreferredSize(new java.awt.Dimension(110, 30));

        bttn_comprar.setText("Comprar");
        bttn_comprar.setActionCommand("COMPRAR");
        bttn_comprar.setEnabled(false);
        bttn_comprar.setMargin(new java.awt.Insets(6, 12, 6, 12));
        bttn_comprar.setPreferredSize(new java.awt.Dimension(110, 30));

        bttn_repetir.setText("Repetir");
        bttn_repetir.setActionCommand("REPETIR");
        bttn_repetir.setEnabled(false);
        bttn_repetir.setMargin(new java.awt.Insets(6, 12, 6, 12));
        bttn_repetir.setPreferredSize(new java.awt.Dimension(110, 30));

        bttn_anular.setText("Anular");
        bttn_anular.setActionCommand("ANULAR");
        bttn_anular.setEnabled(false);
        bttn_anular.setMargin(new java.awt.Insets(6, 12, 6, 12));
        bttn_anular.setPreferredSize(new java.awt.Dimension(110, 30));

        bttn_devolver.setText("Devolver");
        bttn_devolver.setActionCommand("DEVOLVER");
        bttn_devolver.setEnabled(false);
        bttn_devolver.setMargin(new java.awt.Insets(6, 12, 6, 12));
        bttn_devolver.setPreferredSize(new java.awt.Dimension(110, 30));

        bttn_descontar.setText("Descontar");
        bttn_descontar.setActionCommand("DESCONTAR");
        bttn_descontar.setEnabled(false);
        bttn_descontar.setMargin(new java.awt.Insets(6, 12, 6, 12));
        bttn_descontar.setPreferredSize(new java.awt.Dimension(110, 30));

        bttn_finalizar.setText("Finalizar");
        bttn_finalizar.setActionCommand("FINALIZAR");
        bttn_finalizar.setEnabled(false);
        bttn_finalizar.setMargin(new java.awt.Insets(6, 24, 6, 24));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GENERADOR DE TICKET");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bttn_repetir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(bttn_anular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(bttn_descontar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttn_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(bttn_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(bttn_devolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(bttn_finalizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttn_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_devolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttn_repetir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_anular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_descontar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bttn_finalizar)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Visualiza cada línea
    public void visualizar(int nroLineas, ModeloLinea mLinea) {
        txtAr.append("\n" + nroLineas + "  | " + prefijo(mLinea) + " " + mLinea.getLinea().getProducto().getNombre() + "...     " + mLinea.aceptarVisitor());
    }

    private String prefijo(ModeloLinea mLinea) {
        switch (mLinea.getLinea().getClass().getSimpleName()){
            case "Repeticion" -> {
                return "(" + mLinea.getLinea().getCantidad() + "x)";
            }
            case "Anulacion" -> {
                return "(Anul.)";
            }
            case "Devolucion" -> {
                return "(Dev.)";
            }
            default -> {
                return "";
            }
        }
    }
    
    public void Imprimir(ModeloTicket mTicket) {
        txtAr.setText("");
        mTicket.getTicketBD();
        txtAr.append("\nFecha: " + mTicket.getFecha());
        txtAr.append("\nHora: " + mTicket.getHora());
        txtAr.append("\t- - -");
        for (int i = 0; i < mTicket.nroLineas(); i++) {
            txtAr.append("\n" + (i + 1) + "  | " + prefijo(mTicket.getTipoLinea(i), mTicket.getLinea(i).getCantidad()) + " " +  mTicket.getLinea(i).getProducto().getNombre() + "...     " + mTicket.getLinea(i).calcularSubtotal());
        }
        txtAr.append("\nTotal: " + mTicket.calcularTotal());
        txtAr.append("\nTotal: " + mTicket.calcularTotal());
        txtAr.append("\t- - -");
        txtAr.append("Nombre: " + mTicket.getNombre());
        txtAr.append("Apellido: " + mTicket.getApellido());
        txtAr.append("Dni: " + mTicket.getDni());
        txtAr.append("\t- - -");
        txtAr.append("Gracias por su visita");
        txtAr.append("\t- - -");
    }
    
    private String prefijo(String tipo, int cantidad) {
        switch (tipo){
            case "Repeticion" -> {
                return "(" + cantidad + "x)";
            }
            case "Anulacion" -> {
                return "(Anul.)";
            }
            case "Devolucion" -> {
                return "(Dev.)";
            }
            default -> {
                return "";
            }
        }
    }
    
    private void lookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bttn_anular;
    public javax.swing.JButton bttn_comprar;
    public javax.swing.JButton bttn_descontar;
    public javax.swing.JButton bttn_devolver;
    public javax.swing.JButton bttn_finalizar;
    public javax.swing.JButton bttn_iniciar;
    public javax.swing.JButton bttn_repetir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea txtAr;
    // End of variables declaration//GEN-END:variables
}
