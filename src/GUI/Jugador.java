package GUI;

import javax.swing.*;
import java.awt.*;

public class Jugador extends JPanel{
    public Jugador(){
        JButton boton = new JButton("Desgracia");
        setBackground(new Color(29, 227, 45));
        setSize(300,300);
        add(boton);
    }
}
