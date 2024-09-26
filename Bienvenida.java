import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{
    private JLabel label1, label2, label3, label4;
    private JTextField textField1;
    private JButton boton1;
    public static String texto = "";

    public Bienvenida(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));   //cambiar fondo de la interfaz rojo
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());   //agregar un icono en la pantalla en lugar del icono de java

        ImageIcon imagen = new ImageIcon("images/logo-coca.png");  //crear un objeto tipo ImageIcon para guardar la imagen en una etiqueta label
        label1 = new JLabel(imagen);
        label1.setBounds(25,15,300,150);
        add(label1);

        label2 = new JLabel("Sistema de Control Vacacional");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono", 3, 18)); // agregar (tipo de letra, negrita-cursiva, tamaño)
        label2.setForeground(new Color(255,255,255));  // agreagr color de letra en este caso blanco RGB
        add(label2);

        label3 = new JLabel("Ingrese su nombre: ");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("Andale Mono", 1, 12)); // agregar (tipo de letra, negrita-cursiva, tamaño)
        label3.setForeground(new Color(255,255,255));  // agreagr color de letra en este caso blanco RGB
        add(label3);

        label4 = new JLabel("ⓒ2017 The Coca-Cola Company");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono", 1, 12)); // agregar (tipo de letra, negrita, tamaño)
        label4.setForeground(new Color(255,255,255));  // agreagr color de letra en este caso blanco RGB
        add(label4);


        textField1 = new JTextField();
        textField1.setBounds(45,240,255,25);
        textField1.setBackground(new Color(224,224,224)); //cambiar el fondo de color del text field a gris
        textField1.setFont(new Font("Andale Mono", 1, 14)); // agregar (tipo de letra, negrita, tamaño)
        textField1.setForeground(new Color(255,0,0));  // agreagr color de letra en este caso rojo RGB
        add(textField1);

        boton1 = new JButton("Ingresar");
        boton1.setBounds(125,280,100,30);
        boton1.setBackground(new Color(255,255,255)); //ajustar el color del fondo el botón a blanco
        boton1.setFont(new Font ("Andale Mono", 1, 14)); // ajustar tipo de letra
        boton1.setForeground(new Color(255,0,0)); // ajustar color de letra al botón "rojo"
        getRootPane().setDefaultButton(boton1);
        boton1.addActionListener(this);
        add(boton1);
    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
          texto = textField1.getText().trim();
          if(texto.equals("")){
           JOptionPane.showMessageDialog(null, "Debes ingresar tu Nombre");
         }else{
             Licencia licencia = new Licencia();
             licencia.setBounds(0,0,650,400);
             licencia.setVisible(true);
             licencia.setLocationRelativeTo(null);
             licencia.setResizable(false);
             this.setVisible(false);
          }
        }
    }

    public static void main(String[] args) {
        Bienvenida bienvenida = new Bienvenida();
        bienvenida.setBounds(0,0,360,450);
        bienvenida.setVisible(true);
        bienvenida.setLocationRelativeTo(null);
        bienvenida.setResizable(false);
    }


}