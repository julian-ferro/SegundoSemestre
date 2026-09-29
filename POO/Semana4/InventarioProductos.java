package POO.Semana4;

public class InventarioProductos {
    // atributos
    private String nombre;
    private int cantidad;
    private double precio;

    // constructor
    public InventarioProductos(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public String toString() {
        return "InventarioProductos [ nombre:" + nombre + " cantidad: " + cantidad + " precio: " + precio + "]";
    }
    // creacion de metodos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + precio);     
    }
}
 