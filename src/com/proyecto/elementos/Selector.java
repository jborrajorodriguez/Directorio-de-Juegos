package com.proyecto.elementos;

import com.proyecto.introducirdatos.IntroducirDatos;
import directoriodejuegos.FuncionesDirectorio;

/**
 * Clase Selector
 * 
 * @author Juan Borrajo Rodriguez Nº5937 y Arturo Alvarellos Blas Nº6037.
 */
public class Selector {
    
    public static void selector(){
        int opcion;
        do{
            opcion=IntroducirDatos.introducirInt("********** Menú **********"
                    + "*-1 : Mostrar los juegos de tu directorio"
                    + "*-2 : Mostrar las plataformas de tu directorio"
                    + "*-3 : Buscar"
                    + "*-4 : Añadir juego"
                    + "*-5 : Añadir plataforma"
                    + "*-6 : Modificar terminado");
            switch(opcion){
                case 1:FuncionesDirectorio.mostrarJuegos();
                
            }
        }
        
    }

}
