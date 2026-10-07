public class MainSistemasCitasMedicas {
    public static void main(String[] args) {
        // Crear instancias de SistemasCitasMedicas para paciente, medico y cita
        SistemasCitasMedicas paciente = new SistemasCitasMedicas("123456", "Juan Perez", 30, "555-1234");
        SistemasCitasMedicas medico = new SistemasCitasMedicas("Cardiologia", "Dr. Smith", "M001", 5000.0);
        SistemasCitasMedicas cita = new SistemasCitasMedicas("2024-06-15", "10:00", "Juan Perez", "Dr. Smith");

        // Imprimir la informacion de cada instancia
        System.out.println(paciente.toStringPaciente());
        System.out.println(medico.toStringMedico());
        System.out.println(cita.toStringCita());
    }
}

class SistemasCitasMedicas {
    private String idPaciente;
    private String nombrePaciente;
    private int edad;
    private String telefono;
    private String especialidad;
    private String nombreMedico;
    private String idMedico;
    private double salario;
    private String fecha;
    private String hora;
    private String paciente;
    private String medico;

    public SistemasCitasMedicas(String idPaciente, String nombrePaciente, int edad, String telefono) {
        this.idPaciente = idPaciente;
        this.nombrePaciente = nombrePaciente;
        this.edad = edad;
        this.telefono = telefono;
    }

    public SistemasCitasMedicas(String especialidad, String nombreMedico, String idMedico, double salario) {
        this.especialidad = especialidad;
        this.nombreMedico = nombreMedico;
        this.idMedico = idMedico;
        this.salario = salario;
    }

    public SistemasCitasMedicas(String fecha, String hora, String paciente, String medico) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.medico = medico;
    }

    public String toStringPaciente() {
        return "Paciente{idPaciente='" + idPaciente + "', nombrePaciente='" + nombrePaciente + "', edad=" + edad
                + ", telefono='" + telefono + "'}";
    }

    @Override
    public String toString() {
        return toStringPaciente();
    }

    public String toStringMedico() {
        return "Medico{especialidad='" + especialidad + "', nombreMedico='" + nombreMedico + "', idMedico='"
                + idMedico + "', salario=" + salario + "}";
    }

    public String toStringCita() {
        return "Cita{fecha='" + fecha + "', hora='" + hora + "', paciente='" + paciente + "', medico='" + medico + "'}";
    }
}
