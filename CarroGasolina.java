class CarroGasolina extends Carro {
    public CarroGasolina(String marca, String modelo) {
        super(marca, modelo);
    }

    // Implementación del método abstracto
    @Override
    public void encender() {
        System.out.println("⛽ Encendiendo carro a gasolina: " + marca + " " + modelo);
    }
}