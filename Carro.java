abstract class Carro {
    protected String marca;
    protected String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
       // Método común
       public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }

    // Método abstracto (debe ser implementado por las subclases)
    public abstract void encender();
}