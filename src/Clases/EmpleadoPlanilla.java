package Clases;


public class EmpleadoPlanilla extends Empleados{
    
    int cantHijos;

    public EmpleadoPlanilla(String nombre, String dni, int horasTrabajas, int pagoHora) {
        super(nombre, dni, horasTrabajas, pagoHora);
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
        return  sueldoBruto() + horasExtras() +bonoHijos();
    }


    
}
