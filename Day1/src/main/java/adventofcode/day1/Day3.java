package main.java.adventofcode.day1;

import main.java.adventofcode.common.Diagnostic;

public class Day3 {
    public static void main(String[]args) {

        int powerConsumption = Diagnostic.powerConsumption("data_day3.txt");
        System.out.println("The result of part I is: " + powerConsumption);

        int lifeSupportRating = Diagnostic.lifeSupportRating("data_day3.txt");
        System.out.println("The result of part II is: " + lifeSupportRating);

    }
}
