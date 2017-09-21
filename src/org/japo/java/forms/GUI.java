/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.forms;

import java.util.Properties;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import org.japo.java.events.MEM;
import org.japo.java.libraries.UtilesSwing;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class GUI extends JFrame {

    // Propiedades App
    public static final String PRP_LOOK_AND_FEEL = "look_and_feel";
    public static final String PRP_FAVICON = "favicon";

    // Valores por Defecto
    public static final String DEF_LOOK_AND_FEEL = UtilesSwing.LNF_NIMBUS;
    public static final String DEF_FAVICON = "img/favicon.png";

    // Referencias
    private Properties prp;
    private JPanel pnlPpal;
    private JLabel lblDado1;
    private JLabel lblDado2;
    private JLabel lblDado3;
    private JLabel lblDado4;
    private JLabel lblDado5;
    private JLabel lblDado6;
    private JLabel lblIni;

    // Constructor
    public GUI(Properties prp) {
        // Inicialización Anterior
        initBefore(prp);

        // Creación Interfaz
        initComponents();

        // Inicializacion Posterior
        initAfter();
    }

    // Construcción - GUI
    private void initComponents() {
        // Cuadrado 1
        lblDado1 = new JLabel();
        lblDado1.setBackground(new Color(255, 153, 0));
        lblDado1.setFont(new Font("Cambria", Font.BOLD, 100));
        lblDado1.setForeground(Color.WHITE);
        lblDado1.setHorizontalAlignment(JLabel.CENTER);
        lblDado1.setText("1");
        lblDado1.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
        lblDado1.setOpaque(true);
        lblDado1.setPreferredSize(new Dimension(120, 120));
        lblDado1.addMouseListener(new MEM(this));

        // Cuadrado 2
        lblDado2 = new JLabel();
        lblDado2.setBackground(new Color(153, 204, 0));
        lblDado2.setFont(new Font("Cambria", Font.BOLD, 100));
        lblDado2.setForeground(Color.WHITE);
        lblDado2.setHorizontalAlignment(JLabel.CENTER);
        lblDado2.setText("2");
        lblDado2.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
        lblDado2.setOpaque(true);
        lblDado2.setPreferredSize(new Dimension(120, 120));
        lblDado2.addMouseListener(new MEM(this));

        // Cuadrado 3
        lblDado3 = new JLabel();
        lblDado3.setBackground(new Color(204, 204, 0));
        lblDado3.setFont(new Font("Cambria", Font.BOLD, 100));
        lblDado3.setForeground(Color.WHITE);
        lblDado3.setHorizontalAlignment(JLabel.CENTER);
        lblDado3.setText("3");
        lblDado3.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
        lblDado3.setOpaque(true);
        lblDado3.setPreferredSize(new Dimension(120, 120));
        lblDado3.addMouseListener(new MEM(this));

        // Cuadrado 4
        lblDado4 = new JLabel();
        lblDado4.setBackground(new Color(255, 102, 102));
        lblDado4.setFont(new Font("Cambria", Font.BOLD, 100));
        lblDado4.setForeground(Color.WHITE);
        lblDado4.setHorizontalAlignment(JLabel.CENTER);
        lblDado4.setText("4");
        lblDado4.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
        lblDado4.setOpaque(true);
        lblDado4.setPreferredSize(new Dimension(120, 120));
        lblDado4.addMouseListener(new MEM(this));

        // Cuadrado 5
        lblDado5 = new JLabel();
        lblDado5.setBackground(new Color(51, 153, 255));
        lblDado5.setFont(new Font("Cambria", Font.BOLD, 100));
        lblDado5.setForeground(Color.WHITE);
        lblDado5.setHorizontalAlignment(JLabel.CENTER);
        lblDado5.setText("5");
        lblDado5.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
        lblDado5.setOpaque(true);
        lblDado5.setPreferredSize(new Dimension(120, 120));
        lblDado5.addMouseListener(new MEM(this));

        // Cuadrado 6
        lblDado6 = new JLabel();
        lblDado6.setBackground(new Color(204, 51, 255));
        lblDado6.setFont(new Font("Cambria", Font.BOLD, 100));
        lblDado6.setForeground(Color.WHITE);
        lblDado6.setHorizontalAlignment(JLabel.CENTER);
        lblDado6.setText("6");
        lblDado6.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
        lblDado6.setOpaque(true);
        lblDado6.setPreferredSize(new Dimension(120, 120));
        lblDado6.addMouseListener(new MEM(this));

        // Panel Principal
        pnlPpal = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        pnlPpal.setBackground(Color.PINK);
        pnlPpal.add(lblDado1);
        pnlPpal.add(lblDado2);
        pnlPpal.add(lblDado3);
        pnlPpal.add(lblDado4);
        pnlPpal.add(lblDado5);
        pnlPpal.add(lblDado6);

        // Ventana Principal
        setContentPane(pnlPpal);
        setTitle("Cuadraditos");
        setResizable(true);
        setSize(470, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Inicialización Anterior    
    private void initBefore(Properties prp) {
        // Memorizar Referencia
        this.prp = prp;

        // Establecer LnF
        UtilesSwing.establecerLnF(prp.getProperty(PRP_LOOK_AND_FEEL, DEF_LOOK_AND_FEEL));
    }

    // Inicialización Anterior
    private void initAfter() {
        // Establecer Favicon
        UtilesSwing.establecerFavicon(this, prp.getProperty(PRP_FAVICON, DEF_FAVICON));
    }

    // Procesar Click - Intercambiar Etiquetas
    public void procesarSeleccion(MouseEvent e) {
        if (lblIni == null) {
            // Memoriza Etiqueta Inicial
            lblIni = (JLabel) e.getSource();

            // Marcar Etiqueta Inicial
            intercambiarFrenteFondo(lblIni);
        } else {
            // Desmarcar Etiqueta Inicial
            intercambiarFrenteFondo(lblIni);

            // Obtener Etiqueta Final
            JLabel lblFin = (JLabel) e.getSource();

            // Intercambiar Etiquetas
            intercambiarEtiquetas(lblIni, lblFin);

            // Actualizar Contenedor
            validate();

            // Liberar Etiqueta Inicial
            lblIni = null;
        }
    }

    // Intercambiar Colores Frente/Fondo
    private void intercambiarFrenteFondo(JLabel lbl) {
        Color color = lbl.getForeground();
        lbl.setForeground(lbl.getBackground());
        lbl.setBackground(color);
    }

    // Intercambiar Etiquetas Frente/Fondo/Texto
    private void intercambiarEtiquetas(JLabel lblIni, JLabel lblFin) {
        int z = pnlPpal.getComponentZOrder(lblIni);
        pnlPpal.setComponentZOrder(lblIni, pnlPpal.getComponentZOrder(lblFin));
        pnlPpal.setComponentZOrder(lblFin, z);
    }
}
