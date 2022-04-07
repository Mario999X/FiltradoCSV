package model;

public class Accidente {

    private String numExp; // num_expediente
    private String fecha; // fecha
    private String hora; // hora
    private String localizacion; // localizacion
    private String numero; // numero
    private String codDistrito; // cod_distrito
    private String distrito; // distrito
    private String tipoAccidente; // tipo_accidente
    private String estadoMetereologico; //estado_metereologico
    private String tipoVehiculo; // tipo_vehiculo
    private String tipoPersona; // tipo_persona
    private String rangoEdad; // rango_edad
    private String sexo; // sexo
    private String codLesividad; // cod_lesividad
    private String lesividad; // lesividad
    private String coordenadaX; // coordenada_x_utm
    private String coordenadaY; // coordenada_y_utm
    private String positivoAlcohol; // positiva_alcohol
    private String positivoDroga; // positiva_droga
    // Implicacion varios vehiculos = misma fecha, misma hora, mismo distrito


    public Accidente() {
    }

    public String getNumExp() {
        return numExp;
    }

    public void setNumExp(String numExp) {
        this.numExp = numExp;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodDistrito() {
        return codDistrito;
    }

    public void setCodDistrito(String codDistrito) {
        this.codDistrito = codDistrito;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
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

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(String rangoEdad) {
        this.rangoEdad = rangoEdad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCodLesividad() {
        return codLesividad;
    }

    public void setCodLesividad(String codLesividad) {
        this.codLesividad = codLesividad;
    }

    public String getLesividad() {
        return lesividad;
    }

    public void setLesividad(String lesividad) {
        this.lesividad = lesividad;
    }

    public String getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(String coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public String getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(String coordenadaY) {
        this.coordenadaY = coordenadaY;
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
                ", positivoAlcohol='" + positivoAlcohol + '\'' +
                '}';
    }
}
