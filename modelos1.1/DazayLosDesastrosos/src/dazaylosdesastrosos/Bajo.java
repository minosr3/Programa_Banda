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
public class Bajo extends Instrumento{
    Bajo(int tipo){
        super(tipo);
    }
    String afinarInstrumento(){
        return "el bajo ya se afino";
    }
    String tocarInstrumento(){
        return "se esta tocando el bajo";
    }
}
