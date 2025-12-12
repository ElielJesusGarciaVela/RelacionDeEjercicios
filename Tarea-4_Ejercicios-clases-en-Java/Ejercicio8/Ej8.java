class Figura {
    void dibujar() {
        System.out.println("Dibujando una figura");
    }
}

class Triangulo extends Figura {
    @Override
    void dibujar() {
        System.out.println("Dibujando un triángulo");
    }
}

public class Ej8 {
    public static void main(String[] args) {
        Figura figura = new Figura();
        figura.dibujar();
        Triangulo triangulo = new Triangulo();
        triangulo.dibujar();
    }
}