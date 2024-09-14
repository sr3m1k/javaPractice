import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект для считывания ввода от пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем ввод имени
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");


        // Запрашиваем ввод имени
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        System.out.print("Введите каой сейчас год: ");
        int year = scanner.nextInt();
        System.out.println("Ты " + Calculator.add(year, age) + " года рождения");
        // Закрываем сканер для освобождения ресурсов
        scanner.close();
    }
}

