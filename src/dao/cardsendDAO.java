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

            if (!hasCard(rcuid, sesid)) {
                PreparedStatement statement = con.prepareStatement("INSERT INTO cardshare VALUES (?,?,?)");

                statement.setInt(1, sesid);
                statement.setString(2, cn);
                statement.setInt(3, rcuid);

                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }

        public boolean hasCard(int receiveuid, int myuid) {


        boolean hasCard = true;

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT cardname FROM cardshare WHERE receiveduser=? AND userid=? ");

            statement.setInt(1, receiveuid);
            statement.setInt(2, myuid);

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
