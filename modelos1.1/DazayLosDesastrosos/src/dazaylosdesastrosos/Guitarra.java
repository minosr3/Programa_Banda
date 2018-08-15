/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dazaylosdesastrosos;

/**
 *
 * @author Estudiantes
 */
public class Guitarra extends Instrumento{
    
    Guitarra(int tipo){
        super(tipo);
    }
    String afinarInstrumento(){
        return "La guitarra ya esta afinada";
    }
    String tocarInstrumento(){
        return "se esta tocando la guitarra";
    }
}
