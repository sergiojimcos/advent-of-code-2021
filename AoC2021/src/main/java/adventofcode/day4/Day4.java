package main.java.adventofcode.day4;

public class Day4 {
    public static void main(String[]args) {

        int powerConsumption = Bingo.findWinner("data_day4.txt");
        System.out.println("The result of part I is: " + powerConsumption);

        int lifeSupportRating = Bingo.findLoser("data_day4.txt");
        System.out.println("The result of part II is: " + lifeSupportRating);

    }
}
