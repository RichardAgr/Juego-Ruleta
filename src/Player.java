import java.util.ArrayList;

public class Player {
    public ArrayList<Bet> currentBets;
    public int currentMoney;

    public Player(){

    }

    public boolean placeBet(Bet bet){
        Bet newBet = new Bet(bet.moneyBet, bet.betType);
        if (newBet.playerHaveEnoughMoney()) {
            currentBets.add(newBet);
            return true;
        } else {
            System.out.println("You don't have enough money to place this bet.");
            return false;
        }
    }

    public void finishBetPhase(){
        
    }
}
