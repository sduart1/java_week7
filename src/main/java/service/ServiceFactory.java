package service;

import util.DatabaseAccess;
import xml.Stocks;

public class ServiceFactory {

    public static StockService getDatabase(Stocks stocks) {
        return new DatabaseAccess();
    }


}
