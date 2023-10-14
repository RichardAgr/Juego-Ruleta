import java.util.Random;

public class Roulette{
    private Random randomNumber;
    public int result;

    public Roulette(){
        randomNumber=new Random();
    }

    public void spin(int n){
         result = randomNumber.nextInt(37); 
    }

    public int getResult(){
        return result;
    }

    public String getColor(){
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