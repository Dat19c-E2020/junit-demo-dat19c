package dk.kea.dat19c.junitdemodat19c.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c;

    @BeforeEach
    void setUp() {
        c = new Calculator();
    }

    @Test
    void add() {

        assertEquals(42, c.add(17, 25));

    }

    @Test
    void addError(){

        assertEquals(5, c.add(2, 2));
    }

}