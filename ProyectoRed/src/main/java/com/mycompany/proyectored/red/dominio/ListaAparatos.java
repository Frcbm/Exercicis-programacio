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
        setTotalConsumo(aparato.getConsumo());
    }
    public double getTotalConsumo(){
        return this.totalConsumo;
    }
    public void getListaAparatos(){
        for(int i = 0 ; i < listaAparatos.size() ; i++){
            System.out.println(listaAparatos.get(i));
        }
    }
    public void setTotalConsumo(double consumo){
        this.totalConsumo += consumo;
    }
    public void apagadoDeEmergencia(){
        if(totalConsumo > 400){
            for(int i = 0 ; i < listaAparatos.size() ; i++){
                if(listaAparatos.get(i).getStatus() == true){
                    listaAparatos.get(i).apagar();
                }
            }
        }
    }
}
