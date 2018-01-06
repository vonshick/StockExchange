/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockExchange.GUI;

import StockExchange.GUI.elem.PapWarLista;
import StockExchange.GUI.elem.RynSur;
import StockExchange.GUI.elem.RynWal;

/**
 *
 * @author jakub
 */
public class WyborGieldy extends javax.swing.JFrame {

    /**
     * Creates new form WyborGieldy
     */
    public WyborGieldy() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dodGieEt = new javax.swing.JLabel();
        dodajSur = new javax.swing.JButton();
        dodajWal = new javax.swing.JButton();
        dodajPapWar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Giełdy");

        dodGieEt.setText("Dodaj giełdę...");

        dodajSur.setText("Surowców");
        dodajSur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajSurActionPerformed(evt);
            }
        });

        dodajWal.setText("Walut");
        dodajWal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajWalActionPerformed(evt);
            }
        });

        dodajPapWar.setText("Papierów wartościowych");
        dodajPapWar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajPapWarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dodGieEt)
                .addGap(203, 203, 203))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dodajWal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dodajSur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dodajPapWar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(dodGieEt)
                .addGap(40, 40, 40)
                .addComponent(dodajPapWar)
                .addGap(18, 18, 18)
                .addComponent(dodajSur)
                .addGap(18, 18, 18)
                .addComponent(dodajWal)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dodajPapWarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajPapWarActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PapWarLista().setVisible(true);
            }
        });
    }//GEN-LAST:event_dodajPapWarActionPerformed

    private void dodajSurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajSurActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RynSur().setVisible(true);
            }
        });
    }//GEN-LAST:event_dodajSurActionPerformed

    private void dodajWalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajWalActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RynWal().setVisible(true);
            }
        });        // TODO add your handling code here:
    }//GEN-LAST:event_dodajWalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dodGieEt;
    private javax.swing.JButton dodajPapWar;
    private javax.swing.JButton dodajSur;
    private javax.swing.JButton dodajWal;
    // End of variables declaration//GEN-END:variables
}