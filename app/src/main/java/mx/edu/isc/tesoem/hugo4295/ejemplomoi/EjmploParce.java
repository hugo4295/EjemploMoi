package mx.edu.isc.tesoem.hugo4295.ejemplomoi;

public class EjmploParce {

    String nombre, edad;

    public EjmploParce() {
    }

    public EjmploParce(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
