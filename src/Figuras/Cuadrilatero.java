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
 * La clase Cuadrilatero representa un cuadrilátero que hereda de la clase Poligono.
 * Proporciona métodos para calcular el área y el perímetro del cuadrilátero.
 */
public class Cuadrilatero extends Poligono {
    private int alfa, beta;
    private float a, b;
    private int base, altura;

    /**
     * Constructor por defecto de la clase Cuadrilatero.
     */
    public Cuadrilatero() {
    }

    /**
     * Constructor de la clase Cuadrilatero que recibe los valores de los ángulos, lados y dimensiones.
     *
     * @param alfa    el ángulo alfa del cuadrilátero.
     * @param beta    el ángulo beta del cuadrilátero.
     * @param a       el lado a del cuadrilátero.
     * @param b       el lado b del cuadrilátero.
     * @param base    la base del cuadrilátero.
     * @param altura  la altura del cuadrilátero.
     */
    public Cuadrilatero(int alfa, int beta, float a, float b, int base, int altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtiene el valor del ángulo alfa del cuadrilátero.
     *
     * @return el ángulo alfa.
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Establece el valor del ángulo alfa del cuadrilátero.
     *
     * @param alfa el nuevo valor del ángulo alfa.
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Obtiene el valor del ángulo beta del cuadrilátero.
     *
     * @return el ángulo beta.
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Establece el valor del ángulo beta del cuadrilátero.
     *
     * @param beta el nuevo valor del ángulo beta.
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Obtiene el valor del lado a del cuadrilátero.
     *
     * @return el lado a.
     */
    public float getA() {
        return a;
    }

    /**
     * Establece el valor del lado a del cuadrilátero.
     *
     * @param a el nuevo valor del lado a.
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Obtiene el valor del lado b del cuadrilátero.
     *
     * @return el lado b.
     */
    public float getB() {
        return b;
    }

    /**
     * Establece el valor del lado b del cuadrilátero.
     *
     * @param b el nuevo valor del lado b.
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Obtiene el valor de la base del cuadrilátero.
     *
     * @return la base.
     */
    public int getBase() {
        return base;
    }

    /**
     * Establece el valor de la base del cuadrilátero.
     *
     * @param base el nuevo valor de la base.
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * Obtiene el valor de la altura del cuadrilátero.
     *
     * @return la altura.
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Establece el valor de la altura del cuadrilátero.
     *
     * @param altura la nueva altura.
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Calcula el área del cuadrilátero.
     * El área se calcula multiplicando la base por la altura.
     */
    @Override
    public void Area() {
        System.out.println("Area = " + base * altura);
    }

    /**
     * Calcula el perímetro del cuadrilátero.
     * El perímetro se calcula sumando todos los lados del cuadrilátero.
     */
    @Override
    public void Perimetro() {
        System.out.println("Perimetro = " + 2 * (a + b));
    }

    /**
     * Devuelve una representación en cadena del objeto Cuadrilatero.
     *
     * @return una cadena que representa al cuadrilátero.
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" +
                "alfa=" + alfa +
                ", beta=" + beta +
                ", a=" + a +
                ", b=" + b +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}

