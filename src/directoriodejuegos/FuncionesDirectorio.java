package directoriodejuegos;

import com.proyecto.display.Display;
import com.proyecto.elementos.Juego;
import com.proyecto.elementos.Plataforma;
import java.util.ArrayList;
import com.proyecto.introducirdatos.IntroducirDatos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Clase Funciones del directorio.
 *
 * @author Juan Borrajo Rodriguez Nº5937 y Arturo Alvarellos Blas Nº6037.
 */
public class FuncionesDirectorio{

    private static ArrayList<Juego> juegos=new ArrayList();
    private static ArrayList<Plataforma> plataformas=new ArrayList();
    private static File ficheroJuegos, ficheroPlataformas;
    private static PrintWriter escribir;
    private static Scanner sc;
    private static Juego juego;
    private static Plataforma plataforma;

    /**
     * Metodo para añadir un nuevo juego
     *
     */
    public static void añadirJuego(){
        String tit=IntroducirDatos.introducirString("Titulo del juego");
        String des=IntroducirDatos.introducirString("Desarrollador del juego");
        String descr=IntroducirDatos.introducirString("Introduce una descripcion");
        Plataforma plat=FuncionesDirectorio.selectPlataforma();
        int añlan=IntroducirDatos.introducirInt("Año de lanzamiento del juego");
        int njug=IntroducirDatos.introducirInt("Cuantos jugadores?");
        String dlc=IntroducirDatos.introducirString("Tiene dlc's");
        String coop=IntroducirDatos.introducirString("Tiene modo coperativo?");
        String term=IntroducirDatos.introducirString("Has finalizado el juego?");
        juegos.add(new Juego(tit, des, descr, plat, añlan, njug, dlc, coop, term));
    }

    /**
     * Metodo para comprobar que existen los ficheros y leer de ellos al inicio
     * del programa o crearlos si no existen
     *
     */
    public static void crearFicheros(){
        ficheroJuegos=new File("FJuegos.txt");
        ficheroPlataformas=new File("FPlataformas.txt");
        if(ficheroPlataformas.exists()){
            String linea;
            String[] lista=new String[4];
            Plataforma pla;
            try{
                sc=new Scanner(new File("FPlataformas.txt"));
                while(sc.hasNextLine()){
                    linea=sc.nextLine();
                    lista=linea.split(",");
                    pla=new Plataforma(lista[0], lista[1], lista[2], Integer.parseInt(lista[3]));
                    plataformas.add(pla);
                }
            }catch(FileNotFoundException ex){
                System.out.println("Erro 1 "+ex.getMessage());
            }catch(NullPointerException ex){
                System.out.println("Erro 2 "+ex.getMessage()+"\nNo se puede leer de un fichero vacio");
            }
            sc.close();
        }else{
            FuncionesDirectorio.añadirPlataforma();
            FuncionesDirectorio.guardarPlatafomas();
        }
        if(ficheroJuegos.exists()){
            String linea;
            String[] lista=new String[12];
            Juego jug;
            Plataforma pl;
            try{
                sc=new Scanner(new File("FJuegos.txt"));
                while(sc.hasNextLine()){
                    linea=sc.nextLine();
                    lista=linea.split(",");
                    pl=new Plataforma(lista[3], lista[4], lista[5], Integer.parseInt(lista[6]));
                    jug=new Juego(lista[0], lista[1], lista[2], pl , Integer.parseInt(lista[7]), Integer.parseInt(lista[8]), lista[9], lista[10], lista[11]);
                    juegos.add(jug);
                }
            }catch(FileNotFoundException ex){
                System.out.println("Erro 1 "+ex.getMessage());
            }catch(NullPointerException ex){
                System.out.println("Erro 2 "+ex.getMessage()+"\nNo se puede leer de un fichero vacio");
            }
            sc.close();
        }else{
            FuncionesDirectorio.añadirJuego();
            FuncionesDirectorio.guardarJuegos();
        }

    }

    /**
     * Metodo para guardar la informacion en los ficheros
     *
     */
    public static void guardarFicheros(){
        ficheroPlataformas=new File("FPlataformas.txt");
        try{
            escribir=new PrintWriter(ficheroPlataformas);
            for(int i=0; i<plataformas.size(); i++){
                plataforma=plataformas.get(i);
                escribir.println(plataforma.getNombre()+","+plataforma.getModelo()+","+plataforma.getDescripcion()+","+plataforma.getAñoDeSalida());
            }
        }catch(FileNotFoundException ex){
            System.out.println("Erro 1 "+ex.getMessage());
        }catch(NullPointerException ex){
            System.out.println("Erro 2 "+ex.getMessage()+"\nNo se puede leer de un fichero vacio");
        }finally{
            escribir.close();
        }
        ficheroJuegos=new File("FJuegos.txt");
        try{
            escribir=new PrintWriter(ficheroJuegos);
            for(int i=0; i<juegos.size(); i++){
                juego=juegos.get(i);
                escribir.println(juego.getTitulo()+","+juego.getDesarrollador()+","+juego.getDescripcion()+","+juego.getPlataforma().getNombre()
                        +","+juego.getPlataforma().getModelo()+","+juego.getPlataforma().getDescripcion()+","+juego.getPlataforma().getAñoDeSalida()
                        +","+juego.getAñoLanzamiento()+","+juego.getNjugadores()+","+juego.getDlcs()+","+juego.getCo_op()+","+juego.getTerminado());
            }
        }catch(FileNotFoundException ex){
            System.out.println("Erro 1 "+ex.getMessage());
        }catch(NullPointerException ex){
            System.out.println("Erro 2 "+ex.getMessage()+"\nNo se puede leer de un fichero vacio");
        }finally{
            escribir.close();
        }
    }

    /**
     * Metodo para guardar la informacion de las plataformas en el fichero
     *
     */
    public static void guardarPlatafomas(){
        ficheroPlataformas=new File("FPlataformas.txt");
        try{
            escribir=new PrintWriter(ficheroPlataformas);
            for(int i=0; i<plataformas.size(); i++){
                plataforma=plataformas.get(i);
                escribir.println(plataforma.getNombre()+","+plataforma.getModelo()+","+plataforma.getDescripcion()+","+plataforma.getAñoDeSalida());
            }
        }catch(FileNotFoundException ex){
            System.out.println("Erro 1 "+ex.getMessage());
        }catch(NullPointerException ex){
            System.out.println("Erro 2 "+ex.getMessage()+"\nNo se puede leer de un fichero vacio");
        }finally{
            escribir.close();
        }
    }

    /**
     * Metodo para guardar la informacion de los juegos en el fichero
     *
     */
    public static void guardarJuegos(){
        ficheroJuegos=new File("FJuegos.txt");
        try{
            escribir=new PrintWriter(ficheroJuegos);
            for(int i=0; i<juegos.size(); i++){
                juego=juegos.get(i);
                escribir.println(juego.getTitulo()+","+juego.getDesarrollador()+","+juego.getDescripcion()+","+juego.getPlataforma().getNombre()
                        +","+juego.getPlataforma().getModelo()+","+juego.getPlataforma().getDescripcion()+","+juego.getPlataforma().getAñoDeSalida()
                        +","+juego.getAñoLanzamiento()+","+juego.getNjugadores()+","+juego.getDlcs()+","+juego.getCo_op()+","+juego.getTerminado());
            }
        }catch(FileNotFoundException ex){
            System.out.println("Erro 1 "+ex.getMessage());
        }catch(NullPointerException ex){
            System.out.println("Erro 2 "+ex.getMessage()+"\nNo se puede leer de un fichero vacio");
        }finally{
            escribir.close();
        }
    }

    /**
     * Metodo para mostrar todos los juegos que se poseen
     *
     */
    public static String mostrarJuegos(){
        String valor="";
        for(int i=0; i<juegos.size(); i++){
           valor=valor+"\n"+juegos.get(i).getTitulo()+": Desarrollador : "+juegos.get(i).getDesarrollador()+" Plataforma : "+juegos.get(i).getPlataforma().getNombre()+"\n";
        }return valor;
    }

    /**
     * Metodo para buscar los juegos por titulo
     *
     */
    public static String buscarTitulo(){
        String respuesta=" ";
        String titulo=IntroducirDatos.introducirString("Titulo del juego a buscar?");
        for(int i=0; i<juegos.size(); i++){
            if(titulo.equalsIgnoreCase(juegos.get(i).getTitulo())){
                //Display.mostrarMensaje(juegos.get(i).toString()+"\n");
                respuesta=juegos.get(i).toString()+"\n";
            }
        }return respuesta;
    }

    /**
     * Metodo para buscar juegos por su desarrollador
     *
     */
    public static String buscarDesarrollador(){
        String desarrolla=" ";
        String desarr=IntroducirDatos.introducirString("Desarrollador del juego a buscar?");
        for(int i=0; i<juegos.size(); i++){
            if(desarr.equalsIgnoreCase(juegos.get(i).getDesarrollador())){
                System.out.println(juegos.get(i).toString()+"\n");
                desarrolla=desarrolla+"\n"+juegos.get(i).toString()+"\n";
            }
        }return desarrolla;
    }

    /**
     * Metodo para buscer juegos segun su plataforma
     *
     */
    public static String buscarPorPlatadorma(){
        String plata=" ";
        String nombre=IntroducirDatos.introducirString("Nombre de la plataforma");
        for(int i=0; i<juegos.size(); i++){
            if(nombre.equalsIgnoreCase(juegos.get(i).getPlataforma().getNombre())){
                System.out.println(juegos.get(i).toString()+"\n");
                plata=plata+"\n"+juegos.get(i).toString()+"\n";
            }
        }return plata;
    }

    /**
     * Metodo añadir Plataforma
     *
     * Este metodo añade objetos de tipo plataforma a un ArrayList
     *
     */
    public static void añadirPlataforma(){
        String nom=IntroducirDatos.introducirString("Nombre de la plataforma");
        String modelo=IntroducirDatos.introducirString("Que Modelo de consola tienes");
        String des=IntroducirDatos.introducirString("Introduce una pequeña descripción");
        int año=IntroducirDatos.introducirInt("Año de la "+nom);
        plataformas.add(new Plataforma(nom, modelo, des, año));

    }

    /**
     * Metodo mostrar Plataformas
     *
     * Este metodo muestra todas las plataformas que se encuentren en el
     * ArrayList
     *
     */
    public static String mostrarPlataformas(){
        String valor="";
        for(int i=0; i<plataformas.size(); i++){
            valor=valor+"\n"+"Nombre : "+plataformas.get(i).getNombre()+" "+plataformas.get(i).getModelo()+"\n";
        }return valor;

    }

    /**
     * Metodo buscar plataforma por año de salida
     *
     * Este metodo pide un año y ese lo compara en la coleccion para así mostrar
     * los que coincidan.
     *
     */
    public static String buscarPlataformaAñoSalida(){
        String respuesta=" ";
        int año=IntroducirDatos.introducirInt("Año de salida que quieres buscar");
        for(int i=0; i<plataformas.size(); i++){
            if(plataformas.get(i).getAñoDeSalida()==año){
                //System.out.println(plataforma.get(i).toString());
                System.out.println(plataformas.get(i).toString()+"\n");
                respuesta=respuesta+plataformas.get(i).toString()+"\n";
            }
        }return respuesta;

    }

    /**
     * Metodo buscar Plataforma por nombre.
     *
     * Este metodo muestra las plataformas que coincidan con el nombre indicado.
     *
     */
    public static String buscarPlataformaPorNombre(){
        String respuesta=" ";
        String nombre=IntroducirDatos.introducirString("Nombre de la Plataforma");
        for(int i=0; i<plataformas.size(); i++){
            if(plataformas.get(i).getNombre().equalsIgnoreCase(nombre)){
                //System.out.println(plataforma.get(i).toString());
                //Display.mostrarMensaje(plataformas.get(i).toString()+"\n");
                respuesta=respuesta+plataformas.get(i).toString()+"\n";
            }
        }return respuesta;

    }

    /**
     * Metodo buscar Plataforma por tipo
     *
     * Este método muestra las plataformas que coincidan con el tipo indicado.
     *
     */
    public static String buscarPlataformaPorModelo(){
        String respuesta=" ";
        String tipo=IntroducirDatos.introducirString("Modelo de la Plataforma");
        for(int i=0; i<plataformas.size(); i++){
            if(plataformas.get(i).getModelo().equalsIgnoreCase(tipo)){
                //System.out.println(plataforma.get(i).toString());
                //Display.mostrarMensaje(plataformas.get(i).toString()+"\n");
                respuesta=respuesta+plataformas.get(i).toString()+"\n";
            }
        }return respuesta;

    }

    /**
     * Este metodo mediante la introduccion de un tipo de consola devuelve un
     * objeto de tipo Plataforma.
     *
     * @return Objeto de tipo plataforma
     */
    public static Plataforma selectPlataforma(){
        String tipo=IntroducirDatos.introducirString("Introduce el Modelo de consola");
        int i;
        for(i=0; i<plataformas.size(); i++){
            if(plataformas.get(i).getModelo().equalsIgnoreCase(tipo)){
                return plataformas.get(i);

            }
        }
        return plataformas.get(i);

    }

    /**
     * Metodo buscar numero de jugadores.
     * 
     * Este metodo compara un numero
     * introducido con el numero de jugadores de los juegos registrados.
     *
     */
    public static String buscarNumJugadores(){
        String respuesta=" ";
        int njugadores=IntroducirDatos.introducirInt("Introduce número de jugadores.");
        for(int i=0; i<juegos.size(); i++){
            if(juegos.get(i).getNjugadores()==njugadores){
                System.out.println(juegos.get(i).toString()+"\n");
                respuesta=juegos.get(i).toString()+"\n";
            }

        }return respuesta;
    }

    /**
     * Metodo para buscar los metodos por su año de lazamiento
     *
     */
    public static String buscarAñoLanz(){
        String respuesta=" ";
        int año=IntroducirDatos.introducirInt("Año de lanzamiento del juego buscar?");
        for(int i=0; i<juegos.size(); i++){
            if(juegos.get(i).getAñoLanzamiento()==año){
                System.out.println(juegos.get(i).toString()+"\n");
                respuesta=juegos.get(i).toString()+"\n";
            }
        }return respuesta;
    }

    /**
     * Metodo buscar por dlc.
     * 
     * Este metodo compara un boolean introducido con el
     * valor dlc de juegos .
     *
     */
    public static String buscarCoop(){
        String respuesta=" ";
        String coop=IntroducirDatos.introducirString("Tiene cooperativo?");
        for(int i=0; i<juegos.size(); i++){
            if(juegos.get(i).getCo_op()==coop){
                System.out.println(juegos.get(i).toString()+"\n");
                respuesta=juegos.get(i).toString()+"\n";
            }
        }return respuesta;
    }

    /**
     * Método buscar por juego Terminado
     *
     * En este metodo se compara un valor boolean con el metodo isTerminado de
     * la clase Juego
     *
     */
    public static String buscarPorTerminado(){
        String respuesta=" ";
        String terminado=IntroducirDatos.introducirString("Tienes acabado el juego?");
        if(terminado.equalsIgnoreCase("Si")){
            for(int i=0; i<juegos.size(); i++){
                if(juegos.get(i).getTerminado().equalsIgnoreCase(terminado)){
                    System.out.println(juegos.get(i).toString()+"\n");
                    respuesta=juegos.get(i).toString()+"\n";
                }
            }
        }else{
            for(int i=0; i<juegos.size(); i++){
                if(juegos.get(i).getTerminado().equalsIgnoreCase(terminado)){
                    System.out.println(juegos.get(i).toString()+"\n");
                    respuesta=juegos.get(i).toString()+"\n";
                }

            }
        }return respuesta;
    }

    /**
     * Método buscar por juego con Dlc
     *
     * En este metodo se compara un valor boolean con el metodo isDlc de la
     * clase Juego
     *
     */
    public static String buscarPorDLC(){
        String respuesta=" ";
        String dlc=IntroducirDatos.introducirString("El juego tiene Dlc?");
        if(dlc.equalsIgnoreCase("Si")){
            for(int i=0; i<juegos.size(); i++){
                if(juegos.get(i).getDlcs().equalsIgnoreCase(dlc)){
                    System.out.println(juegos.get(i).toString()+"\n");
                    respuesta=juegos.get(i).toString()+"\n";
                }
            }
        }else{
            for(int i=0; i<juegos.size(); i++){
                if(juegos.get(i).getDlcs().equalsIgnoreCase(dlc)){
                    System.out.println(juegos.get(i).toString()+"\n");
                    respuesta=juegos.get(i).toString()+"\n";
                }

            }
        }return respuesta;
    }

    /**
     * Metodo de modificar terminado
     *
     * Este metodo añade un valor true al atributo terminado.
     *
     */
    public static void modificarTerminado(){
        String titulo=IntroducirDatos.introducirString("Introduce el titulo del juego");
        for(int i=0; i<juegos.size(); i++){
            if(juegos.get(i).getTitulo().equalsIgnoreCase(titulo)){
                juegos.get(i).setTerminado("si");

            }
        }

    }
}
