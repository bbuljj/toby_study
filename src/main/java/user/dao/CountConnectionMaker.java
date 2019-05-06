package user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class CountConnectionMaker implements ConnectionMaker{
    private int count;

    private ConnectionMaker connectionMaker;

    public CountConnectionMaker(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
        count++;
        return connectionMaker.makeNewConnection();
    }

    public int getCount() {
        return this.count;
    }
}
