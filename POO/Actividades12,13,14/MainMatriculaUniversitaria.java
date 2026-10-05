public class MainMatriculaUniversitaria {
    public static void main(String[] args) {
        // crear 5 estudiantes
        MatriculaUniversitaria[] estudiantes = new MatriculaUniversitaria[5];
        estudiantes[0] = new MatriculaUniversitaria("Juan", "123456", 20, "juan@correo.com", "Ingeniería", "3");
        estudiantes[1] = new MatriculaUniversitaria("Maria", "789012", 22, "maria@correo.com", "Medicina", "5");
        estudiantes[2] = new MatriculaUniversitaria("Pedro", "345678", 19, "pedro@correo.com", "Arquitectura", "2");
        estudiantes[3] = new MatriculaUniversitaria("Ana", "901234", 21, "ana@correo.com", "Psicología", "4");
        estudiantes[4] = new MatriculaUniversitaria("Luis", "567890", 23, "luis@correo.com", "Economía", "6");

        // crear 3 cursos
        MatriculaUniversitaria.Curso[] cursos = new MatriculaUniversitaria.Curso[3];
        MatriculaUniversitaria matricula = new MatriculaUniversitaria();
        cursos[0] = matricula.new Curso("CS101", "Introducción a la Programación", 3, "Dr. Pérez", 30);
        cursos[1] = matricula.new Curso("MA201", "Cálculo II", 4, "Dra. Gómez", 25);
        cursos[2] = matricula.new Curso("FI301", "Física III", 3, "Dr. López", 20);

        // mostrar información de todos los estudiantes y cursos
        for (MatriculaUniversitaria estudiante : estudiantes) {
            System.out.println("Estudiante: " + estudiante);
        }

        for (MatriculaUniversitaria.Curso curso : cursos) {
            System.out.println("Curso: " + curso);
        }

        // mostrar información mediante setters
        estudiantes[0].setEstudianteavanzasemestre("Juan avanza al siguiente semestre");
        estudiantes[1].setEstudianteEsMayorDeEdad("Maria es mayor de edad");

        System.out.println(estudiantes[0].getEstudianteavanzasemestre());
        System.out.println(estudiantes[1].getEstudianteEsMayorDeEdad());
    }
}

class MatriculaUniversitaria {
    private String nombre;
    private String dni;
    private int edad;
    private String email;
    private String carrera;
    private String semestre;
    private String estudianteavanzasemestre;
    private String estudianteEsMayorDeEdad;

    public MatriculaUniversitaria() {
    }

    public MatriculaUniversitaria(String nombre, String dni, int edad, String email, String carrera, String semestre) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.email = email;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getEstudianteavanzasemestre() {
        return estudianteavanzasemestre;
    }

    public void setEstudianteavanzasemestre(String estudianteavanzasemestre) {
        this.estudianteavanzasemestre = estudianteavanzasemestre;
    }

    public String getEstudianteEsMayorDeEdad() {
        return estudianteEsMayorDeEdad;
    }

    public void setEstudianteEsMayorDeEdad(String estudianteEsMayorDeEdad) {
        this.estudianteEsMayorDeEdad = estudianteEsMayorDeEdad;
    }

    @Override
    public String toString() {
        return "MatriculaUniversitaria{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", carrera='" + carrera + '\'' +
                ", semestre='" + semestre + '\'' +
                '}';
    }

    public class Curso {
        private String codigo;
        private String nombreCurso;
        private int creditos;
        private String profesor;
        private int capacidad;

        public Curso(String codigo, String nombreCurso, int creditos, String profesor, int capacidad) {
            this.codigo = codigo;
            this.nombreCurso = nombreCurso;
            this.creditos = creditos;
            this.profesor = profesor;
            this.capacidad = capacidad;
        }

        @Override
        public String toString() {
            return "Curso{" +
                    "codigo='" + codigo + '\'' +
                    ", nombreCurso='" + nombreCurso + '\'' +
                    ", creditos=" + creditos +
                    ", profesor='" + profesor + '\'' +
                    ", capacidad=" + capacidad +
                    '}';
        }
        //mostrar casos validos he invalidos
        public void mostrarCasosValidosEInvalidos() {
            System.out.println("Curso válido: " + this);
            System.out.println("Curso inválido: " + new Curso("", "", 0, "", 0));
        } 
    }
}


        
    

    
    