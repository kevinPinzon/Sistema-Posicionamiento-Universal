package BETA1;

import java.util.ArrayList;

public class Recorridos {
    private int distancia;
    private ArrayList<Planeta> recorrido;

    public Recorridos() {
    }
    public Recorridos(int distancia, ArrayList<Planeta> recorrido) {
        this.distancia = distancia;
        this.recorrido = recorrido;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public ArrayList<Planeta> getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(ArrayList<Planeta> recorrido) {
        this.recorrido = recorrido;
    }
    
     
}
