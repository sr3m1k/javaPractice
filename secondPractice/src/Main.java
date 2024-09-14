public class Main {
    public static void main(String[] args) {
        // Создаем объект через конструктор по умолчанию
        Car2 defaultCar = new Car2();
        System.out.println("Default Car:");
        System.out.println(defaultCar.To_String());
        System.out.println("Возраст автомобиля: " + defaultCar.getCarAge() + " лет\n");

        // Создаем объект через конструктор с выборочными полями
        Car2 customCar = new Car2("Toyota", "A123BC");
        System.out.println("Custom Car (с выборочными полями):");
        System.out.println(customCar.To_String());
        System.out.println("Возраст автомобиля: " + customCar.getCarAge() + " лет\n");

        // Создаем объект через конструктор со всеми полями
        Car2 fullCar = new Car2("BMW", "B456CD", "Черный", 2018);
        System.out.println("Full Car (со всеми полями):");
        System.out.println(fullCar.To_String());
        System.out.println("Возраст автомобиля: " + fullCar.getCarAge() + " лет\n");

        // Использование сеттеров для изменения значений полей
        customCar.setColor("Синий");
        customCar.setYear(2015);
        System.out.println("Custom Car (после изменения через сеттеры):");
        System.out.println(customCar.To_String());
        System.out.println("Возраст автомобиля: " + customCar.getCarAge() + " лет\n");
    }
}
