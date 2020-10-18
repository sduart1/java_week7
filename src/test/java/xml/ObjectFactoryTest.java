package xml;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ObjectFactoryTest {

    @Test
    public void createStocksTest(){
        ObjectFactory stocksTest = new ObjectFactory();
        assertNotNull("Testing stock creation method", stocksTest.createStocks());
    }


    public void createStockTest() {
        ObjectFactory stockTest = new ObjectFactory();
        assertNotNull("Testing individual stock creation method", stockTest.createStock());
    }
}
