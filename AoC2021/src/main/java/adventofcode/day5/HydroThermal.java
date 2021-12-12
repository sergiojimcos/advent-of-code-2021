package main.java.adventofcode.day5;

import main.java.adventofcode.common.FileReaderClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HydroThermal {
    private int thermalBoard [][];
    private ArrayList <int[]> lineVentsCoordinates = new ArrayList<>();

    public HydroThermal (){
    }

    public void createThermalBoard (String path){
        int maxValue = 0;

        FileReaderClass fileReader = new FileReaderClass(path);
        List<String> lines = fileReader.readStrings();

        for (String line: lines){
            String [] lineSplit = line.split("[->, ]");

            int [] lineVents = new int[4];
            int index = 0;

            for(String number: lineSplit){
                if (!number.equals("")){
                    lineVents[index] = Integer.parseInt(number);
                    index++;
                }
            }

            this.lineVentsCoordinates.add(lineVents);

            if (maxValue < Integer.parseInt(lineSplit[0])){
                maxValue = Integer.parseInt(lineSplit[0]);
            }

        }

        fillThermalBoard(maxValue+1);
    }

    public void fillThermalBoard (int length){
        this.thermalBoard = new int[length][length];
        for (int i = 0; i < thermalBoard.length; i++) {
            for (int j = 0; j < thermalBoard[i].length; j++) {
                this.thermalBoard[i][j] = 0;
            }
        }
    }

    public void findOverlap (){
        for(int [] position: this.lineVentsCoordinates){
            if(position[0] == position[2]){
                if(position[1] < position[3]){
                    for (int i = position[1]; i <= position[3] ; i++) {
                        this.thermalBoard[position[2]][i] += 1;
                    }

                }else{
                    for (int i = position[1]; i >= position[3] ; i--) {
                        this.thermalBoard[position[2]][i] += 1;
                    }
                }

            }else if (position[1] == position[3]){
                if(position[0] < position[2]){
                    for (int i = position[0]; i <= position[2] ; i++) {
                        this.thermalBoard[i][position[3]] += 1;
                    }

                }else{
                    for (int i = position[0]; i >= position[2] ; i--) {
                        this.thermalBoard[i][position[3]] += 1;
                    }
                }

            }
        }
    }

    public int obtainLeap (){
        int counter = 0;
        for (int i = 0; i < this.thermalBoard.length; i++) {
            for (int j = 0; j < this.thermalBoard[i].length; j++) {
                if (this.thermalBoard[i][j] > 1){
                    counter++;
                }
            }
        }
        return counter;
    }

}


