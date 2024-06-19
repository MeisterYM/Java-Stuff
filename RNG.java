//Importing the Random class
import java.util.Random;

public class RNG {
    public static void main(String[] args) {

        System.out.println("Computer! What day of the month is it?");

        //Creating an instance of the Random class.
        Random rand = new Random();

        //Assigning a random value between 1 and 30 to a variable.
        int day_of_month = rand.nextInt(30);

        //Showing the generated value.
        System.out.println(day_of_month);
    }
}
