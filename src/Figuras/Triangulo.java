package Figuras;

public class Triangulo {
    int tx,ty,tanch,talt,tcol;

    public Triangulo(int tx, int ty, int tanch, int talt, int tcol) {
        this.tx = tx;
        this.ty = ty;
        this.tanch = tanch;
        this.talt = talt;
        this.tcol = tcol;
    }

    public int getTx() {
        return tx;
    }

    public void setTx(int tx) {
        this.tx = tx;
    }

    public int getTy() {
        return ty;
    }

    public void setTy(int ty) {
        this.ty = ty;
    }

    public int getTAnch() {
        return tanch;
    }

    public void setTAnch(int tanch) {
        this.tanch = tanch;
    }

    public int getTAlt() {
        return talt;
    }

    public void setTAlt(int talt) {
        this.talt = talt;
    }

    public int getTCol() {
        return tcol;
    }

    public void setTCol(int tcol) {
        this.tcol = tcol;
    }
    
}
