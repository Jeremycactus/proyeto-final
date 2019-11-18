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
public class Vehiculo {
    String placa;
    String tipoVehiculo;
    String modelo;
    int añoModelo;
    String anomalia;
    String propietario;
    String UltimaAnomalia;
    String ciudadRegistro;

    public Vehiculo() {
        this.placa = "";
        this.tipoVehiculo = "";
        this.modelo = "";
        this.añoModelo = 0;
        this.anomalia = "";
        this.propietario = "";
        this.UltimaAnomalia = "";
        this.ciudadRegistro = "";
    }

    
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoModelo() {
        return añoModelo;
    }

    public void setAñoModelo(int añoModelo) {
        this.añoModelo = añoModelo;
    }

    public String getAnomalia() {
        return anomalia;
    }

    public void setAnomalia(String anomalia) {
        this.anomalia = anomalia;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getUltimaAnomalia() {
        return UltimaAnomalia;
    }

    public void setUltimaAnomalia(String UltimaAnomalia) {
        this.UltimaAnomalia = UltimaAnomalia;
    }

    public String getCiudadRegistro() {
        return ciudadRegistro;
    }

    public void setCiudadRegistro(String ciudadRegistro) {
        this.ciudadRegistro = ciudadRegistro;
    }
    
    
}
