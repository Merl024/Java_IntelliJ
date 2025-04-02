package clases.semana7.estatico;

public enum MesAnio {
    ENERO(31, "Enero", "January"),
    FEBRERO(28, "Febrero", "February"),
    MARZO(31, "Marzo", "March");

    private final int dias;
    private final String nombreEspanol;
    private final String nombreIngles;

    MesAnio(int dias, String nombreEspanol, String nombreIngles) {
        this.dias = dias;
        this.nombreEspanol = nombreEspanol;
        this.nombreIngles = nombreIngles;
    }
}
