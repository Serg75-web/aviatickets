import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Ticket ticket1 = new Ticket("Minsk", "Berlin", 65, 14, 17);
        Ticket ticket2 = new Ticket("Moscow", "Boston", 165, 13, 21);

        System.out.println(ticket1.compareTo(ticket2));
    }

}
