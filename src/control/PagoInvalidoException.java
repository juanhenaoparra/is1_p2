package control;

/**
 * Maneja el error si se ingresa un pago no valido
 * 
 * @author Juan Felipe Cortes, Juan Sebastian Henao
 * @version 1.0
 */
public class PagoInvalidoException extends Exception {
    public PagoInvalidoException(String error) {
        super(error);
    }
}
