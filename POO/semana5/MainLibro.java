public class MainLibro {
    public static void main (String[] args){

        //creacion de los 5 libros
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", "978-3-16-148410-0", 1943, true);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "978-3-16-148410-1", 1967, true);
        Libro libro3 = new Libro("1984", "George Orwell", "978-3-16-148410-2", 1949, true);
        Libro libro4 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-3-16-148410-3", 1605, true);
        Libro libro5 = new Libro("La Odisea", "Homero", "978-3-16-148410-4", -800, true);

        //mostrar informacion de los libros
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);

        //Mostrar solo el titulo del libro2
        System.out.println(libro2.getTitulo());

        //cambiar el isbn del libro5
        libro5.setIsbn("203923-3023993");
        System.out.println(libro5);

        //verificar si el libro3 esta disponible
        System.out.println(libro3.estaDisponible());  // true

        //prestar el libro 3
        libro3.prestar();
        System.out.println(libro3.estaDisponible());  // false

        //devolver el libro 3
        libro3.devolver();
        System.out.println(libro3.estaDisponible());  // true
    }
}
