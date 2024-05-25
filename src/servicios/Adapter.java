package servicios;

public class Adapter implements ProveedorDePago{
    String usuario;
    String password; // obviamente se debe encriptar pero no hay tiempo
    String token;
    Servicio servicio;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public String generarToken(String usuario, String servicio) {
        String tokenTemporal;
        if (servicio.equals("paypal")) {
            tokenTemporal = "no necesita token";
            return tokenTemporal;
        } else {
            OtrosServicios otrosServicios = new OtrosServicios();
            otrosServicios.setNombre(servicio);
            tokenTemporal = usuario + ":" + otrosServicios.getNombre();
        }

        return tokenTemporal;
    }
}
