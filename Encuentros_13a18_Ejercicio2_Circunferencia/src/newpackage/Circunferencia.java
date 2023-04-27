/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

public class Circunferencia {
    //atributos
    private double Radio;

//    Constructor
    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }
// Getter
    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    
//    metodos
//    Usas void cuando no devolves nada
    public void crearCircunferencia(){
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el radio;");
        Radio = lector.nextDouble();
    }
    
//    usas return porque devuelven un valor
    public double area(){ 
        return Math.PI * Math.pow(Radio,2);
    }
    
    public double perimetro(){
        return 2* Math.PI * Radio;
    }
}
