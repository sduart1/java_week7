package xml;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class StocksTest {

    @Test
    public void stocksTest(){

        Stocks stockTest = new Stocks();
        assertNotNull("Testing stock list creation", stockTest.getStock());
    }

}
