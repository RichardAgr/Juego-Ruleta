package GUI2;

import javax.swing.*;

public class ApuestasListener implements ApuestaListener {
    public void realizarApuesta(String tipoApuesta) {
        System.out.println("Apuesta realizada: " + tipoApuesta);
        selectTipoDeApuesta(tipoApuesta);
        CustomInputDialogPanel inputDialogPanel = new CustomInputDialogPanel();
        int result = JOptionPane.showConfirmDialog(null, inputDialogPanel, "Apuesta", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String valorCampo1 = inputDialogPanel.getTextField1Value();
            String valorCampo2 = inputDialogPanel.getTextField2Value();
            System.out.println("Campo 1:" + valorCampo1);
            System.out.println("Campo 2:" + valorCampo2);
        }
        JOptionPane.showMessageDialog(null, "Apuesta realizada: " + tipoApuesta);
    }

    private void selectTipoDeApuesta(String tipoApuesta) {
        switch (tipoApuesta) {
            case "Bet on number":
                System.out.println("Bet on number");
                break;
            case "Bet on color":
                System.out.println("Bet on color");
                break;
            default:
                System.out.println("Apuesta no reconocida");
                break;
        }

    }
}
