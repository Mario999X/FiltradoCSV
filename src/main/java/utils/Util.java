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
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Util {

    public static List<Accidente> getAccidentes() throws IOException {

        String DATA_FILE = "01-EjercicioAD.csv";
        String WORKING_DIRECTORY = System.getProperty("user.dir");
        Path path = Paths.get(WORKING_DIRECTORY + File.separator + "data" + File.separator + DATA_FILE);
        final List<String> lines = Files.readAllLines(Paths.get("data/01-EjercicioAD.csv"), StandardCharsets.UTF_8);

        List<Accidente> accidentes = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++){
            StringTokenizer tokenizer = new StringTokenizer(lines.get(i), ",");
            Accidente accidente = new Accidente();
            accidente.setId(Integer.parseInt(tokenizer.nextToken()));
            //accidente.setFecha(LocalDate.parse(tokenizer.nextToken()));
            //accidente.setHora(LocalTime.parse(tokenizer.nextToken()));
            tokenizer.nextToken(); // saltamos localizacion
            tokenizer.nextToken(); // saltamos numero
            tokenizer.nextToken(); // saltamos codigo distrito
            accidente.setDistrito(tokenizer.nextToken());

        }
        return accidentes;
    }
}
