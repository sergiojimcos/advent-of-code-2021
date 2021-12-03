package main.java.adventofcode.common;

import java.util.List;

public class Submarine {
    private Submarine() {
    }

    public static int Pilot(String path) {
        int horizontalMovement = 0;
        int depth = 0;

        FileReaderClass fileReader = new FileReaderClass(path);
        List<String> depthMeasures = fileReader.readStrings();

        for (String depthMeasure : depthMeasures) {

            String[] splitLine = depthMeasure.split(" ");
            String instruction = splitLine[0];
            int distance = Integer.parseInt(splitLine[1]);
            switch (instruction) {
                case "forward":
                    horizontalMovement += distance;
                    break;
                case "down":
                    depth += distance;
                    break;
                case "up":
                    depth -= distance;
                    break;
                default:
                    System.out.println("no match line");
                    break;
            }
        }

        return horizontalMovement * depth;
    }
}
