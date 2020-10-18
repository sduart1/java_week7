package app;

import app.StocksJAXB;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class StocksJAXBTest {

    @Test
    public void testApp(){
        StocksJAXB app = new StocksJAXB();
        assertNotNull("App is executing", app);
    }
}
