/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentros_13a18_ejercicio2_circunferencia;

import newpackage.Circunferencia;

/*
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).

*/
public class Ejercicio2 {

    public static void main(String[] args) {
        Circunferencia circunferencia1 = new Circunferencia(0);
        
        circunferencia1.crearCircunferencia();
        System.out.println("El area de la circunferencia es: " + circunferencia1.area());
        
        System.out.println("El perimetro es: " + circunferencia1.perimetro());
    }   
    

}
