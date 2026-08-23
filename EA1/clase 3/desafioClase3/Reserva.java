public class Reserva {
    private String producto;
    private double precio;
    private int cantidadDisponible;

    public Reserva(String producto, double precio, int cantidadDisponible){
        this.producto = producto;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }
    public void mostrarInformacion(){
        System.out.println("====Producto====");
        System.out.println("Producto: "+producto);
        System.out.println("Precio: $"+precio);
        System.out.println("Stock Restante: "+cantidadDisponible);
    }
    public void reservar(int cantidad){
        if(cantidadDisponible >= cantidad){
            cantidadDisponible -= cantidad;
        }else System.out.println("no hay stock suficiente para esta reserva");
    }
    public double calcularTotal(int cantidad){
        double total = precio * cantidad;
        return total;
    }

}
