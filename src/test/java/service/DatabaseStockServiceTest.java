package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.metamodel.relational.Database;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.DatabaseUtils;
import xml.Stock;
import xml.Stocks;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DatabaseStockServiceTest {
    private static SessionFactory sessionFactory;
    private static Session session;

    @Test
    public void openSessionFactoryTest(){
        sessionFactory = DatabaseUtils.getSessionFactory();
        System.out.println("Session Factory Created");
        assertNotNull("Factory creation worked", sessionFactory);
    }


    @Test
    public void openSessionTest() {
        session = DatabaseUtils.getSessionFactory().openSession();
        assertNotNull("Session creation worked", session);
    }


}

/*

public class HibernateUtilTest {

    private static SessionFactory sessionFactory;
    private Session session;

    @BeforeAll
    public static void setup() {
        sessionFactory = HibernateUtil.getSessionFactory();
        System.out.println("SessionFactory created");
    }

    @AfterAll
    public static void tearDown() {
        if (sessionFactory != null) sessionFactory.close();
        System.out.println("SessionFactory destroyed");
    }

    @Test
    public void testCreate() {
    }

    @Test
    public void testUpdate() {
    }

    @Test
    public void testGet() {
    }

    @Test
    public void testList() {
    }

    @Test
    public void testDelete() {
    }

    @BeforeEach
    public void openSession() {
        session = sessionFactory.openSession();
        System.out.println("Session created");
    }

    @AfterEach
    public void closeSession() {
        if (session != null) session.close();
        System.out.println("Session closed\n");
    }
}
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
 */

