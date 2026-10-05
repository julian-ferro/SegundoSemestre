public class MainProductoVenta {
    public static void main(String[] args) {
        // crear varios productos y simular ventas
        ProductoVenta producto1 = new ProductoVenta("Laptop", 1500.0, 10);
        ProductoVenta producto2 = new ProductoVenta("Smartphone", 800.0, 20);

        System.out.println(producto1);
        System.out.println(producto2);

        // simular ventas
        producto1.vender(3);
        producto2.vender(5);

        // reabastecer productos
        producto1.reabastecer(5);
        producto2.reabastecer(10);

        // calcular valor inventario
        System.out.println("Valor inventario producto1: " + producto1.calcularValorInventario());
        System.out.println("Valor inventario producto2: " + producto2.calcularValorInventario());
    }
}   