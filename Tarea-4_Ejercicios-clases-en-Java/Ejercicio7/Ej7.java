class Animal {
    String nombre;

    void comer() {
        System.out.println(nombre + " está comiendo.");
    }
}

class Perro extends Animal {

    void ladrar() {
        System.out.println(nombre + " está ladrando.");
    }
}

public class Ej7 {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.nombre = "Perro";
        perro.comer();
        perro.ladrar();
    }
}
