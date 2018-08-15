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
public class Voz extends Instrumento{
    Voz(int tipo){
        super(tipo);
    }
    String afinarInstrumento(){
        return "La voz ya se afino";
    }
    String tocarInstrumento(){
        return "Ya esta cantando";
    }
}
