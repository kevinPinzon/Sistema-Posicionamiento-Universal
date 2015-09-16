/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BETA1;

import java.util.ArrayList;

/**
 *
 * @author kevinPinzon
 */
public class Galaxia {

    private ArrayList<Planeta> inscritos;

    public Galaxia() {
        inscritos= new ArrayList<Planeta>();
    }
    public Galaxia(ArrayList<Planeta> inscritos) {
        this.inscritos= inscritos;
    }

    public boolean insert(Planeta a) {
        boolean insert = true;
        
        if (inscritos.isEmpty()) {
            this.inscritos.add(a);
        }
        for (int i = 0; i < inscritos.size(); i++) {
            if (a.getEtiqueta().equals(inscritos.get(i).getEtiqueta())) {
                insert=false;
            }
        }
        if (insert) {
            this.inscritos.add(a);
        }
        return insert;
    }

    public ArrayList<Planeta> getInscritos() {
        return inscritos;
    }

    public void setInscritos(ArrayList<Planeta> inscritos) {
        this.inscritos = inscritos;
    }

}
