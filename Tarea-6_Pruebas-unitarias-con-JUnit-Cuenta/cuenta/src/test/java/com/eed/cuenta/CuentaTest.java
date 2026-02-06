package com.eed.cuenta;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

public class CuentaTest {

    private Cuenta cuenta100;
    private Cuenta cuenta200;

    @Before
    public void setUp() throws Exception {
        cuenta100 = new Cuenta(100);
        cuenta200 = new Cuenta(200);
    }

    // ---------- CONSTRUCTOR ----------

    @Test
    public void crearCuentaConSaldoInicial() {
        assertEquals(100, cuenta100.getSaldo());
        assertEquals(200, cuenta200.getSaldo());
    }

    // ---------- INGRESO ----------

    @Test
    public void ingresoCorrecto() throws CantidadNegativaException {
        cuenta100.ingreso(50);
        assertEquals(150, cuenta100.getSaldo());
    }

    @Test(expected = CantidadNegativaException.class)
    public void ingresoCantidadNegativaLanzaExcepcion() throws CantidadNegativaException {
        cuenta200.ingreso(-300);
    }

    // ---------- REINTEGRO ----------

    @Test
    public void reintegroCorrecto() throws ReintegroException {
        cuenta200.reintegro(50);
        assertEquals(150, cuenta200.getSaldo());
    }

    @Test(expected = ReintegroException.class)
    public void reintegroSinSaldoSuficienteLanzaExcepcion() throws ReintegroException {
        cuenta100.reintegro(200);
    }

    // ---------- TRANSFERENCIA ----------

    @Test
    public void transferenciaCorrecta() throws TransferenciaException {
        cuenta200.transferencia(100, cuenta100);

        assertEquals(200, cuenta100.getSaldo());
        assertEquals(100, cuenta200.getSaldo());
    }

    @Test(expected = TransferenciaException.class)
    public void transferenciaSinSaldoSuficienteLanzaExcepcion() throws TransferenciaException {
        cuenta100.transferencia(200, cuenta200);
    }

    // ---------- EJEMPLO USANDO fail() ----------

    @Test
    public void ingresoNegativoConFail() {
        try {
            cuenta200.ingreso(-50);
            fail("Aquí NO debería llegar");
        } catch (CantidadNegativaException e) {
            assertTrue(true);
        }
    }
}
