/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop08;
import Figuras.Poligono;
import Figuras.Cuadrilatero;
import Figuras.Triangulo;

import Instrumentos.InstrumentoMusical;
import Instrumentos.InstrumentoViento;
import Instrumentos.Flauta;

import mesario.Meses;

/**
 *
 * @author poo08alu03
 */
public class POOP08 {

    /**
     * El método main es el punto de entrada principal del programa.
     * 
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear un objeto de tipo Poligono y asignarlo a una referencia de tipo Poligono
        Poligono pol;
        pol = new Cuadrilatero();
        System.out.println(pol);
        
        // Crear un objeto de tipo Triangulo y asignarlo a una referencia de tipo Poligono
        pol = new Triangulo();
        System.out.println(pol);
        
        // Calcular el área del polígono
        pol.Area();
        
        // Crear un objeto de tipo InstrumentoMusical y asignarlo a una referencia de tipo InstrumentoMusical
        InstrumentoMusical wea;
        wea = new Flauta();
        wea.tocar();
        
        // Imprimir el valor de PI
        System.out.println(Math.PI);
        
        // Imprimir el nombre del mes correspondiente al número del mes
        System.out.println("El mes " + Meses.DOS + " corresponde al mes de " + Meses.NOMBRES_MESES[Meses.DOS]);
    }
}

