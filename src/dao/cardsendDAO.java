package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 187z on 6/8/2016.
 */
public class cardsendDAO extends baseDAO {

    public void sendCard(int sesid, String cn, int rcuid) {

        try (Connection con = super.getConnection()) {

            String cardname = cn;
            int receiveuid = rcuid;
            int sessionid = sesid;

            if (!hasCard(rcuid)) {
                PreparedStatement statement = con.prepareStatement("INSERT INTO cardshare VALUES (?,?,?)");

                statement.setInt(1, sesid);
                statement.setString(2, cn);
                statement.setInt(3, rcuid);

                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }

        public boolean hasCard(int uid) {


        boolean hasCard = true;
        int GetUid = uid;

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT cardname FROM cardshare WHERE receiveduser=?");

            statement.setInt(1, GetUid);

            System.out.println(statement.toString()); // DEBUG
            ResultSet sqlresult = statement.executeQuery();


            if (!sqlresult.isBeforeFirst()){
                System.out.println("User does not have this card yet!");
                hasCard = false;
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return hasCard;
    }

}
