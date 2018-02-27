package directoriodejuegos;

import com.proyecto.elementos.Juego;
import com.proyecto.elementos.Plataforma;
import java.util.ArrayList;
import com.proyecto.introducirdatos.IntroducirDatos;

/**
 *
 * @author Arturo
 */
public class FuncionesDirectorio {
    
    public static void añadirJuego(ArrayList<Juego> ju){
        String tit=IntroducirDatos.introducirString("Titulo del juego");
        String des=IntroducirDatos.introducirString("Desarrollador del juego");
        String descr=IntroducirDatos.introducirString("Introduce una descripcion");
        Plataforma Plat=null;
        int añoLanzamiento=IntroducirDatos.introducirInt("Año de lanzamiento del juego");
        int njug=IntroducirDatos.introducirInt("Cuantos jugadores?");
        boolean dlc=IntroducirDatos.introducirBoolean("Tiene dlc's"); 
        boolean coop=IntroducirDatos.introducirBoolean("Tiene modo coperativo?");
        boolean terminado=IntroducirDatos.introducirBoolean("Has finalizado el juego?");     
    }
    
}
