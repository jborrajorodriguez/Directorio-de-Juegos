package directoriodejuegos;

import com.proyecto.elementos.Plataforma;
import java.util.ArrayList;
import com.proyecto.introducirdatos.IntroducirDatos;
import com.proyecto.display.Display;
import com.proyecto.elementos.Juego;
        

/**
 *Clase Funciones del directorio.
 * 
 * @author Juan Borrajo Rodriguez Nº5937 y Arturo Alvarellos Blas Nº6037.
 */
public class FuncionesDirectorio {
    
    /**
     * Metodo añadir Plataforma
     * 
     * Este metodo añade objetos de tipo plataforma a un ArrayList
     * @param plataforma nombre del ArrayList
     */
    public static void añadirPlataforma(ArrayList <Plataforma> plataforma){
        String nom=IntroducirDatos.introducirString("Nombre de la plataforma");
        String tipo=IntroducirDatos.introducirString("Que tipo de consola tienes");
        String des=IntroducirDatos.introducirString("Introduce una pequeña descripción");
        int año=IntroducirDatos.introducirInt("Año de la "+nom);
        plataforma.add(new Plataforma(nom,tipo,des,año));
        
    }
    /**
     * Metodo mostrar Plataformas
     * 
     * Este metodo muestra todas las plataformas que se encuentren en el ArrayList
     * @param plataforma 
     */
    public static void mostrarPlataformas(ArrayList <Plataforma> plataforma){
        for(int i=0;i<plataforma.size();i++){
            System.out.println(plataforma.get(i).toString());
        }
            
    }
    /**
     * Metodo buscar plataforma por año de salida
     * 
     * Este metodo pide un año y ese lo compara en la coleccion para así mostrar los que coincidan.
     * @param plataforma 
     */
    public static void buscarPlataformaAñoSalida(ArrayList <Plataforma> plataforma){
        int año=IntroducirDatos.introducirInt("Año de salida que quieres buscar");
        for(int i=0;i<plataforma.size();i++){
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
     * @param plataforma 
     */
    public static void buscarPlataformaPorNombre(ArrayList <Plataforma> plataforma){
        String nombre=IntroducirDatos.introducirString("Nombre de la Plataforma");
        for(int i=0;i<plataforma.size();i++){
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
     * @param plataforma 
     */
    public static void buscarPlataformaPorTipo(ArrayList <Plataforma> plataforma){
        String tipo=IntroducirDatos.introducirString("Modelo de la Plataforma");
        for(int i=0;i<plataforma.size();i++){
            if(plataforma.get(i).getTipo().equalsIgnoreCase(tipo)){
                //System.out.println(plataforma.get(i).toString());
                Display.mostrarMensaje(plataforma.get(i).toString());
                
            }
        }
        
    }
    
    /**
     * Metodo selecionar Plataforma.
     * 
     * Este metodo mediante la introduccion de un tipo de consola devuelve un objeto de tipo Plataforma.
     * @param plataforma
     * @return 
     */
    public static Plataforma selectPlataforma(ArrayList <Plataforma> plataforma){
        String tipo=IntroducirDatos.introducirString("Introduce un model el modelo de consola");
        int i;
        for(i=0;i<plataforma.size();i++){
            if(plataforma.get(i).getTipo().equalsIgnoreCase(tipo)){
                return plataforma.get(i);
                
            }
        }
        return plataforma.get(i);
        
    }
    /**
     * Metodo buscar numero de jugadores.
     * 
     * Este metodo compara un numero introducido con el numero de jugadores de los juegos registrados.
     * @param juego 
     */
    public static void buscarNumJugadores(ArrayList <Juego> juego){
        int njugadores=IntroducirDatos.introducirInt("Introduce número de jugadores.");
        for(int i=0;i<juego.size();i++){
            if(juego.get(i).getNjugadores()==njugadores){
                System.out.println(juego.get(i).toString());
            }
            
        }
    }
    /**
     * Metodo buscar por coop.
     * 
     * Este metodo compara un boolean introducido con el valor coop de juegos.
     * @param juego 
     */
    public static void buscarCoop(ArrayList <Juego> juego){
        Boolean coop=IntroducirDatos.introducirBoolean("Tiene cooperativo");
        for(int i=0;i<juego.size();i++){
            if(juego.get(i).isCo_op()==coop){
                System.out.println(juego.get(i).toString());
            }
        }    
    }
    
}
