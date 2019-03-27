package logica.sorteos;
import logica.gestores.Sorteos;

/**
 *
 * @author valem
 */

public class Loteria  extends Sorteos{

    public Loteria(String sorteo, String tipo, int codigo, int emisiones) {
        super(sorteo, tipo, codigo, emisiones);
    }
    
    void sortear() {System.out.println("Hola");    }

    
    void crear()  {System.out.println("Hola");    }

    
    void eliminar()  {System.out.println("Hola");    }

   
    Object consultar()  {return "Hola";   }

    

 
 


}
