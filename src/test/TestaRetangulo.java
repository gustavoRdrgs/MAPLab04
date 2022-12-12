package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import FigurasGeometricas.Retangulo;

public class TestaRetangulo {

    public int testarAreaRet (int b, int h) {
        return b * h;
    }
    int[] alturaRet = {3, 6};
    int[] largRet = {4, 8};

    Retangulo retTeste1 = new Retangulo(3, 4);
    Retangulo retTeste2 = new Retangulo(6, 8);

    @Test 
    public void testarAlturaRetangulo1 () {
        assertEquals(alturaRet[0], retTeste1.getAlturaRetangulo());
    }
    @Test
    public void testarAlturaRetangulo2 () {
        assertEquals(alturaRet[1], retTeste2.getAlturaRetangulo());
    }
    
    @Test
    public void testarLarguraRetangulo1 () {
        assertEquals(largRet[0], retTeste1.getLarguraRetangulo());
    }
    @Test
    public void testarLarguraRetangulo2 () {
        assertEquals(largRet[1], retTeste2.getLarguraRetangulo());
    }

    @Test
    public void testarAreaRetangulo1 () {
        assertEquals(testarAreaRet(alturaRet[0], largRet[0]), retTeste1.areaRet());
    }
    @Test
    public void testarAreaRetangulo2 () {
        assertEquals(testarAreaRet(alturaRet[1], largRet[1]), retTeste2.areaRet());
    }
}
