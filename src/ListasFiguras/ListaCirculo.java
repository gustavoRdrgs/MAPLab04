package ListasFiguras;

import java.util.ArrayList;
import FigurasGeometricas.Circulo;

public class ListaCirculo {
    
    private ArrayList<Circulo> listaCirculos;

    public ListaCirculo () {
        listaCirculos = new ArrayList<>();
    }

    public void addNovoCirculo (int areaCirc) {
        listaCirculos.add(new Circulo(areaCirc));
    }

    public void addCirculoExistente (Circulo circulo) {
        listaCirculos.add(circulo);
    }

    public void mostrarAreaQuad () {

        for (int i = 0; i < listaCirculos.size(); i++) {
            System.out.println("A área do Círculo " + (i+1) + " é de " + listaCirculos.get(i).areaCirc());
        }
        System.out.println();
    }
}
