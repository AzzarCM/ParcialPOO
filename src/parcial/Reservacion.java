/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

//import java.util.ArrayList;

/**
 *
 * @author cmundo
 */
public class Reservacion {
    
    public Reservacion (){}
    
   
    
    int idPaquete,fechaEntrada,fechaSalida;
    double montoTotal;
    String Habitacion, nombre,idHuesped, numeroTarjeta;
    
    public void Reservacion(String nombre, int fechaEntrada, String numeroTarjeta, double montoTotal, int idPaquete, String Habitacion,
            String idHuesped){
        
        this.fechaEntrada = fechaEntrada;
        this.numeroTarjeta = numeroTarjeta;
        this.montoTotal = montoTotal;
        this.idPaquete = idPaquete;
        this.idHuesped = idHuesped;
        this.Habitacion = Habitacion;
        this.fechaSalida = fechaSalida;
        this.nombre = nombre;
        
    
    }
    
    public void eliminarReservacion(String Habitacion){
        
        this.Habitacion = Habitacion;
    
    
    
    }
    
    public void consultarReserva(String Habitacion, int fechaEntrada, int fechaSalida){
        
        this.Habitacion = Habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
                
    
    
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(String idHuesped) {
        this.idHuesped = idHuesped;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public int getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(int fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(int fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getHabitacion() {
        return Habitacion;
    }

    public void setHabitacion(String Habitacion) {
        this.Habitacion = Habitacion;
    }
    
    
    
    
    
    
    
    
    
            
    
    
}
