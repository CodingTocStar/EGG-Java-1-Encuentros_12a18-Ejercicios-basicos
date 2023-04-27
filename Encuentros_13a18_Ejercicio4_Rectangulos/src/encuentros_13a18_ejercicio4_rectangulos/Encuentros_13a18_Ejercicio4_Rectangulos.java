/*
Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. 

La clase incluirá un método para crear el rectángulo con los datos del 
Rectángulo dados por el usuario. 

También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. 

Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. 

Se deberán además definir los 
métodos getters, setters y constructores correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.

 */


//=====================================================================================
// lo que hay que importar
package encuentros_13a18_ejercicio4_rectangulos;

import encuentros_13a18_ejercicio4_rectangulos.newpackage.Rectangulo;
//=====================================================================================


public class Encuentros_13a18_Ejercicio4_Rectangulos {
    
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(); //llamo a la clase rectangulo, defino la variable rectangulo
                                                                             // y creo un nuevo rectangulo
                                                                             
        rectangulo.crearRectangulo(); //de la clase rectangulo accedo con notacion de puntos al metodo crearRectangulo
        
        System.out.println("El perimetro de su rectangulo es: " + rectangulo.perimetro());
        System.out.println("El area del rectangulo es: " + rectangulo.area());
        System.out.println("SU rectangulo dibujado:");
        rectangulo.dibujarRectangulo();  //accedo a la clase rectangulo y uso el metodo dibujar rectangulo
    }
    
}
