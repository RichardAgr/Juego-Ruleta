package GUI2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopapJugador extends JPanel {
        private JTextField nombreField;
        private JTextField dineroField;

        private JButton okBoton;
        private JButton cancelBoton;

        private JLabel mensajeLabel;

        private Font tipografia;
        private GridBagConstraints gbc;

        public String nombre;
        public String dinero;

        public DatosJugador dj;

        public PopapJugador() {
                dj = new DatosJugador();
                setLayout(new GridBagLayout());
                setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                tipografia = getFont().deriveFont(Font.BOLD, 24);
                gbc = new GridBagConstraints();
                armarPopap();
        }

        private void armarPopap(){
                gbc.anchor = GridBagConstraints.CENTER;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.insets = new Insets(5, 5, 5, 5);
                gbc.gridwidth = 2;
                gbc.weightx = 1.0;

                gbc.gridx = 0;
                gbc.gridy = 0;
                JLabel label = new JLabel("Jugador");
                label.setFont(tipografia);
                add(label, gbc);

                gbc.gridwidth = 1;
                gbc.gridy++;
                label = new JLabel("Nombre:");
                add(label, gbc);

                gbc.gridx++;
                nombreField = new JTextField(20);
                String text = "";
                nombreField.setText(text);
                nombreField.setSelectionStart(0);
                nombreField.setSelectionEnd(text.length());
                add(nombreField, gbc);

                gbc.gridx = 0;
                gbc.gridy++;
                label = new JLabel("Dinero(Bs):");
                add(label, gbc);

                gbc.gridx++;
                dineroField = new JTextField(20);
                dineroField.setHorizontalAlignment(JTextField.TRAILING);
                add(dineroField, gbc);

                gbc.gridwidth = 2;
                gbc.gridx = 0;
                gbc.gridy++;

                okBoton = new JButton("Ok");
                cancelBoton = new JButton("Cancelar");
                gbc.gridwidth = 1;
                gbc.gridx = 0;
                gbc.gridy++;
                add(okBoton,gbc);

                gbc.gridx++;
                add(cancelBoton,gbc);

                okBoton = new JButton("OK");
                okBoton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String texto = nombreField.getText();
                                String dinero = dineroField.getText();
                                dj.setDatos(texto,dinero);
                                repaint();
                        }
                });

                cancelBoton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                JDialog dialogo = (JDialog) SwingUtilities.getWindowAncestor(PopapJugador.this);
                                dialogo.dispose();
                        }
                });

                mensajeLabel = new JLabel(" ");
                mensajeLabel.setForeground(Color.RED);
                add(mensajeLabel, gbc);
        }

}

