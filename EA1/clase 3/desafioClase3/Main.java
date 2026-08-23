public class Main {
    public static void main(String[] args){
        System.out.println("creando objetos Reserva...");

        Reserva iphon4 = new Reserva("IPhone 4",40000,20);

        Reserva cargador = new Reserva("Cargador Iphone4",2000,200);

        iphon4.mostrarInformacion();
        cargador.mostrarInformacion();

        iphon4.mostrarInformacion();
        iphon4.reservar(5);



        cargador.mostrarInformacion();
        cargador.reservar(50);



        double totalSinDescuento = iphon4.calcularTotal(5);
        System.out.println(totalSinDescuento);
        double totalConDescuento = iphon4.calcularTotal(5, 0.20);
        System.out.println(totalConDescuento);






    }
}