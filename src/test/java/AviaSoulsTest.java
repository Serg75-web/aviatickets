import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AviaSoulsTest {

    @Test
    public void searchTickets() {

        AviaSouls find = new AviaSouls();

        Ticket ticket1 = new Ticket("Minsk", "Berlin", 65, 14, 17);
        Ticket ticket2 = new Ticket("Moscow", "Boston", 165, 13, 21);
        Ticket ticket3 = new Ticket("London", "Rome", 72, 16, 19);
        Ticket ticket4 = new Ticket("Beijing", "Vladivostok", 52, 9, 11);
        Ticket ticket5 = new Ticket("Dubai", "Moscow", 83, 17, 20);
        Ticket ticket6 = new Ticket("Beijing", "Vladivostok", 56, 11, 14);

        find.add(ticket1);
        find.add(ticket2);
        find.add(ticket3);
        find.add(ticket4);
        find.add(ticket5);
        find.add(ticket6);

        Ticket[] expected = {ticket4, ticket6}; // ожидаем выдачу с самых дешевых
        Ticket[] actual = find.search("Beijing", "Vladivostok"); // ищем билеты из Пекина во Владивосток

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchTickets1() {

        AviaSouls find = new AviaSouls();

        Ticket ticket1 = new Ticket("Minsk", "Berlin", 65, 14, 17);
        Ticket ticket2 = new Ticket("Moscow", "Boston", 165, 13, 21);
        Ticket ticket3 = new Ticket("London", "Rome", 72, 16, 19);
        Ticket ticket4 = new Ticket("Beijing", "Vladivostok", 52, 9, 11);
        Ticket ticket5 = new Ticket("Dubai", "Moscow", 83, 17, 20);
        Ticket ticket6 = new Ticket("Beijing", "Vladivostok", 56, 11, 14);

        find.add(ticket1);
        find.add(ticket2);
        find.add(ticket3);
        find.add(ticket4);
        find.add(ticket5);
        find.add(ticket6);

        Ticket[] expected = {};
        Ticket[] actual = find.search("Minsk", "Rome"); // ищем билеты из Минска в Рим

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchTickets2() {

        AviaSouls find = new AviaSouls();

        Ticket ticket1 = new Ticket("Minsk", "Berlin", 65, 14, 17);
        Ticket ticket2 = new Ticket("Moscow", "Boston", 165, 13, 21);
        Ticket ticket3 = new Ticket("London", "Rome", 72, 16, 19);
        Ticket ticket4 = new Ticket("Beijing", "Vladivostok", 52, 9, 11);
        Ticket ticket5 = new Ticket("Dubai", "Moscow", 83, 17, 20);
        Ticket ticket6 = new Ticket("Beijing", "Vladivostok", 56, 11, 14);

        find.add(ticket1);
        find.add(ticket2);
        find.add(ticket3);
        find.add(ticket4);
        find.add(ticket5);
        find.add(ticket6);

        Ticket[] expected = {ticket2};
        Ticket[] actual = find.search("Moscow", "Boston"); // ищем  билеты из Москвы в Бостон

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchTickets3() {

        AviaSouls find = new AviaSouls();

        Ticket ticket1 = new Ticket("Minsk", "Berlin", 65, 14, 17);
        Ticket ticket2 = new Ticket("Moscow", "Boston", 165, 13, 21);
        Ticket ticket3 = new Ticket("London", "Rome", 72, 16, 19);
        Ticket ticket4 = new Ticket("Beijing", "Vladivostok", 52, 9, 11);
        Ticket ticket5 = new Ticket("Dubai", "Moscow", 83, 17, 20);
        Ticket ticket6 = new Ticket("Beijing", "Vladivostok", 56, 11, 14);

        find.add(ticket1);
        find.add(ticket2);
        find.add(ticket3);
        find.add(ticket4);
        find.add(ticket5);
        find.add(ticket6);

        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket4, ticket6};
        Ticket[] actual = find.searchAndSortBy("Beijing", "Vladivostok", comparator); // ищем  билеты с самым коротким перелетом

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchTickets4() {

        AviaSouls find = new AviaSouls();

        Ticket ticket1 = new Ticket("Minsk", "Berlin", 65, 14, 17);
        Ticket ticket2 = new Ticket("Moscow", "Boston", 165, 13, 21);
        Ticket ticket3 = new Ticket("London", "Rome", 72, 16, 19);
        Ticket ticket4 = new Ticket("Beijing", "Vladivostok", 52, 9, 11);
        Ticket ticket5 = new Ticket("Dubai", "Moscow", 83, 17, 20);
        Ticket ticket6 = new Ticket("Beijing", "Vladivostok", 56, 11, 14);

        find.add(ticket1);
        find.add(ticket2);
        find.add(ticket3);
        find.add(ticket4);
        find.add(ticket5);
        find.add(ticket6);

        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket5};
        Ticket[] actual = find.searchAndSortBy("Dubai", "Moscow", comparator); // ищем  билеты с самым коротким перелетом

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchTickets5() {

        AviaSouls find = new AviaSouls();

        Ticket ticket1 = new Ticket("Minsk", "Berlin", 65, 14, 17);
        Ticket ticket2 = new Ticket("Moscow", "Boston", 165, 13, 21);
        Ticket ticket3 = new Ticket("London", "Rome", 72, 16, 19);
        Ticket ticket4 = new Ticket("Beijing", "Vladivostok", 52, 9, 11);
        Ticket ticket5 = new Ticket("Dubai", "Moscow", 83, 17, 20);
        Ticket ticket6 = new Ticket("Beijing", "Vladivostok", 56, 11, 14);

        find.add(ticket1);
        find.add(ticket2);
        find.add(ticket3);
        find.add(ticket4);
        find.add(ticket5);
        find.add(ticket6);

        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = find.searchAndSortBy("Minsk", "Moscow", comparator); // ищем  билеты с самым коротким перелетом

        Assertions.assertArrayEquals(expected, actual);

    }


}
