/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BETA1;

import java.awt.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author kevinPinzon
 */
public class Dijkstra {
    ArrayList<Planeta> rutaMasCorta;
    int longitudMasCorta;
    ArrayList<Planeta> galaxia;
    ArrayList<Planeta> listos = null;

    public Dijkstra(ArrayList<Planeta> galaxia) {
        this.galaxia = galaxia;
        //  for (int i = 0; i < galaxia.size(); i++) {
        //    etiqueta[i] = galaxia.get(i).getEtiqueta();
        //  distancia[i] = galaxia.get(i).getDistanciaOptima();
        // }
    }

    public void agregarRuta(Planeta a) {
        int dist = 0;
        for (int i = 0; i < galaxia.size(); i++) {
            if (a.getEtiqueta().equals(galaxia.get(i).getEtiqueta())) {
            }
        }
        for (int i = 0; i < a.getAristas().size(); i++) {
            dist = Integer.parseInt(a.getAristas().get(i).getDistancia());
        }

    }

    // retorna la posición en el arreglo de un nodo específico

    public int posicionNodo(String vertice) {
        for (int i = 0; i < galaxia.size(); i++) {
            if (galaxia.get(i).getEtiqueta().equals(vertice)) {
                return i;
            }
        }
        return -1;
    }

    // encuentra la ruta más corta desde un nodo origen a un nodo destino
    public String encontrarRutaMinima(Planeta inicio, Planeta fin) {
        // calcula la ruta más corta del inicio a los demás
        boolean existeConexion = false;
        Planeta tmp=null;
        encontrarRutaMinima(inicio);
        // recupera el nodo final de la lista de terminados
        for (int i = 0; i < inicio.getAristas().size(); i++) {
            if (inicio.getAristas().get(i).getAdyacente().equals(fin)) {
                existeConexion = true;
                tmp=inicio.getAristas().get(i).getAdyacente();
            }
        }
        if (!existeConexion) {
            System.out.println("Error, planeta no alcanzable");
        }
        
        tmp = listos.get(listos.size()-1);
        int distancia = tmp.getDistanciaOptima();  
        // crea una pila para almacenar la ruta desde el nodo final al origen
        Stack<Planeta> pila = new Stack<Planeta>();
        //while(tmp != null) {
        //    pila.add(tmp);
         //   tmp = pila.peek();
       // }
        String ruta = "";
        // recorre la pila para armar la ruta en el orden correcto
        while(!pila.isEmpty())
            ruta+=(pila.pop().getEtiqueta() + " ");
        return distancia + ": " + ruta;
    }

    // encuentra la ruta más corta desde el nodo inicial a todos los demás
    public void encontrarRutaMinima(Planeta inicio) {
        boolean existe = false;
        Queue<Planeta> cola = new PriorityQueue<Planeta>(); // cola de prioridad
        Planeta ni = inicio;          // nodo inicial

        listos = new ArrayList<Planeta>();// lista de nodos ya revisados
        cola.add(ni);                   // Agregar nodo inicial a la cola de prioridad
        while (!cola.isEmpty()) {        // mientras que la cola no esta vacia
            Planeta tmp = cola.poll();     // saca el primer elemento
            listos.add(tmp);            // lo manda a la lista de terminados
            int p = posicionNodo(tmp.getEtiqueta());
            for (int j = 0; j < galaxia.get(p).getAristas().size(); j++) {  // revisa los nodos hijos del nodo tmp
                if (galaxia.get(p).getAristas().isEmpty()) {
                    continue;        // si no hay conexión no lo evalua
                }
                if (estaTerminado(galaxia.get(p).getAristas().get(j).getAdyacente())) {
                    continue;      // si ya fue agregado a la lista de terminados
                }

                // si no está en la cola de prioridad, lo agrega
                Queue<Planeta> tempCola = cola;
                Planeta nod = null;
                for (int i = 0; i < tempCola.size(); i++) {
                    if (tempCola.poll().getEtiqueta().equals(galaxia.get(p).getAristas().get(j).getAdyacente().getEtiqueta())) {
                        cola.add(galaxia.get(p).getAristas().get(j).getAdyacente());
                        // si no está en la cola de prioridad, lo agrega
                        nod = galaxia.get(p).getAristas().get(j).getAdyacente();
                        continue;
                    }
                }

                // si ya está en la cola de prioridad actualiza la distancia menor
                for (Planeta x : cola) {
                    // si la distancia en la cola es mayor que la distancia calculada
                    if (x.getEtiqueta() == nod.getEtiqueta() && x.getDistanciaOptima() > nod.getDistanciaOptima()) {
                        cola.remove(x); // remueve el nodo de la cola
                        cola.add(nod);  // agrega el nodo con la nueva distancia
                        break;          // no sigue revisando
                    }
                }
            }
        }
    }

    public boolean estaTerminado(Planeta j) {
        boolean existe = false;
        for (int i = 0; i < listos.size(); i++) {
            if (j.getEtiqueta().equals(listos.get(i).getEtiqueta())) {
                existe = true;
            }
        }
        return existe;
    }

    // encontrar la ruta mínima por fuerza bruta
    public void encontrarRutaMinimaFuerzaBruta(String inicio, String fin) {
        int p1 = posicionNodo(inicio);
        int p2 = posicionNodo(fin);
        // cola para almacenar cada ruta que está siendo evaluada
        Stack<Planeta> resultado = new Stack<Planeta>();
        resultado.push(galaxia.get(p1));
        recorrerRutas(p1, p2, resultado);
    }

    // recorre recursivamente las rutas entre un nodo inicial y un nodo final
    // almacenando en una cola cada nodo visitado
    public void recorrerRutas(int nodoI, int nodoF, Stack<Planeta> resultado) {
        // si el nodo inicial es igual al final se evalúa la ruta en revisión
        boolean existe = false;
        if (nodoI == nodoF) {
            int respuesta = evaluar(resultado);
            if (respuesta < longitudMasCorta) {
                longitudMasCorta = respuesta;
                for (int i = 0; i < resultado.size(); i++) {
                    rutaMasCorta.add(resultado.get(i));
                }
            }
            return;
        }
        // Si el nodoInicial no es igual al final se crea una lista con todos los nodos
        // adyacentes al nodo inicial que no estén en la ruta en evaluación
        ArrayList<Planeta> listaN = new ArrayList<Planeta>();
        for (int i = 0; i < galaxia.get(nodoI).getAristas().size(); i++) {
            for (int j = 0; j < resultado.size(); j++) {
                resultado.get(i).getEtiqueta().equals(galaxia.get(nodoI).getAristas().get(i).getAdyacente().getEtiqueta());
                existe = true;
            }

            if (!galaxia.get(nodoI).getAristas().isEmpty() && !existe) {
                listaN.add(galaxia.get(nodoI).getAristas().get(i).getAdyacente());
            }
        }
        // se recorren todas las rutas formadas con los nodos adyacentes al inicial
        for (int i = 0; i < listaN.size(); i++) {
            resultado.push(listaN.get(i));
            recorrerRutas(i, nodoF, resultado);
            resultado.pop();
        }
        // evaluar la longitud de una ruta
    }

    public int evaluar(Stack<Planeta> resultado) {
        int resp = 0;
        int[] r = new int[resultado.size()];

        for (int j = 0; j < resultado.size(); j++) {
            r[j] = resultado.get(j).getDistanciaOptima();
        }
        for (int i = 1; i < r.length; i++) {
            resp += Integer.parseInt(galaxia.get(r[i]).getAristas().get(r[i - 1]).getDistancia());
        }
        return resp;
    }

}
