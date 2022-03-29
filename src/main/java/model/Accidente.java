package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Accidente {

    private String numExp; // num_expediente
    private LocalDate fecha; // fecha
    private LocalTime hora; // hora
    private String localizacion; // localizacion
    private String distrito; // distrito
    private String estadoMetereologico; //estado_metereologico
    private String tipoVehiculo; // tipo_vehiculo
    private String sexo; // sexo
    private String lesividad; // lesividad
    private String positivoAlcohol; // positiva_alcohol
    private String positivoDroga; // positiva_droga
    // Implicacion varios vehiculos = misma fecha, misma hora, misma localizacion


    public Accidente() {
    }

    public Accidente(String numExp, LocalDate fecha, LocalTime hora, String localizacion, String distrito, String estadoMetereologico, String tipoVehiculo, String sexo, String lesividad, String positivoAlcohol, String positivoDroga) {
        this.numExp = numExp;
        this.fecha = fecha;
        this.hora = hora;
        this.localizacion = localizacion;
        this.distrito = distrito;
        this.estadoMetereologico = estadoMetereologico;
        this.tipoVehiculo = tipoVehiculo;
        this.sexo = sexo;
        this.lesividad = lesividad;
        this.positivoAlcohol = positivoAlcohol;
        this.positivoDroga = positivoDroga;
    }

    public String getNumExp() {
        return numExp;
    }

    public void setNumExp(String numExp) {
        this.numExp = numExp;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getEstadoMetereologico() {
        return estadoMetereologico;
    }

    public void setEstadoMetereologico(String estadoMetereologico) {
        this.estadoMetereologico = estadoMetereologico;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLesividad() {
        return lesividad;
    }

    public void setLesividad(String lesividad) {
        this.lesividad = lesividad;
    }

    public String getPositivoAlcohol() {
        return positivoAlcohol;
    }

    public void setPositivoAlcohol(String positivoAlcohol) {
        this.positivoAlcohol = positivoAlcohol;
    }

    public String getPositivoDroga() {
        return positivoDroga;
    }

    public void setPositivoDroga(String positivoDroga) {
        this.positivoDroga = positivoDroga;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "numExp='" + numExp + '\'' +
                ", fecha=" + fecha +
                ", localizacion='" + localizacion + '\'' +
                ", distrito='" + distrito + '\'' +
                ", estadoMetereologico='" + estadoMetereologico + '\'' +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                ", sexo='" + sexo + '\'' +
                ", lesividad='" + lesividad + '\'' +
                ", positivoAlcohol='" + positivoAlcohol + '\'' +
                ", positivoDroga='" + positivoDroga + '\'' +
                '}';
    }
}
