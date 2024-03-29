package Clases;


public class EmpleadoPlanilla extends Empleados{
    
    int cantHijos;

    
    public EmpleadoPlanilla(){
        
    }
    
    public EmpleadoPlanilla(String nombre, String apellido, String dni, int horasTrabajas, int pagoHora) {
        super(nombre, apellido, dni, horasTrabajas, pagoHora);
        this.cantHijos = cantHijos;
    }
    
    //Metodo de la clase
    
    public double bonoHijos(){
        
        if (cantHijos > 0 && cantHijos <= 2)
        {
            return sueldoBruto() * 0.02;
        }else if (cantHijos > 0 && cantHijos <= 2)
        {
            return sueldoBruto() * 0.04;
        }
        return 0.0;
    }

    
    
    @Override
    public double sueldoBruto() {
        return getHorasTrabajadas() * getPagoHora();
    }
    
        @Override
    public double  horasExtras() {
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
    public double sueldoNeto() {
        return  sueldoBruto() + horasExtras() + bonoHijos();
    }
    
    @Override
    public String print(){
        return "Empleado Planilla " + "\n" + 
                "Nombres: " + getNombre() + "\n" +
                "Apellidos: " + super.getApellido() + "\n" + 
                "Cedula: " + super.getDni() + "\n" +
                "                           " + "\n" + 
                "Resumen de pago: " + "\n" + 
                "Sueldo bruto: S/ "+ this.sueldoBruto() + "\n" +
                "Bono por hijos: S/" + this.bonoHijos() + "\n" +
                "Pago por horas extras: S/" + this.horasExtras() + "\n" +
                "Sueldo neto: S/" + this.sueldoNeto();
    }
    
}
