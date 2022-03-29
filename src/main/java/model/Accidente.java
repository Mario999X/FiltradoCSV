package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Accidente {
    private int id;
    private LocalDate fecha;
    private String distrito;
    private String positivoDroga;
    private String positivoAlcohol;
    private String choqueBus;
    private String generoConductor;
    private String lesividad; // Num de muertos
    private LocalTime hora;
    private String estadoMetereologico;
    // Implicacion varios vehiculos = misma fecha, misma hora, mismo distrito


    public Accidente() {
    }

    public Accidente(int id, LocalDate fecha, String distrito, String positivoDroga, String positivoAlcohol, String choqueBus, String generoConductor, String lesividad, LocalTime hora, String estadoMetereologico) {
        this.id = id;
        this.fecha = fecha;
        this.distrito = distrito;
        this.positivoDroga = positivoDroga;
        this.positivoAlcohol = positivoAlcohol;
        this.choqueBus = choqueBus;
        this.generoConductor = generoConductor;
        this.lesividad = lesividad;
        this.hora = hora;
        this.estadoMetereologico = estadoMetereologico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getPositivoDroga() {
        return positivoDroga;
    }

    public void setPositivoDroga(String positivoDroga) {
        this.positivoDroga = positivoDroga;
    }

    public String getPositivoAlcohol() {
        return positivoAlcohol;
    }

    public void setPositivoAlcohol(String positivoAlcohol) {
        this.positivoAlcohol = positivoAlcohol;
    }

    public String getChoqueBus() {
        return choqueBus;
    }

    public void setChoqueBus(String choqueBus) {
        this.choqueBus = choqueBus;
    }

    public String getGeneroConductor() {
        return generoConductor;
    }

    public void setGeneroConductor(String generoConductor) {
        this.generoConductor = generoConductor;
    }

    public String getLesividad() {
        return lesividad;
    }

    public void setLesividad(String lesividad) {
        this.lesividad = lesividad;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getEstadoMetereologico() {
        return estadoMetereologico;
    }

    public void setEstadoMetereologico(String estadoMetereologico) {
        this.estadoMetereologico = estadoMetereologico;
    }
}
