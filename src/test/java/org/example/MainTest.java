package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void printSomethingShouldReturnHelloWorld() {
        // Arrange
        Main main = new Main();
        String expected = "Hello World";

        // Act
        String actual = main.printSomething();

        // Assert
        assertEquals(expected, actual, "The printSomething method should return 'Hello World'");
    }
}