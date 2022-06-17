
/**
 * Clase que lleva el control de todos los ciudadanos con sus respectivas multas 
 * @author Juan Felipe Cortes, Juan Sebastian Henao 
 * @version 1.0
 */
import java.util.ArrayList;

public class RepositorioMultas {
    private ArrayList<Ciudadano> ciudadanos = new ArrayList<Ciudadano>();

    /**
     * Buscar ciudadano a travez de su identificacion (cedula)
     * 
     * @param cedula identificacion del ciudadano
     * @return si existe el ciudadano no retorna el ciudadano de lo contrario
     *         retorna null
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

    /**
     * Actualiza un ciudadano a travez de su cedula
     * 
     * @param cedula identificacion del ciudadano
     */
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

    /**
     * Agrega un ciudadano al repositorio general
     * 
     * @param ciudadano objeto ciudadano con los atributos
     */

    public void agregarCiudadano(Ciudadano ciudadano) {
        this.ciudadanos.add(ciudadano);
    }
}
