
public class Auto extends Vehiculo {

    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    public int getCantidadPuertas(){
        return cantidadPuertas;
    }
    public void setCantidadPuertas(int cantidadPuertasRecibidas){
        if (cantidadPuertasRecibidas > 0){
            this.cantidadPuertas = cantidadPuertasRecibidas;
        }
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Vehiculo");
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Cantidad Puertas: "+getCantidadPuertas());
        System.out.println("Velocidad: "+getVelocidad()+"km/h");
    }
}
