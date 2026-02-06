package com.example.tiempo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiempoTest {

    private Tiempo tiempo1;
    private Tiempo tiempo2;

    @BeforeEach
    void setUp() throws Exception {
        tiempo1 = new Tiempo(1, 20, 30);
        tiempo2 = new Tiempo(2, 40, 50);
    }

    // ---------- CONSTRUCTOR ----------
    @Test
    void testTiempo() {
        // Tiempo 1
        assertEquals(1, tiempo1.getHoras());
        assertEquals(20, tiempo1.getMinutos());
        assertEquals(30, tiempo1.getSegundos());
        // Tiempo 2 
        assertEquals(2, tiempo2.getHoras());
        assertEquals(40, tiempo2.getMinutos());
        assertEquals(50, tiempo2.getSegundos());
    }

    @Test
    void testTiempoNegativo() {
        Assertions.assertThrows(CantidadNegativaException.class, () -> {
            new Tiempo(-1, -2, -5);
        });
    }

    @Test
    void testSetters(){
        Assertions.assertThrows(CantidadNegativaException.class, () -> {
            tiempo1.setHoras(-2);
            tiempo1.setMinutos(-10);
            tiempo1.setSegundos(-25);
        });
    }
    // ---------- NORMALIZACIÓN ----------
    @Test
    void testNormaliza() throws CantidadNegativaException{
        Tiempo tiempo = new Tiempo(25, 61, 61);
        assertEquals(1, tiempo.getDias());
        assertEquals(2,tiempo.getHoras());
        assertEquals(2, tiempo.getMinutos());
        assertEquals(1, tiempo.getSegundos());
    }

    // ---------- SUMA CON OBJETO ----------
    @Test
    public void sumaCorrectaDeTiempos() throws CantidadNegativaException {
        Tiempo resultado = tiempo1.suma(tiempo2);

        assertNotNull(resultado);
        assertEquals(0, resultado.getDias());
        assertEquals(4, resultado.getHoras());
        assertEquals(1, resultado.getMinutos());
        assertEquals(20, resultado.getSegundos());
    }

    @Test
    public void sumaConNullDevuelveNull() throws CantidadNegativaException {
        Tiempo resultado = tiempo1.suma(null);
        assertNull(resultado);
    }

    // ---------- SUMA CON ENTEROS ----------
    @Test
    public void sumaConEnterosNormaliza() throws CantidadNegativaException {
        tiempo1.suma(25, 120, 120);

        assertEquals(1, tiempo1.getDias());
        assertEquals(4, tiempo1.getHoras());
        assertEquals(22, tiempo1.getMinutos());
        assertEquals(30, tiempo1.getSegundos());
    }

    @Test
    public void sumaConEnterosNegativosLanzaExcepcion() throws CantidadNegativaException {
        tiempo1.suma(-1, 0, 0);
    }
}
