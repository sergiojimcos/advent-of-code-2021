package main.java.adventofcode.day4;

import main.java.adventofcode.common.FileReaderClass;

import java.util.ArrayList;
import java.util.List;

public class Bingo {
    private Bingo() {
    }

    public static int findWinner(String path){
        FileReaderClass fileReader = new FileReaderClass(path);
        List<String> lines = fileReader.readStrings();
        List<Board> boards = readBoards(lines);

        String[] numbers = lines.get(0).trim().replaceAll(" {2}", " ").split(",");
        for (String number : numbers){
            int numberInt = Integer.parseInt(number);
            for (Board board : boards){
                int boardResult = board.checkNumber(numberInt);
                if (boardResult != 0){
                    return boardResult * numberInt;
                }
            }
        }

        return 0;
    }

    public static int findLoser(String path){
        FileReaderClass fileReader = new FileReaderClass(path);
        List<String> lines = fileReader.readStrings();
        List<Board> boards = readBoards(lines);

        String[] numbers = lines.get(0).trim().replaceAll(" {2}", " ").split(",");
        for (String number : numbers){
            int numberInt = Integer.parseInt(number);
            int boardResult = 0;
            ArrayList<Integer> boardToRemove = new ArrayList<>();
            for (int i = 0; i < boards.size(); i++){
                Board board = boards.get(i);
                int localBoardResult = board.checkNumber(numberInt);
                if (localBoardResult != 0){
                    boardToRemove.add(i);
                    boardResult = localBoardResult;
                }
            }
            if (boardResult != 0){
                for (int i = boardToRemove.size()-1; i >= 0; i--){
                    boards.remove(boardToRemove.get(i).intValue());
                }
            }
            if (boards.size() == 0){
                return boardResult * numberInt;
            }
        }

        return 0;
    }

    private static List<Board> readBoards(List<String> lines){
        List<Board> boards = new ArrayList<>();
        for (int counter = 2; counter < lines.size(); counter = counter + 6) {
            ArrayList<String> boarLines = new ArrayList<>(lines.subList(counter, counter + 5));
            Board newBoard = new Board(boarLines);
            boards.add(newBoard);
        }
        return boards;
    }
}
