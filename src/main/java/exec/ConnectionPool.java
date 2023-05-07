package exec;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private int maxConnection;
    private List<Connection> connectionList = new ArrayList<>();

    public ConnectionPool ( int maxConnection) {
        this.maxConnection = maxConnection;
    }


    // lazy
    public Connection getConnection ( ) throws Exception {

        Connection freeConnection = null;
        for ( Connection conn: connectionList ) {
          //  if ( !conn.isTaken() ) {
       //         freeConnection=conn;
        //    }
        }
        if ( freeConnection != null ) {
            return freeConnection;
        }

        if ( connectionList.size() == maxConnection ) {
            throw new Exception( " Max size reached ");
        }

        Connection newConnection = new Connection();
        connectionList.add(newConnection);
        return newConnection;
    }
    public void endConnection ( String connectionId ) throws Exception {
     //   if ( connectionList.isEmpty() ) {
    //        throw new Exception( " No connection exists ");
    //    }
    //    for ( Connection conn: connectionList ) {
         //   if (conn.getId() == connectionId) {
          //  }else {
       //         throw new Exception( " connection id does not exists ");
        //    }
         //   if ( !conn.isTaken()) {
        //        throw new Exception( " connection id is free and can not be set to free");
//
            }

     //       conn.setTaken(false);
      //      break;
            }
    //    }

 //   }


