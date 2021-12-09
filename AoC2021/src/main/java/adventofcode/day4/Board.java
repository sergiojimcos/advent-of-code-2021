package main.java.adventofcode.day4;

import java.util.List;

public class Board {
    private int [][] matrix = new int[5][5];
    private int[] columns = new int[]{0, 0, 0, 0, 0};
    private int[] row = new int[]{0, 0, 0, 0, 0};
    private int total_count = 0;

    public Board(List<String> lines) {
        for (int i = 0; i < lines.size(); i++){
            String[] numbers = lines.get(i).trim().replaceAll(" {2}", " ").split(" ");
            for (int j = 0; j < numbers.length; j++){
                int number = Integer.parseInt(numbers[j]);
                this.matrix[i][j] = Integer.parseInt(numbers[j]);
                this.total_count += number;
            }
        }
    }

    public int checkNumber(int number){
        int result = 0;
        this.updateBoard(number);
        if (isBingo()){
            result = this.total_count;
        }
        return result;
    }

    private boolean isBingo(){
        for (int i = 0; this.columns.length > i; i++)
        {
            if ((this.columns[i] == 5) || (this.row[i] == 5)){
                return true;
            }
        }
        return false;
    }

    private void updateBoard(int number){
        for (int row = 0; this.matrix.length > row; row++)
        {
            for (int col = 0; this.matrix[row].length > col; col++)
            {
                int value = this.matrix[row][col];
                if (number == value){
                    this.columns[col] += 1;
                    this.row[row] += 1;
                    this.total_count -= value;
                }
            }
        }
    }
}
