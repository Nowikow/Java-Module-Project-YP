import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Race race = new Race(); // новый прототип гонки

        for (int i=0; i<3; i++) {
            race.checkWinner(carMaker(i+1)); // метод проверки дистанции с созданием нового автомобиля
        }

        System.out.println("Самая быстрая машина: " + race.winnerName); // вывод имени победителя
    }

    public static boolean speedCheck(int speed) { //функция проверки скорости автомобиля
        return speed > 0 && speed <= 250;
    }

    public static Car carMaker(int carNumber) {
        Scanner scanner = new Scanner(System.in); //активация класса Scanner

        int speed = 0; // будущая скорость автомобиля
        String name = ""; // будущее имя автомобиля

        System.out.println("Введите название машины №" + carNumber + ":"); //запрос названия автомобиля
        name = scanner.nextLine();


        while (true) {
            System.out.println("Введите скорость машины №" + carNumber + ":"); //запрос скорости автомобиля
            speed = scanner.nextInt();

            if (speedCheck(speed)) { //проверка допустимого диапазона скоростей
                break;
            } else {
                System.out.println("Неправильная скорость");
            }
        }

        return new Car(name, speed); // возврат готового прототипа автомобиля
    }
}