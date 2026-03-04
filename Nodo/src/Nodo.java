import java.util.List;

public  class Nodo {
    private int valore;
    private Nodo Sx;
    private Nodo Dx;
    public Nodo(int valore, Nodo dx, Nodo sx) {
        this.valore = valore;
        Dx = dx;
        Sx = sx;
    }

    private void setValore(int valore) {
        this.valore = valore;
    }

    public void setDx(Nodo dx) {
        Dx = dx;
    }

    public void setSx(Nodo sx) {
        Sx = sx;
    }

    public int getValore() {
        return valore;
    }

    public Nodo getDx() {
        return Dx;
    }

    public Nodo getSx() {
        return Sx;
    }
}
