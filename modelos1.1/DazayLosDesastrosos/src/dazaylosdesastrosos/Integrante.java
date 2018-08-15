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
public class Integrante {

    private Instrumento instrumento;

    Integrante(int tipo) {
        switch (tipo) {
            case 1:
                instrumento = new Guitarra(tipo);
                break;
            case 2:
                instrumento = new Bateria(tipo);
                break;
            case 3:
                instrumento = new Bajo(tipo);
                break;
            case 4:
                instrumento = new Voz(tipo);
                break;
            default:

                break;
        }

    }

    String afinar() {
        return instrumento.afinarInstrumento();
    }

    String tocar() {
        return instrumento.tocarInstrumento();
    }
}
