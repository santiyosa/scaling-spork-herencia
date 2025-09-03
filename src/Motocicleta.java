public class Motocicleta extends Vehiculo {
    private boolean gatoLateral;

    public Motocicleta(String marca, int anio, String modelo, int pasajeros, int velocidad, boolean gatoLateral) {
        super(marca, anio, modelo, pasajeros, velocidad);
        this.gatoLateral = gatoLateral;
    }

    public void endo() {
        System.out.println("Se encuentra haciendo un endo y ¿tiene gato lateral?: " + gatoLateral);
    }

    public int velocidad() {
        int velocidad = 10;
        return velocidad;
    }

    public String mensaje() {
        String informacion = "Esta moto es robada";
        return informacion;
    }
}
