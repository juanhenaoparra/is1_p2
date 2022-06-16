public class ControlPagoMulta {
    private RepositorioMultas repo;

    public void pagarMulta(String cedula, String codigoMulta, double valorPagar, String tipoPago) throws PagoInvalidoException{
        Ciudadano ciudadano = this.repo.buscarCiudadano(cedula);
        Multa multa = ciudadano.buscarMulta(codigoMulta);

        Pago pago = null;
        if (tipoPago == "efectivo") {
            pago = new Efectivo(valorPagar);
        }

        if (tipoPago == "tarjeta") {
            pago = new Tarjeta(valorPagar);
        }

        multa.Pagar(pago);
    }
}
