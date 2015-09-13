
package BETA1;

import java.util.ArrayList;

public class Planeta {

    private double distanciaOptima;
    private ArrayList<Aristas> aristas;
    private String etiqueta;
    private int x;
    private int y;
    
    
    public Planeta() {
        this.distanciaOptima=0;
        this.etiqueta=null;
        this.aristas = new ArrayList<Aristas>();
    }

    public Planeta(String etiqueta, int x, int y) {
        this.aristas = new ArrayList<Aristas>();
        this.etiqueta = etiqueta;
        this.x = x;
        this.y = y;
    }
    
    
    public ArrayList<Aristas> getAristas() {
        return aristas;
    }

    public void setAristas(ArrayList<Aristas> aristas) {
        this.aristas = aristas;
    }
    
    public String getEtiqueta() {
        return etiqueta;
    }

    @Override
    public String toString() {
        return "Planeta: "+ etiqueta;
    }

    public double getDistanciaOptima() {
        return distanciaOptima;
    }

    public void setDistanciaOptima(double distanciaOptima) {
        this.distanciaOptima = distanciaOptima;
    }

    public String insertarAdya(Planeta a,String d){
        String temp="No se ha insertado el planeta, debido a que ya existe conexion del planeta"+a.getEtiqueta()+" "+this.etiqueta;
        boolean insert=true;
        if (this.etiqueta.equals(a.etiqueta)) {
            insert=false;
        }
        if (!aristas.isEmpty()) {
            for (int i = 0; i <this.aristas.size(); i++) {
                if (this.aristas.get(i).getAdyacente().getEtiqueta().equals(a.getEtiqueta()))
                    insert=false;
            }
            if (insert) {
                this.aristas.add(new Aristas(d,a));
                temp="Se ha insertado correctamente el planeta "+a.getEtiqueta()+" con distancia "+d+" a el planeta "+this.etiqueta;
            }
        }else if(aristas.isEmpty() && insert==true) {
            this.aristas.add(new Aristas(d,a));
            temp="Se ha insertado correctamente el planeta "+a.getEtiqueta()+" con distancia "+d+" a el planeta "+this.etiqueta;
        }
        return temp;
    }
    
    public void setDist(Planeta b,String d) {
        for (int i = 0; i < aristas.size(); i++) {
            String temp =aristas.get(i).getAdyacente().getEtiqueta();
            if (temp.equals(b.getEtiqueta())) 
                this.aristas.get(i).setDistancia(d);
            }
    }   
    
    public String getDist(Planeta a){
        String temp2="-1";
        for (int i = 0; i <aristas.size(); i++) {
            String temp=aristas.get(i).getAdyacente().getEtiqueta();
            if (temp.equalsIgnoreCase(a.getEtiqueta())){
                temp2=aristas.get(i).getDistancia();
            }
        }
        return temp2;
    }
    
    public boolean eliminarAdyacente(Planeta a){
        boolean elim=false;
        for (int i = 0; i < aristas.size(); i++) {
            String temp =aristas.get(i).getAdyacente().getEtiqueta();
            if (temp.equals(a.getEtiqueta())) {
                aristas.remove(i);
                elim=true;
            }
        }
        return elim;
    }
    
    public int buscarPlanetaAdya(Planeta a){
        int cont=0;
        for (int i = 0; i < aristas.size(); i++) {
            String temp =aristas.get(i).getAdyacente().getEtiqueta();
            if (temp.equals(a.getEtiqueta())) 
                cont=i;
        }
        return cont;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
}
