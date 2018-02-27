package com.proyecto.elementos;

/**
 * Clase con los datos de los juegos y sus metodos de acceso.
 *
 * @author Juan Borrajo Rodriguez Nº5937 y Arturo Alvarellos Blas Nº6037.
 */
public class Juego{

    private String titulo, desarrollador, descripcion;
    private Plataforma plataforma;
    private int añoLanzamiento, njugadores;
    private boolean dlcs, co_op, terminado;

    public Juego(){
    }

    public Juego(String titulo, String desarrollador, String descripcion, Plataforma plataforma, int añoLanzamiento, int njugadores, boolean dlcs, boolean co_op, boolean terminado){
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

    public boolean isDlcs(){
        return dlcs;
    }

    public void setDlcs(boolean dlcs){
        this.dlcs=dlcs;
    }

    public boolean isCo_op(){
        return co_op;
    }

    public void setCo_op(boolean co_op){
        this.co_op=co_op;
    }

    public boolean isTerminado(){
        return terminado;
    }

    public void setTerminado(boolean terminado){
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
