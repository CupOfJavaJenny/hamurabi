//package hammurabi.docs.matuszek;
//
//import java.util.InputMismatchException;
//import java.util.Random;
//import java.util.Scanner;
//
///**
// *
// */
//
//public class Hammurabi {
//    Random rand = new Random();
//    Scanner scanner = new Scanner(System.in);
//    public int immigrants, harvest, yield, deaths, year;
//    public int people = 100;
//    public int bushelsGrain = 2800;
//    public int acresLand = 1000;
//    public int landValue = 19;
//
//    public static void main(String[] args) {
//        new Hammurabi().playGame();
//    }
//
//    int getNumber() {
//        while (true) {
//            System.out.print(message);
//            try {
//                return scanner.nextInt();
//            }
//            catch (InputMismatchException e) {
//                System.out.println("\"" + scanner.next() + "\" isn't a number!");
//            }
//        }
//    }
//
//    void playGame() {
//        askHowManyAcresToBuy();
//        int sellAmount =  askHowManyAcresToSell();
//        bushelsGrain = landValue * sellAmount;
//        System.out.println(acresLand);
//        acresLand -= sellAmount;
//        System.out.println(acresLand);
//        // declare local variables here: grain, population, etc.
//        // statements go after the declartions
//        bushelsGrain -= askHowManyAcresToPlant();
//        System.out.println(bushelsGrain);
//        int numPlanted = askHowMuchGrainToFeedPeople();
//    }
//
//    int askHowManyAcresToBuy() {
//        System.out.println("How many acres do you wish to buy?");
//        // buy is carrying how many acres were input by hammurabbi.
//        int buy = scanner.nextInt();
//        //landValue * acres wanted = bushelsSpent
//        int bushelsSpent = landValue * buy;
//        if (bushelsSpent < 0) {
//            System.out.println("Not possible my leige");
//        } else if (bushelsSpent > bushelsGrain) {
//            System.out.println("Not enough bushels to do this");
//
//        }
//        if (bushelsSpent <= bushelsGrain && bushelsSpent > 0) {
//            //our $ will go down as our acres go up.
//            bushelsGrain -= bushelsSpent;
//            //our acres go up as hammurabi inputs how much to buy in scanner called input
//            acresLand += buy;
//
//        }
//        return acresLand;
//
//    }
//
//    int askHowManyAcresToSell() {
//        System.out.println("How many acres do you wish to sell?");
//        // sell is carrying how many acres were input by hammurabi.
//        int sellAmount = scanner.nextInt();
//
//        //i haveto be able to sell acres when land value is depreciated, if appreciated i may not be able to sell,
//        // put that in bushels bank
//        int bushelsBank = landValue * sellAmount;
//        while (sellAmount > acresLand) {
//            System.out.println("Land has appreciated, you can't sell that much");
//            //if they haven't entered a correct value, then it'll not let that happen, asking them to enter a new one
//            sellAmount = scanner.nextInt();
//        }
//        return sellAmount;
//    }
//
//
//    int askHowMuchGrainToFeedPeople(){
//        //how much to plant?
//        //make sure they're able to plant that much (can't plant more than they have)
//        // (can't plant on more land then they have)
//        //return number of bushels they're planting
//        while (int numPlanted > acresLand || numPlanted> bushelsGrain)
//            return getNumber();
//
//
//    }
//    int askHowManyAcresToPlant(int acresLand, int population, int bushels){
//        //new plants can't be more than bushels or total amount of acres
//        //new plants / 10 can't be more than the population
//        while (numPlanted > acresLand || numPlanted > bushelsGrain || numPlanted/10 >population) {
//
//        }
//        return getNumber();
//    }
//
//
////
////    }
//
//
//}