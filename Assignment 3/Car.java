public class Car {
    private String modelName;
    private String engineType;
    private String color;
    private String transmission;
    private boolean sunroof;
    private boolean infotainmentSystem;

    public Car(String modelName, String engineType, String color, String transmission, boolean sunroof, boolean infotainmentSystem) {
        this.modelName = modelName;
        this.engineType = engineType;
        this.color = color;
        this.transmission = transmission;
        this.sunroof = sunroof;
        this.infotainmentSystem = infotainmentSystem;
    }

    public void showDetails() {
        System.out.println("Model: " + modelName);
        System.out.println("Engine: " + engineType);
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmission);
        System.out.println("Sunroof: " + (sunroof ? "Yes" : "No"));
        System.out.println("Infotainment: " + (infotainmentSystem ? "Yes" : "No"));
    }
}
