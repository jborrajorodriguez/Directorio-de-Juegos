package com.proyecto.elementos;

import com.proyecto.introducirdatos.IntroducirDatos;
import directoriodejuegos.FuncionesDirectorio;
import com.proyecto.display.Display;

/**
 * Clase Selector
 *
 * @author Juan Borrajo Rodriguez Nº5937 y Arturo Alvarellos Blas Nº6037.
 */
public class Selector {

    //Este es el selector maestro.
    public void selector() {
        int opcion;
        do {
            opcion=IntroducirDatos.introducirInt("********** Menú **********\n\n"
                    +"*-1 : Mostrar los juegos de tu directorio\n"
                    +"*-2 : Mostrar las plataformas de tu directorio\n"
                    +"*-3 : Buscar\n"
                    +"*-4 : Añadir juego\n"
                    +"*-5 : Añadir plataforma\n"
                    +"*-6 : Modificar terminado\n\n");
            switch (opcion) {
                case 1:
                    FuncionesDirectorio.mostrarJuegos();
                    break;
                case 2:
                    FuncionesDirectorio.mostrarPlataformas();
                    break;
                case 3:
                    this.selectorBuscar();
                    break;
                case 4:
                    FuncionesDirectorio.añadirJuego();
                    break;
                case 5:
                    FuncionesDirectorio.añadirPlataforma();
                    break;
                case 6:
                    FuncionesDirectorio.modificarTerminado();
                    break;
                default:
                    Display.mostrarMensaje("Esa opcion no es correcta.");
            }
        }
        while (opcion!=0);

    }

    //Este es el selector de busquedas.
    public void selectorBuscar() {
        int opcion;
        do {
            opcion=IntroducirDatos.introducirInt("********** Elige la Opcion **********\n\n"
                    +"*-1 : Busqueda por Juegos\n"
                    +"*-2 : Busqueda por Plataformas\n\n");
            switch (opcion) {
                case 1:
                    this.selectorBusquedaPorJuego();
                    break;
                case 2:
                    this.selectorBusquedaPorPlataforma();
                    break;

                default:
                    Display.mostrarMensaje("Esa opcion no es correcta.");
            }
        }
        while (opcion!=0);

    }
    //Selector de busqueda por juegos.
    public void selectorBusquedaPorJuego() {
        int opcion;
        do {
            opcion=IntroducirDatos.introducirInt("********** Busqueda por Juego **********\n\n"
                    +"*-1 : Busqueda por Titulo\n"
                    +"*-2 : Busqueda por Desarroladora\n"
                    +"*-3 : Busqueda por Plataforma en la que se encuentra el Juego\n"
                    +"*-4 : Busqueda por Año del Lanzamiento\n"
                    +"*-5 : Busqueda por Número de jugadores\n"
                    +"*-6 : Busqueda por CO-OP\n"
                    +"*-7 : Busqueda por Juego Terminado\n"
                    +"*-8 : Busqueda por Contenido descargable\n\n");
            switch (opcion) {
                case 1:
                    FuncionesDirectorio.buscarTitulo();
                    break;
                case 2:
                    FuncionesDirectorio.buscarDesarrollador();
                    break;
                case 3:
                    FuncionesDirectorio.buscarPorPlatadorma();
                    break;
                case 4:
                    FuncionesDirectorio.buscarAñoLanz();
                    break;
                case 5:
                    FuncionesDirectorio.buscarNumJugadores();
                    break;
                case 6:
                    FuncionesDirectorio.buscarCoop();
                    break;
                case 7:
                    FuncionesDirectorio.buscarPorTerminado();
                    break;
                case 8:
                    FuncionesDirectorio.buscarPorDLC();
                    break;

                default:
                    Display.mostrarMensaje("Esa opcion no es correcta.");
            }
        }
        while (opcion!=0);
    }
    //Selector de busqueda por plataforma.
    public void selectorBusquedaPorPlataforma(){
        int opcion;
        do {
            opcion=IntroducirDatos.introducirInt("********** Busqueda por Plataforma **********\n\n"
                    +"*-1 : Busqueda por Nombre\n"
                    +"*-2 : Busqueda por Año de Salida"
                    +"*-3 : Busqueda por Modelo de plataforma\n\n");
            switch (opcion) {
                case 1:FuncionesDirectorio.buscarPlataformaPorNombre();
                    break;
                case 2:FuncionesDirectorio.buscarPlataformaAñoSalida();
                    break;
                case 3:FuncionesDirectorio.buscarPlataformaPorTipo();
                    break;    

                default:
                    Display.mostrarMensaje("Esa opcion no es correcta.");
            }
        }
        while (opcion!=0);
    }
    
    

}
