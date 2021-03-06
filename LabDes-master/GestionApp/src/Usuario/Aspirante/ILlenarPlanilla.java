/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario.Aspirante;

import Controladores.CtrlAspirante;
import Controladores.CtrlPrincipal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Pedro M
 */
public class ILlenarPlanilla extends javax.swing.JFrame {

    /**
     * Creates new form ILlenarPlanilla
     */
    public ILlenarPlanilla() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_names = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        label_ci = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        label_lugarnacimiento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        label_fechanac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        label_edad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        label_nacionalidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        box_sexo = new javax.swing.JComboBox();
        submit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        Salir = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        ExitOption = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        EditarPerfil = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Solicitud de Empleo"));

        jLabel1.setText("Nombre y Apellidos:");

        label_names.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_namesActionPerformed(evt);
            }
        });

        jLabel2.setText("Cedula:");

        label_ci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_ciActionPerformed(evt);
            }
        });

        jLabel3.setText("Lugar de nacimiento:");

        label_lugarnacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_lugarnacimientoActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha de Nacimiento:");

        label_fechanac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_fechanacActionPerformed(evt);
            }
        });

        jLabel5.setText("Edad");

        label_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_edadActionPerformed(evt);
            }
        });

        jLabel6.setText("Nacionalidad");

        label_nacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                label_nacionalidadActionPerformed(evt);
            }
        });

        jLabel7.setText("Sexo");

        box_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Femenino", "Masculino" }));
        box_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_sexoActionPerformed(evt);
            }
        });

        submit.setText("Generar Planilla");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        back.setText("Regresar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_nacionalidad)
                                    .addComponent(box_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(label_names, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(label_fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_lugarnacimiento)
                                    .addComponent(label_ci, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(label_names, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(label_ci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_lugarnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(label_fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(label_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addComponent(submit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Salir.setText("App");
        Salir.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jMenuItem6.setText("Inicio");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Salir.add(jMenuItem6);

        ExitOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        ExitOption.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        ExitOption.setText("Salir");
        ExitOption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitOptionMouseClicked(evt);
            }
        });
        ExitOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitOptionActionPerformed(evt);
            }
        });
        Salir.add(ExitOption);

        MenuBar.add(Salir);

        jMenu3.setText("Perfil");
        jMenu3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        EditarPerfil.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        EditarPerfil.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        EditarPerfil.setText("Ver");
        EditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarPerfilActionPerformed(evt);
            }
        });
        jMenu3.add(EditarPerfil);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jMenuItem4.setText("Editar");
        jMenu3.add(jMenuItem4);

        MenuBar.add(jMenu3);

        jMenu2.setText("Acciones");
        jMenu2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setText("Llenar planilla");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem2.setText("Consignar Recaudos");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem3.setText("Aceptar Plaza ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem5.setText("Rechazar Plaza");
        jMenu2.add(jMenuItem5);

        MenuBar.add(jMenu2);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_namesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_namesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_namesActionPerformed

    private void label_ciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_ciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_ciActionPerformed

    private void label_lugarnacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_lugarnacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_lugarnacimientoActionPerformed

    private void label_fechanacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_fechanacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_fechanacActionPerformed

    private void label_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_edadActionPerformed

    private void label_nacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_label_nacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_label_nacionalidadActionPerformed

    private void box_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_sexoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void ExitOptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitOptionMouseClicked
        try {
            // TODO add your handling code here:
            CtrlPrincipal.instance().selectOption(0);
        } catch (Exception ex) {
            Logger.getLogger(IAspirante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ExitOptionMouseClicked

    private void ExitOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitOptionActionPerformed

    private void EditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditarPerfilActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            CtrlAspirante.instance().selectOption(4);
        } catch (Exception ex) {
            Logger.getLogger(IAspirante.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_submitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
                try {
            // TODO add your handling code here:
            CtrlAspirante.instance().selectOption(4);
        } catch (Exception ex) {
            Logger.getLogger(IAspirante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backActionPerformed

    public String getLabel_ci() {
        return label_ci.getText();
    }

    public void setLabel_ci(String label_ci) {
        this.label_ci.setText(label_ci);
    }

    public String getLabel_edad() {
        return label_edad.getText();
    }

    public void setLabel_edad(String label_edad) {
        this.label_edad.setText(label_edad);
    }

    public String getLabel_fechanac() {
        return label_fechanac.getText();
    }

    public void setLabel_fechanac(String label_fechanac) {
        this.label_fechanac.setText(label_fechanac);
    }

    public String getLabel_lugarnacimiento() {
        return label_lugarnacimiento.getText();
    }

    public void setLabel_lugarnacimiento(String label_lugarnacimiento) {
        this.label_lugarnacimiento.setText(label_lugarnacimiento);
    }

    public String getLabel_nacionalidad() {
        return label_nacionalidad.getText();
    }

    public void setLabel_nacionalidad(String label_nacionalidad) {
        this.label_nacionalidad.setText(label_nacionalidad);
    }

    public String getLabel_names() {
        return label_names.getText();
    }

    public void setLabel_names(String label_names) {
        this.label_names.setText(label_names);
    }
    public String getBox_Sexo() {
        String x = String.valueOf(this.box_sexo.getSelectedItem());
         return x;
    }

    public void setBox_Sexo(String sexo) {
        if(sexo.equalsIgnoreCase("Femenino"))
            this.box_sexo.setSelectedIndex(1);
        else
            this.box_sexo.setSelectedIndex(2);

    }    

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EditarPerfil;
    private javax.swing.JMenuItem ExitOption;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu Salir;
    private javax.swing.JButton back;
    private javax.swing.JComboBox box_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField label_ci;
    private javax.swing.JTextField label_edad;
    private javax.swing.JTextField label_fechanac;
    private javax.swing.JTextField label_lugarnacimiento;
    private javax.swing.JTextField label_nacionalidad;
    private javax.swing.JTextField label_names;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
