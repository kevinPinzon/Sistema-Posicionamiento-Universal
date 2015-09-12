/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BETA1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Chris
 */
public class UPS extends javax.swing.JFrame {

    Galaxia viaLactea = new Galaxia();
    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    private ArrayList<String> contenido;
    int CordenadaX[] = {30, 300, 600, 30, 400, 190, 590, 890, 890, 1000};
    int CordenadaY[] = {300, 250, 290, 720, 710, 550, 550, 250, 720, 520};
    int CordCont = 0;
    BufferedImage galaxiaModif=null;
    int agregandoCont=0;
    
    public UPS() {
        this.contenido = new ArrayList<String>();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_galaxia = new javax.swing.JDialog();
        jl_galaxia = new javax.swing.JLabel();
        btn_AbrirAgregarPla = new javax.swing.JButton();
        btn_modifcarP = new javax.swing.JButton();
        btn_eliminarP = new javax.swing.JButton();
        btn_abrirAgregarCamino = new javax.swing.JButton();
        btn_AbrirEliminarCaminos = new javax.swing.JButton();
        btn_AbrirModificarCaminos = new javax.swing.JButton();
        jd_AgregarC = new javax.swing.JDialog();
        cmb_origen = new javax.swing.JComboBox();
        cmb_destino = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        sp_distancia = new javax.swing.JSpinner();
        btn_agregarCaminoNuevo = new javax.swing.JButton();
        jd_eliminarC = new javax.swing.JDialog();
        btn_eliminarCamino = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmb_destino1 = new javax.swing.JComboBox();
        cmb_origen1 = new javax.swing.JComboBox();
        btn_verCaminos = new javax.swing.JButton();
        jd_modificarC = new javax.swing.JDialog();
        sp_distancia2 = new javax.swing.JSpinner();
        btn_modificarrCamino = new javax.swing.JButton();
        cmb_destino2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmb_origen2 = new javax.swing.JComboBox();
        btn_verCaminos1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jd_agregarPla = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jl_planetaNuevo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jt_planetaNuevo = new javax.swing.JTextField();
        jt_terminarAgregarPla = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_llenarGalaxia = new javax.swing.JButton();

        jd_galaxia.setBackground(new java.awt.Color(153, 153, 153));

        jl_galaxia.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.acceleratorForeground"));

        btn_AbrirAgregarPla.setText("Agregar Planeta");
        btn_AbrirAgregarPla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AbrirAgregarPlaMouseClicked(evt);
            }
        });

        btn_modifcarP.setText("Modificar Planeta");

        btn_eliminarP.setText("Eliminar Paneta");

        btn_abrirAgregarCamino.setText("Agregar camino");
        btn_abrirAgregarCamino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_abrirAgregarCaminoMouseClicked(evt);
            }
        });

        btn_AbrirEliminarCaminos.setText("Eliminar Camino");
        btn_AbrirEliminarCaminos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AbrirEliminarCaminosMouseClicked(evt);
            }
        });

        btn_AbrirModificarCaminos.setText("Modificar Caminos");
        btn_AbrirModificarCaminos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AbrirModificarCaminosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_galaxiaLayout = new javax.swing.GroupLayout(jd_galaxia.getContentPane());
        jd_galaxia.getContentPane().setLayout(jd_galaxiaLayout);
        jd_galaxiaLayout.setHorizontalGroup(
            jd_galaxiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_galaxiaLayout.createSequentialGroup()
                .addComponent(jl_galaxia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jd_galaxiaLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btn_abrirAgregarCamino)
                .addGap(18, 18, 18)
                .addComponent(btn_AbrirModificarCaminos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_AbrirEliminarCaminos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_AbrirAgregarPla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_modifcarP)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminarP)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jd_galaxiaLayout.setVerticalGroup(
            jd_galaxiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_galaxiaLayout.createSequentialGroup()
                .addComponent(jl_galaxia, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_galaxiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AbrirAgregarPla)
                    .addComponent(btn_modifcarP)
                    .addComponent(btn_eliminarP)
                    .addComponent(btn_abrirAgregarCamino)
                    .addComponent(btn_AbrirModificarCaminos)
                    .addComponent(btn_AbrirEliminarCaminos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Agregar Camino Nuevo");

        sp_distancia.setModel(new javax.swing.SpinnerNumberModel(100, 100, 100000, 100));
        sp_distancia.setName(""); // NOI18N
        sp_distancia.setRequestFocusEnabled(false);

        btn_agregarCaminoNuevo.setText("Agregar");
        btn_agregarCaminoNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarCaminoNuevoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_AgregarCLayout = new javax.swing.GroupLayout(jd_AgregarC.getContentPane());
        jd_AgregarC.getContentPane().setLayout(jd_AgregarCLayout);
        jd_AgregarCLayout.setHorizontalGroup(
            jd_AgregarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarCLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jd_AgregarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_AgregarCLayout.createSequentialGroup()
                        .addComponent(cmb_origen, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jd_AgregarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_agregarCaminoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(sp_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jd_AgregarCLayout.setVerticalGroup(
            jd_AgregarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AgregarCLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jd_AgregarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmb_origen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_AgregarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sp_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addComponent(btn_agregarCaminoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        btn_eliminarCamino.setText("Eliminar");
        btn_eliminarCamino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarCaminoMouseClicked(evt);
            }
        });

        jLabel3.setText("Eliminar camino");

        btn_verCaminos.setText("Ver caminos");
        btn_verCaminos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_verCaminosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_eliminarCLayout = new javax.swing.GroupLayout(jd_eliminarC.getContentPane());
        jd_eliminarC.getContentPane().setLayout(jd_eliminarCLayout);
        jd_eliminarCLayout.setHorizontalGroup(
            jd_eliminarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarCLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jd_eliminarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_eliminarCamino, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_verCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_eliminarCLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(cmb_origen1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(cmb_destino1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_eliminarCLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        jd_eliminarCLayout.setVerticalGroup(
            jd_eliminarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarCLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jd_eliminarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_origen1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_destino1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_verCaminos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_eliminarCamino, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        sp_distancia2.setModel(new javax.swing.SpinnerNumberModel(100, 100, 100000, 100));
        sp_distancia2.setName(""); // NOI18N
        sp_distancia2.setRequestFocusEnabled(false);

        btn_modificarrCamino.setText("Modificar");
        btn_modificarrCamino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarrCaminoMouseClicked(evt);
            }
        });

        jLabel4.setText("Modificar Caminos");

        btn_verCaminos1.setText("Ver caminos");
        btn_verCaminos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_verCaminos1MouseClicked(evt);
            }
        });

        jLabel5.setText("Establesca nueva distancia");

        javax.swing.GroupLayout jd_modificarCLayout = new javax.swing.GroupLayout(jd_modificarC.getContentPane());
        jd_modificarC.getContentPane().setLayout(jd_modificarCLayout);
        jd_modificarCLayout.setHorizontalGroup(
            jd_modificarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarCLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jd_modificarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_modificarrCamino, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_modificarCLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jd_modificarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_distancia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_modificarCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_origen2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_verCaminos1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_destino2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        jd_modificarCLayout.setVerticalGroup(
            jd_modificarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarCLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jd_modificarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_origen2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_verCaminos1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_destino2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_modificarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_distancia2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(btn_modificarrCamino, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("AGREGAR PLANETA");

        jLabel7.setText("Nombre del planeta");

        jt_terminarAgregarPla.setText("Terminar");

        javax.swing.GroupLayout jd_agregarPlaLayout = new javax.swing.GroupLayout(jd_agregarPla.getContentPane());
        jd_agregarPla.getContentPane().setLayout(jd_agregarPlaLayout);
        jd_agregarPlaLayout.setHorizontalGroup(
            jd_agregarPlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarPlaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_agregarPlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_agregarPlaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_planetaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_agregarPlaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jd_agregarPlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_agregarPlaLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_agregarPlaLayout.createSequentialGroup()
                                .addComponent(jl_planetaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_agregarPlaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jt_terminarAgregarPla)
                .addGap(77, 77, 77))
        );
        jd_agregarPlaLayout.setVerticalGroup(
            jd_agregarPlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarPlaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_agregarPlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_planetaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_planetaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_terminarAgregarPla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SISTEMA DE POSICIONAMIENTO UNIVERSAL");

        btn_llenarGalaxia.setText("Cargar Mapa Inicial");
        btn_llenarGalaxia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_llenarGalaxiaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btn_llenarGalaxia, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_llenarGalaxia)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_llenarGalaxiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_llenarGalaxiaMouseClicked
        if (seleccionado.showDialog(null, "ABRIR ") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String cadena;
                try {
                    FileReader file = new FileReader(archivo);
                    BufferedReader entrada = new BufferedReader(file);
                    while ((cadena = entrada.readLine()) != null) {
                        contenido.add(cadena);
                    }
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "error al leer el archivo");
                }
            } else {
                JOptionPane.showMessageDialog(null, "por favor seleccione un archivo txt");
            }

        }

        Image galaxiaIm = new ImageIcon(getClass().getResource("galaxia1.jpg")).getImage();
        int w = galaxiaIm.getWidth(btn_llenarGalaxia);
        int h = galaxiaIm.getHeight(btn_llenarGalaxia);
        BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        String[] tempEntrada;
        int contCord = 0;
        for (int cont = 0; cont < contenido.size(); cont++) {
            Planeta procesando1 = null;
            Planeta procesando2 = null;
            tempEntrada = contenido.get(cont).split("-");

            if (viaLactea.getInscritos().isEmpty()) {
                procesando1 = new Planeta(tempEntrada[0], CordenadaX[contCord], CordenadaY[contCord]);
                viaLactea.insert(procesando1);
                contCord++;
                procesando2 = new Planeta(tempEntrada[1], CordenadaX[contCord], CordenadaY[contCord]);
                contCord++;
                if (!procesando1.getEtiqueta().equals(procesando2.getEtiqueta())) {
                    procesando1.insertarAdya(procesando2, tempEntrada[2]);
                }

                viaLactea.insert(procesando2);
            } else {
                if (contCord < CordenadaX.length) {
                    procesando1 = new Planeta(tempEntrada[0], CordenadaX[contCord], CordenadaY[contCord]);
                    if (viaLactea.insert(procesando1)) {
                        contCord++;
                    }
                    procesando2 = new Planeta(tempEntrada[1], CordenadaX[contCord], CordenadaY[contCord]);
                    if (viaLactea.insert(procesando2)) {
                        contCord++;
                    }
                    if (!procesando1.getEtiqueta().equals(procesando2.getEtiqueta())) {
                        procesando1.insertarAdya(procesando2, tempEntrada[2]);
                    }

                }
            }
        }
        Image planetaIm1;
        int cantidadPla = viaLactea.getInscritos().size();
        Graphics g = combined.getGraphics();
        g.drawImage(galaxiaIm, 0, 0, null);

        for (int i = 0; i < cantidadPla; i++) {
            if (i == viaLactea.getInscritos().size() - 1) {
                planetaIm1 = new ImageIcon(getClass().getResource("planeta" + 10 + ".jpg")).getImage();
            } else {
                planetaIm1 = new ImageIcon(getClass().getResource("planeta" + (i + 1) + ".png")).getImage();
            }
            System.out.println("i: " + (1 + i));
            g.drawImage(planetaIm1, viaLactea.getInscritos().get(i).getX(), viaLactea.getInscritos().get(i).getY(), null);
            g.drawString(i + viaLactea.getInscritos().get(i).getEtiqueta(), viaLactea.getInscritos().get(i).getX(),
                    viaLactea.getInscritos().get(i).getY() + 115);
        }

        for (int j = 0; j < viaLactea.getInscritos().size(); j++) {
            System.out.println("planeta registrado#" + j + " en la via lactea: " + viaLactea.getInscritos().get(j).getEtiqueta());
        }

        if (!viaLactea.getInscritos().isEmpty()) {
            for (int i = 0; i < viaLactea.getInscritos().size(); i++) {
                
                if (!viaLactea.getInscritos().get(i).getAristas().isEmpty()) {
                    for (int j = 0; j < viaLactea.getInscritos().get(i).getAristas().size(); j++) {
                        g.drawLine(viaLactea.getInscritos().get(i).getX() + 50, viaLactea.getInscritos().get(i).getY(), viaLactea.getInscritos().get(i).getAristas().get(j).getAdyacente().getX() + 50, viaLactea.getInscritos().get(i).getAristas().get(j).getAdyacente().getY());
        //                g.drawString(tempdist
                        //                        ,(viaLactea.getInscritos().get(i).getX()+50)
                        //                        , viaLactea.getInscritos().get(i).getY());
                    }
                }
            }
        }
        
        galaxiaModif=combined;
        Image dimg = ((BufferedImage) combined);
        jl_galaxia.setIcon(new ImageIcon(dimg));
        
        this.jd_galaxia.setLocation(1, 1);
        this.jd_galaxia.setModal(true);
        this.jd_galaxia.pack();
        this.jd_galaxia.setVisible(true);


    }//GEN-LAST:event_btn_llenarGalaxiaMouseClicked

    private void btn_AbrirAgregarPlaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AbrirAgregarPlaMouseClicked
        if (viaLactea.getInscritos().size()<10) {
            agregandoCont=viaLactea.getInscritos().size();
            agregandoCont++;
            viaLactea.insert(new Planeta(jt_planetaNuevo.getText(),CordenadaX[agregandoCont],CordenadaY[agregandoCont]));
        
            
            Image planetaN = new ImageIcon(getClass().getResource("planeta" + (agregandoCont + 1) + ".png")).getImage();
            int w = planetaN.getWidth(btn_AbrirAgregarPla);
            int h = planetaN.getHeight(btn_AbrirAgregarPla);
            BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        
            Image dimg = ((BufferedImage) combined);
            jl_planetaNuevo.setIcon(new ImageIcon(dimg));
        
            this.jd_agregarPla.setLocation(1, 1);
            this.jd_agregarPla.setModal(true);
            this.jd_agregarPla.pack();
            this.jd_agregarPla.setVisible(true);
        }else
            JOptionPane.showMessageDialog(rootPane, "se ha llegado al maximo de capacidad en la galaxia",
                    "ERROR", WIDTH, null);
        
        
    }//GEN-LAST:event_btn_AbrirAgregarPlaMouseClicked

    private void btn_abrirAgregarCaminoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_abrirAgregarCaminoMouseClicked
        
        for (int i = 0; i < viaLactea.getInscritos().size(); i++) {
            cmb_origen.addItem(viaLactea.getInscritos().get(i).getEtiqueta());
        }
        for (int i =0; i <  viaLactea.getInscritos().size(); i++) {
            cmb_destino.addItem(viaLactea.getInscritos().get(i).getEtiqueta());
        }

        this.jd_AgregarC.setLocation(150, 150);
        this.jd_AgregarC.setModal(true);
        this.jd_AgregarC.pack();
        this.jd_AgregarC.setVisible(true);

    }//GEN-LAST:event_btn_abrirAgregarCaminoMouseClicked

    private void btn_AbrirEliminarCaminosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AbrirEliminarCaminosMouseClicked
        for (int i = 0; i < viaLactea.getInscritos().size(); i++) {
            cmb_origen1.addItem(viaLactea.getInscritos().get(i).getEtiqueta());
        }
        this.jd_eliminarC.setLocation(150, 150);
        this.jd_eliminarC.setModal(true);
        this.jd_eliminarC.pack();
        this.jd_eliminarC.setVisible(true);

    }//GEN-LAST:event_btn_AbrirEliminarCaminosMouseClicked

    private void btn_agregarCaminoNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarCaminoNuevoMouseClicked
        String origen, destino;
        origen = (String) cmb_origen.getSelectedItem();
        destino = (String) cmb_destino.getSelectedItem();
        int  distI= (int)sp_distancia.getValue();
        String dist=distI+"";
        
        for (int i = 0; i < viaLactea.getInscritos().size(); i++) {
            for (int j = 0; j < viaLactea.getInscritos().size(); j++) {
                if (viaLactea.getInscritos().get(i).getEtiqueta().equals(origen)
                    && viaLactea.getInscritos().get(j).getEtiqueta().equals(destino)) {
                    viaLactea.getInscritos().get(i).insertarAdya(viaLactea.getInscritos().get(j), dist);
                }
            }
        }
        //DIBUJAR LINEA
        if (!viaLactea.getInscritos().isEmpty()) {
            for (int i = 0; i < viaLactea.getInscritos().size(); i++) {
                if (!viaLactea.getInscritos().get(i).getAristas().isEmpty()) {
                    for (int j = 0; j < viaLactea.getInscritos().get(i).getAristas().size(); j++) {
                        Graphics g = galaxiaModif.getGraphics();
                        g.drawLine(viaLactea.getInscritos().get(i).getX() + 50, viaLactea.getInscritos().get(i).getY()
                                , viaLactea.getInscritos().get(i).getAristas().get(j).getAdyacente().getX() + 50
                                , viaLactea.getInscritos().get(i).getAristas().get(j).getAdyacente().getY());

                    }
                }
            }
        }
        
        Image dimg = ((BufferedImage) galaxiaModif);
        jl_galaxia.setIcon(new ImageIcon(dimg));
        
        cmb_destino.removeAllItems();
        cmb_origen.removeAllItems();
        jd_AgregarC.dispose();
        
        this.jd_galaxia.setLocation(1, 1);
        this.jd_galaxia.setModal(true);
        this.jd_galaxia.pack();
        this.jd_galaxia.setVisible(true);
        
        
    }//GEN-LAST:event_btn_agregarCaminoNuevoMouseClicked

    private void btn_eliminarCaminoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarCaminoMouseClicked
        String destino = (String) cmb_destino1.getSelectedItem();
        String origen = (String) cmb_origen1.getSelectedItem();
        
        for (int i = 0; i < viaLactea.getInscritos().size(); i++) {
            for (int j = 0; j < viaLactea.getInscritos().get(i).getAristas().size(); j++) {
                cmb_destino1.addItem(viaLactea.getInscritos().get(i).getEtiqueta());
            }
        }
        
        for (int i = 0; i < viaLactea.getInscritos().size(); i++) {
            if(viaLactea.getInscritos().get(i).getEtiqueta().equals(origen)){
                for (int j = 0; j < viaLactea.getInscritos().get(i).getAristas().size(); i++) {
                    System.out.println(viaLactea.getInscritos().get(i).getAristas().get(j).getAdyacente().getEtiqueta());
                    if (viaLactea.getInscritos().get(i).getAristas().get(j).getAdyacente().getEtiqueta().equals(destino)) {
                        viaLactea.getInscritos().get(i).eliminarAdyacente
                        (viaLactea.getInscritos().get(i).getAristas().get(j).getAdyacente());
                    }
                }
            }
        }
        
        //dibujar
            //galaxia vacia
        Image galaxiaIm = new ImageIcon(getClass().getResource("galaxia1.jpg")).getImage();
        int w = galaxiaIm.getWidth(btn_llenarGalaxia);
        int h = galaxiaIm.getHeight(btn_llenarGalaxia);
        galaxiaModif = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics g = galaxiaModif.getGraphics();
        
            //planetas
        Image planetaIm1;
        int cantidadPla = viaLactea.getInscritos().size();
        g.drawImage(galaxiaIm, 0, 0, null);

        for (int i = 0; i < cantidadPla; i++) {
            if (i == viaLactea.getInscritos().size() - 1) {
                planetaIm1 = new ImageIcon(getClass().getResource("planeta" + 10 + ".jpg")).getImage();
            } else {
                planetaIm1 = new ImageIcon(getClass().getResource("planeta" + (i + 1) + ".png")).getImage();
            }
            System.out.println("i: " + (1 + i));
            g.drawImage(planetaIm1, viaLactea.getInscritos().get(i).getX(), viaLactea.getInscritos().get(i).getY(), null);
            g.drawString(i + viaLactea.getInscritos().get(i).getEtiqueta(), viaLactea.getInscritos().get(i).getX(),
                    viaLactea.getInscritos().get(i).getY() + 115);
        }
        
            //linas
        if (!viaLactea.getInscritos().isEmpty()) {
            for (int i = 0; i < viaLactea.getInscritos().size(); i++) {
                if (!viaLactea.getInscritos().get(i).getAristas().isEmpty()) {
                    for (int j = 0; j < viaLactea.getInscritos().get(i).getAristas().size(); j++) {
                        g.drawLine(viaLactea.getInscritos().get(i).getX() + 50, viaLactea.getInscritos()
                        .get(i).getY(), viaLactea.getInscritos().get(i).getAristas().get(j)
                        .getAdyacente().getX() + 50, viaLactea.getInscritos().get(i).getAristas()
                        .get(j).getAdyacente().getY());
                    }
                }
            }
        }
        
        Image dimg = ((BufferedImage) galaxiaModif);
        jl_galaxia.setIcon(new ImageIcon(dimg));
        
        cmb_destino1.removeAllItems();
        this.jd_eliminarC.dispose();
        
    }//GEN-LAST:event_btn_eliminarCaminoMouseClicked

    private void btn_verCaminosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verCaminosMouseClicked
        cmb_destino1.removeAllItems();
        String origen = (String) cmb_origen1.getSelectedItem();
        
        for (int i = 0; i <viaLactea.getInscritos().size(); i++) {
            if(viaLactea.getInscritos().get(i).getEtiqueta().equals(origen)){
                for (int j = 0; j < viaLactea.getInscritos().get(i).getAristas().size(); j++) {
                    cmb_destino1.addItem(viaLactea.getInscritos().get(i).getAristas().get(j).getAdyacente().getEtiqueta());
                }
            }
        }
        
    }//GEN-LAST:event_btn_verCaminosMouseClicked

    private void btn_AbrirModificarCaminosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AbrirModificarCaminosMouseClicked

        for (int i = 0; i < viaLactea.getInscritos().size(); i++) {
            cmb_origen2.addItem(viaLactea.getInscritos().get(i).getEtiqueta());
        }
        
        this.jd_modificarC.setLocation(150, 150);
        this.jd_modificarC.setModal(true);
        this.jd_modificarC.pack();
        this.jd_modificarC.setVisible(true);

    }//GEN-LAST:event_btn_AbrirModificarCaminosMouseClicked

    private void btn_modificarrCaminoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarrCaminoMouseClicked
        String destino = (String) cmb_destino2.getSelectedItem();
        String origen = (String) cmb_origen2.getSelectedItem();
        
        //eliminar
        for (int i = 0; i < viaLactea.getInscritos().size(); i++) {
            for (int j = 0; j < viaLactea.getInscritos().get(i).getAristas().size(); j++) {
                cmb_destino2.addItem(viaLactea.getInscritos().get(i).getEtiqueta());
            }
        }
        for (int i = 0; i < viaLactea.getInscritos().size(); i++) {
            if(viaLactea.getInscritos().get(i).getEtiqueta().equals(origen)){
                for (int j = 0; j < viaLactea.getInscritos().get(i).getAristas().size(); i++) {
                    System.out.println(viaLactea.getInscritos().get(i).getAristas().get(j).getAdyacente().getEtiqueta());
                    if (viaLactea.getInscritos().get(i).getAristas().get(j).getAdyacente().getEtiqueta().equals(destino)) {
                        viaLactea.getInscritos().get(i).eliminarAdyacente
                        (viaLactea.getInscritos().get(i).getAristas().get(j).getAdyacente());
                    }
                }
            }
        }
        //agregar
        int  distI= (int)sp_distancia2.getValue();
        String dist=distI+"";
        
        for (int i = 0; i < viaLactea.getInscritos().size(); i++) {
            for (int j = 0; j < viaLactea.getInscritos().size(); j++) {
                if (viaLactea.getInscritos().get(i).getEtiqueta().equals(origen)
                    && viaLactea.getInscritos().get(j).getEtiqueta().equals(destino)) {
                    viaLactea.getInscritos().get(i).insertarAdya(viaLactea.getInscritos().get(j), dist);
                }
            }
        }
        
        //dibujar
        if (!viaLactea.getInscritos().isEmpty()) {
            for (int i = 0; i < viaLactea.getInscritos().size(); i++) {
                if (!viaLactea.getInscritos().get(i).getAristas().isEmpty()) {
                    for (int j = 0; j < viaLactea.getInscritos().get(i).getAristas().size(); j++) {
                        Graphics g = galaxiaModif.getGraphics();
                        g.drawLine(viaLactea.getInscritos().get(i).getX() + 50, viaLactea.getInscritos().get(i).getY()
                                , viaLactea.getInscritos().get(i).getAristas().get(j).getAdyacente().getX() + 50
                                , viaLactea.getInscritos().get(i).getAristas().get(j).getAdyacente().getY());

                    }
                }
            }
        }
        
        Image dimg = ((BufferedImage) galaxiaModif);
        jl_galaxia.setIcon(new ImageIcon(dimg));
        
        cmb_destino2.removeAllItems();
        cmb_origen2.removeAllItems();
        jd_modificarC.dispose();
        
    }//GEN-LAST:event_btn_modificarrCaminoMouseClicked

    private void btn_verCaminos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verCaminos1MouseClicked
        cmb_destino2.removeAllItems();
        String origen = (String) cmb_origen2.getSelectedItem();
        
        for (int i = 0; i <viaLactea.getInscritos().size(); i++) {
            if(viaLactea.getInscritos().get(i).getEtiqueta().equals(origen)){
                for (int j = 0; j < viaLactea.getInscritos().get(i).getAristas().size(); j++) {
                    cmb_destino2.addItem(viaLactea.getInscritos().get(i).getAristas().get(j).getAdyacente().getEtiqueta());
                }
            }
        }
    }//GEN-LAST:event_btn_verCaminos1MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UPS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AbrirAgregarPla;
    private javax.swing.JButton btn_AbrirEliminarCaminos;
    private javax.swing.JButton btn_AbrirModificarCaminos;
    private javax.swing.JButton btn_abrirAgregarCamino;
    private javax.swing.JButton btn_agregarCaminoNuevo;
    private javax.swing.JButton btn_eliminarCamino;
    private javax.swing.JButton btn_eliminarP;
    private javax.swing.JButton btn_llenarGalaxia;
    private javax.swing.JButton btn_modifcarP;
    private javax.swing.JButton btn_modificarrCamino;
    private javax.swing.JButton btn_verCaminos;
    private javax.swing.JButton btn_verCaminos1;
    private javax.swing.JComboBox cmb_destino;
    private javax.swing.JComboBox cmb_destino1;
    private javax.swing.JComboBox cmb_destino2;
    private javax.swing.JComboBox cmb_origen;
    private javax.swing.JComboBox cmb_origen1;
    private javax.swing.JComboBox cmb_origen2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JDialog jd_AgregarC;
    private javax.swing.JDialog jd_agregarPla;
    private javax.swing.JDialog jd_eliminarC;
    private javax.swing.JDialog jd_galaxia;
    private javax.swing.JDialog jd_modificarC;
    private javax.swing.JLabel jl_galaxia;
    private javax.swing.JLabel jl_planetaNuevo;
    private javax.swing.JTextField jt_planetaNuevo;
    private javax.swing.JButton jt_terminarAgregarPla;
    private javax.swing.JSpinner sp_distancia;
    private javax.swing.JSpinner sp_distancia2;
    // End of variables declaration//GEN-END:variables
}
