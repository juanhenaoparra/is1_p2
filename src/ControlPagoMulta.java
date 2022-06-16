public class ControlPagoMulta {
    private RepositorioMultas repo;

    public void pagarMulta(String cedula, String codigoMulta, double valorPagar, String tipoPago) {
        Ciudadano ciudadano = this.repo.buscarCiudadano(cedula);
        Multa multa = ciudadano.buscarMulta(codigoMulta);

        //Pago pago

        //multa.Pagar(valorPagar, pago)
    }
}
