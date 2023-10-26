package logica;/*
 * Autores:
 * Aguilar Choque Ricardo
 * Christian Rojas Blum
 * */

import java.util.ArrayList;

public class Player {


    private final ArrayList<Bet> currentBets;
    private int currentMoney;

    public Player(int money) {
        this.currentMoney = money;
        this.currentBets = new ArrayList<Bet>();
    }

    public void placeBet(int moneyBet, BetType bet) {
        Bet newBet = new Bet(moneyBet, bet);
        System.out.println();
        if (moneyBet < currentMoney) {
            currentBets.add(newBet);
            currentMoney -= newBet.getMoneyBet();
            System.out.println("You placed a bet of " + newBet.getMoneyBet() + " on " + newBet.getBetType().getClass() + ".");
        } else {
            System.out.println("You don't have enough money to place this bet.");
        }
        System.out.println("You now have " + currentMoney + " left.");
    }

    public void finishBetPhase() {
        System.out.println("*----- BET PHASE FINISHED -----*");
    }

    public void checkWins() {
        System.out.println("*----- ROULETTE RESULTS -----*");
        for (Bet bet : currentBets) {
            bet.getBetType().checkWinCondition();
            if (bet.getBetType().checkWinCondition()) {
                System.out.println("* You won " + bet.getBetType().calculateProfit(bet.getMoneyBet()) + " on " + bet.getBetType().getClass() + ". *");
                currentMoney += (int) bet.getBetType().calculateProfit(bet.getMoneyBet());
            } else {
                if (Roulette.getResult() == 0) {
                    int recoveredMoney = ProfitCalculator.calculateProfitOnZero(bet);
                    currentMoney += recoveredMoney;
                    System.out.println("You lost " + recoveredMoney + " on " + bet.getBetType().getClass() + ".");
                } else {
                    System.out.println("You lost " + bet.getMoneyBet() + " on " + bet.getBetType().getClass() + ".");
                }
            }
            System.out.println("You now have " + currentMoney + " left.");
        }
    }

    public void addMoney(int money) {
        currentMoney += money;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

    public ArrayList<Bet> getCurrentBets() {
        return currentBets;
    }

}
