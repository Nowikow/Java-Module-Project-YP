import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Race race = new Race(); // новый прототип гонки

        for (int i=0; i<3; i++) {
            race.checkWinner(carMaker(i+1)); // метод проверки дистанции с созданием нового автомобиля
        }

        System.out.println("Самая быстрая машина: " + race.winnerName); // вывод имени победителя
    }

    public static Car carMaker(int carNumber) {
        Scanner scanner = new Scanner(System.in); //активация класса Scanner

        int speed = 0; // будущая скорость автомобиля
        String name = ""; // будущее имя автомобиля

        while (true) {
            System.out.println("Введите название машины №" + carNumber + ":"); //запрос названия автомобиля
            name = scanner.nextLine();

            if (name == "") { //проверка имени на пустую строку
                System.out.println("Название автомобиля не должно быть пустой строкой");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Введите скорость машины №" + carNumber + ":"); //запрос скорости автомобиля

            if (scanner.hasNextInt()) { // проверка введённой скорости на тип int

                speed = scanner.nextInt();

                if (speed > 0 && speed <= 250) { // проверка введённой скорости в допустимом диапазоне от 0 до 250
                    break;
                } else {
                    System.out.println("Введённая скорость должна быть больше 0, но меньше 250");
                }
            } else {
                System.out.println("Введённая скорость не является целым числом");
                scanner.nextLine();
            }
        }

        return new Car(name, speed); // возврат готового прототипа автомобиля
    }
}