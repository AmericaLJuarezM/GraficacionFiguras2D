
package Figuras;


class Circulo {
    
    private int cix,ciy,cianch,cialt,cicol;

    public Circulo(int cix,int ciy,int cianch,int cialt,int cicol ) {
        this.cix= cix;        
        this.ciy =ciy;
        this.cianch=cianch;
        this.cialt=cialt;
        this.cicol=cicol;
    }

    public int getcix() {
        return cix;
    }

    public void setcix(int cix) {
        this.cix = cix;
    }

    public int getciy() {
        return ciy;
    }

    public void setciy(int ciy) {
        this.ciy = ciy;
    }

    public int getcianch() {
        return cianch;
    }

    public void setcianch(int cianch) {
        this.cianch = cianch;
    }

    public int getcialt() {
        return cialt;
    }

    public void setcialt(int cialt) {
        this.cialt = cialt;
    }

    public int getcicol() {
        return cicol;
    }

    public void setcicol(int cicol) {
        this.cicol = cicol;
    }
    
    
    
    
    
}
