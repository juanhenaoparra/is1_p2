
/**
 * Descripción de la clase
 * @author Juan Felipe Cortes, Juan Sebastian Henao 
 * @version 1.0
 */
import java.util.ArrayList;

public class RepositorioMultas {
    private ArrayList<Ciudadano> ciudadanos;

    /**
     * Descripción del método.
     * 
     * @param nombreParámetro descripción parámetro (uno por cada parámetro)
     * @return descripción de lo que retorna
     * @throws excepción y explicación de su posible causa
     */

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

    public void actualizarCiudadano(Ciudadano ciudadano) {
        for (int i = 0; i < this.ciudadanos.size(); i++) {
            Ciudadano tempCiudadano = this.ciudadanos.get(i);

            if (tempCiudadano.getCedula() != ciudadano.getCedula()) {
                continue;
            }

            this.ciudadanos.remove(i);
            this.ciudadanos.add(ciudadano);
        }
    }
}
