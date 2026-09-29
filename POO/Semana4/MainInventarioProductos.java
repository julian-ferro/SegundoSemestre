package POO.Semana4;

public class MainInventarioProductos {
    public static void main(String[] args) {
        // Creación de los objetos de la clase InventarioProductos
        InventarioProductos objProducto1 = new InventarioProductos("Laptop", 10, 1500.00);
        InventarioProductos objProducto2 = new InventarioProductos("Smartphone", 20, 800.00);

        objProducto1.mostrarInformacion();
        System.out.println();
        objProducto2.mostrarInformacion();
    }
}
