
public class Main {
    public static void main(String[]args){
        BetType bet1 = new BetType("1", 1);
        BetType bet2 = new BetType("color", 2);
        BetType bet3 = new BetType(true, 3);
        BetType bet5 = new BetOnNumber(20, 5);
        BetType bet4 = new BetOnColor("red", 4);
        BetType bet6 = new BetOnParity(true, 6);
    }
}
