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
    
   
    
    int idPaquete,idHuesped, numeroTarjeta;
    Fecha fechaEntrada,fechaSalida;
    double montoTotal;
    String nombre;
    Paq paquete;
    Habitacion hab;
    
    public void Reservacion(String nombre, Fecha fechaEntrada, Fecha fechaSalida, int numeroTarjeta, double montoTotal, int idPaquete, Habitacion hab,
            int idHuesped, Paq paquete){
        
        this.fechaEntrada = fechaEntrada;
        this.numeroTarjeta = numeroTarjeta;
        this.montoTotal = montoTotal;
        this.idPaquete = idPaquete;
        this.idHuesped = idHuesped;
        this.hab = hab;
        this.fechaSalida = fechaSalida;
        this.nombre = nombre;
        this.paquete = paquete;
        
    
    }

    public Paq getPaquete() {
        return this.paquete;
    }

    public void setPaquete(Paq paquete) {
        this.paquete = paquete;
    }

    public Habitacion getHab() {
        return this.hab;
    }

    public void setHab(Habitacion hab) {
        this.hab = hab;
    }
    
    
    
    public void eliminarReservacion(Habitacion hab){
        this.hab = hab;
    }
    
    public void consultarReserva(Habitacion hab, Fecha fechaEntrada, Fecha fechaSalida){
        
        this.hab = hab;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
                
    
    
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Fecha getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Fecha fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Fecha getFechaSalida() {
        return this.fechaSalida;
    }

    public void setFechaSalida(Fecha fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    
    
    
    
    
    
    
    
    
            
    
    
}
