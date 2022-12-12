package FigurasGeometricas;

public class GerenciaFiguras {

    public static Quadrado criaQuadrado(int larguraQuad) {

        return new Quadrado(larguraQuad);
    }

    public static Retangulo criaRetangulo(int alturaRet, int larguraRet) {

        return new Retangulo(alturaRet, larguraRet);
    }

    public static Circulo criaCirculo(int areaCirc) {

        return new Circulo(areaCirc);
    }
    
}
