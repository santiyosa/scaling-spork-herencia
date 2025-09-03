public class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String marca, int anio, String modelo, int pasajeros, int velocidad, int numeroPuertas) {
        super(marca, anio, modelo, pasajeros, velocidad);
        this.numeroPuertas = numeroPuertas;
    }

    public void piques() {
        System.out.println("Se encuentra picando y con un numero de puertas de: " +numeroPuertas);
    }

}
