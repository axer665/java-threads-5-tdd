import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
