import FigurasGeometricas.*;
import ListasFiguras.ListaCirculo;
import ListasFiguras.ListaQuadrados;
import ListasFiguras.ListaRetangulos;

public class App {
    public static void main(String[] args) throws Exception {
        

        Circulo circulo1 = GerenciaFiguras.criaCirculo(12);
        Circulo circulo2 = GerenciaFiguras.criaCirculo(9);

        ListaCirculo listaDeCirculos = new ListaCirculo();

        listaDeCirculos.addNovoCirculo(8);
        listaDeCirculos.addNovoCirculo(6);
        listaDeCirculos.addCirculoExistente(circulo1);
        listaDeCirculos.addCirculoExistente(circulo2);

        listaDeCirculos.mostrarAreaQuad();

        Quadrado quadrado1 = GerenciaFiguras.criaQuadrado(8);
        Quadrado quadrado2 = GerenciaFiguras.criaQuadrado(12);

        ListaQuadrados listaDeQuadrados = new ListaQuadrados();

        listaDeQuadrados.addNovoQuadrado(6);
        listaDeQuadrados.addNovoQuadrado(14);
        listaDeQuadrados.addQuadradoExistente(quadrado1);
        listaDeQuadrados.addQuadradoExistente(quadrado2);

        listaDeQuadrados.mostrarAreaQuad();

        Retangulo retangulo1 = GerenciaFiguras.criaRetangulo(3, 4);
        Retangulo retangulo2 = GerenciaFiguras.criaRetangulo(6, 8);
        
        ListaRetangulos listaDeRetangulos = new ListaRetangulos();

        listaDeRetangulos.addNovoRetangulo(6, 8);
        listaDeRetangulos.addNovoRetangulo(7, 9);
        listaDeRetangulos.addRetanguloExistente(retangulo1);
        listaDeRetangulos.addRetanguloExistente(retangulo2);

        listaDeRetangulos.mostrarAreaRet();

    }
}
