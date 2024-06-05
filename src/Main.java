class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
        this.base = 0.0;
        this.altura = 0.0;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(5.0, 4.0);
        Retangulo retangulo2 = new Retangulo();

        retangulo2.setBase(5.0);
        retangulo2.setAltura(4.0);

        System.out.println("Retângulo 1:");
        System.out.println("Área: " + retangulo1.calcularArea());
        System.out.println("Perímetro: " + retangulo1.calcularPerimetro());

        System.out.println("\nRetângulo 2:");
        System.out.println("Área: " + retangulo2.calcularArea());
        System.out.println("Perímetro: " + retangulo2.calcularPerimetro());
    }
}
