package entities;

/**
 * Objeto que herda los atributos de pago
 * 
 * @author Juan Felipe Cortes, Juan Sebastian Henao
 * @version 1.0
 */
public class Tarjeta extends Pago {
    public Tarjeta(double valor) {
        this.setValor(valor);
    }
}
