public class Person {
    private final String name;
    private final String surname;
    private int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }
}