package GUI;

import javax.swing.*;

public class Ruleta {
    public JFrame ventana2;

    public Ruleta(JFrame ventana2){
        this.ventana2 = ventana2;
        agregarBoton();
    }

    public void agregarBoton(){
        JButton boton = new JButton("Ruleta");
        ventana2.add(boton);
    }


}
