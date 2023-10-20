import java.util.ArrayList;

public class Player {


    private ArrayList<Bet> currentBets;
    private int currentMoney;

    public Player(int money){
        this.currentMoney = money;
        this.currentBets = new ArrayList<Bet>();
    }

    public boolean placeBet(int moneyBet, BetType bet) {
        Bet newBet = new Bet(moneyBet, bet);
        boolean res = false;
        if (moneyBet < currentMoney) {
            currentBets.add(newBet);
            currentMoney -= newBet.moneyBet;
            System.out.println("You placed a bet of " + newBet.moneyBet + " on " + newBet.betType.getClass() + ".");
            res = true;
        } else {
            System.out.println("You don't have enough money to place this bet.");
        }
        System.out.println("You now have " + currentMoney + " left.");
        return res;
    }

    public void finishBetPhase(){
        
    }

    public void addMoney(int money){
        currentMoney += money;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(int currentMoney) {
        this.currentMoney = currentMoney;
    }

    public ArrayList<Bet> getCurrentBets() {
        return currentBets;
    }

}
