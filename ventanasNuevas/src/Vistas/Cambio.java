
package Vistas;

import java.util.Calendar;
import java.util.Locale;
import ejerciciofase2.EjercicioFase2;
import Clases.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import ejerciciofase2.EjercicioFase2;
import Excepciones.*;

public class Cambio extends javax.swing.JFrame {
    
    private static String opc = "";
    
    public Cambio() {
        initComponents();
        
        EjercicioFase2.resetearPer();
        
        EjercicioFase2.guardarBoolean(false);
        
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,-18);
        DCfecha.setMaxDate(c);
        
        Calendar d = Calendar.getInstance();
        d.add(Calendar.YEAR,-67);
        DCfecha.setMinDate(d);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFnombre = new javax.swing.JTextField();
        TFapellidoUno = new javax.swing.JTextField();
        TFdni = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TFcalle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFportal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TFpiso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TFmano = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TFmovil = new javax.swing.JFormattedTextField();
        TFtelPers = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TFsalario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Bsalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        RBadministracion = new javax.swing.JRadioButton();
        RBlogistica = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        TFapellidoDos = new javax.swing.JTextField();
        Bguardar = new javax.swing.JButton();
        DCfecha = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Perfil");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("DNI:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("PRIMER APELLIDO");

        TFnombre.setEnabled(false);
        TFnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnombreActionPerformed(evt);
            }
        });

        TFapellidoUno.setEnabled(false);
        TFapellidoUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFapellidoUnoActionPerformed(evt);
            }
        });

        try {
            TFdni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdniActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Direccion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Calle:");

        TFcalle.setEnabled(false);
        TFcalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFcalleActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Portal:");

        TFportal.setEnabled(false);
        TFportal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFportalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Piso:");

        TFpiso.setEnabled(false);
        TFpiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFpisoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Mano:");

        TFmano.setEnabled(false);
        TFmano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFmanoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TFcalle, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFportal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFpiso, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFmano)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFportal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(TFpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TFmano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefonos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Personal:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Movil:");

        try {
            TFmovil.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFmovil.setEnabled(false);
        TFmovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFmovilActionPerformed(evt);
            }
        });

        TFtelPers.setEnabled(false);
        TFtelPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFtelPersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFmovil, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(TFtelPers))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TFtelPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TFmovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Salario:");

        TFsalario.setEnabled(false);
        TFsalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFsalarioActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Fecha de nacimiento:");

        Bsalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bsalir.setText("Salir");
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        buttonGroup1.add(RBadministracion);
        RBadministracion.setText("ADMINISTRACION");
        RBadministracion.setEnabled(false);
        RBadministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBadministracionActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBlogistica);
        RBlogistica.setText("LOGISTICA");
        RBlogistica.setEnabled(false);
        RBlogistica.setFocusPainted(false);
        RBlogistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBlogisticaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBlogistica)
                    .addComponent(RBadministracion))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(RBadministracion)
                .addGap(44, 44, 44)
                .addComponent(RBlogistica)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("SEGUNDO APELLIDO");

        TFapellidoDos.setEnabled(false);
        TFapellidoDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFapellidoDosActionPerformed(evt);
            }
        });

        Bguardar.setText("Guardar");
        Bguardar.setEnabled(false);
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        try {
            DCfecha.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }
        DCfecha.setEnabled(false);
        DCfecha.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                DCfechaOnCommit(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel14))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TFnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                        .addComponent(TFapellidoUno)
                                        .addComponent(TFapellidoDos))
                                    .addGap(34, 34, 34)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(Bguardar)
                                .addGap(159, 159, 159)
                                .addComponent(Bsalir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(TFsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TFapellidoUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 21, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(TFapellidoDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TFsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(DCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bsalir)
                    .addComponent(Bguardar))
                .addGap(193, 193, 193))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdniActionPerformed
        
        if(EjercicioFase2.compDni(TFdni.getText()) == null){
            EjercicioFase2.mostrarNuevo();
            if(EjercicioFase2.crearNuevo() == true){
                TFdni.setEnabled(false);
                TFnombre.setEnabled(true);
            }
            else
            TFdni.setText("");
        }
        else{
            TFdni.setEnabled(false);
            TFdni.setText(EjercicioFase2.getPersona().getDni());
            TFnombre.setText(EjercicioFase2.getPersona().getNombre());
            TFapellidoUno.setText(EjercicioFase2.getPersona().getApellido1());
            TFapellidoDos.setText(EjercicioFase2.getPersona().getApellido2());
            TFcalle.setText(EjercicioFase2.getPersona().getCalle());
            TFportal.setText(EjercicioFase2.getPersona().getPortal());
            String p = Integer.toString(EjercicioFase2.getPersona().getPiso());
            TFpiso.setText(p);
            TFmano.setText(EjercicioFase2.getPersona().getMano());
            TFtelPers.setText(EjercicioFase2.getPersona().getTelPers());
            TFmovil.setText(EjercicioFase2.getPersona().getTelMovil());
            DCfecha.setEnabled(true);
            DCfecha.setSelectedDate(EjercicioFase2.getFechaNac());
            DCfecha.setEnabled(false);
            String s;
            if(EjercicioFase2.getPersona().getSalario() == 0)
                s = null;
            else
                s = Float.toString(EjercicioFase2.getPersona().getSalario());
            TFsalario.setText(s);
            if(EjercicioFase2.getCargo().compareToIgnoreCase("administracion") == 0)
                RBadministracion.setSelected(true);
            else
                if(EjercicioFase2.getCargo().compareToIgnoreCase("logistica") == 0)
                    RBlogistica.setSelected(true);
            RBadministracion.setEnabled(false);
            RBlogistica.setEnabled(false);
            EjercicioFase2.guardarDni(TFdni.getText());
            EjercicioFase2.mostrarOpcion();
            if(EjercicioFase2.o() == true){
                TFnombre.setEnabled(true);
                TFapellidoUno.setEnabled(true);
                TFapellidoDos.setEnabled(true);
                TFcalle.setEnabled(true);
                TFportal.setEnabled(true);
                TFpiso.setEnabled(true);
                TFmano.setEnabled(true);
                TFtelPers.setEnabled(true);
                TFmovil.setEnabled(true);
                TFsalario.setEnabled(true);
                DCfecha.setEnabled(true);
                RBlogistica.setEnabled(true);
                RBadministracion.setEnabled(true);
                Bguardar.setEnabled(true);
            }
            else
                if(EjercicioFase2.getVisualizar()){
                TFnombre.setEnabled(false);
                TFapellidoUno.setEnabled(false);
                TFapellidoDos.setEnabled(false);
                TFcalle.setEnabled(false);
                TFportal.setEnabled(false);
                TFpiso.setEnabled(false);
                TFmano.setEnabled(false);
                TFtelPers.setEnabled(false);
                TFmovil.setEnabled(false);
                TFsalario.setEnabled(false);
                DCfecha.setEnabled(false);
                RBlogistica.setEnabled(false);
                RBadministracion.setEnabled(false);
                Bguardar.setEnabled(false);
            }
            
        }
    }//GEN-LAST:event_TFdniActionPerformed

    private void TFnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnombreActionPerformed
        try{
            if(TFnombre.getText().isEmpty())
                throw new CampoVacio();
            else{
                TFnombre.setEnabled(false);
                TFapellidoUno.requestFocus();
                TFapellidoUno.setEnabled(true);
            }
        }   
        catch(CampoVacio e){
                javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
                }
        
        
    }//GEN-LAST:event_TFnombreActionPerformed

    private void TFapellidoUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFapellidoUnoActionPerformed
        try{
            if(TFapellidoUno.getText().isEmpty())
                throw new CampoVacio();
            else{
                TFapellidoUno.setEnabled(false);
                TFapellidoDos.requestFocus();
                TFapellidoDos.setEnabled(true);
            }
        }
        catch(CampoVacio e){
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        }
    }//GEN-LAST:event_TFapellidoUnoActionPerformed

    private void TFapellidoDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFapellidoDosActionPerformed
        try{
            if(TFapellidoDos.getText().isEmpty())
                throw new CampoVacio();
            else{
                TFapellidoDos.setEnabled(false);
                TFcalle.requestFocus();
                TFcalle.setEnabled(true);
            }
        }
        catch(CampoVacio e){
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        }
    }//GEN-LAST:event_TFapellidoDosActionPerformed

    private void TFsalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFsalarioActionPerformed
        try{
            float n = Float.parseFloat(TFsalario.getText());
            TFsalario.setEnabled(false);
            DCfecha.setEnabled(true);
        }
        catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(this,"Todos los caracteres deben de ser numericos");
            TFsalario.setText("");
        }
        
    }//GEN-LAST:event_TFsalarioActionPerformed

    private void TFcalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcalleActionPerformed
        try{
            if(TFcalle.getText().isEmpty())
                throw new CampoVacio();
            else{
                TFcalle.setEnabled(false);
                TFportal.requestFocus();
                TFportal.setEnabled(true);
            }
        }
        catch(CampoVacio e){
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        }
    }//GEN-LAST:event_TFcalleActionPerformed

    private void TFportalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFportalActionPerformed
        try{
            if(TFportal.getText().isEmpty())
                throw new CampoVacio();
            else
                if(TFportal.getText().length() > 2)
                    throw new PortalNoValido();
            else{
                 int n = Integer.parseInt(TFportal.getText());
                 TFportal.setEnabled(false);
                 TFpiso.requestFocus();
                 TFpiso.setEnabled(true);
                 }
            
        }
        catch(CampoVacio e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"El campo no puede quedar vacio");
            TFportal.setText("");
        }
        catch(PortalNoValido e)
        {
            javax.swing.JOptionPane.showMessageDialog(this,"La longitud del campo no es la correcta");
            TFportal.setText("");
        }
        catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(this,"Todos los caracteres deben de ser numericos");
            TFportal.setText("");
        }
        
        
    }//GEN-LAST:event_TFportalActionPerformed

    private void TFpisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFpisoActionPerformed
        try{
            if(TFpiso.getText().isEmpty())
            throw new CampoVacio();
        else
            if(TFpiso.getText().length() > 2)
                    throw new PisoNoValido();
        else{
            int n = Integer.parseInt(TFpiso.getText());
            TFpiso.setEnabled(false);
            TFmano.requestFocus();
            TFmano.setEnabled(true);
        }
        }
        catch(CampoVacio e){
            javax.swing.JOptionPane.showMessageDialog(this,"El campo no puede quedar vacio");
            TFpiso.setText("");
        }
        catch(PisoNoValido e){
            javax.swing.JOptionPane.showMessageDialog(this,"La longitud del campo no es la correcta");
            TFpiso.setText("");
        }
        catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(this,"Todos los caracteres deben de ser numericos");
            TFpiso.setText("");
        }
        
    }//GEN-LAST:event_TFpisoActionPerformed

    private void TFmanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFmanoActionPerformed
        try{
            if(TFmano.getText().isEmpty())
                throw new CampoVacio();
            else{
                TFmano.setEnabled(false);
                TFtelPers.requestFocus();
                TFtelPers.setEnabled(true);
            }
        }
        catch(CampoVacio e){
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        }
    }//GEN-LAST:event_TFmanoActionPerformed

    private void TFmovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFmovilActionPerformed
        if(TFmovil.getText().isEmpty())
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        else{
            TFmovil.setEnabled(false);
            TFsalario.requestFocus();
            TFsalario.setEnabled(true);
        }
    }//GEN-LAST:event_TFmovilActionPerformed

    private void RBadministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBadministracionActionPerformed
        opc = "administracion";
        if(RBadministracion.isSelected() || RBlogistica.isSelected()){
            RBadministracion.setEnabled(false);
            RBlogistica.setEnabled(false);
            Bguardar.setEnabled(true);
        }
    }//GEN-LAST:event_RBadministracionActionPerformed

    private void TFtelPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFtelPersActionPerformed
        try{
            int n = Integer.parseInt(TFtelPers.getText());
            if(TFtelPers.getText().isEmpty()){
                TFtelPers.setEnabled(false);
                TFmovil.setEnabled(true);
                TFmovil.requestFocus();
            }
            else
                if(TFtelPers.getText().length() == 9){
                    TFtelPers.setEnabled(false);
                    TFmovil.setEnabled(true);
                    TFmovil.requestFocus();
                }
            else
                    throw new TelefonoNoValido();
        }
        catch(TelefonoNoValido e){
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no tiene la longitud correcta");
            TFtelPers.setText("");
        }
        catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(this,"Todos los caracteres deben de ser numericos");
            TFtelPers.setText("");
        }
        
    }//GEN-LAST:event_TFtelPersActionPerformed

    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed
        if(RBadministracion.isSelected())
            opc = "administracion";
        else
            if(RBlogistica.isSelected())
                opc = "logistica";

        if(EjercicioFase2.o() == false)
            EjercicioFase2.guardarPersona(TFdni.getText(), TFnombre.getText(), TFapellidoUno.getText(), TFapellidoDos.getText(), TFcalle.getText(), TFportal.getText(), TFpiso.getText(), TFmano.getText(), TFtelPers.getText(), TFmovil.getText(), TFsalario.getText(), DCfecha.getSelectedDate(), opc);
        else
            if(EjercicioFase2.o() == true)
                EjercicioFase2.editarPersona(TFdni.getText(), TFnombre.getText(), TFapellidoUno.getText(), TFapellidoDos.getText(), TFcalle.getText(), TFportal.getText(), TFpiso.getText(), TFmano.getText(), TFtelPers.getText(), TFmovil.getText(), TFsalario.getText(), DCfecha.getSelectedDate(), opc);
        EjercicioFase2.reiniciarCambio();   
    }//GEN-LAST:event_BguardarActionPerformed

    private void RBlogisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBlogisticaActionPerformed
        opc = "logistica";
        if(RBadministracion.isSelected() || RBlogistica.isSelected()){
            RBadministracion.setEnabled(false);
            RBlogistica.setEnabled(false);
            Bguardar.setEnabled(true);
        }
    }//GEN-LAST:event_RBlogisticaActionPerformed

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        EjercicioFase2.cerrarCambio();
    }//GEN-LAST:event_BsalirActionPerformed

    private void DCfechaOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_DCfechaOnCommit
        DCfecha.setEnabled(false);
        RBadministracion.setEnabled(true);
        RBlogistica.setEnabled(true);
    }//GEN-LAST:event_DCfechaOnCommit
    
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
            java.util.logging.Logger.getLogger(Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cambio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bguardar;
    private javax.swing.JButton Bsalir;
    private datechooser.beans.DateChooserCombo DCfecha;
    private javax.swing.JRadioButton RBadministracion;
    private javax.swing.JRadioButton RBlogistica;
    private javax.swing.JTextField TFapellidoDos;
    private javax.swing.JTextField TFapellidoUno;
    private javax.swing.JTextField TFcalle;
    private javax.swing.JFormattedTextField TFdni;
    private javax.swing.JTextField TFmano;
    private javax.swing.JFormattedTextField TFmovil;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JTextField TFpiso;
    private javax.swing.JTextField TFportal;
    private javax.swing.JTextField TFsalario;
    private javax.swing.JTextField TFtelPers;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
