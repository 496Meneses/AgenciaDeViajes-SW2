/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import utilidades.Utilidades;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author libardo
 */
public class GUIMenu extends javax.swing.JFrame {

    /**
     * Creates new form GUIMenu
     */
    public GUIMenu() {
        initComponents();
        //Poner el icono de la aplicación
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/recursos/logo.png");
        this.setIconImage(icon);

        ponerUsuarioLogueado();
        fijarPrivilegios();
    }

    private void ponerUsuarioLogueado() {
        
        if (Utilidades.usuario == null) {
            this.mnuEmpleadoLogueado.setText("(Anónimo)");
        } else {
            this.mnuEmpleadoLogueado.setText("(" + Utilidades.usuario.getLogin() + ")");
        }
         
    }

    private void fijarPrivilegios() {
        /*
        Empleados empleado = Utilidades.empleadoSesion;
        if (empleado != null) {
            if (empleado.getCargo().equals("A")) {
                //Admin
            } else {
                //Empleado normal
                mnuConfiguracion.setVisible(false);
                mnuInformes.setVisible(false);
            }
        }
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuPaqueteTodoIncluido = new javax.swing.JMenu();
        mnuPaquetesPersonalizados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuPaquetesTodoIncluido = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        mnuInformes = new javax.swing.JMenu();
        mnuIngresosPorFecha = new javax.swing.JMenuItem();
        mnuConsultaAbierta = new javax.swing.JMenuItem();
        mnuConfiguracion = new javax.swing.JMenu();
        mnuConfiguracionTarifas = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuAgentes = new javax.swing.JMenuItem();
        btnInicializar = new javax.swing.JMenuItem();
        mnuUsuariosSistema = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuAcercaDe = new javax.swing.JMenuItem();
        mnuEmpleadoLogueado = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración de Parqueadero");

        mnuPaqueteTodoIncluido.setText("Opciones");

        mnuPaquetesPersonalizados.setText("Paquetes Personalizados");
        mnuPaquetesPersonalizados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPaquetesPersonalizadosActionPerformed(evt);
            }
        });
        mnuPaqueteTodoIncluido.add(mnuPaquetesPersonalizados);
        mnuPaqueteTodoIncluido.add(jSeparator1);

        mnuPaquetesTodoIncluido.setText("Paquetes todo incluido");
        mnuPaquetesTodoIncluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPaquetesTodoIncluidoActionPerformed(evt);
            }
        });
        mnuPaqueteTodoIncluido.add(mnuPaquetesTodoIncluido);

        jMenuItem1.setText("Ventas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuPaqueteTodoIncluido.add(jMenuItem1);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuPaqueteTodoIncluido.add(mnuSalir);

        jMenuBar1.add(mnuPaqueteTodoIncluido);

        mnuInformes.setText("Informes");

        mnuIngresosPorFecha.setText("Ingresos por fecha");
        mnuIngresosPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIngresosPorFechaActionPerformed(evt);
            }
        });
        mnuInformes.add(mnuIngresosPorFecha);

        mnuConsultaAbierta.setText("Consulta Abierta");
        mnuConsultaAbierta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaAbiertaActionPerformed(evt);
            }
        });
        mnuInformes.add(mnuConsultaAbierta);

        jMenuBar1.add(mnuInformes);

        mnuConfiguracion.setText("Configuracion");

        mnuConfiguracionTarifas.setText("Configuración de Tarifas");
        mnuConfiguracionTarifas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConfiguracionTarifasActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mnuConfiguracionTarifas);
        mnuConfiguracion.add(jSeparator2);

        mnuAgentes.setText("Agentes de viaje");
        mnuAgentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgentesActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mnuAgentes);

        btnInicializar.setText("Inicializar datos");
        btnInicializar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicializarActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(btnInicializar);

        mnuUsuariosSistema.setText("Usuarios del sistema");
        mnuConfiguracion.add(mnuUsuariosSistema);

        jMenuBar1.add(mnuConfiguracion);

        mnuAyuda.setText("Ayuda");

        mnuAcercaDe.setText("Acerca de");
        mnuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAcercaDeActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuAcercaDe);

        jMenuBar1.add(mnuAyuda);

        mnuEmpleadoLogueado.setBackground(java.awt.Color.magenta);
        mnuEmpleadoLogueado.setForeground(java.awt.SystemColor.activeCaption);
        mnuEmpleadoLogueado.setText("Usuario_logueado");
        mnuEmpleadoLogueado.setEnabled(false);
        jMenuBar1.add(mnuEmpleadoLogueado);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuPaquetesPersonalizadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPaquetesPersonalizadosActionPerformed
        GUIPaquetesPersonalizados ins = GUIPaquetesPersonalizados.getInstance();
        if (!ins.isShowing()) {
             ins.setMaximizable(true);
            dskEscritorio.add(ins);
            ins.show();
        }
       
    }//GEN-LAST:event_mnuPaquetesPersonalizadosActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAcercaDeActionPerformed
        // TODO add your handling code here:
        String str = "Agencia de viajes demo \n"
                + "Version 0.1 - Julio 6 de 2019 \n"
                + "Universidad del Cauca";
        Utilidades.mensajeExito(str, "Acerca De");
    }//GEN-LAST:event_mnuAcercaDeActionPerformed

    private void mnuIngresosPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIngresosPorFechaActionPerformed
        Utilidades.mensajeAdvertencia("En construcción....", "Atención");


    }//GEN-LAST:event_mnuIngresosPorFechaActionPerformed

    private void mnuConfiguracionTarifasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConfiguracionTarifasActionPerformed

        Utilidades.mensajeAdvertencia("En construcción....", "Atención");

    }//GEN-LAST:event_mnuConfiguracionTarifasActionPerformed

    private void mnuAgentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgentesActionPerformed
        Utilidades.mensajeAdvertencia("En construcción....", "Atención");
    }//GEN-LAST:event_mnuAgentesActionPerformed

    private void mnuConsultaAbiertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaAbiertaActionPerformed
        Utilidades.mensajeAdvertencia("En construcción....", "Atención");
    }//GEN-LAST:event_mnuConsultaAbiertaActionPerformed

    private void btnInicializarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicializarActionPerformed
        Utilidades.mensajeAdvertencia("En construcción....", "Atención");
    }//GEN-LAST:event_btnInicializarActionPerformed

    private void mnuPaquetesTodoIncluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPaquetesTodoIncluidoActionPerformed
         GUIPaquetesTodoIncluido ins = GUIPaquetesTodoIncluido.getInstance();
        if (!ins.isShowing()) {
             ins.setMaximizable(true);
            dskEscritorio.add(ins);
            ins.show();
        }
       
    }//GEN-LAST:event_mnuPaquetesTodoIncluidoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUIMenu ins = new GUIMenu();
                ins.setExtendedState(MAXIMIZED_BOTH);
                ins.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnInicializar;
    private javax.swing.JDesktopPane dskEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem mnuAcercaDe;
    private javax.swing.JMenuItem mnuAgentes;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuConfiguracion;
    private javax.swing.JMenuItem mnuConfiguracionTarifas;
    private javax.swing.JMenuItem mnuConsultaAbierta;
    private javax.swing.JMenu mnuEmpleadoLogueado;
    private javax.swing.JMenu mnuInformes;
    private javax.swing.JMenuItem mnuIngresosPorFecha;
    private javax.swing.JMenu mnuPaqueteTodoIncluido;
    private javax.swing.JMenuItem mnuPaquetesPersonalizados;
    private javax.swing.JMenuItem mnuPaquetesTodoIncluido;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuUsuariosSistema;
    // End of variables declaration//GEN-END:variables

}
