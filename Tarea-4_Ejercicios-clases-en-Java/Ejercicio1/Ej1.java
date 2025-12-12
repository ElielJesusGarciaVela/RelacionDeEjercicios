class Libro {
    String titulo;
    String autor;
    int paginas;
}

public class Ej1 {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.titulo = "El Quijote";
        libro.autor = "Miguel de Cervantes";
        libro.paginas = 863;

        System.out.println("Título: "+libro.titulo);
        System.out.println("Autor: "+libro.autor);
        System.out.println("Páginas: "+libro.paginas);
    }
}
