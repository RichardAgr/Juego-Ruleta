import java.util.Random;

public class Roulette{
    private static final Random randomNumber;
    public static int result;

    static {
        randomNumber = new Random();
    }

    private Roulette() {}

    public static void spin(){
         result = randomNumber.nextInt(37); 
    }

    public static int getResult(){
        return result;
    }

    public static String getColor(){
        if (result == 0) {
            return "Verde";
        } else if ((result > 0 && result < 11) || (result > 18 && result < 29)) {
            return (result % 2 == 0) ? "Negro" : "Rojo";
        } else if ((result > 10 && result < 19) || (result > 28 && result < 37)) {
            return (result % 2 == 0) ? "Rojo" : "Negro";
        } else {
            return "";
        }
    }
}