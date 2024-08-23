/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.en.raya;


import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Vista extends javax.swing.JFrame {
    boolean estado = true;
    String nextgame = "O";
    String turn = "X";
    JLabel lbs [] = new JLabel [9];
    int victorias[][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {1,4,7},
        {2,5,8},
        {3,6,9},
        {1,5,9},
        {3,5,7}
    };
    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/consola.png")).getImage());
        lbs[0]=Casilla1;
        lbs[1]=Casilla2;
        lbs[2]=Casilla3;
        lbs[3]=Casilla4;
        lbs[4]=Casilla5;
        lbs[5]=Casilla6;
        lbs[6]=Casilla7;
        lbs[7]=Casilla8;
        lbs[8]=Casilla9;
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Casilla1 = new javax.swing.JLabel();
        Casilla2 = new javax.swing.JLabel();
        Casilla3 = new javax.swing.JLabel();
        Casilla4 = new javax.swing.JLabel();
        Casilla5 = new javax.swing.JLabel();
        Casilla6 = new javax.swing.JLabel();
        Casilla7 = new javax.swing.JLabel();
        Casilla8 = new javax.swing.JLabel();
        Casilla9 = new javax.swing.JLabel();
        Btnreiniciar = new javax.swing.JButton();
        Lbturn = new javax.swing.JLabel();
        Lbx = new javax.swing.JLabel();
        Lbo = new javax.swing.JLabel();
        Lbpts1 = new javax.swing.JLabel();
        Lbpts2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La vieja");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        Casilla1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Casilla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla1.setOpaque(true);
        Casilla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla1MousePressed(evt);
            }
        });

        Casilla2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Casilla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla2.setOpaque(true);
        Casilla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla2MousePressed(evt);
            }
        });

        Casilla3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Casilla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla3.setOpaque(true);
        Casilla3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla3MousePressed(evt);
            }
        });

        Casilla4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Casilla4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla4.setOpaque(true);
        Casilla4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla4MousePressed(evt);
            }
        });

        Casilla5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Casilla5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla5.setOpaque(true);
        Casilla5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla5MousePressed(evt);
            }
        });

        Casilla6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Casilla6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla6.setOpaque(true);
        Casilla6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla6MousePressed(evt);
            }
        });

        Casilla7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Casilla7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla7.setOpaque(true);
        Casilla7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla7MousePressed(evt);
            }
        });

        Casilla8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Casilla8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla8.setOpaque(true);
        Casilla8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla8MousePressed(evt);
            }
        });

        Casilla9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Casilla9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Casilla9.setOpaque(true);
        Casilla9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Casilla9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(Casilla4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Casilla5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Casilla6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(Casilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Casilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Casilla3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Casilla7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Casilla8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Casilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Casilla4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Casilla7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        Btnreiniciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btnreiniciar.setText("Reiniciar");
        Btnreiniciar.setContentAreaFilled(false);
        Btnreiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btnreiniciar.setOpaque(false);
        Btnreiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnreiniciarActionPerformed(evt);
            }
        });
        jPanel1.add(Btnreiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 140, 40));

        Lbturn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lbturn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbturn.setText("Turno de X");
        jPanel1.add(Lbturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 37));

        Lbx.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Lbx.setText("X = ");
        jPanel1.add(Lbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        Lbo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Lbo.setText("O = ");
        jPanel1.add(Lbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        Lbpts1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Lbpts1.setText("0");
        jPanel1.add(Lbpts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        Lbpts2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Lbpts2.setText("0");
        jPanel1.add(Lbpts2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, -7, 410, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Casilla1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla1MousePressed
    presionar(1);
    }//GEN-LAST:event_Casilla1MousePressed

    private void Casilla2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla2MousePressed
    presionar(2);
    }//GEN-LAST:event_Casilla2MousePressed

    private void Casilla3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla3MousePressed
    presionar(3);
    }//GEN-LAST:event_Casilla3MousePressed

    private void Casilla4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla4MousePressed
    presionar(4);
    }//GEN-LAST:event_Casilla4MousePressed

    private void Casilla5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla5MousePressed
    presionar(5);
    }//GEN-LAST:event_Casilla5MousePressed

    private void Casilla6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla6MousePressed
    presionar(6);
    }//GEN-LAST:event_Casilla6MousePressed

    private void Casilla7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla7MousePressed
    presionar(7);
    }//GEN-LAST:event_Casilla7MousePressed

    private void Casilla8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla8MousePressed
    presionar(8);
    }//GEN-LAST:event_Casilla8MousePressed

    private void Casilla9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Casilla9MousePressed
    presionar(9);
    }//GEN-LAST:event_Casilla9MousePressed

    private void BtnreiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnreiniciarActionPerformed
        for (int i = 0; i < lbs.length; i++) {
           lbs[i].setText("");
           lbs[i].setBackground(java.awt.Color.white);
           estado = true;
           
        }
        turn = nextgame;
        if(nextgame.equals("O")){
            nextgame="X";
        }else{
          nextgame="O";  
        }
        Lbturn.setText("Turno de " + turn);
    }//GEN-LAST:event_BtnreiniciarActionPerformed

   public void presionar (int casilla){
    if(lbs[casilla-1].getText().equals("") && (estado)){
       lbs[casilla-1].setText(turn);
       cambiarturno();
       comprobarwiner();
   }  
  }
   
   public void cambiarturno(){
    if(turn.equals("X")){
       turn = "O"; 
    }else{
        turn = "X";
    }
    Lbturn.setText("Turno de " + turn);
   }
   
   public void comprobarwiner(){
       for (int i = 0; i < victorias.length; i++) {
           if(lbs[victorias[i][0]-1].getText().equals("X") &&
           lbs[victorias[i][1]-1].getText().equals("X") &&
           lbs[victorias[i][2]-1].getText().equals("X")){
               
           lbs[victorias[i][0]-1].setBackground(java.awt.Color.green);
           lbs[victorias[i][1]-1].setBackground(java.awt.Color.green);
           lbs[victorias[i][2]-1].setBackground(java.awt.Color.green);
           Lbpts1.setText(Integer.toString(Integer.parseInt(Lbpts1.getText())+1));
           Lbturn.setText("Ganó X");
           estado = false;
           
           
        } 
          if(lbs[victorias[i][0]-1].getText().equals("O") &&
           lbs[victorias[i][1]-1].getText().equals("O") &&
           lbs[victorias[i][2]-1].getText().equals("O")){
              
          lbs[victorias[i][0]-1].setBackground(java.awt.Color.green);
          lbs[victorias[i][1]-1].setBackground(java.awt.Color.green);
          lbs[victorias[i][2]-1].setBackground(java.awt.Color.green);    
          Lbpts2.setText(Integer.toString(Integer.parseInt(Lbpts2.getText())+1));    
          Lbturn.setText("Ganó O");  
          estado = false;
       }else{
           Lbturn.setText("Empate");     
          }
     }
   }     
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnreiniciar;
    private javax.swing.JLabel Casilla1;
    private javax.swing.JLabel Casilla2;
    private javax.swing.JLabel Casilla3;
    private javax.swing.JLabel Casilla4;
    private javax.swing.JLabel Casilla5;
    private javax.swing.JLabel Casilla6;
    private javax.swing.JLabel Casilla7;
    private javax.swing.JLabel Casilla8;
    private javax.swing.JLabel Casilla9;
    private javax.swing.JLabel Lbo;
    private javax.swing.JLabel Lbpts1;
    private javax.swing.JLabel Lbpts2;
    private javax.swing.JLabel Lbturn;
    private javax.swing.JLabel Lbx;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
