package main.java.adventofcode.day1;

import main.java.adventofcode.common.Submarine;

public class Day2 {
    public static void main(String[]args) {

        int distance = Submarine.Pilot("data_day2.txt");
        System.out.println("The result of single-measurement is: " + distance);

    }
}
