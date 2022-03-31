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
            procesarStreamsBasicos();
        } catch (Exception e){
            System.err.println("Error al leer el fichero de accidentes: " + e.getMessage());
        }
    }

    private void procesarStreamsBasicos(){
        //todosAccidentes();
        totalAccidentes();
        accidentesFechaExacta();
        accidentesSegunGenero();
        accidentesConBus();
        accidentesMultiple();
        accidentesMortales();

    }

    private void todosAccidentes() {
        // Creamos el flujo
        // Equivale a selec * from accidents
        System.out.println("Todos los accidentes");
        Stream<Accidente> s = accidentes.stream(); //flujo de elementos Accidente
        s.forEach(System.out::println); // imprime la lista de accidentes
        // accidentesStream.forEach(System.out::println); esta linea es equivalente a la anterior
        System.out.println();
    }

    private void totalAccidentes(){
        System.out.println("--- TOTAL ACCIDENTES ---");
        Stream<Accidente> s = accidentes.stream();
        System.out.println(s.count());
    }

   private void accidentesFechaExacta(){
        final String fecha = "20/12/2021";
        System.out.println("--- Num de Accidentes en fecha exacta: "+ fecha +" ---");
        Stream<Accidente> s = accidentes.stream().filter(p -> p.getFecha().equals(fecha));
        System.out.println(s.count());
   }

   private void accidentesSegunGenero(){
       System.out.println("--- Num de accidentes según el género ---");
       Stream<Accidente> s = accidentes.stream();
       Stream<Accidente> o = accidentes.stream();
       Stream<Accidente> q = accidentes.stream();
       System.out.println("- Num hombres: " + s.filter(p -> p.getSexo().equalsIgnoreCase("Hombre")).count());
       System.out.println("- Num mujeres: " + o.filter(p -> p.getSexo().equalsIgnoreCase("Mujer")).count());
       System.out.println("- Num desconocido: " + q.filter(p -> p.getSexo().equalsIgnoreCase("Desconocido")).count());
   }

   private void accidentesConBus(){
       System.out.println("--- Num de accidentes con intervención de buses ---");
       Stream<Accidente> s = accidentes.stream().filter(p -> p.getTipoVehiculo().equalsIgnoreCase("autobús"));
       System.out.println(s.count());
   }

   private void accidentesMultiple(){
       System.out.println("--- Num de accidentes a la vez en una localización específica y misma fecha/hora ---");

       Stream<Accidente> s = accidentes.stream().filter(p -> p.getDistrito().equalsIgnoreCase("puente de vallecas")
               && p.getFecha().equals("01/01/2021") && p.getHora().equals("4:30:00"));
       System.out.println(s.count());
   }

   private void accidentesMortales(){
       System.out.println("--- Num de accidentes con fallecido ---");
       Stream<Accidente> s = accidentes.stream().filter(p -> p.getLesividad().equalsIgnoreCase("null"));
       System.out.println(s.count());
   }

}
