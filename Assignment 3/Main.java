public class Main {
    public static void main(String[] args) {
        // Default Car
        Car defaultCar = new CarBuilder().build();
        System.out.println("Default Car:");
        defaultCar.showDetails();

        System.out.println("\n-----------------------------\n");

        // Customized Car
        Car customCar = new CarBuilder()
                .setModelName("Tesla Model 3")
                .setEngineType("Electric")
                .setColor("Midnight Silver")
                .setTransmission("Automatic")
                .setSunroof(true)
                .setInfotainmentSystem(true)
                .build();

        System.out.println("Customized Car:");
        customCar.showDetails();
    }
}
