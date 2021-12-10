package test.java.adventofcode;

import main.java.adventofcode.day4.Bingo;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day4Test {

    @Test
    @DisplayName("Test Part I")
    public void testPartI() {
        assertEquals(4512, Bingo.findWinner("Day4_Example.txt"),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Test Part II")
    public void testPartII() {
        assertEquals(1924, Bingo.findLoser("Day4_Example.txt"),
                "Result is not the expected one");
    }
}
