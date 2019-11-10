
package Clases;


public abstract class  Empleados {
    private String nombre;
     private String apellido;
    private String dni;
    private int horasTrabajadas;
    private int pagoHora;
    
    // CONSTRUCTOR SIN PARAMETROS
    public Empleados(){
        
    }
    
    public Empleados(String nombre, String apellido, String dni, int horasTrabajas, int pagoHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajas;
        this.pagoHora = pagoHora;
    }

    // Metodos abstractos: 
    
    public abstract double sueldoBruto();
    public abstract double sueldoNeto();
    public abstract double horasExtras();
    public abstract String print();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(int pagoHora) {
        this.pagoHora = pagoHora;
    }
}
