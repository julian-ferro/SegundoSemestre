import java.util.ArrayList;
import java.util.List;

public class SitemasCitasMedicas {
    // clase paciente
    private String documento;
    private String nombre;
    private int edad;
    private String telefono;

    // constructor
    public SitemasCitasMedicas() {
        this.documento = "";
        this.nombre = "";
        this.edad = 0;
        this.telefono = "";
       
    }

    // metodos getters y setters
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    // metodo toString
    @Override
    public String toString() {
        return "SitemasCitasMedicas{" +
                "documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    // clase medico
    private String especialidad;
    private String nombreMedico;
    private String codigo;
    private double salario;

    // constructor
    public SitemasCitasMedicas(String especialidad, String nombreMedico, String codigo, double salario) {
        this.especialidad = especialidad;
        this.nombreMedico = nombreMedico;
        this.codigo = codigo;
        this.salario = salario;
    }

    // metodos getters y setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // metodo toString
    public String toStringMedico() {
        return "SitemasCitasMedicas{" +
                "especialidad='" + especialidad + '\'' +
                ", nombreMedico='" + nombreMedico + '\'' +
                ", codigo='" + codigo + '\'' +
                ", salario=" + salario +
                '}';
    }
    // clase cita
    private String fecha;
    private String hora;
    private String paciente;
    private String medico;

    // constructor
    public SitemasCitasMedicas(String fecha, String hora, String paciente, String medico) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.medico = medico;
    }

    // metodos getters y setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    // metodo toString
    public String toStringCita() {
        return "SitemasCitasMedicas{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", paciente='" + paciente + '\'' +
                ", medico='" + medico + '\'' +
                '}';
    }
}