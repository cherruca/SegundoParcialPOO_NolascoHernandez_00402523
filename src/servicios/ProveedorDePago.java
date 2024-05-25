package servicios;

public interface ProveedorDePago {
    public String generarToken(String usuario, String servicio);
}
