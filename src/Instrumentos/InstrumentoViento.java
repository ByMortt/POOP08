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
 * La clase InstrumentoViento representa un instrumento musical de viento.
 * Implementa la interfaz InstrumentoMusical y proporciona implementaciones para los métodos definidos en ella.
 */
public class InstrumentoViento implements InstrumentoMusical {

    /**
     * Crea una instancia de InstrumentoViento.
     */
    public InstrumentoViento() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void tocar() {
        System.out.println("Tocando el instrumento de viento");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void afinar() {
        System.out.println("Afinando el instrumento de viento");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "InstrumentoViento{}";
    }
}
