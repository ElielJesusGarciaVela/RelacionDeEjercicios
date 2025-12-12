class Estudiante {
    String nombre;
    double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
}
public class Ej3 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Eliel", 10);
        System.out.println("Nombre: "+estudiante1.nombre);
        System.out.println("Nota: "+estudiante1.nota);
    }
}
