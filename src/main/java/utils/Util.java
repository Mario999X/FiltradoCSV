package utils;

import model.Accidente;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Util {

    public static List<Accidente> getAccidentes() throws IOException {

        String DATA_FILE = "accidents.csv";
        String WORKING_DIRECTORY = System.getProperty("user.dir");
        Path path = Paths.get(WORKING_DIRECTORY + File.separator + "data" + File.separator + DATA_FILE);
        final List<String> lines = Files.readAllLines(Paths.get("data/accidents.csv"), StandardCharsets.UTF_8);

        List<Accidente> accidentes = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++){
            StringTokenizer tokenizer = new StringTokenizer(lines.get(i), ";");
            Accidente accidente = new Accidente();
            accidente.setNumExp(tokenizer.nextToken());
            accidente.setFecha(tokenizer.nextToken());
            accidente.setHora(tokenizer.nextToken());
            accidente.setLocalizacion(tokenizer.nextToken());
            accidente.setNumero(tokenizer.nextToken());
            accidente.setCodDistrito(tokenizer.nextToken());
            accidente.setDistrito(tokenizer.nextToken());
            accidente.setTipoAccidente(tokenizer.nextToken());
            accidente.setEstadoMetereologico(tokenizer.nextToken());
            accidente.setTipoVehiculo(tokenizer.nextToken());
            accidente.setTipoPersona(tokenizer.nextToken());
            accidente.setRangoEdad(tokenizer.nextToken());
            accidente.setSexo(tokenizer.nextToken());
            accidente.setCodLesividad(tokenizer.nextToken());
            accidente.setLesividad(tokenizer.nextToken());
            accidente.setCoordenadaX(tokenizer.nextToken().replace(",", "."));
            accidente.setCoordenadaY(tokenizer.nextToken().replace(",", "."));
            //accidente.setPositivoAlcohol(tokenizer.nextToken());
            //accidente.setPositivoDroga(tokenizer.nextToken());
            accidentes.add(accidente);
            //System.out.println(accidentes);
        }
        return accidentes;
    }
}
