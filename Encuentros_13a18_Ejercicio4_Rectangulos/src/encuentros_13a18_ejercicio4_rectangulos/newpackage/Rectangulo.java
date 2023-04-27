
package encuentros_13a18_ejercicio4_rectangulos.newpackage;

import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class Rectangulo {
//    ATRIBUTOS
    private double base;
    private double altura;
    
//    CONSTRUCTOR
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public Rectangulo(){
    }
    
//    GETTER y SETTER
    //base
    public double getBase(){
        return base;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    //altura
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
//    CREANDO RECTANGULO
    public void crearRectangulo(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la base");
        double base = lector.nextDouble();
        System.out.println("Ingrese la altura");
        double altura = lector.nextDouble();
        
        this.base = base;
        this.altura = altura;
    }
    
    //CALCULOS
    public double perimetro(){
        return (base+altura)*2;
    }
    
    public double area(){
        return base*altura;
    }
    
    //ERROR QUE MARCABA
    /*
    El error en su código se encuentra en la definición de los métodos perimetro() y area() en la clase Rectangulo. 
    Estos métodos no deben recibir parámetros ya que base y altura ya son atributos de la clase. 
    Además, al llamar a estos métodos en su método main, no les está pasando argumentos.
    */
    
    public void dibujarRectangulo (){   //como no tiene return usa void, no devuelve nada 
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
