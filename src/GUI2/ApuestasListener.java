package GUI2;

import logica.Color;
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
    private Color color;

    public void realizarApuesta(String tipoApuesta) {
        CustomInputDialogPanel inputDialogPanel = new CustomInputDialogPanel(tipoApuesta);
        int result = JOptionPane.showConfirmDialog(null, inputDialogPanel, "Apuesta", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            selectTipoDeApuesta(tipoApuesta, inputDialogPanel);
        }
    }

    private void selectTipoDeApuesta(String tipoApuesta, CustomInputDialogPanel inputDialogPanel) {
        Player player = Main.rouletteGame.getPlayer();
        moneyBet = inputDialogPanel.getTextField3Value();
        switch (tipoApuesta) {
            case "Bet on number":
                number1 = inputDialogPanel.getTextField1Value();
                player.placeBet(moneyBet, new logica.BetOnNumber(number1));
                break;
            case "Bet on color":
                color = inputDialogPanel.getColorJComboBox();
                player.placeBet(moneyBet, new logica.BetOnColor(color));
                break;
            case "Bet on parity":
                boolean1 = inputDialogPanel.getBooleanField1();
                player.placeBet(moneyBet, new logica.BetOnParity(boolean1));
                break;
            case "Bet on 18":
                boolean1 = inputDialogPanel.getBooleanField1();
                player.placeBet(moneyBet, new logica.BetOn18(boolean1));
                break;
            case "Corner bet":
                number1 = inputDialogPanel.getTextField1Value();
                number2 = inputDialogPanel.getTextField2Value();
                player.placeBet(moneyBet, new logica.CornerBet(number1, number2));
                break;
            case "Split bet":
                number1 = inputDialogPanel.getTextField1Value();
                number2 = inputDialogPanel.getTextField2Value();
                player.placeBet(moneyBet, new logica.SplitBet(number1, number2));
                break;
            case "Bet on column":
                number1 = inputDialogPanel.getTextField1Value();
                player.placeBet(moneyBet, new logica.BetOnColumn(number1));
                break;
            case "Bet on dozen":
                boolean1 = inputDialogPanel.getBooleanField1();
                boolean2 = inputDialogPanel.getBooleanField2();
                boolean3 = inputDialogPanel.getBooleanField3();
                player.placeBet(moneyBet, new logica.BetOnDozen(boolean1, boolean2, boolean3));
                break;
            case "Bet on 2 column":
                number1 = inputDialogPanel.getTextField1Value();
                number2 = inputDialogPanel.getTextField2Value();
                player.placeBet(moneyBet, new logica.BetOnTwoColumns(number1, number2));
                break;
            case "Street bet":
                number1 = inputDialogPanel.getTextField1Value();
                player.placeBet(moneyBet, new logica.StreetBet(number1));
                break;

            default:
                System.out.println("Apuesta no reconocida");
                break;
        }

    }

}
