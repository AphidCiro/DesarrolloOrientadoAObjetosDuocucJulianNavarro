public abstract class Vehiculo {

    private String marca;
    private String modelo;
    private int velocidad;


    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;

        this.velocidad = 0;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marcaRecibida){
        if (marcaRecibida != null && !marcaRecibida.isBlank()) {
            this.marca = marcaRecibida;
        }
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modeloRecibido){
        if (modeloRecibido != null && !modeloRecibido.isBlank()) {
            this.modelo = modeloRecibido;
        }
    }
    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(int velocidadRecibida){
        if (velocidadRecibida >= 0) {
            this.velocidad = velocidadRecibida;
        }
    }
    public void acelerar(int velocidadRecibida){
        if (velocidadRecibida > 0){
            setVelocidad(getVelocidad()+velocidadRecibida);
        }
    }
    public void detener(){
        setVelocidad(0);
    }
    public abstract void mostrarInformacion();
}
