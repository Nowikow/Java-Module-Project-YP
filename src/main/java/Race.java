public class Race {

    String winnerName = ""; // имя победителя
    int winnerDistance = 0; // дистанция, которую проехал победитель

    public void checkWinner(Car car) { //метод, определяющий победителей
        int checkDistance = 24 * car.carSpeed;

        if (checkDistance > winnerDistance) { // проверка пройденный дистанции сравнением с дистанцией предыдщуего авто
            this.winnerDistance = checkDistance;
            this.winnerName = car.carName; // запись имени текущего победителя
        }
    }
}
