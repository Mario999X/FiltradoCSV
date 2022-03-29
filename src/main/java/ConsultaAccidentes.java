import model.Accidente;
import utils.Util;

import java.util.List;
import java.util.stream.Stream;

public class ConsultaAccidentes {

    List<Accidente> accidentes;

    public ConsultaAccidentes(){
        // Cargamos la lista de accidentes
        try {
            accidentes = Util.getAccidentes();
            procesarStreams();
        } catch (Exception e){
            System.err.println("Error al leer el fichero de accidentes: " + e.getMessage());
        }
    }

    private void procesarStreams(){
        //accidentesLeganes();
        todosAccidentes();
    }

    private void todosAccidentes() {
        // Creamos el flujo
        // Equivale a selec * from products
        System.out.println("Todos los productos");
        Stream<Accidente> s = accidentes.stream(); //flujo de elementos Product
        s.forEach(a -> System.out.println(a)); // imprime la lista de productos
        // productStream.forEach(System.out::println); esta linea es equivalente a la anterior
        System.out.println();
    }

    /*
    private void accidentesLeganes(){
        System.out.println("--- Nº de accidentes ocurridos en Leganés ---");
        Stream<Accidente> s = accidentes.stream().filter(a -> a.getDistrito().equals("LEGANÉS"));
        s.forEach(accidente -> System.out.println(s.count()));
    }

     */

}
