
package Poli;


public class VehiculoTuristico extends Vehiculo{
    
    private int nPuertas;
    
    public VehiculoTuristico(int nPuertas, String matriucla, String marca, String modelo) {
        super(matriucla, marca, modelo);
        this.nPuertas = nPuertas;
    
    }    
     public int getnPuerta(){
         return nPuertas;
    }
     @Override
     public String mostrarDatos(){
         return "Matricula: "+matricula+
                 "\nMarca: "+marca+
                 "\nModelo: "+modelo+
                 "\nNumero de Puertas: "+nPuertas;
}
}
