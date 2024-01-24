import java.util.Scanner;

class OrderInputProcessor implements InputProcessor {
    private Scanner scanner;

    public OrderInputProcessor(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void processInput(Order order) {
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(getIntInput("Кол-во: "));
        order.setPrice(getIntInput("Цена: "));
    }

    private String prompt(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    private int getIntInput(String message) {
        int input = 0;
        boolean validInput = false;
        do {
            try {
                System.out.println(message);
                input = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите целое число.");
            }
        } while (!validInput);
        return input;
    }
}

