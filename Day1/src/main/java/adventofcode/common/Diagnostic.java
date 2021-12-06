package main.java.adventofcode.common;

import java.util.ArrayList;
import java.util.List;

public class Diagnostic {
    private Diagnostic() {
    }

    public static int powerConsumption(String path) {
        FileReaderClass fileReader = new FileReaderClass(path);
        List<String> diagnostic = fileReader.readStrings();

        int LineLength = diagnostic.get(0).length();
        StringBuilder gammaRate = new StringBuilder();
        StringBuilder epsilonRate = new StringBuilder();

        for (int j = 0; j < LineLength; j++) {
            int count = 0;
            for (String currentLine : diagnostic) {
                if (currentLine.charAt(j) == '0') {
                    count = count + 1;
                } else {
                    count = count - 1;
                }
            }

            if (count > 0) {
                gammaRate.append('0');
                epsilonRate.append('1');
            } else {
                gammaRate.append('1');
                epsilonRate.append('0');
            }
        }

        int gamma = Integer.parseInt(String.valueOf(gammaRate), 2);
        int epsilon = Integer.parseInt(String.valueOf(epsilonRate), 2);
        return gamma * epsilon;
    }

    public static int lifeSupportRating(String path) {

        FileReaderClass fileReader = new FileReaderClass(path);
        List<String> diagnostic = fileReader.readStrings();

        ArrayList<String> inputListOxy = new ArrayList<>(diagnostic);
        int oxygen = generator(0, inputListOxy, true);

        ArrayList<String> inputListCo2 = new ArrayList<>(diagnostic);
        int co2 = generator(0, inputListCo2, false);

        return oxygen * co2;
    }

    private static int generator(int index, ArrayList<String> inputList, boolean useOne){
        if (inputList.size() == 1){
            return Integer.parseInt(inputList.get(0), 2);
        }

        int count = 0;
        for (String currentLine : inputList) {
                if (currentLine.charAt(index) == '0') {
                    count = count - 1;
                } else {
                    count = count + 1;
                }
        }

        char mainValue = '0';
        char secondValue = '1';
        if (!useOne){
            mainValue = '1';
            secondValue = '0';

        }

        char value = secondValue;
        if (count >= 0) {
            value = mainValue;
        }

        for (int i = inputList.size() - 1; i >= 0; i--) {
            if (inputList.get(i).charAt(index) != value){
                inputList.remove(i);
            }
        }
        return generator(index +1, inputList, useOne);
    }

}
