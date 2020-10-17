package util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import service.StockService;
import xml.Stocks;

public class DatabaseAccess implements StockService {

    //  TO DO: ADD CUSTOM EXCEPTION
    public void addObjectsToDatabase(Stocks stocks) throws HibernateException {
        Transaction transaction = null;
        Session session = null;
        try{
            session = DatabaseUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(stocks);
            transaction.commit();
        } catch (HibernateException e){
            if (transaction != null && transaction.isActive()) {
                transaction.rollback(); // close transaction
            }
            if (session != null){
                session.close();
            }
        }
    }
}
