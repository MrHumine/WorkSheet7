import org.example.Checkks;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @ParameterizedTest
    @ValueSource(ints = {3,23,311,487,653,947})
    void isPrimeTest(int number){

        Checkks test_prime = new Checkks();

        assertTrue(test_prime.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {32, 64, 2, 20, 30, 26})
    void isEvenTest(int number){

        Checkks test_prime = new Checkks();

        assertTrue(test_prime.isEven(number));
    }

    @ParameterizedTest
    @CsvSource(value = {"23, 23", "23,46", "23,115", "23,184", "23,207", "23,230"})
    void isMultipleTest(int number, int number2){

        Checkks test_prime = new Checkks();

        assertTrue(test_prime.isMultiple(number, number2));
    }


};
