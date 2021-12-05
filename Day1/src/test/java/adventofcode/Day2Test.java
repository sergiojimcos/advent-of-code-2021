package test.java.adventofcode;

import main.java.adventofcode.common.Submarine;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day2Test {
    @Test
    @DisplayName("Test for Day 2 part I")
    public void testDay2PartI() {
        assertEquals(150, Submarine.Pilot("Day2_Example.txt"),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Test for Day 2 part II")
    public void testDay2PartII() {
        assertEquals(900, Submarine.PilotManual("Day2_Example.txt"),
                "Result is not the expected one");
    }
}
