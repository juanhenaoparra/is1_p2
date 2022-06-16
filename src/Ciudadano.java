import java.util.ArrayList;

public class Ciudadano {
    private String cedula;
    private String nombre;
    private ArrayList<Multa> multas;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Multa buscarMulta(String codigo) {
        for (int i = 0; i < this.multas.size(); i++) {
            Multa multa = this.multas.get(i);
            if (multa.getCodigo() != codigo) {
                continue;
            }

            return multa;
        }

        return null;
    }
}
