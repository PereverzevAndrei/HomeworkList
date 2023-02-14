import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> basket = new ArrayList<>();

        while (true) {
            System.out.println("\nВыберите операцию: \n 1. Добавить\n 2. Показать\n 3. Удалить\n 4. Завершить \n");
            String input = scanner.next();
            int action = Integer.parseInt(input);
            if ("4".equals(input)) {
                break;
            }
            if (action == 1) {
                String goods = scanner.next();
                basket.add(goods);
                System.out.println("Список покупок:  " + basket.size());
                System.out.println();
            } else if (action == 2) {
                System.out.println("Итого в корзине: ");
                for (int i = 0; i < basket.size(); i++) {
                    System.out.println((i + 1) + " " + basket.get(i));
                }
            } else if (action == 3) {
                System.out.println("\nВведите номер продукта или название ");
                String deletion = scanner.next();
                if (deletion.matches("-?\\d+(\\.\\d+)?")) {
                    int number = Integer.parseInt(deletion);
                    basket.remove(number - 1);
                } else {
                    basket.remove(deletion);
                }
            }
        }
    }
}
