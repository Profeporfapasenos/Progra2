/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2;

/**
 *
 * @author Jose Daniel
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        CbDia.removeAllItems();
        CbDia.addItem("1");
        CbDia.addItem("2");
        CbDia.addItem("3");
        CbDia.addItem("4");
        CbDia.addItem("5");
        CbDia.addItem("6");
        CbDia.addItem("7");
        CbDia.addItem("8");
        CbDia.addItem("9");
        CbDia.addItem("10");
        CbDia.addItem("11");
        CbDia.addItem("12");
        CbDia.addItem("13");
        CbDia.addItem("14");
        CbDia.addItem("15");
        CbDia.addItem("16");
        CbDia.addItem("17");
        CbDia.addItem("18");
        CbDia.addItem("19");
        CbDia.addItem("20");
        CbDia.addItem("21");
        CbDia.addItem("22");
        CbDia.addItem("23");
        CbDia.addItem("24");
        CbDia.addItem("25");
        CbDia.addItem("26");
        CbDia.addItem("27");
        CbDia.addItem("28");
        CbDia.addItem("29");
        CbDia.addItem("30");
        CbDia.addItem("31");
        
        CbMes.removeAllItems();
        CbMes.addItem("Enero");
        CbMes.addItem("Febrero");
        CbMes.addItem("Marzo");
        CbMes.addItem("Abril");
        CbMes.addItem("Mayo");
        CbMes.addItem("Junio");
        CbMes.addItem("Julio");
        CbMes.addItem("Agosto");
        CbMes.addItem("Septiembre");
        CbMes.addItem("Octubre");
        CbMes.addItem("Noviembre");
        CbMes.addItem("Diciembre");
        
        CbAño.removeAllItems();
        CbAño.addItem("2000");
        CbAño.addItem("1999");
        CbAño.addItem("1998");
        CbAño.addItem("1997");
        CbAño.addItem("1996");
        CbAño.addItem("1995");
        CbAño.addItem("1994");
        CbAño.addItem("1993");
        CbAño.addItem("1992");
        CbAño.addItem("1991");
        
        CbPadecimiento.removeAllItems();
        CbPadecimiento.addItem("Infarto");
        CbPadecimiento.addItem("Perdida de sangre por herida");
        CbPadecimiento.addItem("Parto");
        CbPadecimiento.addItem("Dolor estomacal");
        CbPadecimiento.addItem("Quebradura");
        CbPadecimiento.addItem("Otro");
        
        CbCondicion.removeAllItems();
        CbCondicion.addItem("Verde");
        CbCondicion.addItem("Amarillo");
        CbCondicion.addItem("Rojo");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableVerdes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaAmarillos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BttIngreso = new javax.swing.JButton();
        TxtNombre = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtDetalle = new javax.swing.JTextArea();
        CbDia = new javax.swing.JComboBox<>();
        CbMes = new javax.swing.JComboBox<>();
        CbAño = new javax.swing.JComboBox<>();
        CbPadecimiento = new javax.swing.JComboBox<>();
        CbCondicion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BttLiberarA = new javax.swing.JButton();
        BttAtenderA = new javax.swing.JButton();
        BttLiberaryAtenderA = new javax.swing.JButton();
        BttLiberarV = new javax.swing.JButton();
        BttAtenderV = new javax.swing.JButton();
        BttLiberaryAtenderV = new javax.swing.JButton();
        BttLiberarR = new javax.swing.JButton();
        BttAtenderR = new javax.swing.JButton();
        BttLiberaryAtenderR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Consu.", "Ficha", "Nombre", "Condicion", "Telefono", "Padecimiento", "Detalle"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        TableVerdes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Consu.", "Ficha", "Nombre", "Condicion", "Telefono", "Padecimiento", "Detalle"
            }
        ));
        jScrollPane2.setViewportView(TableVerdes);

        TablaAmarillos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Consu.", "Ficha", "Nombre", "Condicion", "Telefono", "Padecimiento", "Detalle"
            }
        ));
        jScrollPane3.setViewportView(TablaAmarillos);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel1.setText("Ingreso de pacientes");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del paciente");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel3.setText("Fecha de nacimiento");

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel4.setText("Padecimiento");

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setText("Detalle del paciente");

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel6.setText("Condicion");

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel7.setText("Telefono");

        BttIngreso.setText("Ingresar");

        TxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefonoActionPerformed(evt);
            }
        });

        TxtDetalle.setColumns(20);
        TxtDetalle.setRows(5);
        jScrollPane4.setViewportView(TxtDetalle);

        CbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CbPadecimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CbCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel8.setText("Gestion de consultorios");

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel9.setText("Consultorios Verdes");

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel10.setText("Consultorios Amarillos");

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel11.setText("Consultorios Rojos");

        BttLiberarA.setText("Liberar");

        BttAtenderA.setText("Atender");

        BttLiberaryAtenderA.setText("Liberar y atender");

        BttLiberarV.setText("Liberar");

        BttAtenderV.setText("Atender");

        BttLiberaryAtenderV.setText("Liberar y atender");

        BttLiberarR.setText("Liberar");

        BttAtenderR.setText("Atender");

        BttLiberaryAtenderR.setText("Liberar y atender");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(CbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(CbAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CbPadecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(39, 39, 39)
                            .addComponent(jScrollPane4)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(BttIngreso))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(39, 39, 39)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39)
                        .addComponent(CbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(184, 184, 184)
                                            .addComponent(jLabel11))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(BttLiberaryAtenderV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BttLiberaryAtenderA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BttLiberaryAtenderR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BttAtenderV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BttLiberarV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BttLiberarA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BttAtenderA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BttLiberarR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BttAtenderR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(0, 164, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel9)
                                    .addGap(452, 452, 452)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(83, 83, 83))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel10)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CbPadecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BttLiberarV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BttAtenderV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BttLiberaryAtenderV)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BttLiberarA))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addComponent(BttIngreso))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BttAtenderA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BttLiberaryAtenderA)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BttLiberarR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BttAtenderR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BttLiberaryAtenderR)))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttAtenderA;
    private javax.swing.JButton BttAtenderR;
    private javax.swing.JButton BttAtenderV;
    private javax.swing.JButton BttIngreso;
    private javax.swing.JButton BttLiberarA;
    private javax.swing.JButton BttLiberarR;
    private javax.swing.JButton BttLiberarV;
    private javax.swing.JButton BttLiberaryAtenderA;
    private javax.swing.JButton BttLiberaryAtenderR;
    private javax.swing.JButton BttLiberaryAtenderV;
    private javax.swing.JComboBox<String> CbAño;
    private javax.swing.JComboBox<String> CbCondicion;
    private javax.swing.JComboBox<String> CbDia;
    private javax.swing.JComboBox<String> CbMes;
    private javax.swing.JComboBox<String> CbPadecimiento;
    private javax.swing.JTable TablaAmarillos;
    private javax.swing.JTable TableVerdes;
    private javax.swing.JTextArea TxtDetalle;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
