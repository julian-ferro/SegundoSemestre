package POO.Semana4;

public class MainCalificaciones  { 
    public static void main(String[] args) {
        // Creación de los objetos de la clase Calificaciones
        Calificaciones objCalificacion1 = new Calificaciones("Juan Perez", "12345", "Matemáticas", 4.5, 3.8, 4.2);
        Calificaciones objCalificacion2 = new Calificaciones("Maria Lopez", "67890", "Historia", 3.9, 4.1, 4.0);

        objCalificacion1.mostrarInformacion();
        objCalificacion1.calcularPromedio();

        System.out.println();

        objCalificacion2.mostrarInformacion();
        objCalificacion2.calcularPromedio();
    }

}
