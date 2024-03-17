package hammurabi.docs.matuszek;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Hammurabi {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    public int immigrants, harvest, yield, deaths, year;
    public int people = 100;
    public int bushelsGrain = 2800;
    public int acresLand = 1000;
    public int landValue = 19;

    public static void main(String[] args) {
        new Hammurabi().playGame();
    }

    void playGame() {
        askHowManyAcresToBuy();
        // declare local variables here: grain, population, etc.
        // statements go after the declations
    }

    int askHowManyAcresToBuy() {
        System.out.println("How many acres do you wish to buy?");
        // buy is carrying how many acres were input by hammurabbi.
        int buy = scanner.nextInt();
        //landValue * acres wanted = bushelsSpent
        int bushelsSpent = landValue * buy;
        if (bushelsSpent < 0) {
            System.out.println("Not possible my leige");
        } else if (bushelsSpent > bushelsGrain) {
            System.out.println("Not enough bushels to do this");

        }
        if (bushelsSpent <= bushelsGrain && bushelsSpent > 0) {
            //our $ will go down as our acres go up.
            bushelsGrain -= bushelsSpent;
            //our acres go up as hammurabi inputs how much to buy in scanner called input
            acresLand += buy;

        }
        return acresLand;

//    }
//    int askHowManyAcresToSell(int acresOwned){
//
//    }
//    int askHowMuchGrainToFeedPeople(int bushels){
//
//    }
//    int askHowManyAcresToPlant(int acresOwned, int population, int bushels){
//
//    }
    }
}