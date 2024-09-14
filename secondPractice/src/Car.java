public class Car {

    private final String model;
    private final String license;
    private final String color;
    private final int year;


    public Car() {
        this.model = "unknown model";
        this.license = "unknown license";
        this.color = "unknown color";
        this.year = 0;
    }


    public Car(String model, String license) {
        this.model = model;
        this.license = license;
        this.color = "unknown color";
        this.year = 0;
    }


    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }


    public void displayInfo() {
        System.out.println("model: " + model);
        System.out.println("licence: " + license);
        System.out.println("color: " + color);
        System.out.println("year: " + year);
    }

    public static void main(String[] args) {

        Car defaultCar = new Car();
        defaultCar.displayInfo();

        System.out.println();


        Car customCar = new Car("BMW", "A444YE799");
        customCar.displayInfo();

        System.out.println();


        Car fullCar = new Car("BMW", "B444AX799", "Black", 2020);
        fullCar.displayInfo();
    }
}
