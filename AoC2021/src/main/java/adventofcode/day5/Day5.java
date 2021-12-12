package main.java.adventofcode.day5;

public class Day5 {
    public static void main(String[]args){
        HydroThermal hydroThermal = new HydroThermal();
        hydroThermal.createThermalBoard("data_day5.txt");
        hydroThermal.findOverlap();
        int solution = hydroThermal.obtainLeap();

        System.out.println("The number of the points that has at least two lines is: "+ solution);


    }
}
