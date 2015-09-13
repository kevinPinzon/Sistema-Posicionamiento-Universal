
package BETA1;

public class Aristas {
    
    private String distancia;
    private Planeta adyacente;

    public Aristas() {
    }

    public Aristas(String distancia, Planeta adyacente) {
        this.distancia = distancia;
        this.adyacente = adyacente;
    }

    public Planeta getAdyacente() {
        return adyacente;
    }

    public void setAdyacente(Planeta adyacente) {
        this.adyacente = adyacente;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }
    
}
