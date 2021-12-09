package main.java.adventofcode.day4;

import main.java.adventofcode.common.FileReaderClass;

import java.util.ArrayList;
import java.util.List;

public class Bingo {
    private Bingo() {
    }

    public static int play(String path){
        FileReaderClass fileReader = new FileReaderClass(path);
        List<String> lines = fileReader.readStrings();
        List<Board> boards = new ArrayList<>();
        for (int counter = 2; counter < lines.size(); counter = counter + 6) {
            ArrayList<String> boarLines = new ArrayList<>(lines.subList(counter, counter + 5));
            Board newBoard = new Board(boarLines);
            boards.add(newBoard);
        }
        String[] numbers = lines.get(0).trim().replaceAll(" {2}", " ").split(",");
        for (String number : numbers){
            for (Board board : boards){
                int numberInt = Integer.parseInt(number);
                int boardResult = board.checkNumber(numberInt);
                if (boardResult != 0){
                    return boardResult * numberInt;
                }
            }
        }

        return 0;
    }
}
