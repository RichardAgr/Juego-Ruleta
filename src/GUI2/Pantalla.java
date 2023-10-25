package GUI2;

import javax.swing.*;
import java.awt.*;
import java.awt.GridBagLayout;
public class Pantalla extends JFrame{
    private GridBagConstraints gbc = new GridBagConstraints();

    public Pantalla(){
        setTitle("Ruleta");
        setSize(1200, 700);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        armarMesa();
        setVisible(true);
    }

    private void armarMesa(){
        JPanel tablero = new Tablero();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weighty = 1.0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(tablero,gbc);

        JPanel ruleta = new Ruleta();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weighty = 1.0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(ruleta,gbc);

        JPanel datosJugador = new DatosJugador();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weighty = 1.0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(datosJugador,gbc);

        JPanel jugador = new Jugador();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weighty = 1.0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(jugador,gbc);

        JPanel apuestas = new Apuestas();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weighty = 1.0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(apuestas,gbc);

        JPanel play = new PlayGame();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weighty = 1.0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(play,gbc);
    }

    public static void main(String[] args){
        Pantalla playRuleta = new Pantalla();
    }
}
