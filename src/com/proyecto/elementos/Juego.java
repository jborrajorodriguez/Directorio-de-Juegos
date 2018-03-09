package com.proyecto.elementos;

/**
 * Clase con los datos de los juegos y sus metodos de acceso.
 *
 * @author Juan Borrajo Rodriguez Nº5937 y Arturo Alvarellos Blas Nº6037.
 */
public class Juego{

    private String titulo;
    private String desarrollador;
    private String descripcion;
    private Plataforma plataforma;
    private int añoLanzamiento; 
    private int njugadores;
    private String dlcs, co_op, terminado;

    public Juego(){
    }

    public Juego(String titulo, String desarrollador, String descripcion, Plataforma plataforma, int añoLanzamiento, int njugadores, String dlcs, String co_op, String terminado){
        this.titulo=titulo;
        this.desarrollador=desarrollador;
        this.descripcion=descripcion;
        this.plataforma=plataforma;
        this.añoLanzamiento=añoLanzamiento;
        this.njugadores=njugadores;
        this.dlcs=dlcs;
        this.co_op=co_op;
        this.terminado=terminado;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getDesarrollador(){
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador){
        this.desarrollador=desarrollador;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

    public Plataforma getPlataforma(){
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma){
        this.plataforma=plataforma;
    }

    public String getDlcs(){
        return dlcs;
    }

    public void setDlcs(String dlcs){
        this.dlcs=dlcs;
    }

    public String getCo_op(){
        return co_op;
    }

    public void setCo_op(String co_op){
        this.co_op=co_op;
    }

    public String getTerminado(){
        return terminado;
    }

    public void setTerminado(String terminado){
        this.terminado=terminado;
    }

    public int getAñoLanzamiento(){
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento){
        this.añoLanzamiento=añoLanzamiento;
    }

    public int getNjugadores(){
        return njugadores;
    }

    public void setNjugadores(int njugadores){
        this.njugadores=njugadores;
    }

    @Override
    public String toString(){
        return ("Titulo: "+titulo+"\nDesarrollador: "+desarrollador+"\nDescripción: "+descripcion+"\nPlataforma: "+plataforma
                +"\nAño de Lanzamiento: "+añoLanzamiento+"\nNº jugadores: "+njugadores+"\nDLC's: "+dlcs+"\nCooperativo: "+co_op
                +"\nTerminado: "+terminado);
    }
}
