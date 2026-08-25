public class Jugador {
    private String nombre;
    private int edad;


    public Jugador(String nombre, int edad)
            throws EdadInvalidaException{

        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("el nombre es obligatorio");
        }
        if (edad <12){
            throw new EdadInvalidaException("el jugador debe tener mas de 12 años");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString(){
        return nombre + " " + edad + " años";
    }
}
