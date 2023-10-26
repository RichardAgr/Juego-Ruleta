package GUI2;

import javax.swing.*;
import java.awt.*;

public class DatosJugador extends JPanel{
    private JLabel titulo;
    public String nombre;
    public String dinero;
    private GridBagConstraints gbc;
    public DatosJugador(){
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        mostrarDatos();
    }

    public void mostrarDatos() {
        Font nuevaTipografia = new Font("Arial", Font.BOLD, 24);
        JLabel nom = new JLabel("Nombre: "+"Riki");
        nom.setFont(nuevaTipografia);
        JLabel plata = new JLabel("Dinero: "+"2000"+" Bs");
        plata.setFont(nuevaTipografia);

        titulo = new JLabel("Datos del jugador", SwingConstants.CENTER);
        Font tituloTipografia = new Font("Arial", Font.BOLD, 26);
        titulo.setFont(tituloTipografia);

        gbc.insets = new Insets(5,0,80,0);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(titulo, gbc);

        gbc.insets = new Insets(5,0,5,0);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(nom, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(plata, gbc);
    }

    public void setDatos(String nombre, String dinero){
        this.nombre = nombre;
        this.dinero =dinero;
        mostrarDatos();
    }

}
