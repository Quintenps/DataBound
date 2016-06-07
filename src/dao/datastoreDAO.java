package dao;

import platform.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 187z on 6/7/2016.
 */
public class datastoreDAO extends baseDAO {

    public void updateFirstName(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String datafield = df;
            int sessionid = sesid;

            PreparedStatement statement = con.prepareStatement("UPDATE datastore SET firstname=? WHERE userid=?");
            statement.setString(1, datafield);
            statement.setInt(2, sessionid);
            System.out.println(statement.executeUpdate());
            System.out.println("Cards updated!");


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }
    public void updateMiddleName(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String datafield = df;
            int sessionid = sesid;

            PreparedStatement statement = con.prepareStatement("UPDATE datastore SET middlename=? WHERE userid=?");
            statement.setString(1, datafield);
            statement.setInt(2, sessionid);
            System.out.println(statement.executeUpdate());
            System.out.println("Cards updated!");


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }
    public void updateLastName(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String datafield = df;
            int sessionid = sesid;

            PreparedStatement statement = con.prepareStatement("UPDATE datastore SET lastname=? WHERE userid=?");
            statement.setString(1, datafield);
            statement.setInt(2, sessionid);
            System.out.println(statement.executeUpdate());
            System.out.println("Cards updated!");


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }

}