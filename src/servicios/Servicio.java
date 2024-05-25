package servicios;

public abstract class Servicio {
    String nombre;

    // otros atributos de servicios pago...


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String procesarToken(String token);
}
