import java.util.Scanner;
import java.time.LocalDate;
public class Main {
    public static String determineLeapYear(int yearExamination) {
        if (yearExamination % 4 == 0 && yearExamination % 100 != 0) {
            String textYear = " -  год високосный";
            //System.out.print("if");
            return textYear;
        } else if (yearExamination % 400 == 0) {
            String textYear = " -  год високосный";
            return textYear;
        } else {
            String textYear = " -  год не високосный";
            return textYear;
        }
    }

    public static String installOS(int OS, int yearOfCreation) {
        int currentYear = LocalDate.now().getYear();
        boolean deviceUntilCurrentYear = yearOfCreation < currentYear;
        switch (OS) {
            case 0: {
                if (deviceUntilCurrentYear) {
                    String text = "Установите lite-версию приложения для iOS по ссылке ...";
                    return text;
                } else {
                    String text = "Установите версию приложения для iOS по ссылке ...";
                    return text;
                }
            }
            case 1:
                if (deviceUntilCurrentYear) {
                    String text = "Установите lite-версию приложения для Android  по ссылке ...";
                    return text;
                } else {
                    String text = "Установите версию приложения для Android  по ссылке ...";
                    return text;
                }
            default: {
                String text = "Вы ввели неверную цифру";
                return text;
            }
        }
    }

    public static int calculationDeliveryDistance(int Distance) {
        int tameDelivery;
        if (Distance <= 20) {
            tameDelivery = 1;
            return tameDelivery;
        } else if (Distance <= 60) {
            tameDelivery = 2;
            return tameDelivery;
        } else if (Distance <= 100) {
            tameDelivery = 3;
            return tameDelivery;
        } else {
            tameDelivery = 4;
            return tameDelivery;
        }
    }
    public static void printSeparator(){
        System.out.println("==================");
    }

    public static void main(String[] args) {
        // Задача 1
        // Реализуйте метод, который получает в качестве параметра год, и проверяет, является ли он високосным,
        // и выводит результат в консоль
        printSeparator();
        System.out.println("Решаем Задачу № 1: определение високосного года");
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите год в формате ХХХХ : ");
        int year = in.nextInt();
        System.out.println(year + determineLeapYear(year));
        printSeparator();

        // Задача 2
        // Напишите метод, куда подаются два параметра: тип операционной системы (ОС) ( 0 — iOS или 1 — Android) и
        // год выпуска устройства.
        // Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
        System.out.println("Решаем Задачу № 2: установка ОС");
        System.out.print("Укажите год выпуска Вашего телефона в формате XXXX :");
        int clientDeviceYear = in.nextInt();
        System.out.print("Укажите какой операционной системой Вы пользуетесь? Если iOS - напишите 0, если Android - 1 : ");
        int clientOS = in.nextInt();
        System.out.println(installOS(clientOS, clientDeviceYear));
        printSeparator();

        // Задача 3
        //доставка банковских карт на дом с четкой датой доставки.
        //написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
        System.out.println("Решаем Задачу № 3 расчёт времени доставки карт в зависимости от расстояния до клиента");
        System.out.print("Укажите расстояние до клиента в км. : ");
        int deliveryDistance = in.nextInt();
        if (calculationDeliveryDistance(deliveryDistance) < 4) {
            System.out.println("Для доставки клиенту на расстоянии " + deliveryDistance + "км. потребуется " + calculationDeliveryDistance(deliveryDistance) + " дней.");
        } else
            System.out.println("Для доставки клиенту на расстоянии более 100 км невозможна!");
        printSeparator();
    }
}