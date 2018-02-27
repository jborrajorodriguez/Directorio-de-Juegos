package directoriodejuegos;

import com.proyecto.display.Display;
import com.proyecto.elementos.Juego;
import com.proyecto.elementos.Plataforma;
import java.util.ArrayList;
import com.proyecto.introducirdatos.IntroducirDatos;

/**
 * Clase Funciones del directorio.
 *
 * @author Juan Borrajo Rodriguez Nº5937 y Arturo Alvarellos Blas Nº6037.
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
     * Metodo añadir Plataforma
     *
     * Este metodo añade objetos de tipo plataforma a un ArrayList
     *
     * @param plataforma nombre del ArrayList
     */
    public static void añadirPlataforma(ArrayList<Plataforma> plataforma){
        String nom=IntroducirDatos.introducirString("Nombre de la plataforma");
        String tipo=IntroducirDatos.introducirString("Que tipo de consola tienes");
        String des=IntroducirDatos.introducirString("Introduce una pequeña descripción");
        int año=IntroducirDatos.introducirInt("Año de la "+nom);
        plataforma.add(new Plataforma(nom, tipo, des, año));

    }

    /**
     * Metodo mostrar Plataformas
     *
     * Este metodo muestra todas las plataformas que se encuentren en el
     * ArrayList
     *
     * @param plataforma
     */
    public static void mostrarPlataformas(ArrayList<Plataforma> plataforma){
        for(int i=0; i<plataforma.size(); i++){
            System.out.println(plataforma.get(i).toString());
        }

    }

    /**
     * Metodo buscar plataforma por año de salida
     *
     * Este metodo pide un año y ese lo compara en la coleccion para así mostrar
     * los que coincidan.
     *
     * @param plataforma
     */
    public static void buscarPlataformaAñoSalida(ArrayList<Plataforma> plataforma){
        int año=IntroducirDatos.introducirInt("Año de salida que quieres buscar");
        for(int i=0; i<plataforma.size(); i++){
            if(plataforma.get(i).getAñoDeSalida()==año){
                //System.out.println(plataforma.get(i).toString());
                Display.mostrarMensaje(plataforma.get(i).toString());

            }
        }

    }

    /**
     * Metodo buscar Plataforma por nombre.
     *
     * Este metodo muestra las plataformas que coincidan con el nombre indicado.
     *
     * @param plataforma
     */
    public static void buscarPlataformaPorNombre(ArrayList<Plataforma> plataforma){
        String nombre=IntroducirDatos.introducirString("Nombre de la Plataforma");
        for(int i=0; i<plataforma.size(); i++){
            if(plataforma.get(i).getNombre().equalsIgnoreCase(nombre)){
                //System.out.println(plataforma.get(i).toString());
                Display.mostrarMensaje(plataforma.get(i).toString());

            }
        }

    }

    /**
     * Metodo buscar Plataforma por tipo
     *
     * Este método muestra las plataformas que coincidan con el tipo indicado.
     *
     * @param plataforma
     */
    public static void buscarPlataformaPorTipo(ArrayList<Plataforma> plataforma){
        String tipo=IntroducirDatos.introducirString("Modelo de la Plataforma");
        for(int i=0; i<plataforma.size(); i++){
            if(plataforma.get(i).getTipo().equalsIgnoreCase(tipo)){
                //System.out.println(plataforma.get(i).toString());
                Display.mostrarMensaje(plataforma.get(i).toString());

            }
        }

    }

    /**
     * Metodo selecionar Plataforma.
     *
     * Este metodo mediante la introduccion de un tipo de consola devuelve un
     * objeto de tipo Plataforma.
     *
     * @param plataforma
     * @return
     */
    public static Plataforma selectPlataforma(ArrayList<Plataforma> plataforma){
        String tipo=IntroducirDatos.introducirString("Introduce un model el modelo de consola");
        int i;
        for(i=0; i<plataforma.size(); i++){
            if(plataforma.get(i).getTipo().equalsIgnoreCase(tipo)){
                return plataforma.get(i);

            }
        }
        return plataforma.get(i);

    }

    /**
     * Metodo buscar numero de jugadores.
     *
     * Este metodo compara un numero introducido con el numero de jugadores de
     * los juegos registrados.
     *
     * @param juego
     */
    public static void buscarNumJugadores(ArrayList<Juego> juego){
        int njugadores=IntroducirDatos.introducirInt("Introduce número de jugadores.");
        for(int i=0; i<juego.size(); i++){
            if(juego.get(i).getNjugadores()==njugadores){
                System.out.println(juego.get(i).toString());
            }

        }
    }

    /**
     * <<<<<<< ProyectoArturo Metodo para buscar los metodos por su año de
     * lazamiento
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

    /**
     * Metodo buscar por dlc .
     *
     * Este metodo compara un boolean introducido con el valor dlc de juegos .
     *
     * @param juego
     *
     */
    public static void buscarCoop(ArrayList<Juego> juego){
        Boolean coop=IntroducirDatos.introducirBoolean("Tiene cooperativo");
        for(int i=0; i<juego.size(); i++){
            if(juego.get(i).isCo_op()==coop){
                System.out.println(juego.get(i).toString());
            }
        }
    }

    /**
     * Método buscar por juego Terminado
     *
     * En este metodo se compara un valor boolean con el metodo isTerminado de
     * la clase Juego
     *
     * @param juego
     */
    public static void buscarPorTerminado(ArrayList<Juego> juego){

        Boolean terminado=IntroducirDatos.introducirBoolean("Tienes acabado el juego");
        if(terminado==true){
            for(int i=0; i<juego.size(); i++){
                if(juego.get(i).isTerminado()==terminado){
                    System.out.println(juego.get(i).toString());
                }
            }
        }else{
            for(int i=0; i<juego.size(); i++){
                if(juego.get(i).isTerminado()==terminado){
                    System.out.println(juego.get(i).toString());
                }

            }
        }
    }

    /**
     * Método buscar por juego con Dlc
     *
     * En este metodo se compara un valor boolean con el metodo isDlc de la
     * clase Juego
     *
     * @param juego
     */
    public static void buscarPorDLC(ArrayList<Juego> juego){

        Boolean dlc=IntroducirDatos.introducirBoolean("Tienes acabado el juego");
        if(dlc==true){
            for(int i=0; i<juego.size(); i++){
                if(juego.get(i).isDlcs()==dlc){
                    System.out.println(juego.get(i).toString());
                }
            }
        }else{
            for(int i=0; i<juego.size(); i++){
                if(juego.get(i).isDlcs()==dlc){
                    System.out.println(juego.get(i).toString());
                }

            }
        }
    }
}