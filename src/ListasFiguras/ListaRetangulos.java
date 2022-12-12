package ListasFiguras;

import java.util.ArrayList;
import FigurasGeometricas.Retangulo;

public class ListaRetangulos {

    private ArrayList<Retangulo> listaRetangulos;

    public ListaRetangulos () {     
        listaRetangulos = new ArrayList<>();
    }

    public void addNovoRetangulo (int alturaRet, int larguraRet) {
        listaRetangulos.add(new Retangulo(alturaRet, larguraRet));
    }

    public void addRetanguloExistente (Retangulo retangulo) {
        listaRetangulos.add(retangulo);
    }
    public void mostrarAreaRet () {

        for (int i = 0; i < listaRetangulos.size(); i++) {
            System.out.println("A área do Retângulo " + (i+1) + " é de " + listaRetangulos.get(i).areaRet());
        }
        System.out.println();
    }
    
}
