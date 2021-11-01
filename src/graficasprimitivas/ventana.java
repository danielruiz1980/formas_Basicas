
package graficasprimitivas;

import clases.acoplada;
import clases.circulo;
import clases.linea;
import clases.poligono;
import java.awt.Graphics;


public class ventana extends javax.swing.JFrame {

  
    public ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    @Override
    public void paint (Graphics g){
        super.paint(g);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        lineas = new javax.swing.JButton();
        circulos = new javax.swing.JButton();
        poligonos = new javax.swing.JButton();
        acopladas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GRAFICAS PRIMITIVAS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 90, 40));

        borrar.setBackground(new java.awt.Color(0, 0, 0));
        borrar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        borrar.setForeground(new java.awt.Color(255, 255, 255));
        borrar.setText("BORRAR");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        lineas.setBackground(new java.awt.Color(0, 0, 0));
        lineas.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lineas.setForeground(new java.awt.Color(255, 255, 255));
        lineas.setText("LÍNEAS");
        lineas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lineasMouseClicked(evt);
            }
        });
        lineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineasActionPerformed(evt);
            }
        });
        getContentPane().add(lineas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        circulos.setBackground(new java.awt.Color(0, 0, 0));
        circulos.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        circulos.setForeground(new java.awt.Color(255, 255, 255));
        circulos.setText("CÍRCULOS");
        circulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                circulosMouseClicked(evt);
            }
        });
        circulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circulosActionPerformed(evt);
            }
        });
        getContentPane().add(circulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        poligonos.setBackground(new java.awt.Color(0, 0, 0));
        poligonos.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        poligonos.setForeground(new java.awt.Color(255, 255, 255));
        poligonos.setText("POLÍGONOS");
        poligonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poligonosMouseClicked(evt);
            }
        });
        poligonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poligonosActionPerformed(evt);
            }
        });
        getContentPane().add(poligonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        acopladas.setBackground(new java.awt.Color(0, 0, 0));
        acopladas.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        acopladas.setForeground(new java.awt.Color(255, 255, 255));
        acopladas.setText("ACOPLADAS");
        acopladas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acopladasActionPerformed(evt);
            }
        });
        getContentPane().add(acopladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 380, 400));

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/screen-8.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void lineasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lineasMouseClicked
        linea.hacerLInea(jPanel1.getGraphics());
        
        
    }//GEN-LAST:event_lineasMouseClicked

    private void lineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lineasActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
               
        jPanel1.repaint();//borrar el panel 
        
    }//GEN-LAST:event_borrarActionPerformed

    private void circulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circulosActionPerformed
        
    }//GEN-LAST:event_circulosActionPerformed

    private void circulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circulosMouseClicked
        
        circulo.hacerCirculo(jPanel1.getGraphics());
    }//GEN-LAST:event_circulosMouseClicked

    private void poligonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poligonosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poligonosActionPerformed

    private void poligonosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poligonosMouseClicked
       poligono.hacerPoligo(jPanel1.getGraphics());
    }//GEN-LAST:event_poligonosMouseClicked

    private void acopladasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acopladasActionPerformed
        acoplada.hacerAcoplada(jPanel1.getGraphics());
        
    }//GEN-LAST:event_acopladasActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acopladas;
    private javax.swing.JButton borrar;
    private javax.swing.JButton circulos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lineas;
    private javax.swing.JButton poligonos;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
