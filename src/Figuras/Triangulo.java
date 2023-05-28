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
 * La clase Triangulo representa un triángulo que hereda de la clase Poligono.
 * Proporciona métodos para calcular el área y el perímetro del triángulo.
 */
public class Triangulo extends Poligono {
    private int alfa, beta, gamma;
    private float a, b, c;
    private float base, altura;

    /**
     * Constructor por defecto de la clase Triangulo.
     */
    public Triangulo() {
    }

    /**
     * Constructor de la clase Triangulo que recibe los valores de los ángulos, lados y dimensiones.
     *
     * @param alfa    el ángulo alfa del triángulo.
     * @param beta    el ángulo beta del triángulo.
     * @param gamma   el ángulo gamma del triángulo.
     * @param a       el lado a del triángulo.
     * @param b       el lado b del triángulo.
     * @param c       el lado c del triángulo.
     * @param base    la base del triángulo.
     * @param altura  la altura del triángulo.
     */
    public Triangulo(int alfa, int beta, int gamma, float a, float b, float c, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtiene el valor del ángulo alfa del triángulo.
     *
     * @return el ángulo alfa.
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * Establece el valor del ángulo alfa del triángulo.
     *
     * @param alfa el nuevo valor del ángulo alfa.
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * Obtiene el valor del ángulo beta del triángulo.
     *
     * @return el ángulo beta.
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Establece el valor del ángulo beta del triángulo.
     *
     * @param beta el nuevo valor del ángulo beta.
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * Obtiene el valor del ángulo gamma del triángulo.
     *
     * @return el ángulo gamma.
     */
    public int getGamma() {
        return gamma;
    }

    /**
     * Establece el valor del ángulo gamma del triángulo.
     *
     * @param gamma el nuevo valor del ángulo gamma.
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    /**
     * Obtiene el valor del lado a del triángulo.
     *
     * @return el lado a.
     */
    public float getA() {
        return a;
    }

    /**
     * Establece el valor del lado a del triángulo.
     *
     * @param a el nuevo valor del lado a.
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Obtiene el valor del lado b del triángulo.
     *
     * @return el lado b.
     */
    public float getB() {
        return b;
    }

    /**
     * Establece el valor del lado b del triángulo.
     *
     * @param b el nuevo valor del lado b.
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Obtiene el valor del lado c del triángulo.
     *
     * @return el lado c.
     */
    public float getC() {
        return c;
    }

    /**
     * Establece el valor del lado c del triángulo.
     *
     * @param c el nuevo valor del lado c.
     */
    public void setC(float c) {
        this.c = c;
    }

    /**
     * Obtiene el valor de la base del triángulo.
     *
     * @return la base.
     */
    public float getBase() {
        return base;
    }

    /**
     * Establece el valor de la base del triángulo.
     *
     * @param base el nuevo valor de la base.
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Obtiene el valor de la altura del triángulo.
     *
     * @return la altura.
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Establece el valor de la altura del triángulo.
     *
     * @param altura la nueva altura.
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Calcula el área del triángulo.
     * El área se calcula multiplicando la base por la altura y dividiendo el resultado por 2.
     */
    @Override
    public void Area() {
        System.out.println("Area = " + (base * altura) / 2);
    }

    /**
     * Calcula el perímetro del triángulo.
     * El perímetro se calcula sumando los tres lados del triángulo.
     */
    @Override
    public void Perimetro() {
        System.out.println("Perimetro = " + (a + b + c));
    }

    /**
     * Devuelve una representación en cadena del objeto Triangulo.
     *
     * @return una cadena que representa al triángulo.
     */
    @Override
    public String toString() {
        return "Triangulo{" +
                "alfa=" + alfa +
                ", beta=" + beta +
                ", gamma=" + gamma +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
