
/**
 * Objeto multa que tiene un codigo valor y pagos a la multa (se puede pagar en varios pagos),
 * tiene la funcionalidad de pagar, de verificar si ya esta pagada la multa o si quiere abonar a los pagos
 * @author Juan Felipe Cortes, Juan Sebastian Henao 
 * @version 1.0
 */

import java.util.ArrayList;

public class Multa {
    private String codigo;
    private double valor;
    private ArrayList<Pago> pagos = new ArrayList<Pago>();

    public Multa(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<Pago> pagos) {
        this.pagos = pagos;
    }

    /**
     * Genera una suma de todos lo pagos que se le hiceron a la multa
     * 
     * @return retorna el total de todos lo pagos echos
     */

    private double sumarPagos() {
        double total = 0.0;

        for (int i = 0; i < this.pagos.size(); i++) {
            total += this.pagos.get(i).getValor();
        }

        return total;
    }

    /**
     * Verifica si se le puede abonar a la multa
     * 
     * @param valor el valor que puede abonar a la multa
     * @return retorna verdadero si puede abonar dinero a la multa, de lo contrario
     *         false
     */

    private boolean puedeAbonar(double valor) {
        double total = this.sumarPagos();

        if (total + valor > this.valor) {
            return false;
        }

        return true;
    }

    /**
     * Funcion que agrega pago a la multa validando antes que esta ya no esta pagada
     * en su totalidad
     * 
     * @param pago el pago que se efectua al pagar la multa
     * @throws PagoInvalidoException verifica que el tipo de pago se valido lanza
     *                               cuando se ingresa un pago invalido, que no sea
     *                               efectivo o tarjeta
     */

    public void Pagar(Pago pago) throws PagoInvalidoException {
        if (!this.puedeAbonar(pago.getValor())) {
            throw new PagoInvalidoException("no puedes abonar a una deuda ya pagada");
        }

        this.pagos.add(pago);
    }
}
