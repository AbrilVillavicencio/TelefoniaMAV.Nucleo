/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.TelefoniaMAV.Nucleo.Entidades;

/**
 *
 * @author Abril
 */
public class Tarifa {
    private double cuotaMensual;
    private RegistroLlamadas registro;
    private double costoLocal;
    private double costoCelular;

    /**
     * @return the cuotaMensual
     */
    public double getCuotaMensual() {
        return cuotaMensual;
    }

    /**
     * @param cuotaMensual the cuotaMensual to set
     */
    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    /**
     * @return the registro
     */
    public RegistroLlamadas getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(RegistroLlamadas registro) {
        this.registro = registro;
    }

    /**
     * @return the costoLocal
     */
    public double getCostoLocal() {
        return costoLocal;
    }

    /**
     * @param costoLocal the costoLocal to set
     */
    public void setCostoLocal(double costoLocal) {
        this.costoLocal = costoLocal;
    }

    /**
     * @return the costoCelular
     */
    public double getCostoCelular() {
        return costoCelular;
    }

    /**
     * @param costoCelular the costoCelular to set
     */
    public void setCostoCelular(double costoCelular) {
        this.costoCelular = costoCelular;
    }
    
}
