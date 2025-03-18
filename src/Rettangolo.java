public class Rettangolo implements Poligono {
    
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }

    // Getters e setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

}
