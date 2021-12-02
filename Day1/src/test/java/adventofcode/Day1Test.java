package test.java.adventofcode;

import main.java.adventofcode.common.SonarSweep;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Test {
    @Test
    @DisplayName("Only one element should return 0")
    public void testWithOneElement() {
        assertEquals(0, SonarSweep.measurementIncreases("testWithOneElement.txt"),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Two elements with increase should return 1")
    public void testTwoElementsWithIncrease() {
        assertEquals(1, SonarSweep.measurementIncreases("testWithTwoElementsWithIncrease.txt"),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Two elements with increase should return 0")
    public void testTwoElementsWithOutIncrease() {
        assertEquals(0, SonarSweep.measurementIncreases("testWithTwoElementsWithOutIncrease.txt"),
                "Result is not the expected one");
    }

    @Test
    @DisplayName("Ten elements with 7 increases should return 7")
    public void testWithSevenIncreases() {
        assertEquals(7, SonarSweep.measurementIncreases("testWithSevenIncreases.txt"),
                "Result is not the expected one");
    }

}
