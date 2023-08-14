/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4guia2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sabrina
 */
public class ListaPrecio extends javax.swing.JInternalFrame {
private DefaultTableModel modelo=new DefaultTableModel();
   public boolean isCellEditable(int f, int c){
       return false;
   }
    /**
     * Creates new form ListaPrecio
     */
    public ListaPrecio() {
        initComponents();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtMinimo = new javax.swing.JTextField();
        jtMaximo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();

        setClosable(true);
        setTitle("Busqueda por Precio");

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel1.setText("Lista por Precio");

        jLabel2.setText("Entre $");

        jLabel3.setText("y");

        jtMinimo.setToolTipText("");
        jtMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMinimoActionPerformed(evt);
            }
        });
        jtMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtMinimoKeyReleased(evt);
            }
        });

        jtMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMaximoActionPerformed(evt);
            }
        });
        jtMaximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtMaximoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtMaximoKeyReleased(evt);
            }
        });

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMinimoActionPerformed
      
    }//GEN-LAST:event_jtMinimoActionPerformed

    private void jtMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMaximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMaximoActionPerformed

    private void jtMaximoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMaximoKeyPressed
      
    }//GEN-LAST:event_jtMaximoKeyPressed

    private void jtMinimoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMinimoKeyReleased
       Double minimo=Double.parseDouble(jtMinimo.getText());
       Double maximo=Double.parseDouble(jtMaximo.getText());
        try{
       borrarFilas();
        for(Productos prod:MenuGeneral.listaProductos){
           if(minimo<=prod.getPrecio() && maximo>=prod.getPrecio()){
               modelo.addRow(new Object[]{prod.getCodigo(),prod.getDescripcion(),prod.getPrecio(),prod.getStock()});
           }
       }}catch(NumberFormatException e){
           JOptionPane.showMessageDialog(this, "Debe ser un numero","Error",JOptionPane.ERROR_MESSAGE);
       }catch(Exception e){
           JOptionPane.showMessageDialog(this, "Debe ser un numero","Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jtMinimoKeyReleased

    private void jtMaximoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMaximoKeyReleased
       
        Double minimo=Double.parseDouble(jtMinimo.getText());
       Double maximo=Double.parseDouble(jtMaximo.getText());
        try{
       borrarFilas();
        for(Productos prod:MenuGeneral.listaProductos){
           if(minimo<=prod.getPrecio() && maximo>=prod.getPrecio()){
               modelo.addRow(new Object[]{prod.getCodigo(),prod.getDescripcion(),prod.getPrecio(),prod.getStock()});
           }
       }}catch(NumberFormatException e){
           JOptionPane.showMessageDialog(this, "Debe ser un numero","Error",JOptionPane.ERROR_MESSAGE);
       }catch(Exception e){
           JOptionPane.showMessageDialog(this, "Debe ser un numero","Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jtMaximoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtMaximo;
    private javax.swing.JTextField jtMinimo;
    private javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables
  private void armarCabecera(){
    modelo.addColumn("Codigo");
    modelo.addColumn("Descripcion");
    modelo.addColumn("Precio");
    modelo.addColumn("Stock");
    jtProductos.setModel(modelo);
}
private void borrarFilas(){
    int f=jtProductos.getRowCount()-1;
    //for(int filas =f;filas>=0;filas--)
    for(;f>=0;f--){
        modelo.removeRow(f);
    }
}



}
