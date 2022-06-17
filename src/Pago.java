/**
 * Objeto pago que contiene la informacion principal de un pago, ya sea efectivo
 * o por tarjeta
 * 
 * @author Juan Felipe Cortes, Juan Sebastian Henao
 * @version 1.0
 */
public class Pago {
    private int numero;
    private double valor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
