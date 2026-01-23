package src;
public class Calculadora {

    public static int sumar(int a, int b) {
        return Math.addExact(a, b);
    }

    public static int restar(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public static int multiplicar(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: División entre cero no permitida");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Suma: " + sumar(5, 3));
            System.out.println("Resta: " + restar(10, 4));
            System.out.println("Multiplicación: " + multiplicar(6, 2));
            System.out.println("División: " + dividir(8, 2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
