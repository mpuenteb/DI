/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_menu;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JMenuItem;

/**
 *
 * @author Maria
 */
public class Menu3 extends javax.swing.JFrame {

    /**
     * Creates new form Menu3
     */
    public Menu3() {
        initComponents();
    }
    
    public void Menu3(){
        oyente o=new oyente();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmOpciones = new javax.swing.JMenu();
        mTamanio = new javax.swing.JMenu();
        miGrande = new javax.swing.JMenuItem();
        miMediano = new javax.swing.JMenuItem();
        mColor = new javax.swing.JMenu();
        miRojo = new javax.swing.JMenuItem();
        miVerde = new javax.swing.JMenuItem();
        miAzul = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jmOpciones.setText("Opciones");
        jmOpciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mTamanio.setText("Tamaño de ventana");
        mTamanio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        miGrande.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        miGrande.setText("Grande");
        miGrande.setPreferredSize(new java.awt.Dimension(69, 22));
        mTamanio.add(miGrande);

        miMediano.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        miMediano.setText("Mediano");
        mTamanio.add(miMediano);

        jmOpciones.add(mTamanio);

        mColor.setText("Color de fondo");
        mColor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        miRojo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        miRojo.setText("Rojo");
        miRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiaColor(evt);
            }
        });
        mColor.add(miRojo);

        miVerde.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        miVerde.setText("Verde");
        miVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiaColor(evt);
            }
        });
        mColor.add(miVerde);

        miAzul.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        miAzul.setText("Azul");
        miAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiaColor(evt);
            }
        });
        mColor.add(miAzul);

        jmOpciones.add(mColor);

        jMenuBar1.add(jmOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiaColor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiaColor
        // identificar el menuItem elegido
        String opcion=evt.getActionCommand();
        
        switch(opcion){
            case("Rojo"): getContentPane().setBackground(Color.red);
            break;
            case("Verde"): getContentPane().setBackground(Color.green);
            break;
            case("Azul"): getContentPane().setBackground(Color.blue); 
            break;
        }
    }//GEN-LAST:event_cambiaColor

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmOpciones;
    private javax.swing.JMenu mColor;
    private javax.swing.JMenu mTamanio;
    private javax.swing.JMenuItem miAzul;
    private javax.swing.JMenuItem miGrande;
    private javax.swing.JMenuItem miMediano;
    private javax.swing.JMenuItem miRojo;
    private javax.swing.JMenuItem miVerde;
    // End of variables declaration//GEN-END:variables
}
