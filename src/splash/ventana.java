/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ventana.java
 *
 * Created on 03/10/2009, 13:35:44
 */

package splash;

/**
 *
 * @author zxero
 */
public class ventana extends javax.swing.JFrame {

    /** Creates new form ventana */
    public ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla Ingreso");
        setMinimumSize(new java.awt.Dimension(490, 390));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton3.setText("Salir");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(60, 310, 180, 41);

        jLabel2.setFont(new java.awt.Font("DejaVu Serif", 1, 18));
        jLabel2.setText("Nombre de usuario");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 120, 167, 24);

        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 1, 18));
        jLabel3.setText("Clave de acceso");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 190, 144, 24);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(240, 220, 230, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llaves.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 10, 61, 59);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 80, 420, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arnold" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(240, 150, 210, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 2, 2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14));
        jLabel5.setText("Ingrese su Nombre y Clave de Acceso");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 40, 260, 17);

        jButton2.setText("Ingresar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 310, 180, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10));
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("¿Olvidó su clave de acceso? Haga click Aquí");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(240, 260, 199, 13);

        jLabel6.setFont(new java.awt.Font("Algerian", 2, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FOTO");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 100, 200, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        
}//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.dispose();
        new principal().setVisible(true);
}//GEN-LAST:event_jButton2MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new ventana().setVisible(true);



            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
