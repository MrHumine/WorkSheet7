import org.example.Checkks;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @ParameterizedTest
    @ValueSource(ints = {3,23,311,486,653,947})
    void isPrimeTest(int number){

        Checkks test_prime = new Checkks();

        assertTrue(test_prime.isPrime(number));
    };
}
