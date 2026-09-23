package POO.Semana4;

public class MainCompraVentaVehiculos {
    public static void main(String[] args) {
        // Creación de los objetos de la clase CompraVentaVehiculos
        CompraVentaVehiculos objVehiculo1 = new CompraVentaVehiculos("Toyota", "Corolla", 2020, 20000.0);
        CompraVentaVehiculos objVehiculo2 = new CompraVentaVehiculos("Honda", "Civic", 2019, 18000.0);

        objVehiculo1.mostrarInformacion();
        System.out.println();
        objVehiculo2.mostrarInformacion();
    }
}
