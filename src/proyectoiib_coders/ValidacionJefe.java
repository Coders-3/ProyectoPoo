/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoiib_coders;

import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo
 */
public class ValidacionJefe extends JDialog {
    
    Busqueda ventanaBusqueda = new Busqueda(this, false);
    Nave nave;        
    DefaultTableModel modeloTabla2;
    public ValidacionJefe(JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        modeloTabla2 = new DefaultTableModel();
        modeloTabla2.addColumn("Velocity");
        modeloTabla2.addColumn("Time");

        //panelDatos.setVisible(true);            //visualizar datos
    }
    
//    public ValidacionJefe() {
//        initComponents();
//        this.setLocationRelativeTo(null);
//        panelDatos.setVisible(true);            //visualizar datos
//    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgBuscar = new javax.swing.ButtonGroup();
        panelDatos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        pnlEngineer = new javax.swing.JPanel();
        lblHead = new javax.swing.JLabel();
        lblNameValidation = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        rbtPorTiempo = new javax.swing.JRadioButton();
        rbtPorVelocidad = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Validation");

        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblDatos);

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEngineer.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingeniero a Cargo"));

        lblHead.setText("Head Engineer:");

        lblNameValidation.setText("Name");

        javax.swing.GroupLayout pnlEngineerLayout = new javax.swing.GroupLayout(pnlEngineer);
        pnlEngineer.setLayout(pnlEngineerLayout);
        pnlEngineerLayout.setHorizontalGroup(
            pnlEngineerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEngineerLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblHead)
                .addGap(68, 68, 68)
                .addComponent(lblNameValidation)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        pnlEngineerLayout.setVerticalGroup(
            pnlEngineerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEngineerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlEngineerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameValidation)
                    .addComponent(lblHead))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));

        btnBuscar.setText("Buscar");
        btnBuscar.setEnabled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btgBuscar.add(rbtPorTiempo);
        rbtPorTiempo.setText("Por Tiempo");
        rbtPorTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtPorTiempoActionPerformed(evt);
            }
        });

        btgBuscar.add(rbtPorVelocidad);
        rbtPorVelocidad.setText("Por Velocidad");
        rbtPorVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtPorVelocidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtPorTiempo)
                .addGap(18, 18, 18)
                .addComponent(rbtPorVelocidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtPorTiempo)
                    .addComponent(rbtPorVelocidad)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlEngineer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlEngineer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        int a;
        String tiempo="";
        String v="";
        int timeF = (int)Math.ceil(nave.getTiempoFinal());
        
        //Referenciar a la tabla de "Busqueda"
        ventanaBusqueda.tblDatosBusqueda.setModel(modeloTabla2);
        
        if(rbtPorTiempo.isSelected()){
            try{
            a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo que desee, rango disponible [0-"+timeF+"]"));
            //Se calcula la velocidad al tiempo ingresado
            if(a>=0&&a<=timeF){
                nave.calcularVelocidad(a);
                v=Double.toString(nave.getVelocidad());//Se transforma en String y se almacena
                tiempo= Integer.toString(a);
                modeloTabla2.addRow(new Object[]{v,tiempo});
                ventanaBusqueda.show();            
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Tiempo Fuera de rango");
            }
            

            

            }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un numero entero");
        }   
        }
        if(rbtPorVelocidad.isSelected()){

            //creando el arreglo
            String[] velocidad= new String[timeF+1];
            nave.setVelocidad(0);

            for (int i = 0; i < timeF+1; i++) {
                nave.calcularVelocidad(i);
                velocidad[i]=Double.toString(nave.getVelocidad());//Se transforma en String y se almacena
            } 
            
            //Agregamos un ComboBox para los datos
            JComboBox cmb1 = new JComboBox(velocidad);
            cmb1.setEditable(true);
            JOptionPane.showMessageDialog(null, cmb1, "Que velocidad desea buscar", JOptionPane.QUESTION_MESSAGE);
            v=cmb1.getSelectedItem().toString();
            
            for (int i = 0; i < timeF+1; i++) {
                nave.calcularVelocidad(i);
                velocidad[i]=Double.toString(nave.getVelocidad());//Se transforma en String y se almacena
                if(velocidad[i].equals(v)){
                    tiempo=Integer.toString(i);
                }
            }
            modeloTabla2.addRow(new Object[]{v,tiempo});
            ventanaBusqueda.show();
            }
        

        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rbtPorVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtPorVelocidadActionPerformed
        // TODO add your handling code here:
        
        btnBuscar.setEnabled(true);
    }//GEN-LAST:event_rbtPorVelocidadActionPerformed

    private void rbtPorTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtPorTiempoActionPerformed
        // TODO add your handling code here:
        
        btnBuscar.setEnabled(true);
    }//GEN-LAST:event_rbtPorTiempoActionPerformed

   
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
            java.util.logging.Logger.getLogger(ValidacionJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValidacionJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValidacionJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValidacionJefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ValidacionJefe dialog = new ValidacionJefe(new JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgBuscar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHead;
    public javax.swing.JLabel lblNameValidation;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel pnlEngineer;
    private javax.swing.JRadioButton rbtPorTiempo;
    private javax.swing.JRadioButton rbtPorVelocidad;
    public javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}
