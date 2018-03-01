package com.proyecto.elementos;
/**
 * @author Juan Borrajo Rodriguez Nº5937 y Arturo Alvarellos Blas Nº6037.
 */
public class Plataforma {
    
   private String nombre,modelo,descripcion;
   private int añoDeSalida;

    public Plataforma() {
    }

    public Plataforma(String nombre,String tipo,String descripcion,int añoDeSalida) {
        this.nombre=nombre;
        this.modelo=tipo;
        this.descripcion=descripcion;
        this.añoDeSalida=añoDeSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo=modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion=descripcion;
    }

    public int getAñoDeSalida() {
        return añoDeSalida;
    }

    public void setAñoDeSalida(int añoDeSalida) {
        this.añoDeSalida=añoDeSalida;
    }

    @Override
    public String toString() {
        return ("Nombre : "+nombre+"\nTipo : "+modelo+"\nDescripcion : "+descripcion+"\nAño de salida : "+añoDeSalida);
    }
   
   

}
