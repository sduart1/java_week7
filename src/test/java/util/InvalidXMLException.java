package util;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class InvalidXMLException extends Throwable {


        @Rule
        public ExpectedException thrown = ExpectedException.none();

        /**
         *
         * @throws InvalidXMLException
         * Set the expected exception thrown to DatabaseInitializationException.
         * Create an instance in which the exception is thrown.
         * Verify it is the correct exception.
         */
        @Test
        public void testInitialize() throws InvalidXMLException {
            thrown.expect(InvalidXMLException.class);

            int testVal = 0;

            if (testVal != 1){
                String cause = null;
                throw new InvalidXMLException();
            }

        }



    }


