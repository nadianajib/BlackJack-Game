public class ConnectionDB {
    public class ConnectionDB {
 import java.sql.Connection;
import java.sql.DriverManager;



        public class ConnectionDB {


            public static void main(String[] args) {

                Connection connection = null;

                try {

                    Class.forName("org.postgresql.Driver");
                    connection = DriverManager.getConnection("jdbc:postgresql://Localhost:5432/postgres","postgres","root");
                    if(connection!= null) {
                        System.println.out("Connection OK");
                    } else {
                        System.println.out("Connection Failed");

                    }
                } catch (Exception e) {

                    System.println.out(e);

                }

            }

        }

    }

}
