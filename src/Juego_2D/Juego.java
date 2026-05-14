package Juego_2D;

import com.sun.tools.javac.Main;
/** Prueba github**/
import javax.swing.*;
import java.awt.*;

import static java.awt.AWTEventMulticaster.add;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Juego {


    private JPanel MainJuego = new JPanel();
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;

    private JTextField txtUsuario;
    private JButton btnJugar;


    public Juego(){

        JFrame frame = new JFrame("Juego");
        frame.setContentPane(new Juego().MainJuego);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocation(200, 175);
        frame.setVisible(true);

        JFrame frame = new JFrame("Memory Play");
        ImageIcon imagen = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMAGE/memory.png"))
        frame.setIconImage(icono);

        frame.setContentPane(MainJuego);
        frame.setSize(500,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void iniciarLetras(){


    }




    public static void main(String[] args) {
        new Juego();
    }




    /**
     *  Aqui hacemos el form.main despues que hayamos vinculado
     *  correctamente el Juego.form con la clase publica de Juego
     *
     *  Y como sabes que esta bien ps porque sale automaticamente
     *  el private JPanel MainJuego o el nombre q le asignes.
     *  **/
    public

}