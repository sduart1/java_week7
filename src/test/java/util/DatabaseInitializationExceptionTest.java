package util;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import util.DatabaseInitializationException;

/**
 *
 * Unit test for DatabaseInitializationException
 */
public class DatabaseInitializationExceptionTest {

    /**
     * Initialize the Expected Exception Thrown
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     *
     * @throws DatabaseInitializationException
     * Set the expected exception thrown to DatabaseInitializationException.
     * Create an instance in which the exception is thrown.
     * Verify it is the correct exception.
     */
    @Test
    public void testInitialize() throws DatabaseInitializationException {
        thrown.expect(DatabaseInitializationException.class);

        int testVal = 0;

        if (testVal != 1){
            throw new DatabaseInitializationException("Testing database initialization", null);
        }

    }



}
