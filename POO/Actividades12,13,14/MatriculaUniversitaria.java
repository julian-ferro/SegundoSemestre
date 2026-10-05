public class MatriculaUniversitaria {
    //clase estudiantes
    private String nombre;
    private String documento;
    private int edad;
    private String correo;
    private String programa;
    private String semestre;
    //constructor
    public MatriculaUniversitaria() {
    }
    
    public MatriculaUniversitaria(String nombre, String documento, int edad, String correo, String programa, String semestre) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.correo = correo;
        this.programa = programa;
        this.semestre = semestre;
    }
    //clase curso 
    private class Curso {
        private String codigo;
        private String nombre;
        private int creditos;
        private String profesor;
        private int cupomaximo;
        //constructor
        public Curso() {
        }

        public Curso(String codigo, String nombre, int creditos, String profesor, int cupomaximo) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.creditos = creditos;
            this.profesor = profesor;
            this.cupomaximo = cupomaximo;
        }


        //comportamientos minimos
        private String estudianteavanzasemestre;

        public String getEstudianteavanzasemestre() {
            return estudianteavanzasemestre;
        }

        public void setEstudianteavanzasemestre(String estudianteavanzasemestre) {
            this.estudianteavanzasemestre = estudianteavanzasemestre;
        }
        private String EstudianteEsMayorDeEdad;

        public String getEstudianteEsMayorDeEdad() {
            return EstudianteEsMayorDeEdad;
        }

        public void setEstudianteEsMayorDeEdad(String EstudianteEsMayorDeEdad) {
            this.EstudianteEsMayorDeEdad = EstudianteEsMayorDeEdad;
        }

        private class CursoMostrarInformacion {
            private String informacion;

            public CursoMostrarInformacion(String informacion) {
                this.informacion = informacion;
            }

            public String getInformacion() {
                return informacion;
            }

            public void setInformacion(String informacion) {
                this.informacion = informacion;
            }

            private String cursoTienecupo;

            public String getCursoTienecupo() {
                return cursoTienecupo;
            }

            public void setCursoTienecupo(String cursoTienecupo) {
                this.cursoTienecupo = cursoTienecupo;
            }
            public String toString() {
                return "CursoMostrarInformacion{" +
                        "informacion='" + informacion + '\'' +
                        ", cursoTienecupo='" + cursoTienecupo + '\'' +
                        '}';
            }
            //getters and setters 
            public String getCursoMostrarInformacion() {
                return informacion;
            }

            public void setCursoMostrarInformacion(String informacion) {
                this.informacion = informacion;
            }       
           
        }
    }
}
