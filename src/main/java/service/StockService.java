package service;

import org.hibernate.HibernateException;
import xml.Stock;
import xml.Stocks;

public interface StockService {

    public void addObjectsToDatabase(Stocks stock) throws HibernateException;

}
