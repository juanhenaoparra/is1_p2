
/**
 * Descripción de la clase
 * @author Juan Felipe Cortes, Juan Sebastian Henao 
 * @version 1.0
 */

import java.util.ArrayList;

public class Multa {
    private String codigo;
    private double valor;
    private ArrayList<Pago> pagos;

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

    private double sumarPagos() {
        double total = 0.0;

        for (int i = 0; i < this.pagos.size(); i++) {
            total += this.pagos.get(i).getValor();
        }

        return total;
    }

    private boolean puedeAbonar(double valor) {
        double total = this.sumarPagos();

        if (total + valor > this.valor) {
            return false;
        }

        return true;
    }

    public void Pagar(Pago pago) throws PagoInvalidoException {
        if (!this.puedeAbonar(pago.getValor())) {
            throw new PagoInvalidoException("no puedes abonar a una deuda ya pagada");
        }

        this.pagos.add(pago);
    }
}
