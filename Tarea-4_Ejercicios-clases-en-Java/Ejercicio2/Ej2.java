class Rectangulo {
    double base;
    double altura;

    double calcularArea(double base, double altura) {
        return base * altura;
    }

    double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
}
public class Ej2 {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.base = 10;
        rectangulo.altura= 20;
        System.out.println("Area: "+rectangulo.calcularArea(rectangulo.base, rectangulo.altura));
        System.out.println("Perimetro: "+rectangulo.calcularPerimetro(rectangulo.base, rectangulo.altura));
    }
}