/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dazaylosdesastrosos;

import java.util.Random;

/**
 *
 * Carlos Ñañez 
 * 20152020030
 * Alejandro Pintor
 * 201520200!#!
 */
public class DazayLosDesastrosos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generadorAleatorios = new Random();
        
        int contador=0;
        int numeroIntegrantes = 5 + generadorAleatorios.nextInt(6);
        
        Integrante[] banda = new Integrante[numeroIntegrantes];
        
        System.out.println("hoy son "+numeroIntegrantes+" integrantes");
        for (int i = 0; i < numeroIntegrantes; i++) {
            banda[i] = new Integrante(1 + generadorAleatorios.nextInt(4));
            
            System.out.println(banda[i].afinar());
            System.out.println(banda[i].tocar());
            contador=contador+1;
        }
        if(contador==numeroIntegrantes){
            System.out.println("Los Desastrosos en la Casa!!!");
        }else {
            System.out.println("Es un Desastre "+contador);
        }
    }

}
