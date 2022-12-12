package ListasFiguras;

import java.util.ArrayList;
import FigurasGeometricas.Quadrado;

public class ListaQuadrados {

    private ArrayList<Quadrado> listaQuadrados;

    public ListaQuadrados() {
        listaQuadrados = new ArrayList<>();
    }

    public void addNovoQuadrado(int larguraQuad) {
        listaQuadrados.add(new Quadrado(larguraQuad));
    }

    public void addQuadradoExistente(Quadrado quadrado) {
        listaQuadrados.add(quadrado);
    }

    public void mostrarAreaQuad () {

        for (int i = 0; i < listaQuadrados.size(); i++) {
            System.out.println("A área do Quadrado " + (i+1) + " é de " + listaQuadrados.get(i).areaQuad());
        }
        System.out.println();
    }
    
}
