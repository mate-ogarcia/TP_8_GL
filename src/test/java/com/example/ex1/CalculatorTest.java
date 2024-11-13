package com.example.ex1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        assertEquals(5.0, Calculator.add(2.0, 3.0), "Addition de 2.0 et 3.0 devrait être 5.0");
        assertEquals(0.0, Calculator.add(-1.0, 1.0), "Addition de -1.0 et 1.0 devrait être 0.0");
        assertEquals(-3.0, Calculator.add(-1.0, -2.0), "Addition de -1.0 et -2.0 devrait être -3.0");
    }

    @Test
    void testSubtract() {
        assertEquals(1.0, Calculator.subtract(3.0, 2.0), "Soustraction de 3.0 et 2.0 devrait être 1.0");
        assertEquals(-2.0, Calculator.subtract(-1.0, 1.0), "Soustraction de -1.0 et 1.0 devrait être -2.0");
        assertEquals(1.0, Calculator.subtract(-1.0, -2.0), "Soustraction de -1.0 et -2.0 devrait être 1.0");
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, Calculator.multiply(2.0, 3.0), "Multiplication de 2.0 et 3.0 devrait être 6.0");
        assertEquals(-1.0, Calculator.multiply(-1.0, 1.0), "Multiplication de -1.0 et 1.0 devrait être -1.0");
        assertEquals(2.0, Calculator.multiply(-1.0, -2.0), "Multiplication de -1.0 et -2.0 devrait être 2.0");
        assertEquals(0.0, Calculator.multiply(0.0, 5.0), "Multiplication de 0.0 et 5.0 devrait être 0.0");
    }

    @Test
    void testDivide() {
        assertEquals(2.0, Calculator.divide(6.0, 3.0), "Division de 6.0 par 3.0 devrait être 2.0");
        assertEquals(-2.0, Calculator.divide(-6.0, 3.0), "Division de -6.0 par 3.0 devrait être -2.0");
        assertEquals(0.0, Calculator.divide(0.0, 5.0), "Division de 0.0 par 5.0 devrait être 0.0");

        // Test de division par zéro
        assertEquals(0.0, Calculator.divide(5.0, 0.0), "Division par zéro devrait renvoyer 0.0");
    }
}
