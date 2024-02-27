
package com.umg.entidad;

/**
 *
 * @author keidy
 */
public class EEmpleado {

    private String codigoEmpleado = "";
    private String puesto = "";

    public EEmpleado() {
    }    
    
    public EEmpleado(String codigoEmpleado, String puesto) {
        this.codigoEmpleado = codigoEmpleado;
        this.puesto = puesto;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
