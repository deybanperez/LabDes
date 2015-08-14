    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario.Aspirante;

import Controladores.CtrlAspirante;
import Controladores.CtrlPrincipal;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author soluciones
 */
public class IAspirar extends javax.swing.JFrame {

    /**
     * Creates new form IAspirar
     */
    public IAspirar() {
        initComponents();
        
        
        try {
        int fila=0,columna=0;
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellHeaderRenderer();
        
        
        CtrlPrincipal.instance().ctrlBD.SetQuery("SELECT USUARIO.NOMBRE_USUARIO, USUARIO.APELLIDO, USUARIO.CORREOE, MATERIA_SEMESTRE.NOMBRE_MATERIA, MATERIA_SEMESTRE.SEMESTRE, CONCURSO.FECHA_INICIO, CONCURSO.FECHA_FIN, CONCURSO.ID_CONCURSO, CONCURSO.ID_MATERIA, CONCURSO.CEDULA_COORDINADOR FROM USUARIO, MATERIA_SEMESTRE, CONCURSO WHERE CONCURSO.CEDULA_COORDINADOR=USUARIO.CEDULA AND CONCURSO.ID_MATERIA = MATERIA_SEMESTRE.ID_MATERIA");
        ResultSet auxRset = CtrlPrincipal.instance().ctrlBD.GetQuery();
        CtrlAspirante.instance().ids_concurso = new ArrayList();
        CtrlAspirante.instance().ids_coordinador = new ArrayList();
        CtrlAspirante.instance().ids_materia = new ArrayList();        
                
        while (auxRset.next())
        {
            DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
            model.addRow(new Vector());
            this.jTable1.setValueAt(auxRset.getString(1)+" "+auxRset.getString(2), fila, columna++);
            this.jTable1.setValueAt(auxRset.getString(3), fila, columna++);
            this.jTable1.setValueAt(auxRset.getString(4), fila, columna++);
            this.jTable1.setValueAt(auxRset.getString(5), fila, columna++); 
            this.jTable1.setValueAt(auxRset.getString(6), fila, columna++);
            this.jTable1.setValueAt(auxRset.getString(7), fila, columna++);
            ArrayList<String> x = CtrlAspirante.instance().ids_concurso;
            CtrlAspirante.instance().ids_concurso.add(auxRset.getString(8));
            CtrlAspirante.instance().ids_materia.add(auxRset.getString(9));
            CtrlAspirante.instance().ids_coordinador.add(auxRset.getString(10));
            columna=0;
            fila++;
        }
        
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
               
        for(int i = 0; i < this.jTable1.getColumnCount(); i++)
            this.jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        
        
        if(this.jTable1.getRowCount() > 0 )
            {
                this.label_coordinador.setText(this.jTable1.getModel().getValueAt(0,0).toString());
                this.label_correo.setText(this.jTable1.getModel().getValueAt(0,1).toString());
                this.label_materia.setText(this.jTable1.getModel().getValueAt(0,2).toString());
                this.label_semestre.setText(this.jTable1.getModel().getValueAt(0,3).toString());
                this.label_fechain.setText(this.jTable1.getModel().getValueAt(0,4).toString());
                this.label_fechafin.setText(this.jTable1.getModel().getValueAt(0,5).toString());
            }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(IAspirante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label_coordinador = new javax.swing.JTextField();
        label_correo = new javax.swing.JTextField();
        label_materia = new javax.swing.JTextField();
        label_semestre = new javax.swing.JTextField();
        label_fechain = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        label_fechafin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Aspirar Concurso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 24))); // NOI18N
        jPanel1.setToolTipText("");

        lCodigo.setText("Coordinador:");

        jLabel2.setText("Correo:");

        jLabel3.setText("Materia");

        jLabel4.setText("Fecha Fin:");

        jLabel6.setText("Semestre:");

        jLabel7.setText("Fecha inicio:");

        label_coordinador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_coordinador.setToolTipText("");
        label_coordinador.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        label_coordinador.setEnabled(false);

        label_correo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_correo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        label_correo.setEnabled(false);

        label_materia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_materia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        label_materia.setEnabled(false);
        label_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_materiaActionPerformed(evt);
            }
        });

        label_semestre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_semestre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        label_semestre.setEnabled(false);
        label_semestre.setSelectionColor(new java.awt.Color(0, 0, 0));
        label_semestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_semestreActionPerformed(evt);
            }
        });

        label_fechain.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_fechain.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        label_fechain.setEnabled(false);
        label_fechain.setSelectionColor(new java.awt.Color(0, 0, 0));
        label_fechain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_fechainActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        submit.setText("Enviar");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coordinador", "Correo", "Materia", "Semestre", "Fecha inicio", "Fecha fin"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        label_fechafin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_fechafin.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        label_fechafin.setEnabled(false);
        label_fechafin.setSelectionColor(new java.awt.Color(0, 0, 0));
        label_fechafin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_fechafinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(105, 105, 105))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(111, 111, 111))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(109, 109, 109))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(113, 113, 113))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_fechain, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_semestre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_materia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_correo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_coordinador, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_fechafin, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(label_coordinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(label_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(label_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(label_fechain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label_fechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_materiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_materiaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
        try {
           
        CtrlPrincipal.instance().selectOption(70);
        }
         catch (SQLException ex) {
            Logger.getLogger(IAspirante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IAspirar.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_submitMouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        try {

        CtrlAspirante.instance().selectOption(9);
        } 
         catch (SQLException ex) {
            Logger.getLogger(IAspirante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IAspirar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_submitActionPerformed

    private void label_fechainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_fechainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_fechainActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try
        {
            int row = jTable1.getSelectedRow();

            this.label_coordinador.setText(jTable1.getModel().getValueAt(row, 0).toString());
            this.label_correo.setText(jTable1.getModel().getValueAt(row, 1).toString());
            this.label_materia.setText(jTable1.getModel().getValueAt(row, 2).toString());
            this.label_semestre.setText(jTable1.getModel().getValueAt(row, 3).toString());
            this.label_fechain.setText(jTable1.getModel().getValueAt(row, 4).toString());
            this.label_fechafin.setText(jTable1.getModel().getValueAt(row, 4).toString());
            CtrlAspirante.instance().selected = row;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void label_fechafinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_fechafinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_fechafinActionPerformed

    private void label_semestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_semestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_semestreActionPerformed

public String getLabel_Semestre(){
return label_semestre.getText();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JTextField label_coordinador;
    private javax.swing.JTextField label_correo;
    private javax.swing.JTextField label_fechafin;
    private javax.swing.JTextField label_fechain;
    private javax.swing.JTextField label_materia;
    private javax.swing.JTextField label_semestre;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables

    public boolean EmptyFields()
    {
        if(!(label_fechain.getText().isEmpty() || label_fechafin.getText().isEmpty() || label_materia.getText().isEmpty()))
            return true;
    
        return false;
    }



}