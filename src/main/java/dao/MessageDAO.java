package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * Created by 187z on 6/12/2016.
 */
public class MessageDAO extends baseDAO {

    public void newMsg(String msg, int receiver, int sender) {

        try (Connection con = super.getConnection()) {
                long unixTime = System.currentTimeMillis() / 1000L;

                PreparedStatement statement = con.prepareStatement("INSERT INTO Messages (date, receive_userid, sender_userid, message, isread) VALUES (?,?,?,?,?)");
                statement.setLong(1, unixTime);
                statement.setInt(2, receiver);
                statement.setInt(3, sender);
                statement.setString(4, msg);
                statement.setInt(5, 0);
                statement.executeUpdate();
                System.out.println("Message made!");


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }

    public void markRead(int uid){
        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("UPDATE Messages SET isread=1 WHERE receive_userid=?");
            statement.setInt(1, uid);
            statement.executeUpdate();
            System.out.println("Everything marked as read!");


        }catch (SQLException sqle) { sqle.printStackTrace(); }

    }

    public int selectUnread(int uid){
        int unread = 0;
        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT count(messageid) as unreadtotal FROM Messages WHERE isread=0 AND receive_userid=?");
            statement.setInt(1, uid);
            ResultSet sqlresult = statement.executeQuery();
            sqlresult.next();
            unread = sqlresult.getInt("unreadtotal");

            System.out.println("There are "+ unread +" unread messages");




        }catch (SQLException sqle) { sqle.printStackTrace(); }
        return unread;
    }

    public HashMap<Integer, Integer> whichMessages(int userid) {
        HashMap<Integer, Integer> allmsgs = new HashMap();

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT messageid, receive_userid FROM Messages WHERE receive_userid=? ");
            statement.setInt(1, userid);

            System.out.println(statement.toString()); // DEBUG
            ResultSet sqlresult = statement.executeQuery();
            while(sqlresult.next()) {
                int msgid = sqlresult.getInt("messageid");
                int receive_userid = sqlresult.getInt("receive_userid");


                allmsgs.put(msgid, receive_userid);
            }

        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return allmsgs;
    }

    public HashMap<Integer, String> allMessages(int userid, int msgid) {
        HashMap<Integer, String> allmsgs = new HashMap();

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT * FROM Messages WHERE receive_userid=? AND messageid=?  ORDER BY messageid DESC");
            statement.setInt(1, userid);
            statement.setInt(2, msgid);

            System.out.println(statement.toString()); // DEBUG
            ResultSet sqlresult = statement.executeQuery();

            while(sqlresult.next()) {
                String date = sqlresult.getString("date");
                String receive_userid = sqlresult.getString("receive_userid");
                String sender_userid = sqlresult.getString("sender_userid");
                String message = sqlresult.getString("message");


                allmsgs.put(1, date);
                allmsgs.put(2, receive_userid);
                allmsgs.put(3, sender_userid);
                allmsgs.put(4, message);

            }

        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return allmsgs;
    }

}
