package com.proyecto.elementos;

import com.proyecto.introducirdatos.IntroducirDatos;
import directoriodejuegos.FuncionesDirectorio;
import com.proyecto.display.Display;

/**
 * Clase Selector
 *
 * @author Juan Borrajo Rodriguez Nº5937 y Arturo Alvarellos Blas Nº6037.
 */
public class Selector{

    //Este es el selector maestro.
    public void selector(){
        int opcion;
        FuncionesDirectorio.crearFicheros();
        do{
            opcion=IntroducirDatos.introducirInt("********** Menú **********\n\n"
                    +"*-1 : Mostrar los juegos de tu directorio\n"
                    +"*-2 : Mostrar las plataformas de tu directorio\n"
                    +"*-3 : Buscar\n"
                    +"*-4 : Añadir juego\n"
                    +"*-5 : Añadir plataforma\n"
                    +"*-6 : Modificar terminado\n"
                    +"*-0 : Salir\n\n");
            switch(opcion){
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
                    FuncionesDirectorio.guardarJuegos();
                    break;
                case 5:
                    FuncionesDirectorio.añadirPlataforma();
                    FuncionesDirectorio.guardarPlatafomas();
                    break;
                case 6:
                    FuncionesDirectorio.modificarTerminado();
                    FuncionesDirectorio.guardarFicheros();
                    break;
                case 0:
                    break;
                default:
                    Display.mostrarMensaje("Esa opcion no es correcta.");
            }
        }while(opcion!=0);

    }

    //Este es el selector de busquedas.
    public void selectorBuscar(){
        int opcion;
        do{
            opcion=IntroducirDatos.introducirInt("********** Elige la Opcion **********\n\n"
                    +"*-1 : Busqueda de Juegos\n"
                    +"*-2 : Busqueda de Plataformas\n"
                    +"*-0 : Volver al menú anterior\n\n");
            switch(opcion){
                case 1:
                    this.selectorBusquedaPorJuego();
                    break;
                case 2:
                    this.selectorBusquedaPorPlataforma();
                    break;
                case 0:
                    break;
                default:
                    Display.mostrarMensaje("Esa opcion no es correcta.");
            }
        }while(opcion!=0);

    }

    //Selector de busqueda por juegos.
    public void selectorBusquedaPorJuego(){
        int opcion;
        do{
            opcion=IntroducirDatos.introducirInt("********** Busqueda por Juego **********\n\n"
                    +"*-1 : Busqueda por Titulo\n"
                    +"*-2 : Busqueda por Desarroladora\n"
                    +"*-3 : Busqueda por Plataforma en la que se encuentra el Juego\n"
                    +"*-4 : Busqueda por Año del Lanzamiento\n"
                    +"*-5 : Busqueda por Número de jugadores\n"
                    +"*-6 : Busqueda por CO-OP\n"
                    +"*-7 : Busqueda por Juego Terminado\n"
                    +"*-8 : Busqueda por Contenido descargable\n"
                    +"*-0 : Volver al menú anterior\n\n");
            switch(opcion){
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
                case 0:
                    break;
                default:
                    Display.mostrarMensaje("Esa opcion no es correcta.");
            }
        }while(opcion!=0);
    }

    //Selector de busqueda por plataforma.
    public void selectorBusquedaPorPlataforma(){
        int opcion;
        do{
            opcion=IntroducirDatos.introducirInt("********** Busqueda por Plataforma **********\n\n"
                    +"*-1 : Busqueda por Nombre\n"
                    +"*-2 : Busqueda por Año de Salida\n"
                    +"*-3 : Busqueda por Modelo de plataforma\n"
                    +"*-0 : Volver al menú anterior\n\n");
            switch(opcion){
                case 1:
                    FuncionesDirectorio.buscarPlataformaPorNombre();
                    break;
                case 2:
                    FuncionesDirectorio.buscarPlataformaAñoSalida();
                    break;
                case 3:
                    FuncionesDirectorio.buscarPlataformaPorModelo();
                    break;
                case 0:
                    break;
                default:
                    Display.mostrarMensaje("Esa opcion no es correcta.");
            }
        }while(opcion!=0);
    }

}
