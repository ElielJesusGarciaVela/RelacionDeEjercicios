class Circulo {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    double getArea() {
        return Math.PI * radio * radio;
    }
}

public class Ej5 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        System.out.println("Area: "+circulo.getArea());
        System.out.println("Radio: "+circulo.radio);
    }
}