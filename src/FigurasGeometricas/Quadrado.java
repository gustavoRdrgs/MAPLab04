package FigurasGeometricas;

public class Quadrado {
    
    private int larguraAlturaQuadrado;

    public Quadrado(int largAltQuadrado) {
        this.larguraAlturaQuadrado = largAltQuadrado;
    }

    public int getLargAltQuadrado() {
        return larguraAlturaQuadrado;
    }

    public void setLaguraQuadrado(int largAltQuadrado) {
        this.larguraAlturaQuadrado = largAltQuadrado;
    }

    public int areaQuad () {

        return (larguraAlturaQuadrado * larguraAlturaQuadrado);
    }
}
