package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import FigurasGeometricas.Quadrado;

public class TestaQuadrado {
    
    public int testarAreaQuad (int b, int h) {
        return b * h;
    }
    int[] altLargRet = {6, 14};

    Quadrado quadTeste1 = new Quadrado(6);
    Quadrado quadTeste2 = new Quadrado(14);

    @Test 
    public void testarAltLargQuadrado1 () {
        assertEquals(altLargRet[0], quadTeste1.getLargAltQuadrado());
    }
    @Test
    public void testarAltLargQuadrado2 () {
        assertEquals(altLargRet[1], quadTeste2.getLargAltQuadrado());
    }

    @Test
    public void testarAreaQuadrado1 () {
        assertEquals(testarAreaQuad(altLargRet[0], altLargRet[0]), quadTeste1.areaQuad());
    }
    @Test
    public void testarAreaQuadrado2 () {
        assertEquals(testarAreaQuad(altLargRet[1], altLargRet[1]), quadTeste2.areaQuad());
    }
    
}
