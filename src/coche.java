public class coche {
    private int numeroPuertas;


    public void addDoors(int numeroPuertas){
        this.numeroPuertas += numeroPuertas;
    }

    public coche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}
