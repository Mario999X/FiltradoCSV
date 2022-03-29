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
            accidente.setFecha(LocalDate.parse(tokenizer.nextToken(), DateTimeFormatter.ofPattern("d/MM/yyyy")));
            //accidente.setHora(LocalTime.parse(tokenizer.nextToken())); // , DateTimeFormatter.ofPattern("HH:mm:ss")
            accidente.setLocalizacion(tokenizer.nextToken());
            tokenizer.nextToken(); // saltamos numero
            tokenizer.nextToken(); // saltamos cod_distrito
            accidente.setDistrito(tokenizer.nextToken());
            tokenizer.nextToken(); // saltamos tipo_accidente
            accidente.setEstadoMetereologico(tokenizer.nextToken());
            accidente.setTipoVehiculo(tokenizer.nextToken());
            tokenizer.nextToken(); // saltamos tipo_persona
            tokenizer.nextToken(); // saltamos rango_edad
            accidente.setSexo(tokenizer.nextToken());
            tokenizer.nextToken(); // saltamos cod_lesividad
            accidente.setLesividad(tokenizer.nextToken());
            tokenizer.nextToken(); // saltamos coordenada_x_utm
            //tokenizer.nextToken(); // saltamos coordenada_y_utm
            accidente.setPositivoAlcohol(tokenizer.nextToken());
            accidente.setPositivoDroga(tokenizer.nextToken());
            accidentes.add(accidente);
        }
        return accidentes;
    }
}
