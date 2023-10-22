package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class Pantalla extends JFrame{
    private GridBagConstraints gbc = new GridBagConstraints();

    public Pantalla(){
        setTitle("Ruleta");
        setSize(900, 600);
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
        add(tabla,gbc);
    }

    public static void main(String[] args){
        Pantalla playRuleta = new Pantalla();
    }
}
