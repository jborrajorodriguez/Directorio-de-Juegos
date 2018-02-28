package directoriodejuegos;

import com.proyecto.display.Display;
import com.proyecto.elementos.Juego;
import com.proyecto.elementos.Plataforma;
import java.util.ArrayList;
import com.proyecto.introducirdatos.IntroducirDatos;
import java.io.File;

/**
 * Clase Funciones del directorio.
 *
 * @author Juan Borrajo Rodriguez Nº5937 y Arturo Alvarellos Blas Nº6037.
 */
public class FuncionesDirectorio{

    private static ArrayList<Juego> juego=new ArrayList();
    private static ArrayList<Plataforma> plataforma=new ArrayList();
    private static File ficheroJuegos, ficheroPlataformas;

    /**
     * Metodo para añadir un nuevo juego
     *
     */
    public static void añadirJuego(){
        String tit=IntroducirDatos.introducirString("Titulo del juego");
        String des=IntroducirDatos.introducirString("Desarrollador del juego");
        String descr=IntroducirDatos.introducirString("Introduce una descripcion");
        Plataforma plat=null;
        int añlan=IntroducirDatos.introducirInt("Año de lanzamiento del juego");
        int njug=IntroducirDatos.introducirInt("Cuantos jugadores?");
        boolean dlc=IntroducirDatos.introducirBoolean("Tiene dlc's");
        boolean coop=IntroducirDatos.introducirBoolean("Tiene modo coperativo?");
        boolean term=IntroducirDatos.introducirBoolean("Has finalizado el juego?");
        juego.add(new Juego(tit, des, descr, plat, añlan, njug, dlc, coop, term));
    }

    public static void crearFicheros(){
        ficheroJuegos=new File("FJuegos.txt");
        ficheroPlataformas=new File("FPlataformas.txt");

    }

    public static void guardarFicheros(){

    }

    /**
     * Metodo para mostrar todos los juegos que se poseen
     *
     */
    public static void mostrarJuegos(){
        for(int i=0; i<juego.size(); i++){
            System.out.println(juego.get(i).toString());
        }
    }

    /**
     * Metodo para buscar los juegos por titulo
     *
     */
    public static void buscarTitulo(){
        String titulo=IntroducirDatos.introducirString("Titulo del juego a buscar?");
        for(int i=0; i<juego.size(); i++){
            if(titulo.equalsIgnoreCase(juego.get(i).getTitulo())){
                Display.mostrarMensaje(juego.get(i).toString());
            }
        }
    }

    /**
     * Metodo para buscar juegos por su desarrollador
     *
     */
    public static void buscarDesarrollador(){
        String desarr=IntroducirDatos.introducirString("Desarrollador del juego a buscar?");
        for(int i=0; i<juego.size(); i++){
            if(desarr.equalsIgnoreCase(juego.get(i).getDesarrollador())){
                System.out.println(juego.get(i).toString());
            }
        }
    }

    /**
     * Metodo para buscer juegos segun su plataforma
     *
     */
    public static void buscarPorPlatadorma(){
        String nombre=IntroducirDatos.introducirString("Nombre de la plataforma");
        for(int i=0; i<juego.size(); i++){
            if(nombre.equalsIgnoreCase(juego.get(i).getPlataforma().getNombre())){
                System.out.println(juego.get(i).toString());
            }
        }
    }

    /**
     * Metodo añadir Plataforma
     *
     * Este metodo añade objetos de tipo plataforma a un ArrayList
     *
     */
    public static void añadirPlataforma(){
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
     */
    public static void mostrarPlataformas(){
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
     */
    public static void buscarPlataformaAñoSalida(){
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
     */
    public static void buscarPlataformaPorNombre(){
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
     */
    public static void buscarPlataformaPorTipo(){
        String tipo=IntroducirDatos.introducirString("Modelo de la Plataforma");
        for(int i=0; i<plataforma.size(); i++){
            if(plataforma.get(i).getTipo().equalsIgnoreCase(tipo)){
                //System.out.println(plataforma.get(i).toString());
                Display.mostrarMensaje(plataforma.get(i).toString());

            }
        }

    }

    /**
     * Este metodo mediante la introduccion de un tipo de consola devuelve un
     * objeto de tipo Plataforma.
     *
     * @return Objeto de tipo plataforma
     */
    public static Plataforma selectPlataforma(){
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
     * Metodo buscar numero de jugadores. Este metodo compara un numero
     * introducido con el numero de jugadores de los juegos registrados.
     *
     */
    public static void buscarNumJugadores(){
        int njugadores=IntroducirDatos.introducirInt("Introduce número de jugadores.");
        for(int i=0; i<juego.size(); i++){
            if(juego.get(i).getNjugadores()==njugadores){
                System.out.println(juego.get(i).toString());
            }

        }
    }

    /**
     * Metodo para buscar los metodos por su año de lazamiento
     *
     */
    public static void buscarAñoLanz(){
        int año=IntroducirDatos.introducirInt("Año de lanzamiento del juego buscar?");
        for(int i=0; i<juego.size(); i++){
            if(juego.get(i).getAñoLanzamiento()==año){
                System.out.println(juego.get(i).toString());
            }
        }
    }

    /**
     * Metodo buscar por dlc . Este metodo compara un boolean introducido con el
     * valor dlc de juegos .
     *
     */
    public static void buscarCoop(){
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
     */
    public static void buscarPorTerminado(){

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
     */
    public static void buscarPorDLC(){

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

    /**
     * Metodo de modificar terminado
     *
     * Este metodo añade un valor true al atributo terminado.
     *
     */
    public static void modificarTerminado(){
        String titulo=IntroducirDatos.introducirString("Introduce el titulo del juego");
        for(int i=0; i<juego.size(); i++){
            if(juego.get(i).getTitulo().equalsIgnoreCase(titulo)){
                juego.get(i).setTerminado(true);
            }
        }

    }
}
