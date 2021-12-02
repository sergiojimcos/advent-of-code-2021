package main.java.adventofcode.common;

import java.util.List;

public class SonarSweep {
    private SonarSweep(){
    }

    public static int measurementIncreases (String path){
        int counterIncrease = 0;

        FileReaderClass fileReader = new FileReaderClass(path);
        List<Integer> depthMeasures = fileReader.readFile();

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
}
