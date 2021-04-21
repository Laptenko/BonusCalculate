package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @ParameterizedTest(name = "{index} - " + "{0}")
    @CsvSource(value = {
            "'registered user, bonus under limit', 100060, true, 30"}
    )
    void calculate(String testName, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();
        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual); // сравнивает ОР и ФР
    }
}