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
public class Bateria extends Instrumento {
    Bateria(int tipo){
        super(tipo);
    }
    String afinarInstrumento(){
        return "La bateria ya esta afina";
    }
    String tocarInstrumento(){
        return "ya se esta tocando la bateria";
    }
}
