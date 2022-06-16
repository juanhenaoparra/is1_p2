import java.util.ArrayList;

public class RepositorioMultas {
    private ArrayList<Ciudadano> ciudadanos;

    public Ciudadano buscarCiudadano(String cedula) {
        for (int i = 0; i < this.ciudadanos.size(); i++) {
            Ciudadano ciudadano = this.ciudadanos.get(i);
            if (ciudadano.getCedula() != cedula) {
                continue;
            }

            return ciudadano;
        }

        return null;
    }
}
