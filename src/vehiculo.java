public class vehiculo {
    String col, pla, mar;
    int acientos;

    public vehiculo(String col, String pla, String mar, int acientos) {
        this.col = col;
        this.pla = pla;
        this.mar = mar;
        this.acientos = acientos;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getPla() {
        return pla;
    }

    public void setPla(String pla) {
        this.pla = pla;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public int getAcientos() {
        return acientos;
    }

    public void setAcientos(int acientos) {
        this.acientos = acientos;
    }
}
