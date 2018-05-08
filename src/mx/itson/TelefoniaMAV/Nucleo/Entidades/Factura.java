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
public class Factura {
    private Cliente cliente;
    private Tarifa tarifa;
    private RegistroLlamadas registro;
    private int gratisLocal=10;
    private int gratisCelular=10;

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
     * @return the tarifa
     */
    public Tarifa getTarifa() {
        return tarifa;
    }

    /**
     * @param tarifa the tarifa to set
     */
    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
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
     * @return the gratisLocal
     */
    public int getGratisLocal() {
        return gratisLocal;
    }

    /**
     * @param gratisLocal the gratisLocal to set
     */
    public void setGratisLocal(int gratisLocal) {
        this.gratisLocal = gratisLocal;
    }

    /**
     * @return the gratisCelular
     */
    public int getGratisCelular() {
        return gratisCelular;
    }

    /**
     * @param gratisCelular the gratisCelular to set
     */
    public void setGratisCelular(int gratisCelular) {
        this.gratisCelular = gratisCelular;
    }
    
            
}
