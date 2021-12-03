package main.java.adventofcode.common;

import java.util.List;

public class SonarSweep {
    private SonarSweep(){
    }

    public static int measurementIncreases (String path){
        int counterIncrease = 0;

        FileReaderClass fileReader = new FileReaderClass(path);
        List<Integer> depthMeasures = fileReader.readIntegers();

        if (depthMeasures.size() > 1){
            for (int i = 0; i < depthMeasures.size(); i++){

                if (depthMeasures.get(i) < depthMeasures.get(i +1)){

                    counterIncrease++;
                }

                if (i == depthMeasures.size() - 2) {

                    break;
                }
            }
        }

        return counterIncrease;
    }

    public static int threeMeasurementSlidingWindowIncreases (String path){
        int counterIncrease = 0;

        FileReaderClass fileReader = new FileReaderClass(path);
        List<Integer> depthMeasures = fileReader.readIntegers();

        if (depthMeasures.size() > 3){
            for (int i = 3; i < depthMeasures.size(); i++){

                int windowA = depthMeasures.get(i-1) + depthMeasures.get(i-2) + depthMeasures.get(i-3);
                int windowB = depthMeasures.get(i) + depthMeasures.get(i-1) + depthMeasures.get(i-2);

                if (windowA < windowB){
                    counterIncrease++;
                }
            }
        }

        return counterIncrease;
    }
}
