
package Poli;

public class Principal {
    
    public static void main(String[] args){
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("GH67","Ferrari","A89");
        misVehiculos[1] = new VehiculoTuristico(4,"GH47","Audi","A84");
        misVehiculos[2] = new VehiculoDeportivo(500,"GH27","Toyota","A29");
        misVehiculos[3] = new VehiculoFurgoneta(2000,"GH68","DSFK","A87");
   
    
    for(Vehiculo vehiculos: misVehiculos){
        System.out.println(vehiculos.mostrarDatos());
        System.out.println("");
    }
    }
    
}
