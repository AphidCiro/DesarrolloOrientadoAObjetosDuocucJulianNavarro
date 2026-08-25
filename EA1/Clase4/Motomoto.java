public class Motomoto extends Vehiculo{

    private int cilindrado;

    public Motomoto(String marca, String modelo, int cilindrado){
        super(marca, modelo);
        this.cilindrado = cilindrado;
    }

    public int getCilindrado() {
        return cilindrado;
    }

    public void setCilindrado(int cilindrado) {
        if(cilindrado > 0){
            this.cilindrado = cilindrado;
        }
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Motocicleta");
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Cilindrada: "+getCilindrado()+"cc");
        System.out.println("velocidad: "+getVelocidad());
    }
}
