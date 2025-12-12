class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        } else {
            System.out.println("No hay suficiente stock.");
        }
    }
}

public class Ej6 {
    public static void main(String[] args) {
        Producto mesa = new Producto("mesa", 25, 200);
        System.out.println("Producto: " + mesa.nombre);
        System.out.println("Precio: " + mesa.precio);
        System.out.println("Stock: " + mesa.stock);
        mesa.vender(25);
        System.out.println("Stock despues de vender 25 mesas: "+mesa.stock);
    }
}
