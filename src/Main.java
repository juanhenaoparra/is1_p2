public class Main {
    public static void main(String[] args) throws PagoInvalidoException {
        RepositorioMultas repo1 = new RepositorioMultas();
        Ciudadano c1 = new Ciudadano("100000", "Juan felipe");
        c1.agregarMulta("1234", 50000);
        repo1.agregarCiudadano(c1);

        ControlPagoMulta control1 = new ControlPagoMulta(repo1);

        control1.pagarMulta("100000", "1234", 50000, "efectivo");

    }
}
