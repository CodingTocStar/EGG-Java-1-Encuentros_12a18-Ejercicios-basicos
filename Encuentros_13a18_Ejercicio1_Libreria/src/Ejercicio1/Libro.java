package Ejercicio1;

/*
ISBN
Titulo
Autor
Número de páginas
*/
public class Libro {
    //atributos
    public int ISBN;
    public String titulo;
    public String autor;
    public int numeroHojas;
    
    //Constructor
    public Libro(int ISBN, String titulo, String autor, int numeroHojas){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroHojas = numeroHojas;
    }
    
//    Metodos getter y setter
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroHojas=" + numeroHojas + '}';
    }
    
    

    
}
