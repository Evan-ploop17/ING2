
package Clases;


public class EmpleadoNomina extends Empleados{
    
    private String ruc;
    
    public EmpleadoNomina(){
    }

    public EmpleadoNomina(String nombre, String apellido, String dni, int horasTrabajas, int pagoHora, String ruc) {
        super(nombre, apellido, dni, horasTrabajas, pagoHora);
        this.ruc = ruc;
    }
    
    
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    
    
    
    
    
    @Override
    public double sueldoBruto() {
        return getHorasTrabajadas() + getPagoHora();
    }

    @Override
    public double sueldoNeto() {
        return  sueldoBruto() + horasExtras();
    }

    @Override
    public double horasExtras() {
        
        int horasExtras = getHorasTrabajadas() - 45;
      
        if (getHorasTrabajadas() > 45)
        {
            return horasExtras * getPagoHora();
        }
        else 
        {
            return 0;
        }
    }

    @Override
    public String print() {
        
        return "Empleado Planilla " + "\n" + 
                "Nombres: " + getNombre() + "\n" +
                "Apellidos: " + super.getApellido() + "\n" + 
                "Cedula: " + super.getDni() + "\n" +
                "RUC: " + this.getRuc() +   "\n" +
                "                           " + "\n" + 
                "Resumen de pago: " + "\n" + 
                "Sueldo bruto: S/ "+ this.sueldoBruto() + "\n" +
                "Pago por horas extras: S/" + this.horasExtras() + "\n" +
                "Sueldo neto: S/" + this.sueldoNeto();
    }
    
    
    }
    

