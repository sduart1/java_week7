package xml;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class StockTest {

    @Test
    public void stockTest(){

        Stock stockTest = new Stock();
        stockTest.setID(stockTest.getID());
        stockTest.setTime(stockTest.getTime());
        stockTest.setPrice(stockTest.getPrice());
        stockTest.setSymbol(stockTest.getSymbol());

        assertNotNull("Testing stock creation", stockTest);

    }



}
