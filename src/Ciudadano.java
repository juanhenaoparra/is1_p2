
/**
 * Es la objeto ciudadano que se identifica con los atributos cedula, nombre y puede tener multas 
 * @author Juan Felipe Cortes, Juan Sebastian Henao 
 * @version 1.0
 */

import java.util.ArrayList;

public class Ciudadano {
    private String cedula;
    private String nombre;
    private ArrayList<Multa> multas = new ArrayList<Multa>();

    public Ciudadano(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

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

    /**
     * Busca si el ciudadano tiene alguna multa existe
     * 
     * @param codigo el codigo con el que se va a buscar una multa especifica
     * @return si existe la multa devuelve la multa de lo contrario devuelve null
     */

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

    public void agregarMulta(String codigo, double valor) {
        Multa auxMulta = new Multa(codigo, valor);
        this.multas.add(auxMulta);
    }
}
