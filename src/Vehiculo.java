public class Vehiculo {
    protected String marca;
    protected int anio;
    protected String modelo;
    protected int pasajeros;
    protected int velocidad;
    

    public Vehiculo(String marca, int anio, String modelo, int pasajeros, int velocidad) {
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.pasajeros = pasajeros;
        this.velocidad = velocidad;
    }




public void acelerar(){
System.out.println("Se encuentra acelerando");
}

public void frenar(){
System.out.println("Se encuentra frenando");
}



}
