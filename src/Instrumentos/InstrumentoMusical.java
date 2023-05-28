/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Instrumentos;

/**
 *
 * @author poo08alu03
 */
/**
 * La interfaz InstrumentoMusical representa un instrumento musical genérico.
 * Define los métodos comunes que deben implementar todos los instrumentos musicales.
 */
public interface InstrumentoMusical {
    
    /**
     * Toca el instrumento musical.
     */
    void tocar();
    
    /**
     * Ajusta o afina el instrumento musical.
     */
    void afinar();
    
    /**
     * Obtiene el tipo de instrumento.
     *
     * @return el tipo de instrumento.
     */
    String tipoInstrumento();
}

