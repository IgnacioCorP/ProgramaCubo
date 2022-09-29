/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacubo;

import dominio.Cubo;

/**
Clase cubo 
* Alto ancho y vacio
* constructor vacio y con los atributos
* metodo que calcule el volumen del cubo
* Cuando se ejecute se muestre el volumen del cubo
* HYacer paso a paso y establecer punto de ruptura en el momento exacto de calcular el volumen del cubo
 */
public class ProgramaCubo {

    
    public static void main(String[] args) {
        Cubo cubo1 = new Cubo(7,4,10);
        System.out.println(cubo1);
        System.out.print("\nEl volumen del cubo es: ");
        int res = cubo1.CalcularVolumen();
        System.out.println(res); 
    }
    
}
