import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        ArrayList<Jugador> jugadores = new ArrayList<>();

        try {
            System.out.println("BUENBENUDO AL TORNEO");
            System.out.println("ingrese el nombre del jugador");

            String nombre = scanner.nextLine();

            System.out.println("Ingrese la edad del jugador; ");

            String edadTexto = scanner.nextLine();
            int edad = Integer.parseInt(edadTexto);

            Jugador jugador = new Jugador(nombre, edad);

            jugadores.add(jugador);

            System.out.println("jugador registrado correctamente");
            System.out.println(jugador);
            System.out.println("\n ingrese una pocision a consultar");

            int pocision = Integer.parseInt(scanner.nextLine());

            Jugador encontrado = jugadores.get(pocision);

            System.out.println("Jugador encontrado: ");
            System.out.println(encontrado);

            guardarJugador(encontrado);


        }catch (NumberFormatException e ){
            System.out.println("error la edad debe ser ingresada en numeros");
        }catch (IndexOutOfBoundsException e ){
            System.out.println("jugador no encontrado");
        }catch (IllegalArgumentException e ){
            System.out.println("dato invalido "+ e.getMessage());
        }catch (EdadInvalidaException e){
            System.out.println("edad invalida "+e.getMessage());
        }catch (IOException e){
            System.out.println("Eerror al cargar el archivo");
        }catch(Exception e ){
            System.out.println("ono: "+e.getMessage());
        }finally {
            scanner.close();
            System.out.println("finalizado");
        }
    }
    public static void guardarJugador(Jugador jugador)
        throws IOException{
        FileWriter archivo = new FileWriter("jugadores.txt",true);
        archivo.write(jugador + "\n");
        archivo.close();
        System.out.println("waos");
    }
}
