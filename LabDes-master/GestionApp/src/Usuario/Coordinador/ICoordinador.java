/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario.Coordinador;

import Controladores.CtrlPrincipal;
import Main.IPrincipal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author Xiomara
 */
public class ICoordinador extends javax.swing.JFrame {

    /**
     * Creates new form ICoordinador
     */
    public ICoordinador() throws SQLException
    {
        int fila=0,columna=0;
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellHeaderRenderer();
        
        initComponents(); 
        CtrlPrincipal.instance().ctrlBD.SetQuery("SELECT MS.ID_MATERIA,MS.SEMESTRE,MS.NOMBRE_MATERIA FROM MATERIA_SEMESTRE MS, COORDINADOR C WHERE MS.ID_MATERIA = C.ID_MATERIA AND MS.SEMESTRE = C.SEMESTRE AND C.CEDULA ="+CtrlPrincipal.instance().sesionCoordinador.getCedula());        
        ResultSet auxRset = CtrlPrincipal.instance().ctrlBD.GetQuery();
     
        while (auxRset.next())
        {
            DefaultTableModel model= (DefaultTableModel) tablaNotificaciones.getModel();
            model.addRow(new Vector());
            tablaNotificaciones.setValueAt(auxRset.getString(1), fila, columna++);
            tablaNotificaciones.setValueAt(auxRset.getString(2), fila, columna++);
            tablaNotificaciones.setValueAt(auxRset.getString(3), fila, columna++);
            columna=0;
            fila++;
        }
        
        jLabel1.setText("Usuario: "+CtrlPrincipal.instance().sesionCoordinador.getNombre()+" "+CtrlPrincipal.instance().sesionCoordinador.getApellido());
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
               
        for(int i = 0; i < this.tablaNotificaciones.getColumnCount(); i++)
            this.tablaNotificaciones.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNotificaciones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        Salir = new javax.swing.JMenu();
        ExitOption = new javax.swing.JMenuItem();
        acciones = new javax.swing.JMenu();
        generarPlanilla = new javax.swing.JMenuItem();
        visualizarPlazas = new javax.swing.JMenuItem();
        publicarConcurso = new javax.swing.JMenuItem();
        enviarSolicitud = new javax.swing.JMenuItem();
        evaluarDcoumento = new javax.swing.JMenuItem();
        completarPerfilAspirante = new javax.swing.JMenuItem();
        aplicarConcurso = new javax.swing.JMenuItem();
        notificarGanador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coordinador");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Materias Coordinadas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 24))); // NOI18N
        jPanel1.setToolTipText("");

        tablaNotificaciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaNotificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Semestre", "Nombre"
            }
        ));
        tablaNotificaciones.setEnabled(false);
        jScrollPane1.setViewportView(tablaNotificaciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );

        Salir.setText("App");
        Salir.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

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

        acciones.setText("Acciones");
        acciones.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        generarPlanilla.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK));
        generarPlanilla.setText("Generar planilla");
        generarPlanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarPlanillaActionPerformed(evt);
            }
        });
        acciones.add(generarPlanilla);

        visualizarPlazas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK));
        visualizarPlazas.setText("Visualizar Plazas");
        visualizarPlazas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarPlazasActionPerformed(evt);
            }
        });
        acciones.add(visualizarPlazas);

        publicarConcurso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        publicarConcurso.setText("Publicar Concurso");
        publicarConcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicarConcursoActionPerformed(evt);
            }
        });
        acciones.add(publicarConcurso);

        enviarSolicitud.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        enviarSolicitud.setText("Enviar Solicitud");
        acciones.add(enviarSolicitud);

        evaluarDcoumento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        evaluarDcoumento.setText("Evaluar Documento");
        acciones.add(evaluarDcoumento);

        completarPerfilAspirante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        completarPerfilAspirante.setText("Completar Perfil de Aspirante");
        acciones.add(completarPerfilAspirante);

        aplicarConcurso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        aplicarConcurso.setText("Aplicar Concurso");
        acciones.add(aplicarConcurso);

        notificarGanador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK));
        notificarGanador.setText("Notificar Ganador");
        notificarGanador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificarGanadorActionPerformed(evt);
            }
        });
        acciones.add(notificarGanador);

        MenuBar.add(acciones);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitOptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitOptionMouseClicked
        try {
            // TODO add your handling code here:
            CtrlPrincipal.instance().selectOption(0);
        } catch (SQLException ex) {
            Logger.getLogger(ICoordinador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ExitOptionMouseClicked

    private void ExitOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitOptionActionPerformed

    private void generarPlanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarPlanillaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generarPlanillaActionPerformed

    private void publicarConcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicarConcursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publicarConcursoActionPerformed

    private void visualizarPlazasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarPlazasActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            CtrlPrincipal.instance().selectOption(40);
        } catch (SQLException ex) {
            Logger.getLogger(IPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_visualizarPlazasActionPerformed

    private void notificarGanadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificarGanadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notificarGanadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExitOption;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu Salir;
    private javax.swing.JMenu acciones;
    private javax.swing.JMenuItem aplicarConcurso;
    private javax.swing.JMenuItem completarPerfilAspirante;
    private javax.swing.JMenuItem enviarSolicitud;
    private javax.swing.JMenuItem evaluarDcoumento;
    private javax.swing.JMenuItem generarPlanilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem notificarGanador;
    private javax.swing.JMenuItem publicarConcurso;
    private javax.swing.JTable tablaNotificaciones;
    private javax.swing.JMenuItem visualizarPlazas;
    // End of variables declaration//GEN-END:variables
    public javax.swing.JTable getJTable(){
        return tablaNotificaciones;
    }
}

