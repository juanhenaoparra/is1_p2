package control;

import entities.Ciudadano;
import entities.Efectivo;
import entities.Multa;
import entities.Pago;
import entities.Tarjeta;

/**
 * Clase que tiene el control para pagar las multas de los ciudadanos
 * 
 * @author Juan Felipe Cortes, Juan Sebastian Henao
 * @version 1.0
 */

public class ControlPagoMulta {
    private RepositorioMultas repo;

    public ControlPagoMulta(RepositorioMultas repo) {
        this.repo = repo;
    }

    /**
     * funcion para que el ciudadano a travez de su cedula y el codigo de la multa
     * pueda pagar la multa con el medio de pago de su preferencia
     * sea en efectivo o sea por tarjeta
     * 
     * @param cedula      la cedual es la identificacion del ciudadano
     * @param codigoMulta el codigo de la multa que se va a pagar
     * @param valorPagar  el valor que se va a cancelar en la multa
     * @param tipoPago    el tipo de pago que va a elegir si es en efectivo o si es
     *                    por tarjeta
     * @throws PagoInvalidoException verifica que el tipo de pago se valido lanza
     *                               cuando se ingresa un pago invalido, que no sea
     *                               efectivo o tarjeta
     */

    public void pagarMulta(String cedula, String codigoMulta, double valorPagar, String tipoPago)
            throws PagoInvalidoException {
        Ciudadano ciudadano = this.repo.buscarCiudadano(cedula);
        Multa multa = ciudadano.buscarMulta(codigoMulta);

        Pago pago = null;
        if (tipoPago.equalsIgnoreCase("efectivo")) {
            System.out.println("pago: " + valorPagar);
            pago = new Efectivo(valorPagar);
        }

        if (tipoPago.equalsIgnoreCase("tarjeta")) {
            pago = new Tarjeta(valorPagar);
        }

        multa.Pagar(pago);
    }
}
