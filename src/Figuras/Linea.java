
package Figuras;

class Linea {
    
    public  int lx,ly,lanch,lalt,lopc,lcol;

    public Linea(int lx, int ly, int lanch, int lalt, int lopc, int lcol) {
        this.lx = lx;
        this.ly = ly;
        this.lanch = lanch;
        this.lalt = lalt;
        this.lopc = lopc;
        this.lcol = lcol;
    }

    public int getlx() {
        return lx;
    }

    public void setlx(int lx) {
        this.lx = lx;
    }

    public int getly() {
        return ly;
    }

    public void setly(int ly) {
        this.ly = ly;
    }

    public int getlanch() {
        return lanch;
    }

    public void setlanch(int lanch) {
        this.lanch = lanch;
    }

    public int getlalt() {
        return lalt;
    }

    public void setlalt(int lalt) {
        this.lalt = lalt;
    }

    public int getlopc() {
        return lopc;
    }

    public void setlopc(int lopc) {
        this.lopc = lopc;
    }

    public int getColores1() {
        return lcol;
    }

    public void setlcol(int lcol) {
        this.lcol = lcol;
    }
}
