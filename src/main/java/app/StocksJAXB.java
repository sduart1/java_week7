package app;

import org.hibernate.Session;
import util.DatabaseConnectionException;
import util.DatabaseUtils;
import util.HibernateUtil;
import xml.Stocks;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;

public class StocksJAXB {

    /**
     * An enumeration that indicates how the program terminates (ends)
     */
    private enum ProgramTerminationStatusEnum {

        // for now, we just have normal or abnormal but could more specific ones as needed.
        NORMAL(0),
        ABNORMAL(-1);

        // when the program exits, this value will be reported to underlying OS
        private int statusCode;

        /**
         * Create a new  ProgramTerminationStatusEnum
         *
         * @param statusCodeValue the value to return the OS. A value of 0
         *                        indicates success or normal termination.
         *                        non 0 numbers indicate abnormal termination.
         */
        private ProgramTerminationStatusEnum(int statusCodeValue) {
            this.statusCode = statusCodeValue;
        }

        /**
         * @return The value sent to OS when the program ends.
         */
        private int getStatusCode() {
            return statusCode;
        }
    }

    /**
     * Terminate the application.
     *
     * @param statusCode        an enum value that indicates if the program terminated ok or not.
     * @param diagnosticMessage A message to display to the user when the program ends.
     *                          This should be an error message in the case of abnormal termination
     *                          <p/>
     *                          NOTE: This is an example of DRY in action.
     *                          A program should only have one exit point. This makes it easy to do any clean up
     *                          operations before a program quits from just one place in the code.
     *                          It also makes for a consistent user experience.
     */
    private static void exit(ProgramTerminationStatusEnum statusCode, String diagnosticMessage) {
        if (statusCode == ProgramTerminationStatusEnum.NORMAL) {
            System.out.println(diagnosticMessage);
        } else if (statusCode == ProgramTerminationStatusEnum.ABNORMAL) {
            System.err.println(diagnosticMessage);
        } else {
            throw new IllegalStateException("Unknown ProgramTerminationStatusEnum.");
        }
        System.exit(statusCode.getStatusCode());
    }

    /**
     *
     * @param args
     * @throws JAXBException
     * @throws FileNotFoundException
     */

    public static void main(String[] args) throws JAXBException, FileNotFoundException, DatabaseConnectionException {

        // be optimistic init to positive values
        ProgramTerminationStatusEnum exitStatus = ProgramTerminationStatusEnum.NORMAL;
        String programTerminationMessage = "Normal program termination.";


        JAXBContext context = JAXBContext.newInstance(Stocks.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Stocks stocks = (Stocks) unmarshaller.unmarshal(new FileReader("src/main/resources/stock_info.xml"));
        System.out.println(stocks.toString());

        try {
            Connection connection = DatabaseUtils.getConnection();
            Session session = DatabaseUtils.getSessionFactory().openSession();
            session.beginTransaction();

            //Commit the transaction
            session.getTransaction().commit();
            HibernateUtil.shutdown();
            } catch (DatabaseConnectionException  exception) {
                throw new DatabaseConnectionException (exception.getMessage(), exception);
            }

    }
}
