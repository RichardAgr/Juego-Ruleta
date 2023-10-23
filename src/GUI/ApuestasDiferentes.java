/*
 * Autores:
 * Aguilar Choque Ricardo
 * Christian Rojas Blum
 * */

package GUI;

import javax.swing.*;
import java.awt.*;

public class ApuestasDiferentes extends JPanel {
    private JLabel titulo;
    private JPanel contenedorApuesta;
    public ApuestasDiferentes(){
        setLayout(new BorderLayout());
        titulo = new JLabel("Apuestas",SwingConstants.CENTER);
        Font tipografia = new Font(Font.SANS_SERIF, Font.BOLD, 30);
        titulo.setFont(tipografia);
        add(titulo,BorderLayout.NORTH);
        contenedorApuesta = new JPanel();
        contenedorApuesta.setLayout(new GridLayout(0,2));
        add(contenedorApuesta,BorderLayout.CENTER);
        ponerBotones();
    }

    private void ponerBotones(){
        Font nuevaTipografia = new Font("Arial", Font.BOLD, 16);
        JButton apuesta1 = new JButton("Bet on number");
        apuesta1.setFont(nuevaTipografia);
        JButton apuesta2 = new JButton("Bet on color");
        apuesta2.setFont(nuevaTipografia);
        JButton apuesta3 = new JButton("Bet on parity");
        apuesta3.setFont(nuevaTipografia);
        JButton apuesta4 = new JButton("Bet on 18");
        apuesta4.setFont(nuevaTipografia);
        JButton apuesta5 = new JButton("Corner bet");
        apuesta5.setFont(nuevaTipografia);
        JButton apuesta6 = new JButton("Split bet");
        apuesta6.setFont(nuevaTipografia);
        JButton apuesta7 = new JButton("Bet on column");
        apuesta7.setFont(nuevaTipografia);
        JButton apuesta8 = new JButton("Bet on dozen");
        apuesta8.setFont(nuevaTipografia);
        JButton apuesta9 = new JButton("Bet on 2 colum");
        apuesta9.setFont(nuevaTipografia);
        JButton apuesta10 = new JButton("Street bet");
        apuesta10.setFont(nuevaTipografia);

        contenedorApuesta.add(apuesta1);
        contenedorApuesta.add(apuesta2);
        contenedorApuesta.add(apuesta3);
        contenedorApuesta.add(apuesta4);
        contenedorApuesta.add(apuesta5);
        contenedorApuesta.add(apuesta6);
        contenedorApuesta.add(apuesta7);
        contenedorApuesta.add(apuesta8);
        contenedorApuesta.add(apuesta9);
        contenedorApuesta.add(apuesta10);


    }
}
