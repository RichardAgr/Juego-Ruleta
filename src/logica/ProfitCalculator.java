package logica;/*
 * Autores:
 * Aguilar Choque Ricardo
 * Christian Rojas Blum
 * */

import java.util.ArrayList;

public class ProfitCalculator {

    private ProfitCalculator () {}

    public static double calculateProfit(int moneyBet, float betProfit) {
        return moneyBet * betProfit + moneyBet;
    }

    public static int calculateProfitOnZero(Bet currentBet) {
        return currentBet.getMoneyBet()/2;
    }
}
