import java.util.Scanner;

void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Hero hero = new Hero();

    while (true) {
        IO.println("\nУкажите, как должен двигаться герой:");
        IO.println("1 — пешком");
        IO.println("2 — на лошади");
        IO.println("3 — лететь");
        IO.println("0 — выход");
        IO.print("Ваш выбор: ");

        int choice;

        // Проверка на ввод только цифр
        while (!scanner.hasNextInt()) {
            IO.println("Ошибка! Введите только цифру.");
            IO.print("Ваш выбор: ");
            scanner.next(); // очищаем некорректный ввод
        }

        choice = scanner.nextInt();

        // Условие выхода из цикла
        if (choice == 0) {
            IO.println("Выход из программы. Пока!");
            break;
        }

        switch (choice) {
            case 1:
                hero.setStrategy(new Walking());
                break;
            case 2:
                hero.setStrategy(new HorseRiding());
                break;
            case 3:
                hero.setStrategy(new Flying());
                break;
            default:
                IO.println("Неверный выбор, герой пойдёт пешком.");
                hero.setStrategy(new Walking());
                break;
        }
        hero.Move();   // выполняем перемещение выбранным способом
    }
    scanner.close();
}