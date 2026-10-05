public class Estudiante {

    private int id;
    private String nombre;
    private double puntaje;
    private boolean tieneResidencia;

    public Estudiante(int id, String nombre, double puntaje) {
        this.id = id;
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.tieneResidencia = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public boolean tieneResidencia() {
        return tieneResidencia;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public void setTieneResidencia(boolean tieneResidencia) {
        this.tieneResidencia = tieneResidencia;
    }

    @Override
    public String toString() {
        return id + " - " + nombre + " - Puntaje: " + puntaje
                + " - Residencia: " + tieneResidencia;
    }
}