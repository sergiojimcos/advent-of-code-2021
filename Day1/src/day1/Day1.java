package day1;

import java.io.IOException;
import java.util.List;

public class Day1 {
    public static void main(String[]args) throws IOException {

        int counterIncrease = 0;

        FileReaderClass fileReader = new FileReaderClass();
        List<Integer> depthMeasures = fileReader.readFile();

        for (int i = 0; i < depthMeasures.size(); i++){

            if (depthMeasures.get(i) < depthMeasures.get(i +1)){

                counterIncrease++;
            }

            if (i == depthMeasures.size() - 2) {

                break;
            }
        }

        System.out.println("The final result of PROBLEM 1 is: " + counterIncrease);
    }
}
