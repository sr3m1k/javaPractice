public class Car2 {

    private final String model;
    private final String license;
    private String color;
    private int year;


    private static final int CURRENT_YEAR = 2023;


    public Car2() {
        this.model = "Неизвестная модель";
        this.license = "Неизвестный номер";
        this.color = "Неизвестный цвет";
        this.year = 0;
    }


    public Car2(String model, String license) {
        this.model = model;
        this.license = license;
        this.color = "Неизвестный цвет";
        this.year = 0;
    }


    public Car2(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }


    public String To_String() {
        return "Модель: " + model + "\nНомер: " + license + "\nЦвет: " + color + "\nГод выпуска: " + year;
    }


    public int getCarAge() {
        if (year == 0) {
            return 0;
        }
        return CURRENT_YEAR - year;
    }


//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public String getLicense() {
//        return license;
//    }
//
//    public void setLicense(String license) {
//        this.license = license;
//    }
//
//    public String getColor() {
//        return color;
//    }

    public void setColor(String color) {
        this.color = color;
    }
//
//    public int getYear() {
//        return year;
//    }

    public void setYear(int year) {
        this.year = year;
    }
}


