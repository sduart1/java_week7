package service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import xml.Stocks;

/**
 *  Stock service that adds stock data to a list. Stock data
 *  being retrieved is from XML document passed to main.
 */
public class DatabaseStockService {

    private static SessionFactory factory;
    public void addStock(Stocks stock) {

        Session session = factory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(stock);
            transaction.commit();
        }catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
