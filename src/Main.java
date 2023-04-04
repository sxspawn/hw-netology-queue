import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static List<Person> generateClients() {
        List<Person> clients = new LinkedList<>();
        clients.add(new Person("Иван", "Иванов", 2));
        clients.add(new Person("Петр", "Петров", 3));
        clients.add(new Person("Михаил", "Михайлов", 1));
        clients.add(new Person("Алексей", "Алексеев", 5));
        clients.add(new Person("Николай", "Николаев", 4));
        return clients;
    }

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println(person.getName() + " " + person.getSurname() + " прокатился на аттракционе.");
            person.setTickets(person.getTickets() - 1);
            if (person.getTickets() > 0) {
                queue.offer(person);
            }
        }
    }
}