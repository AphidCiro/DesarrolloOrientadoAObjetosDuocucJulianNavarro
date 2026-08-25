public class pagoTarjeta implements MetodoPago{

    private double saldo;

    public pagoTarjeta(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void pagar(double monto) {
        if (0>=monto){
            System.out.println("el monto debe ser mayo a cero");
            return;
        }
        if (saldo <monto){
            System.out.println("no tienes saldo suficiente");
        }
        saldo -=monto;
        System.out.println("pago con tarjeta realizado :3");
        System.out.println("saldo restante: "+saldo);
    }

    @Override
    public String obtenerNombre() {
        return "Pago Con Tarjeta";
    }
}
