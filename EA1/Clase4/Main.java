public class Main {
    public static void main(String[] args){

        Auto auto = new Auto("toyora", "supra",4);

        Motomoto moto = new Motomoto("kawasaki", "ninja", 1000);

        auto.mostrarInformacion();
        moto.mostrarInformacion();

        auto.acelerar(100);
        moto.acelerar(200);

        System.out.println("Velocidad toyota supra: "+auto.getVelocidad());
        System.out.println("velocidad Kawasaki ninja: "+moto.getVelocidad());

        auto.setMarca("Audi");
        auto.setModelo("tu mama");
        auto.setCantidadPuertas(2);
        auto.mostrarInformacion();
        auto.detener();
        auto.mostrarInformacion();
    }
}
