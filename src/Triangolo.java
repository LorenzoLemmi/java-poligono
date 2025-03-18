public class Triangolo implements Poligono {
    private double lato1;
    private double lato2;
    private double lato3;

    public Triangolo(double lato1, double lato2, double lato3) {
        
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    @Override
    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }

    @Override
    public double calcolaArea() {
        // Formula di Erone
        double p = calcolaPerimetro() / 2;
        return Math.sqrt(p * (p - lato1) * (p - lato2) * (p - lato3));
    }

    // Getters
    public double getLato1() {
        return lato1;
    }

    public double getLato2() {
        return lato2;
    }

    public double getLato3() {
        return lato3;
    }
}
