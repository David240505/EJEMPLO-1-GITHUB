class CarroElectrico extends Carro {
    public CarroElectrico(String marca, String modelo) {
        super(marca, modelo);
    }

    // Implementación del método abstracto
    @Override
    public void encender() {
        System.out.println("🔋 Encendiendo carro eléctrico: " + marca + " " + modelo);
    }
}