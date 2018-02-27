package directoriodejuegos;

import com.proyecto.display.Display;
import com.proyecto.elementos.Juego;
import com.proyecto.elementos.Plataforma;
import java.util.ArrayList;
import com.proyecto.introducirdatos.IntroducirDatos;

/**
 *
 * @author Arturo
 */
public class FuncionesDirectorio{

    /**
     * Metodo para añadir un nuevo juego
     *
     * @param ju ArrayList con los juegos
     */
    public static void añadirJuego(ArrayList<Juego> ju){
        String tit=IntroducirDatos.introducirString("Titulo del juego");
        String des=IntroducirDatos.introducirString("Desarrollador del juego");
        String descr=IntroducirDatos.introducirString("Introduce una descripcion");
        Plataforma plat=null;
        int añlan=IntroducirDatos.introducirInt("Año de lanzamiento del juego");
        int njug=IntroducirDatos.introducirInt("Cuantos jugadores?");
        boolean dlc=IntroducirDatos.introducirBoolean("Tiene dlc's");
        boolean coop=IntroducirDatos.introducirBoolean("Tiene modo coperativo?");
        boolean term=IntroducirDatos.introducirBoolean("Has finalizado el juego?");
        ju.add(new Juego(tit, des, descr, plat, añlan, njug, dlc, coop, term));
    }

    /**
     * Metodo para mostrar todos los juegos que se poseen
     *
     * @param ju ArrayList con los juegos
     */
    public static void mostrarJuegos(ArrayList<Juego> ju){
        for(int i=0; i<ju.size(); i++){
            System.out.println(ju.get(i).toString());
        }
    }

    /**
     * Metodo para buscar los juegos por titulo
     *
     * @param ju ArrayList con los juegos
     */
    public static void buscarTitulo(ArrayList<Juego> ju){
        String titulo=IntroducirDatos.introducirString("Titulo del juego a buscar?");
        for(int i=0; i<ju.size(); i++){
            if(titulo.equalsIgnoreCase(ju.get(i).getTitulo())){
                Display.mostrarMensaje(ju.get(i).toString());
            }
        }
    }

    /**
     * Metodo para buscar juegos por su desarrollador
     *
     * @param ju ArrayList con los juegos
     */
    public static void buscarDesarrollador(ArrayList<Juego> ju){
        String desarr=IntroducirDatos.introducirString("Desarrollador del juego a buscar?");
        for(int i=0; i<ju.size(); i++){
            if(desarr.equalsIgnoreCase(ju.get(i).getDesarrollador())){
                System.out.println(ju.get(i).toString());
            }
        }
    }

    /**
     * Metodo para buscer juegos segun su plataforma
     *
     * @param ju ArrayList con los juegos
     */
    public static void buscarPorPlatadorma(ArrayList<Juego> ju){
        String nombre=IntroducirDatos.introducirString("Nombre de la plataforma");
        for(int i=0; i<ju.size(); i++){
            if(nombre.equalsIgnoreCase(ju.get(i).getPlataforma().getNombre())){
                System.out.println(ju.get(i).toString());
            }
        }
    }

    /**
     * Metodo para buscar los metodos por su año de lazamiento
     *
     * @param ju ArrayList con los juegos
     */
    public static void buscarAñoLanz(ArrayList<Juego> ju){
        int año=IntroducirDatos.introducirInt("Año de lanzamiento del juego buscar?");
        for(int i=0; i<ju.size(); i++){
            if(ju.get(i).getAñoLanzamiento()==año){
                System.out.println(ju.get(i).toString());
            }
        }
    }

}
