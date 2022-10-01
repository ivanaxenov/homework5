public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения Android по сслыке");
        } else if (clientOS == 0) {
            System.out.println(" Установите версию приложения IOS по ссылке");
        } else {
            System.out.println("ОС не подходит, только IOS или Android");
        }

    }

    public static void task2() {
        System.out.println("Задание 2");
        int clientOS = 0;
        int clientDeviceYear = 2012;
        boolean IOS = clientOS == 0 && clientDeviceYear >= 2015;
        boolean lightIOS = clientOS == 0 && clientDeviceYear <= 2015;
        boolean android = clientOS == 1 && clientDeviceYear >= 2015;
        boolean lightAndroid = clientOS == 1 && clientDeviceYear <= 2015;
        if (android) {
            System.out.println("Установите версию приложения Android по ссылке ");
        } else if (lightAndroid) {
            System.out.println("Установите облегченную версию приожения для Android");
        }
        if (IOS) {
            System.out.println("Установите версию приложения IOS по ссылке ");
        } else if (lightIOS) {
            System.out.println("Установите облегченную версию приожения для IOS");
        } else {
            System.out.println("ОС не подходит, только IOS или Android");
        }

    }

    public static void task3() {
        System.out.println("Задание 3");
        int year = 2021;
        boolean notLeap = year % 100 == 0 && year % 4 != 0 || year % 100 == 0 && year % 400 != 0;
        if (notLeap) {
            System.out.println("Год не является высокосным");
        } else {
            System.out.println("Год высокосный");
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        int deliveryDistance = 100;
        boolean day = deliveryDistance < 20;
        boolean plusDay = deliveryDistance >= 20 && deliveryDistance <= 60;
        boolean plusTwo = deliveryDistance > 60 && deliveryDistance <= 100;
        if (day) {
            System.out.println("Доставка карты 1 день");
        } else if (plusDay) {
            System.out.println("Доставка карты 2 деня");
        } else if (plusTwo) {
            System.out.println("Доставка карты 3 деня");
        } else {
            System.out.println("Доставка карт больше 3 дней");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int monthNumber = 2;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
                System.out.println("Сейчас лето");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Сейчас осень");
                break;
            case 11:
            default:
                System.out.println("Неверный номер месяца, введите с 1-12.");


        }

    }

}