/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author poo08alu03
 */
/**
 * La clase abstracta Poligono representa un polígono genérico.
 * Proporciona métodos abstractos para calcular el área y el perímetro del polígono.
 */
public abstract class Poligono {

    /**
     * Constructor por defecto de la clase Poligono.
     */
    public Poligono() {
    }

    /**
     * Método abstracto para calcular el área del polígono.
     * Cada subclase debe implementar este método según sus reglas específicas.
     */
    public abstract void Area();

    /**
     * Método abstracto para calcular el perímetro del polígono.
     * Cada subclase debe implementar este método según sus reglas específicas.
     */
    public abstract void Perimetro();

    /**
     * Devuelve una representación en cadena del objeto Poligono.
     *
     * @return una cadena que representa al polígono.
     */
    @Override
    public String toString() {
        return "Poligono{}";
    }
}

