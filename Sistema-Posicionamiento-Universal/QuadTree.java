package BETA1;

import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.JOptionPane;

public class QuadTree {

    private Nodo Raiz;
    private int profundidad = 0;
    
    public QuadTree(BufferedImage imagen, int profundidad) {
        Nodo nodo = new Nodo();
        Raiz = nodo;
        insert(nodo, imagen, profundidad);
    }

    public Nodo getRaiz() {
        return Raiz;
    }

    public void setRaiz(Nodo Raiz) {
        this.Raiz = Raiz;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    private boolean isWhite(BufferedImage imagen) {
        boolean isEqual = true;
        Color colorAux1;
        Color colorAux2 = new Color(imagen.getRGB(0, 0));
        for (int i = 0; i < imagen.getHeight(); i++) {
            for (int j = 0; j < imagen.getWidth(); j++) {
                colorAux1 = new Color(imagen.getRGB(i, j));
                if (colorAux1 == colorAux2) {
                    isEqual = true;
                } else {
                    isEqual = false;
                    break;
                }
            }
        }
        return isEqual;
    }


    private void insert(Nodo nodo, BufferedImage imagen, int profundidad) {
        //generando corte            
        int w = imagen.getWidth() / 2;
        int h = imagen.getHeight() / 2;
        if ((w >= 4) || (h >= 4)) {
            if (this.profundidad < profundidad) {
                if ((isWhite(imagen)) == false) {
                    nodo.setValue(imagen);

                    BufferedImage corte1 = imagen.getSubimage(0, 0, w, h);
                    BufferedImage corte2 = imagen.getSubimage(w, imagen.getMinY(), w, h);
                    BufferedImage corte3 = imagen.getSubimage(imagen.getMinX(), h, w, h);
                    BufferedImage corte4 = imagen.getSubimage(w, h, w, h);
                    //dibujar(whiteImage, w, h);
                    //repartiendo los hijos                    
                    if ((isWhite(corte1)) == false) {
                        this.profundidad++;
                        Nodo child = new Nodo(true);
                        nodo.setNE(child);
                        nodo.getNE().setValue(corte1);
                        //dibujar(whiteImage, w, h);
                        insert(child, corte1, profundidad);
                    }
                    if ((isWhite(corte2)) == false) {
                        this.profundidad++;
                        Nodo child = new Nodo(true);
                        nodo.setNW(child);
                        nodo.getNW().setValue(corte2);
                        //dibujar(whiteImage, w, h);
                        insert(child, corte2, profundidad);
                    }
                    if ((isWhite(corte3)) == false) {
                        this.profundidad++;
                        Nodo child = new Nodo(true);
                        nodo.setSE(child);
                        nodo.getSE().setValue(corte3);
                        //dibujar(whiteImage, w, h);
                        insert(child, corte3, profundidad);
                    }
                    if ((isWhite(corte4)) == false) {
                        this.profundidad++;
                        Nodo child = new Nodo(true);
                        nodo.setSW(child);
                        nodo.getSW().setValue(corte4);
                        //dibujar(whiteImage, w, h);
                        insert(child, corte4, profundidad);
                    }

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "La imagen llego a su limite");
        }
    }

}
