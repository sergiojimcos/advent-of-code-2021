package main.java.adventofcode.day1;

import main.java.adventofcode.common.Submarine;

public class Day2 {
    public static void main(String[]args) {

        int distance_partI = Submarine.Pilot("data_day2.txt");
        System.out.println("The result of part I is: " + distance_partI);

        int distance_partII = Submarine.PilotManual("data_day2.txt");
        System.out.println("The result of part II is: " + distance_partII);
    }
}
