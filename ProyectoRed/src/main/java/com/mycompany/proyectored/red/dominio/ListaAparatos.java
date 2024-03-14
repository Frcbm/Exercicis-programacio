package com.mycompany.proyectored.red.dominio;

import java.util.ArrayList;

public class ListaAparatos {
    private double totalConsumo = 0;
    private ArrayList<Aparato> listaAparatos;
    public ListaAparatos(){
        this.listaAparatos = new ArrayList<Aparato>();
    }
    public void addToList(Aparato aparato){
        listaAparatos.add(aparato);
        setTotalConsumo();
    }
    
    public double getTotalConsumo() {
        double total = 0;
        for (Aparato aparato : listaAparatos) {
            if (aparato.getStatus()) {
                total += aparato.getConsumo();
            }
        }
        return total;
    }
        
    public void getListaAparatos(){
        for(Aparato aparato : listaAparatos){
            System.out.println(aparato);
        }
    }
    public void setTotalConsumo(){
        this.totalConsumo = 0;
        for(int i = 0 ; i < listaAparatos.size(); i++){
            if(!listaAparatos.get(i).getStatus()){
                this.totalConsumo += listaAparatos.get(i).getConsumo();
            }
        }
      
    }
    public void apagadoDeEmergencia(){
        setTotalConsumo();
        if(this.totalConsumo > 400){
            for(Aparato aparato : this.listaAparatos){
                aparato.apagar();
            }
        }
    }
}