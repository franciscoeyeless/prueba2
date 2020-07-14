/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2020;

/**
 *
 * @author viceb
 */
public class Almuerzo {
    private String entrada;
    private String platoprincipal;
    private String postre;
    private String bebida;

    public Almuerzo(String entrada, String platoprincipal, String postre, String bebida) {
        this.entrada = entrada;
        this.platoprincipal = platoprincipal;
        this.postre = postre;
        this.bebida = bebida;
    }

    public Almuerzo() {
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getPlatoprincipal() {
        return platoprincipal;
    }

    public void setPlatoprincipal(String platoprincipal) {
        this.platoprincipal = platoprincipal;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
    
    public String explicar() {
        String retorno = "Para comenzar, serviremos " 
                + this.entrada 
                + ", seguido de un delicioso " 
                + this.platoprincipal
                + ". Para terminar de postre "
                + this.postre
                + ". Para beber, " + this.bebida;
        
        return retorno;
    
    }
    
}
