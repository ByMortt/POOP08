/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instrumentos;

/**
 *
 * @author poo08alu03
 */
/**
 * La clase Flauta representa una flauta que hereda de la clase InstrumentoViento.
 * Proporciona métodos para obtener el tipo de instrumento y una representación en cadena del objeto.
 */
public class Flauta extends InstrumentoViento {

    /**
     * Constructor por defecto de la clase Flauta.
     */
    public Flauta() {
    }
    
    /**
     * Obtiene el tipo de instrumento, en este caso "Flauta".
     *
     * @return el tipo de instrumento.
     */
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }

    /**
     * Devuelve una representación en cadena del objeto Flauta.
     *
     * @return una cadena que representa a la flauta.
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
}
