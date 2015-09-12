package BETA1;

public class Nodo {

    private Nodo NW;
    private Nodo NE;
    private Nodo SW;
    private Nodo SE;
    private boolean hasChild;
    private Object value;

    public Nodo(boolean hasChild) {                    
            this.NE = null;
            this.NW = null;
            this.SE = null;
            this.SW = null;        
    }

    public Nodo() {
        this.value = null;
            this.NE = null;
            this.NW = null;
            this.SE = null;
            this.SW = null;
    }

    public Nodo getNW() {
        return NW;
    }

    public void setNW(Nodo NW) {
        this.NW = NW;
    }

    public Nodo getNE() {
        return NE;
    }

    public void setNE(Nodo NE) {
        this.NE = NE;
    }

    public Nodo getSW() {
        return SW;
    }

    public void setSW(Nodo SW) {
        this.SW = SW;
    }

    public Nodo getSE() {
        return SE;
    }

    public void setSE(Nodo SE) {
        this.SE = SE;
    }

    public boolean hadChild() {
        return hasChild;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    
    public Object getValue() {
        return value;
    }
}
