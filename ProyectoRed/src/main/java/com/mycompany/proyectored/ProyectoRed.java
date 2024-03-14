package com.mycompany.proyectored;

import com.mycompany.proyectored.red.dominio.Aparato;
import com.mycompany.proyectored.red.dominio.ListaAparatos;

public class ProyectoRed {

    public static void main(String[] args) {
        ListaAparatos listaAparatos = new ListaAparatos();
        Aparato tele = new Aparato(305);
        System.out.println(tele.toString());
        Aparato lavavajillas = new Aparato(100);
        tele.encender();    
        lavavajillas.encender();
        listaAparatos.addToList(tele);
        listaAparatos.addToList(lavavajillas);
        
        System.out.println(listaAparatos.getTotalConsumo());
        System.out.println("Tele: " + tele.toString() + "\n" + "lavavajillas: " + lavavajillas.toString());
        listaAparatos.getListaAparatos();
        listaAparatos.apagadoDeEmergencia();
        System.out.println(listaAparatos.getTotalConsumo());
        System.out.println("Tele: " + tele.getStatus() + "\n" + "lavavajillas: " + lavavajillas.toString());
        System.out.println(listaAparatos.getTotalConsumo());
    }
}