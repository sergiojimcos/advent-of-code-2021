package main.java.adventofcode.day1;

import main.java.adventofcode.common.SonarSweep;

public class Day1 {
    public static void main(String[]args) {

        int singleMeasurement = SonarSweep.measurementIncreases("data_day1.txt");
        int threeMeasurement = SonarSweep.threeMeasurementSlidingWindowIncreases("data_day1.txt");
        System.out.println("The result of single-measurement is: " + singleMeasurement);
        System.out.println("The result of three-measurement sliding window is: " + threeMeasurement);

    }
}
