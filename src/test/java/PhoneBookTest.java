import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookTest {
    PhoneBook sut = new PhoneBook();
    @Test
    public void testsAdditional() {
        System.out.println("Test add");

        // given:
        String name = "Вася";
        String number = "9067697727";

        int expected = 1;

        // when:
        var result = sut.add(name, number);

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testsAdditionalDouble() {
        System.out.println("Test add double");

        // given:
        String name1 = "Вася";
        String name2 = "Лена";
        String number = "9067697727";

        int expected = 1;

        // when:
        sut.add(name1, number); // Добавляем пользователя
        var result = sut.add(name2, number); // Пользователь с одинаковым номером не должен добавиться

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testsFindByNumber() {
        System.out.println("Test findByNumber");

        // given:
        String name = "Вася";
        String number = "9067697727";

        String expected = "Вася";

        // when:
        sut.add(name, number);
        var result = sut.findByNumber(number);

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testsFindByNumberMissing() {
        System.out.println("Test findByNumber missing");

        // given:
        String name = "Вася";
        String number = "9067697727";

        String expected = PhoneBook.notNumberMessage;

        // when:
        sut.add(name, number);
        var result = sut.findByNumber("0001234567");

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testsfindByName() {
        System.out.println("Test findByName");

        // given:
        String name = "Вася";
        String number = "9067697727";

        String expected = "9067697727";

        // when:
        sut.add(name, number);
        var result = sut.findByName("Вася");

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testsFindByNameMissing() {
        System.out.println("Test findByName missing");

        // given:
        String name = "Вася";
        String number = "9067697727";

        String expected = PhoneBook.notNameMessage;

        // when:
        sut.add(name, number);
        var result = sut.findByName("Ирина");

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testsPrintAllNames() {
        System.out.println("Test printAllNames");

        // given:
        List<String> expected = new ArrayList();
        expected.add("Алексей");
        expected.add("Ирина");
        expected.add("Юрий");

        // when:
        sut.add("Юрий", "0983717");
        sut.add("Алексей", "098371247");
        sut.add("Ирина", "0983243717");
        var result = sut.printAllNames();

        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testsPrintAllNamesEmpty() {
        System.out.println("Test printAllNames empty");

        // given:
        List<String> expected = new ArrayList();

        // when:
        var result = sut.printAllNames();

        // then:
        Assertions.assertEquals(expected, result);
    }
}
