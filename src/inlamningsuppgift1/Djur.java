package inlamningsuppgift1;

public abstract class Djur implements IFoder {

    private int vikt;
    private String namn;
    private String art;

    Djur() {
    }

    Djur(int vikt, String namn, String art) {
        this.vikt = vikt;
        this.namn = namn;
        this.art = art;
    }

    public int getVikt() {
        return vikt;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

}
