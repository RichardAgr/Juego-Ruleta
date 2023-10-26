package GUI2;

import logica.Main;
import logica.Player;

import javax.swing.*;

public class ApuestasListener implements ApuestaListener {
    private int number1;
    private int number2;
    private int moneyBet;
    private boolean boolean1;
    private boolean boolean2;
    private boolean boolean3;

    public void realizarApuesta(String tipoApuesta) {
        System.out.println("Apuesta realizada: " + tipoApuesta);
        CustomInputDialogPanel inputDialogPanel = new CustomInputDialogPanel(tipoApuesta);
        int result = JOptionPane.showConfirmDialog(null, inputDialogPanel, "Apuesta", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            selectTipoDeApuesta(tipoApuesta, inputDialogPanel);
        }
    }

    private void selectTipoDeApuesta(String tipoApuesta, CustomInputDialogPanel inputDialogPanel) {
        Player player = Main.rouletteGame.getPlayer();
        switch (tipoApuesta) {
            case "Bet on number":
                number1 = inputDialogPanel.getTextField1Value();
                moneyBet = inputDialogPanel.getTextField3Value();
                player.placeBet(moneyBet, new logica.BetOnNumber(number1));
                break;
            case "Bet on color":
                System.out.println("Bet on color");
                break;
            case "Bet on parity":
                System.out.println("Bet on parity");
                break;
            case "Bet on 18":
                System.out.println("Bet on 18");
                break;
            case "Corner bet":
                System.out.println("Corner bet");
                break;
            case "Split bet":
                System.out.println("Split bet");
                break;
            case "Bet on column":
                System.out.println("Bet on column");
                break;
            case "Bet on dozen":
                System.out.println("Bet on dozen");
                break;
            case "Bet on 2 column":
                System.out.println("Bet on 2 column");
                break;
            case "Street bet":
                System.out.println("Street bet");
                break;

            default:
                System.out.println("Apuesta no reconocida");
                break;
        }

    }

}
