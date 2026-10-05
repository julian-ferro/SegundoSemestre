public class ProductoVenta {
    //atributos
    private String nombre;
    private double precio;
    private int stock;
    //constructor
    public ProductoVenta(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //toString
    public String toString() {
        return "ProductoVenta [nombre: " + nombre + ", precio: " + precio + ", stock: " + stock + "]";
    }
    //vender
    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        } else {
            System.out.println("No hay suficiente stock para vender " + cantidad + " unidades.");
        }
        System.out.println("Venta realizada. Stock restante: " + stock);
    }
    //crear reabastecer
    public void reabastecer(int cantidad) {
        stock += cantidad;
        System.out.println("Reabastecimiento realizado. Stock actual: " + stock);
    }
    //Calcular valor inventario
    public double calcularValorInventario() {
        return stock * precio;
    }

    
}
