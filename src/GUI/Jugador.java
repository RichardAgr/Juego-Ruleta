/*
 * Autores:
 * Aguilar Choque Ricardo
 * Christian Rojas Blum
 * */

package GUI;

import javax.swing.*;
import java.awt.*;


public class Jugador extends JPanel{
    private JLabel titulo;
    public Jugador(){
        titulo = new JLabel("Jugadores");
        Font tipografia = new Font(Font.SANS_SERIF, Font.BOLD, 30);
        titulo.setFont(tipografia);
        add(titulo);
    }
}
