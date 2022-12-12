package FigurasGeometricas;

public class Retangulo {
    
    private int alturaRetangulo;
    private int larguraRetangulo;

    public Retangulo(int alturaRetangulo, int larguraRetangulo) {
        this.alturaRetangulo = alturaRetangulo;
        this.larguraRetangulo = larguraRetangulo;
    }

    public int getAlturaRetangulo() {
        return alturaRetangulo;
    }

    public void setAlturaRetangulo(int alturaRetangulo) {
        this.alturaRetangulo = alturaRetangulo;
    }

    public int getLarguraRetangulo() {
        return larguraRetangulo;
    }

    public void setLarguraRetangulo(int larguraRetangulo) {
        this.larguraRetangulo = larguraRetangulo;
    }

    public int areaRet () {

        return (alturaRetangulo * larguraRetangulo);
    }

}
