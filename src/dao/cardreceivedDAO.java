package dao;

import platform.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 187z on 6/8/2016.
 */
public class cardreceivedDAO extends baseDAO {

    public HashMap<String, Integer> cardAccess(int uid) {
        HashMap<String, Integer > receivedCardAccess = new HashMap<>();


        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT userid, cardname FROM cardshare WHERE receiveduser=?");
            statement.setInt(1, uid);

            ResultSet cardAccess = statement.executeQuery();



            while(cardAccess.next()){
                int userid = cardAccess.getInt("userid");
                String cardname = cardAccess.getString("cardname");
                receivedCardAccess.put(cardname, userid);
            }




        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return receivedCardAccess;
    }

    public String cardShareCount(int uid, String cn) {
        int CSC = 0;
        String CSCF = "0";

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT count(userid) AS total FROM cardshare WHERE userid=? AND cardname=?");
            statement.setInt(1, uid);
            statement.setString(2, cn);

            ResultSet cardAccess = statement.executeQuery();
            cardAccess.next();
            CSC = cardAccess.getInt("total");
            CSCF = Integer.toString(CSC);



        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return CSCF;
    }



}
