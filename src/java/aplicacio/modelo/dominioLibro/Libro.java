/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacio.modelo.dominioLibro;

/**
 *
 * @author 09
 */
public class Libro {
     //ISBN, título, autor y precio
    private String ISBN;
    private String Titulo;
    private String Autor;
    private double Precio;
    public Libro(){
        
    }
    public Libro(String isbn, String titulo, String autor, double precio){
        this.ISBN = isbn;
        this.Titulo = titulo;
        this.Autor = autor;
        this.Precio = precio;
    }
    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Autor
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /**
     * @return the Precio
     */
    public double getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
}
