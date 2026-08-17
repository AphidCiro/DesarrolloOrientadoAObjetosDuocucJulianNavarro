public class Main {

    public static void main(String[] args){


        System.out.println("waos");


        Producto cargador = new Producto("cargador",2000,100);

        Producto teclado = new Producto("Teclado geymer",200000,20);

        Producto tuMama = new Producto("Josefa",0,2);

        cargador.mostrarInfo();
        teclado.mostrarInfo();
        tuMama.mostrarInfo();


        cargador.vender(1);

        tuMama.vender(1);

        teclado.vender(10);

        cargador.mostrarInfo();
        teclado.mostrarInfo();
        tuMama.mostrarInfo();

        System.out.println("PRECIOCONIVA");

        double precioConIva = teclado.calcularPrecioConIva();
        System.out.println(precioConIva);


        System.out.println("mostrarpreciodelacompra");

        int cantidad = 3;

        double totalCompra = teclado.calcularPrecioFinal(cantidad,20);

        System.out.println("cantidad: "+cantidad);
        System.out.println(totalCompra);

        System.out.println("compracondescuento");

        double totalDescuento = teclado.calcularPrecioFinal(cantidad, 30);
        System.out.println(totalDescuento);
        System.out.println("es el total con 30% d descuento");

        System.out.println("kill me");
        System.out.println("*dies*");
    }

}