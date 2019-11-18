/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mecanica;

/**
 *
 * @author Ryzen 5
 */
public class Mecanica {
  private static Ventana formulario;
  private static Vehiculo vehiculoo[];
  private static int contador;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Ventana v1= new Ventana();
       
            v1.setVisible(true);
            
             
     formulario=new Ventana();
       vehiculoo=new Vehiculo[1000];
             //arreglo para almacenar 0 - 999 vehiculos
             
             for (int i = 0; i < 1000; i++){
                vehiculoo[i] =new Vehiculo();
             }
             contador=0; 
    }
    //se crean guardar y buscar
    public static void Wardar(String placa,String tipoVehiculo, String modelo,int añoModelo,String anomalia,String propietario,String UltimaAnomalia,String ciudadRegistro){
        //creamos las variablesxd
        vehiculoo[contador].setPlaca(placa);
        vehiculoo[contador].setTipoVehiculo(tipoVehiculo);
        vehiculoo[contador].setModelo(modelo);
        vehiculoo[contador].setAñoModelo(añoModelo);
        vehiculoo[contador].setAnomalia(anomalia);
        vehiculoo[contador].setPropietario(propietario);
        vehiculoo[contador].setUltimaAnomalia(UltimaAnomalia);
        vehiculoo[contador].setCiudadRegistro(ciudadRegistro);
        
        contador++;
    }
    public static void buscar(String bus){
        //bus= varibale buscador
        
        for (int j = 0; j < vehiculoo.length ; j++){
            if (vehiculoo[j].getPlaca().equals(bus)){
                formulario.cargardatos(vehiculoo[j]);
            }
                
        }
        
    }
}
