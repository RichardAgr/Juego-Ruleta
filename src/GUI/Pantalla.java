package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class Pantalla extends JFrame{
    private GridBagConstraints gbc = new GridBagConstraints();

    public Pantalla(){
        setTitle("Ruleta");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        armarMesa();
        setVisible(true);
    }

    public void armarMesa(){
        JPanel tabla = new Tablero();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(tabla,gbc);


        JPanel rule = new Ruleta();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(rule,gbc);

        JPanel play = new Jugador();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(play,gbc);
    }

    public static void main(String[] args){
        Pantalla playRuleta = new Pantalla();
    }
}
