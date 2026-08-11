public  class Main {

    public static void main(String[] args) {
        String nombre = "Alex";
        int edad = 16;
        int nivel = 12;
        boolean tieneMembresia = true;
        int modoSeleccionado = 2;
        System.out.println("====JUGADOR====");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Nivel: "+nivel);

        switch (modoSeleccionado) {
            case 1:
                System.out.println("Modo Historia");
                boolean accesoHistoria = (nivel > 1) ? true:false;
                if (accesoHistoria == true) {
                    System.out.println("Acesso Permitido");
                } else System.out.println("Aceso Denegado ");
                break;
            case 2:
                System.out.println("Modo Competitivo");
                boolean accesoCompetitivo = (edad>15 && nivel >= 10 && tieneMembresia == true)?true:false;
                if (accesoCompetitivo == true) {
                    System.out.println("Aceso Permitido");
                }else System.out.println("Aceso Denegado");
                break;
            case 3:
                System.out.println("Modo Entrenamiento");
                boolean acesoEntrenamiento = true;
                if (acesoEntrenamiento = true){
                    System.out.println("Aceso Permitido");
                }
            default:
                System.out.println("Tipo de entrada desconocida");
        }
    }
}