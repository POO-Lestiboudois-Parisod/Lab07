package test;

import Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();

        // Capture output stream for validation
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream, true, StandardCharsets.UTF_8));
    }

    /**
     * Simulates user input by providing it as an input stream.
     *
     * @param input the simulated user input
     */
    private void simulateInput(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
    }

    /**
     * Retrieves the captured output from the console.
     *
     * @return the captured console output
     */
    private String getConsoleOutput() {
        return outputStream.toString(StandardCharsets.UTF_8).trim();
    }

    @Test
    public void testAddition() {
        simulateInput("5\nEnt\n3\n+\nexit\n");
        calculator.run();

        String output = getConsoleOutput();
        assertTrue(output.contains("Result: 8"), "The output should display the result of 5 + 3 as 8");
    }

    @Test
    public void testSubtraction() {
        simulateInput("10\nEnt\n4\n-\nexit\n");
        calculator.run();

        String output = getConsoleOutput();
        assertTrue(output.contains("Result: 6"), "The output should display the result of 10 - 4 as 6");
    }

    @Test
    public void testMultiplication() {
        simulateInput("3\nEnt\n5\n*\nexit\n");
        calculator.run();

        String output = getConsoleOutput();