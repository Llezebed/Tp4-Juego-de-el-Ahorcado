/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controladorlibro;


import aplicacio.modelo.dominioLibro.Libro;
import aplicacio.modelo.dominioLibro.ListaLibros;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author 09
 */
@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable{
    private Libro unLibro;
    private ListaLibros listaLibros;
    private String ISBN;
    private String titulo;
    private String autor;
    private double precio;
    
    public LibroFormBean(){
        listaLibros = new ListaLibros();
    }
    public void guardarLibro(){
        unLibro = new Libro (getISBN(),getTitulo(),getAutor(),getPrecio());
        getListaLibros().getListadoLibros().add(getUnLibro());
     
    }
    

    
    public ListaLibros getListaLibros() {
        return listaLibros;
    }

    
    public void setListaLibros(ListaLibros listaLibros) {
        this.listaLibros = listaLibros;
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
     * @return the unLibro
     */
    public Libro getUnLibro() {
        return unLibro;
    }

    /**
     * @param unLibro the unLibro to set
     */
    public void setUnLibro(Libro unLibro) {
        this.unLibro = unLibro;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}