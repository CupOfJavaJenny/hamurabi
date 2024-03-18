import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Hammurabi {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        new Hammurabi().playGame();
        Hammurabi hammurabi = new Hammurabi();
//        System.out.println(hammurabi.askHowManyAcresToBuy(50, 100));
        System.out.println(hammurabi.askHowManyAcresToSell(20));

    }

    void playGame() {
        int people = 100;
        int bushelsGrain = 2800;
        int acresLand = 1000;
        int landValue = 19;
    }

    int askHowManyAcresToBuy(int price, int bushel) {
        //asking how many acres to buy
        int acrestoBuy;

        do {
            acrestoBuy = getNumber("How many acres would you like to buy?  ");

        } while (acrestoBuy * price > bushel);
        return acrestoBuy;
    }

    /**
     * Prints the given message (which should ask the user for some integral
     * quantity), and returns the number entered by the user. If the user's
     * response isn't an integer, the question is repeated until the user
     * does give a integer response.
     *
     * @param message The request to present to the user.
     * @return The user's numeric response.
     */
    int getNumber(String message) {
        while (true) {
            System.out.print(message);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\"" + scanner.next() + "\" isn't a number!");
            }
        }
    }

    int askHowManyAcresToSell(int acresOwned) {

        int acresToSell;

        do {
            acresToSell = getNumber("How much would you like to sell?  ");

        } while (acresToSell > acresOwned);
        return acresToSell;
    }

    int askHowMuchGrainToFeedPeople(int bushels) {
        int bushelsFed;
        do {
            bushelsFed = getNumber("How many bushels would you like to feed the citizens? ");

        } while (bushelsFed > bushels);
        return bushelsFed;
    }
}
