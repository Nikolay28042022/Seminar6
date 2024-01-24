import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        System.out.println("Укажите параметры заказа:");

        Scanner scanner = new Scanner(System.in);

        Order order = new Order();
        InputProcessor inputProcessor = new OrderInputProcessor(scanner);
        inputProcessor.processInput(order);

        FileSaver fileSaver = new OrderFileSaver();
        fileSaver.saveToFile(order);

        System.out.println("Заказ успешно сохранен в файл order.json.");

        // Закрываем сканнер после использования
        scanner.close();
    }
}
