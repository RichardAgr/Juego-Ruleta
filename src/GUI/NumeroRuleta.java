/*
 * Autores:
 * Aguilar Choque Ricardo
 * Christian Rojas Blum
 * */

package GUI;

import javax.swing.*;
import java.awt.*;

public class NumeroRuleta extends JPanel {
    private JLabel titulo;
    public NumeroRuleta(){
        titulo = new JLabel("Numeros salientes");
        Font tipografia = new Font(Font.SANS_SERIF, Font.BOLD, 30);
        titulo.setFont(tipografia);
        add(titulo);
    }
}
