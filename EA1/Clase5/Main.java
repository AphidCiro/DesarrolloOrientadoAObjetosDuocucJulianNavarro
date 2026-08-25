import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //recibir datos user
        //Scanner = me permite recibir datos por consola
        Scanner teclado = new Scanner(System.in);
        MetodoPago metodoPago;
        //
        System.out.println("Sitema de pagos MACH");
        System.out.println("1 . Pagar con tarjeta");

        System.out.println("2 . Pagar con transferencia");

        //Exceptions = manejar casos de error
        //try las opciones que puede fallar o el código a validar
        //catch = los tipos de errores
        //finally = se ejecuta exista o no exista un error Siempre
        try{
            //
            System.out.println("selecciona una opción: ");
            //Parsear = cambiar el tipo de dato

            int opcion = Integer.parseInt(teclado.nextLine());
            System.out.println("Ingrese el monto: $");
            //1000 1,000 1.000
            double monto = Double.parseDouble(teclado.nextLine().replace(",",".") );
            //Lammo a la interface y la almaceno en una variable

            if(opcion == 1){
                metodoPago = new pagoTarjeta(150000);
            }else if(opcion == 2){
                System.out.println("INGRESE EL BANCO PARA PAGAR");
                String banco = teclado.nextLine();
                metodoPago = new PagoTransferencia(banco);
            }else{
                System.out.println("La opción escogida no existe");
                return;
            }
            //Ejecutamos la operación correspondiente
            System.out.println("Método : " + metodoPago.obtenerNombre());
            metodoPago.pagar(monto);
            //catch= validoe l tipo de error o excepción
        }catch (NumberFormatException e){
            System.out.println("Debes ingresar un número ");
        }finally {
            //debo cerrar Scanner
            teclado.close();
            System.out.println("Programa de pago finalizado sin errores o bugs o crash");
        }

    }
}






