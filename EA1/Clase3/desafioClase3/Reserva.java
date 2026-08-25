public class Reserva {
    private String producto;
    private int precio;
    private int cantidadDisponible;

    public Reserva(String producto, int precio, int cantidadDisponible){
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
            System.out.println("cantidad reservada "+cantidad+" unidades reservadas");
        }else System.out.println("no hay stock suficiente para esta reserva");
    }
    public int calcularTotal(int cantidad){
        int total = precio * cantidad;
        return total;
    }
    public double calcularTotal(int cantidad , double descuento){
        double Descuento = (cantidad * precio) * descuento;
        double totalConDescuento = (cantidad * precio)-Descuento;
        return totalConDescuento;
    }


}
