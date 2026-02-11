import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");

        // Создаем очередь и заполняем её первыми клиентами
        Queue<String> clientsQueue = new ArrayDeque<>(firstClients);

        // Обрабатываем очередь
        while (!clientsQueue.isEmpty()) {
            // Извлекаем следующего клиента
            String currentClient = clientsQueue.poll();

            // Обрабатываем клиента
            System.out.println(currentClient + " сделала новый маникюр.");

            // С вероятностью 50% добавляем друга
            if (Math.random() < 0.5) {
                String friend = "a friend of " + currentClient;
                clientsQueue.offer(friend);
                System.out.println("  -> " + friend + " записался в очередь");
            }
        }

        System.out.println("Все клиенты обслужены!");
    }
}