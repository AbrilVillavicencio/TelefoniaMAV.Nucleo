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
public class RegistroLlamadas {
    private Cliente cliente;
    private String llamadaLocal;
    private int vecesLocal;
    private String llamadaCelular;
    private double minutosCelular;

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the llamadaLocal
     */
    public String getLlamadaLocal() {
        return llamadaLocal;
    }

    /**
     * @param llamadaLocal the llamadaLocal to set
     */
    public void setLlamadaLocal(String llamadaLocal) {
        this.llamadaLocal = llamadaLocal;
    }

    /**
     * @return the vecesLocal
     */
    public int getVecesLocal() {
        return vecesLocal;
    }

    /**
     * @param vecesLocal the vecesLocal to set
     */
    public void setVecesLocal(int vecesLocal) {
        this.vecesLocal = vecesLocal;
    }

    /**
     * @return the llamadaCelular
     */
    public String getLlamadaCelular() {
        return llamadaCelular;
    }

    /**
     * @param llamadaCelular the llamadaCelular to set
     */
    public void setLlamadaCelular(String llamadaCelular) {
        this.llamadaCelular = llamadaCelular;
    }

    /**
     * @return the minutosCelular
     */
    public double getMinutosCelular() {
        return minutosCelular;
    }

    /**
     * @param minutosCelular the minutosCelular to set
     */
    public void setMinutosCelular(double minutosCelular) {
        this.minutosCelular = minutosCelular;
    }
    
}
