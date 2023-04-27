/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_operaciones.newpackage;

import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class Operacion {
//    ATRIBUTOS
    private double num1;    //Cuando creo una clase los atributos los defino public, private o protected
    private double num2;    // con su tipo de variable
    
//    CONSTRUCTOR
    public Operacion(double num1, double num2){ //recibo los numeros como parametros
        this.num1 = num1; //defino cada numero con this porque es redundante
        this.num2 = num2;
    }
    
    public Operacion(){ // lo creas asi para cuando usas frameworks y demas evitas que genere errores 
                        // y tenes de base el constructor vacio
    }
    
//    Metodos GET y SET  --> sirven para traer cuando son privados y para setearlos
    public double getNum1(){
        return num1;
    }
    
    public void setNum1(double num1){
        this.num1 = num1;
    }
//    ------------------------------------
    public double getNum2(){
        return num2;
    }
    
    public void setNum2(double num2){
        this.num2 = num2;
    }
    
//    Metodos para crear la operacion
    
    public void crearOperacion(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        this.num1 = lector.nextInt();
        System.out.println("Ingrese el numero 2");
        this.num2 = lector.nextInt();
    }
    
//    METODOS
    public double suma(){
        double suma = num1 + num2;
        return suma;
    }
    
    public double resta(){
        return num1 - num2;
    }
    
    public double multiplicar(){
        if(num1 == 0 || num2 == 0){
            System.out.println("No se puede multiplicar por 0.");
            return 0;
        }
        return num1 * num2;
    }
    
    public double dividir(){
        if(num2==0){
            System.out.println("No se puede dividir por cero");
            return 0;
        }
        return num1/num2;
    }
}
