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

    public void updateData(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String datafield = df;
            int sessionid = sesid;
            System.out.println("UPDATE datastore set "+datafield+" datafield");

            PreparedStatement statement = con.prepareStatement("UPDATE datastore SET ?=? WHERE userid=?");
            statement.setString(1, datafield);
            statement.setString(2, datafield);
            statement.setInt(3, sessionid);
            System.out.println(statement.executeUpdate());
//
//            ResultSet sqlresult = statement.executeQuery();
//            sqlresult.next();
//            int uid = (Integer) sqlresult.getObject("userid");
//
//            PreparedStatement addds = con.prepareStatement("INSERT INTO datastore (userid) VALUES (?) ");
//            addds.setInt(1, uid);
//            addds.executeUpdate();
//            System.out.println("Datastore added!");
//
//            PreparedStatement addcd = con.prepareStatement("INSERT INTO cards (userid,cardname) VALUES (?,'FamilyCard'),(?,'BusinessCard'),(?,'UnknownCard') ");
//            addcd.setInt(1, uid);
//            addcd.setInt(2, uid);
//            addcd.setInt(3, uid);
//            addcd.executeUpdate();
            System.out.println("Cards updated!");


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }

}