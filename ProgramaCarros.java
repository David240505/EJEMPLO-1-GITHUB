public class ProgramaCarros {
    public static void main(String[] args) {
        // Crear objetos
        Carro electrico = new CarroElectrico("Tesla", "Model 3");
        Carro gasolina = new CarroGasolina("Toyota", "Corolla");

        // Mostrar información y encender cada carro
        electrico.mostrarInformacion();
        electrico.encender();

        System.out.println();

        gasolina.mostrarInformacion();
        gasolina.encender();
    }
}