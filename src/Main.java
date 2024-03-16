// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача 2");
        int clientOS1 = 1;
        int clientDeviceYear = 2017;
        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения IOS по ссылке");
        } else if (clientOS1== 0 && clientDeviceYear >= 2015) {
            System.out.println("Учтановите версию приложения для IOS по ссылке");
        }
        if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите блегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача 3");
        int year = 2024;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + "не является високосным");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            System.out.println("Доставка занимает 1 сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка займёт 2 суток");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Доставка займёт 3 суток");
        } else {
            System.out.println("Доставка не осуществляется");
        }
        System.out.println("Задача 5");
        int monthNomber = 88;
        switch (monthNomber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц под номером " + monthNomber + " относсится к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц под номером " + monthNomber + " относится к сезону весна" );
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц под номером " + monthNomber + " относится к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц под номером " + monthNomber + " относится к сезону осень");
                break;
            default:
                System.out.println("Месяца под номером " + monthNomber + " не существует");

        }


    }

}







