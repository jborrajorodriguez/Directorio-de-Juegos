package directoriodejuegos;

import com.proyecto.elementos.Plataforma;
import java.util.ArrayList;
import com.proyecto.introducirdatos.IntroducirDatos;
        

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
    public void añadirPlataforma(ArrayList <Plataforma> plataforma){
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
    public void mostrarPlataformas(ArrayList <Plataforma> plataforma){
        for(int i=0;i<plataforma.size();i++){
            System.out.println(plataforma.get(i).toString());
        }
            
    }
    
}
