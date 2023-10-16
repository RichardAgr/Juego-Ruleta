public class Bet {
    public int moneyBet;
    public BetType betType;

    public Bet(int moneyBet,BetType betType){
        this.moneyBet = moneyBet;
        this.betType = betType;
    }

    public boolean playerHaveEnoughMoney(){
        return true;
    }
}
