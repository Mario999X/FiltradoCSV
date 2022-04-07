package utils;

import model.Accidente;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UtilCSV {

    private final static String CSV_FILE = "data/accidents.csv";
    private final static String WORKING_DIRECTORY = System.getProperty("user.dir");
    private static UtilCSV instance;

    private UtilCSV(){
    }

    public static UtilCSV getInstance(){
        if (instance == null){
            instance = new UtilCSV();
        }
        return instance;
    }

    public List<Accidente> getAccidentes() throws IOException{
        Path path = Paths.get(WORKING_DIRECTORY + File.separator + CSV_FILE);
        Stream<String> lineas = Files.lines(path, StandardCharsets.UTF_8);
        return lineas.skip(1).parallel().map(this::parse).collect(Collectors.toList());
    }

    private Accidente parse(String linea){
        String[] datos = linea.split(";");
        Accidente acc = new Accidente();
        acc.setNumExp(datos[0]);
        acc.setFecha(datos[1]);
        acc.setHora(datos[2]);
        acc.setLocalizacion(datos[3]);
        acc.setNumero(datos[4]);
        acc.setCodDistrito(datos[5]);
        acc.setDistrito(datos[6]);
        acc.setTipoAccidente(datos[7]);
        acc.setEstadoMetereologico(datos[8]);
        acc.setTipoVehiculo(datos[9]);
        acc.setTipoPersona(datos[10]);
        acc.setRangoEdad(datos[11]);
        acc.setSexo(datos[12]);
        acc.setCodLesividad(datos[13]);
        acc.setLesividad(datos[14]);
        acc.setCoordenadaX(datos[15]);
        acc.setCoordenadaY(datos[16]);
        acc.setPositivoAlcohol(datos[17]);
        acc.setPositivoDroga(datos[18]);
        return acc;
    }

}
