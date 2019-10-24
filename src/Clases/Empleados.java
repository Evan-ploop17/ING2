
package Clases;


public abstract class  Empleados {
    private String nombre;
    private String dni;
    private int horasTrabajadas;
    private int pagoHora;

    public Empleados(String nombre, String dni, int horasTrabajas, int pagoHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajas;
        this.pagoHora = pagoHora;
    }

    public int getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(int pagoHora) {
        this.pagoHora = pagoHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setHorasTrabajadas(int horasTrabajas) {
        this.horasTrabajadas = horasTrabajas;
    }

    // Metodos abstractos: 
    
    public abstract double sueldoBruto();
    public abstract double sueldoNeto();
    public abstract double horasExtras();
}
