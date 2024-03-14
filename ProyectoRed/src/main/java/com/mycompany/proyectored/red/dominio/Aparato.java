package com.mycompany.proyectored.red.dominio;

public class Aparato {
    
    private final double consumo;
    private boolean status;
    
    public Aparato(double consumo){
        this.status = false;
        this.consumo = consumo;
    }
    
    public double getConsumo(){
        return this.consumo;
    }

    public boolean getStatus(){
        return this.status;
    }
    
    public void apagar(){
        this.status = false;
    }
    public void encender(){
        this.status = true;
    }
    

    @Override
    public String toString(){
        String estado = status ? "encendido" : "apagado";
        return "El aparato esta " + estado; 
    }
    
}
