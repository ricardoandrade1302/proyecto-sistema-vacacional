import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;


public class Principal extends JFrame implements ActionListener {

    private JLabel labelLogo, labelBienvenido, labelDatosTrabajador, labelNombres, labelApellido1, labelApellido2, labelSelecDpto, labelSelecAntig, labelResultadoCalc, labelFooter;
    private JMenuBar mb;
    private JMenu menuOpciones, menuColorFondo, menuCalcular, menuAcercaDe;
    private JMenuItem itemNuevo, itemSalir, itemRojo, itemNegro, itemMorado, itemVacaciones, itemCreador;
    private JTextField txtNombreCompleto, txtApellido1, txtApellido2;
    private JComboBox comboDpto, comboAntig;
    private JTextArea textArea;
    private JScrollPane scroll;
    String nombre = "";


    public Principal() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        getContentPane().setBackground(new Color(255, 0, 0));
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombre = ventanaBienvenida.texto;

        mb = new JMenuBar();
        mb.setBackground(new Color(255, 0, 0));
        setJMenuBar(mb);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255, 0, 0));
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.setForeground(new Color(255, 255, 255));
        mb.add(menuOpciones);

        menuColorFondo = new JMenu("Color de fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
        menuColorFondo.setForeground(new Color(255, 0, 0));
        menuOpciones.add(menuColorFondo);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255, 0, 0));
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuCalcular.setForeground(new Color(255, 255, 255));
        mb.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255, 0, 0));
        menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
        menuAcercaDe.setForeground(new Color(255, 255, 255));
        mb.add(menuAcercaDe);

        itemNuevo = new JMenuItem("Nuevo");
        itemNuevo.setFont(new Font("Andale Mono", 1, 14));
        itemNuevo.setForeground(new Color(255, 0, 0));
        menuOpciones.add(itemNuevo);
        itemNuevo.addActionListener(this);

        itemSalir = new JMenuItem("Salir");
        itemSalir.setFont(new Font("Andale Mono", 1, 14));
        itemSalir.setForeground(new Color(255, 0, 0));
        menuOpciones.add(itemSalir);
        itemSalir.addActionListener(this);

        itemRojo = new JMenuItem("Rojo");
        itemRojo.setFont(new Font("Andale Mono", 1, 14));
        itemRojo.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(itemRojo);
        itemRojo.addActionListener(this);

        itemNegro = new JMenuItem("Negro");
        itemNegro.setFont(new Font("Andale Mono", 1, 14));
        itemNegro.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(itemNegro);
        itemNegro.addActionListener(this);

        itemMorado = new JMenuItem("Morado");
        itemMorado.setFont(new Font("Andale Mono", 1, 14));
        itemMorado.setForeground(new Color(255, 0, 0));
        menuColorFondo.add(itemMorado);
        itemMorado.addActionListener(this);

        itemVacaciones = new JMenuItem("Vacaciones");
        itemVacaciones.setFont(new Font("Andale Mono", 1, 14));
        itemVacaciones.setForeground(new Color(255, 0, 0));
        menuCalcular.add(itemVacaciones);
        itemVacaciones.addActionListener(this);

        itemCreador = new JMenuItem("El Creador");
        itemCreador.setFont(new Font("Andale Mono", 1, 14));
        itemCreador.setForeground(new Color(255, 0, 0));
        menuAcercaDe.add(itemCreador);
        itemCreador.addActionListener(this);

        ImageIcon imagen = new ImageIcon("images/logo-coca.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(5, 5, 250, 100);
        add(labelLogo);

        labelBienvenido = new JLabel("Bienvenido " + nombre.toUpperCase());
        labelBienvenido.setBounds(280, 30, 400, 50);
        labelBienvenido.setFont(new Font("Andale mono", 1, 20));
        labelBienvenido.setForeground(new Color(255, 255, 255));
        add(labelBienvenido);

        labelDatosTrabajador = new JLabel("Datos del trabajador para el calculo de vacaciones");
        labelDatosTrabajador.setBounds(45, 140, 900, 25);
        labelDatosTrabajador.setFont(new Font("Andale mono", 0, 24));
        labelDatosTrabajador.setForeground(new Color(255, 255, 255));
        add(labelDatosTrabajador);

        labelNombres = new JLabel("Nombres");
        labelNombres.setBounds(25, 188, 180, 25);
        labelNombres.setFont(new Font("Andale mono", 1, 12));
        labelNombres.setForeground(new Color(255, 255, 255));
        add(labelNombres);

        txtNombreCompleto = new JTextField();
        txtNombreCompleto.setBounds(25, 213, 150, 25);
        txtNombreCompleto.setBackground(new java.awt.Color(224, 224, 224));
        txtNombreCompleto.setFont(new java.awt.Font("Andale mono", 1, 14));
        txtNombreCompleto.setForeground(new java.awt.Color(255, 0, 0));
        add(txtNombreCompleto);

        labelApellido1 = new JLabel("Primer Apellido");
        labelApellido1.setBounds(25, 248, 180, 25);
        labelApellido1.setFont(new Font("Andale mono", 1, 12));
        labelApellido1.setForeground(new Color(255, 255, 255));
        add(labelApellido1);

        txtApellido1 = new JTextField();
        txtApellido1.setBounds(25, 273, 150, 25);
        txtApellido1.setBackground(new java.awt.Color(224, 224, 224));
        txtApellido1.setFont(new java.awt.Font("Andale mono", 1, 14));
        txtApellido1.setForeground(new java.awt.Color(255, 0, 0));
        add(txtApellido1);


        labelApellido2 = new JLabel("Segundo Apellido");
        labelApellido2.setBounds(25, 308, 180, 25);
        labelApellido2.setFont(new Font("Andale mono", 1, 12));
        labelApellido2.setForeground(new Color(255, 255, 255));
        add(labelApellido2);

        txtApellido2 = new JTextField();
        txtApellido2.setBounds(25, 334, 150, 25);
        txtApellido2.setBackground(new java.awt.Color(224, 224, 224));
        txtApellido2.setFont(new java.awt.Font("Andale mono", 1, 14));
        txtApellido2.setForeground(new java.awt.Color(255, 0, 0));
        add(txtApellido2);

        labelSelecDpto = new JLabel("Selecciona el departamento");
        labelSelecDpto.setBounds(220, 188, 180, 25);
        labelSelecDpto.setFont(new Font("Andale mono", 1, 12));
        labelSelecDpto.setForeground(new Color(255, 255, 255));
        add(labelSelecDpto);

        comboDpto = new JComboBox();
        comboDpto.setBounds(220, 213, 220, 25);
        comboDpto.setBackground(new java.awt.Color(224, 224, 224));
        comboDpto.setFont(new java.awt.Font("Andale mono", 1, 14));
        comboDpto.setForeground(new java.awt.Color(255, 0, 0));
        add(comboDpto);
        comboDpto.addItem("");
        comboDpto.addItem("Atención al cliente");
        comboDpto.addItem("Logistica");
        comboDpto.addItem("Gerencia");


        labelSelecAntig = new JLabel("Selecciona la antigüedad");
        labelSelecAntig.setBounds(220, 248, 180, 25);
        labelSelecAntig.setFont(new Font("Andale mono", 1, 12));
        labelSelecAntig.setForeground(new Color(255, 255, 255));
        add(labelSelecAntig);

        comboAntig = new JComboBox();
        comboAntig.setBounds(220, 273, 220, 25);
        comboAntig.setBackground(new java.awt.Color(224, 224, 224));
        comboAntig.setFont(new java.awt.Font("Andale mono", 1, 14));
        comboAntig.setForeground(new java.awt.Color(255, 0, 0));
        add(comboAntig);
        comboAntig.addItem("");
        comboAntig.addItem("1 año de servicio");
        comboAntig.addItem("2 a 6 años de servicio");
        comboAntig.addItem("7 años o mas de servicio");


        labelResultadoCalc = new JLabel("Resultado del calculo:");
        labelResultadoCalc.setBounds(220, 307, 180, 25);
        labelResultadoCalc.setFont(new Font("Andale mono", 1, 11));
        labelResultadoCalc.setForeground(new Color(255, 255, 255));
        add(labelResultadoCalc);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBackground(new Color(224, 224, 224));
        textArea.setFont(new Font("Andale mono", 1, 11));
        textArea.setForeground(new Color(255, 0, 0));
        textArea.setText("\n     Aqui aparece el resultado del calculo de las vacaciones");

        scroll = new JScrollPane(textArea);
        scroll.setBounds(220, 335, 380, 90);
        add(scroll);


        labelFooter = new JLabel("ⓒ2017 The Coca Cola Company | Todos los derechos reservados");
        labelFooter.setBounds(135, 445, 500, 30);
        labelFooter.setFont(new java.awt.Font("Andale mono", 1, 12));
        labelFooter.setForeground(new java.awt.Color(255, 255, 255));
        add(labelFooter);

    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == itemVacaciones) {

            String nombreCompleto = txtNombreCompleto.getText();
            String primerApellido = txtApellido1.getText();
            String segundoApellido = txtApellido2.getText();
            String dpto = comboDpto.getSelectedItem().toString();
            String antig = comboAntig.getSelectedItem().toString();


            if (nombreCompleto.equals("") || primerApellido.equals("") || segundoApellido.equals("") || dpto.equals("") || antig.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");

            } else {
                if (dpto.equals("Atención al cliente")) {
                    if (antig.equals("1 año de servicio")) {
                        textArea.setText("El trabajador " + nombreCompleto + " " + primerApellido + " " + segundoApellido + " " +
                                "\n quien labora en " + dpto + " con " + antig + " recibe " +
                                "\n7 dias de vacaciones");
                    }

                    if (antig.equals("2 a 6 años de servicio")) {
                        textArea.setText("El trabajador " + nombreCompleto + " " + primerApellido + " " + segundoApellido + " " +
                                "\n quien labora en " + dpto + " con " + antig + " recibe " +
                                "\n14 dias de vacaciones");

                    }

                    if (antig.equals("7 años o mas de servicio")) {
                        textArea.setText("El trabajador " + nombreCompleto + " " + primerApellido + " " + segundoApellido + " " +
                                "\n quien labora en " + dpto + " con " + antig + " recibe " +
                                "\n20 dias de vacaciones");
                    }
                }


                if (dpto.equals("Logistica")) {
                    if (antig.equals("1 año de servicio")) {
                        textArea.setText("El trabajador " + nombreCompleto + " " + primerApellido + " " + segundoApellido + " " +
                                "\n quien labora en " + dpto + " con " + antig + " recibe " +
                                "\n7 dias de vacaciones");
                    }

                    if (antig.equals("2 a 6 años de servicio")) {
                        textArea.setText("El trabajador " + nombreCompleto + " " + primerApellido + " " + segundoApellido + " " +
                                "\n quien labora en " + dpto + " con " + antig + " recibe " +
                                "\n15 dias de vacaciones");

                    }

                    if (antig.equals("7 años o mas de servicio")) {
                        textArea.setText("El trabajador " + nombreCompleto + " " + primerApellido + " " + segundoApellido + " " +
                                "\n quien labora en " + dpto + " con " + antig + " recibe " +
                                "\n22 dias de vacaciones");
                    }
                }

                if (dpto.equals("Gerencia")) {
                    if (antig.equals("1 año de servicio")) {
                        textArea.setText("El trabajador " + nombreCompleto + " " + primerApellido + " " + segundoApellido + " " +
                                "\n quien labora en " + dpto + " con " + antig + " recibe " +
                                "\n10 dias de vacaciones");
                    }

                    if (antig.equals("2 a 6 años de servicio")) {
                        textArea.setText("El trabajador " + nombreCompleto + " " + primerApellido + " " + segundoApellido + " " +
                                "\n quien labora en " + dpto + " con " + antig + " recibe " +
                                "\n20 dias de vacaciones");

                    }

                    if (antig.equals("7 años o mas de servicio")) {
                        textArea.setText("El trabajador " + nombreCompleto + " " + primerApellido + " " + segundoApellido + " " +
                                "\n quien labora en " + dpto + " con " + antig + " recibe " +
                                "\n30 dias de vacaciones");
                    }
                }
            }
        }
        if(e.getSource()==itemNuevo)

        {
            txtNombreCompleto.setText("");
            txtApellido1.setText("");
            txtApellido2.setText("");
            comboDpto.setSelectedIndex(0);
            comboAntig.setSelectedIndex(0);
            textArea.setText("\n     Datos del trabajador para el calculo de vacaciones");

        }

        if(e.getSource()==itemSalir)

        {
            System.exit(0);
        }

        if(e.getSource()==itemRojo)

        {
            getContentPane().setBackground(new Color(255, 0, 0));

        }

        if(e.getSource()==itemNegro)

        {
            getContentPane().setBackground(new Color(0, 0, 0));
        }

        if(e.getSource()==itemMorado)

        {
            getContentPane().setBackground(new Color(128, 0, 128));
        }

        if(e.getSource()==itemCreador){
            JOptionPane.showMessageDialog(null, "                  Designed by: \nhttps://github.com/ricardoandrade1302");
        }
        
        
    }
    

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.setBounds(0, 0, 650, 600);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        principal.setResizable(false);
    }

}