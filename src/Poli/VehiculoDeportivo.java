
package Poli;


public class VehiculoDeportivo extends Vehiculo {
    
    private int cilindrada;
    
    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
    @Override
     public String mostrarDatos(){
         return "Matricula: "+matricula+
                 "\nMarca: "+marca+
                 "\nModelo: "+modelo+
                 "\nCilindrada: "+cilindrada;
    }
    
}
