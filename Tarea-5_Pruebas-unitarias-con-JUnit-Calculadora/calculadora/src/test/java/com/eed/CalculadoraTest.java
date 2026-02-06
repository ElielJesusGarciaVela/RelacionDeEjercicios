package com.eed;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        int resultado = Calculadora.sumar(5, 3);
        assertEquals(8, resultado);
    }

    @Test
    public void testRestar() {
        int resultado = Calculadora.restar(10, 4);
        assertEquals(6, resultado);
    }

    @Test
    public void testMultiplicar() {
        int resultado = Calculadora.multiplicar(6, 7);
        assertEquals(42, resultado);
    }

    @Test
    public void testDividir() {
        int resultado = Calculadora.dividir(20, 4);
        assertEquals(5, resultado);
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirPorCero() {
        Calculadora.dividir(10, 0);
    }
}