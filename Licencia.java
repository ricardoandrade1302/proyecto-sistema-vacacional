import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;


public class Licencia extends JFrame implements ActionListener, ChangeListener{
  
  private JLabel label1, label2;
  private JCheckBox check1;
  private JTextArea textArea1;
  private JScrollPane scroll;
  private JButton boton1, boton2;
  String nombre = "";


  public Licencia(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Terminos de uso");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombre = ventanaBienvenida.texto;
    
    label1 = new JLabel("TERMINOS Y CONDICIONES");
    label1.setBounds(215,5,200,30);
    label1.setFont(new Font("Andale Mono", 1, 14));
    label1.setForeground(new Color(0,0,0));
    add(label1);
  
    textArea1 = new JTextArea();
    textArea1.setEditable(false);
    textArea1.setFont(new Font("Andale Mono", 0, 11));
    textArea1.setText("\n\n          TERMINOS Y CONDCIONES" + 
			"\n\n     Al utilizar este servicio, aceptas cumplir con los siguientes términos y condiciones." + 
                        "\n     Reconoces que has leído, entendido y estás de acuerdo con todas las disposiciones aquí establecidas." + 
			"\n\n     El uso indebido de este servicio, la copia no autorizada de contenidos o cualquier violación de estos términos" + 
			"\n     puede resultar en la suspensión o cancelación de tu acceso. Nos reservamos el derecho de modificar estos " +
			"\n     términos en cualquier momento,por lo que te recomendamos revisarlos periódicamente.");
    scroll = new JScrollPane(textArea1);
    scroll.setBounds(10,40,575,200);
    add(scroll);
    
    check1 = new JCheckBox("Yo: " + nombre.toUpperCase() + ", Acepto");
    check1.setBounds(10,250,300,30);
    check1.addChangeListener(this);
    add(check1);
    
    boton1 = new JButton("Continuar");
    boton1.setBounds(10,290,100,30);
    boton1.setEnabled(false); 
    boton1.addActionListener(this);
    getRootPane().setDefaultButton(boton1);
    add(boton1);

    boton2 = new JButton("No Acepto");
    boton2.setBounds(120,290,100,30);
    boton2.setEnabled(true); 
    boton2.addActionListener(this);
    add(boton2);
   
    ImageIcon imagen = new ImageIcon("images/coca-cola.png");
    label2 = new JLabel(imagen);
    label2.setBounds(315,135,300,300);
    add(label2);
  }
  

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
     Principal principal = new Principal();
       principal.setBounds(0,0,650,535);
       principal.setVisible(true);
       principal.setLocationRelativeTo(null);
       principal.setResizable(false);
       this.setVisible(false);

      }

    if(e.getSource() == boton2){
      Bienvenida bienvenida = new Bienvenida();
        bienvenida.setBounds(0,0,360,450);
        bienvenida.setVisible(true);
        bienvenida.setLocationRelativeTo(null);
        bienvenida.setResizable(false);
        this.setVisible(false);

     }
  }


  public void stateChanged(ChangeEvent e){
    if(check1.isSelected()){
       boton1.setEnabled(true);
       boton2.setEnabled(false);
      }else{
       boton1.setEnabled(false);
       boton2.setEnabled(true);
      }
  }

  
  public static void main(String[] args) {
     Licencia licencia = new Licencia();
     licencia.setBounds(0,0,650,400);
     licencia.setVisible(true);
     licencia.setLocationRelativeTo(null);
     licencia.setResizable(false);
    }


}