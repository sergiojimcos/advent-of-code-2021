package main.java.adventofcode.day1;

import main.java.adventofcode.common.SonarSweep;

import java.io.IOException;

public class Day1 {
    public static void main(String[]args) {

        int sinlgeMeasurement = SonarSweep.measurementIncreases("data.txt");
        int threeMeasurement = SonarSweep.threeMeasurementSlidingWindowIncreases("data.txt");
        System.out.println("The result of single-measurement is: " + sinlgeMeasurement);
        System.out.println("The result of three-measurement sliding window is: " + threeMeasurement);

    }
}
