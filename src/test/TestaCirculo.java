package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import FigurasGeometricas.Circulo;

public class TestaCirculo {

    int[] areaCirc = {12, 9};
    
    Circulo circTeste1 = new Circulo(12);
    Circulo circTeste2 = new Circulo(9);

    @Test
    public void testarAreaCirculo1 () {
        assertEquals(areaCirc[0], circTeste1.getAreaCirculo());
    }
    @Test
    public void testarAreaCirculo2 () {
        assertEquals(areaCirc[1], circTeste2.getAreaCirculo());
    }
}
