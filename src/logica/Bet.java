package logica;
/*
* Autores:
* Aguilar Choque Ricardo
* Christian Rojas Blum
* */
public class Bet {
    private final int moneyBet;
    private final BetType betType;

    public Bet(int moneyBet, BetType betType) {
        this.moneyBet = moneyBet;
        this.betType = betType;
    }

    public int getMoneyBet() {
        return moneyBet;
    }

    public BetType getBetType() {
        return betType;
    }
}
