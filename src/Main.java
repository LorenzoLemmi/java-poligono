public class Main {
    public static void main(String[] args) {
        
        // Rettangolo
        Rettangolo rettangolo = new Rettangolo(5, 3);
        System.out.println("Rettangolo:");
        System.out.println("Perimetro = " + rettangolo.calcolaPerimetro());
        System.out.println("Area = " + rettangolo.calcolaArea());

        // Triangolo
        Triangolo triangolo = new Triangolo(3, 4, 5);
        System.out.println("\n=== Triangolo ===");
        System.out.println("Perimetro: " + triangolo.calcolaPerimetro());
        System.out.println("Area: " + triangolo.calcolaArea());
    }
}
