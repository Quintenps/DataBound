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

    public HashMap<Integer, String> cardAccess(int uid) {
        HashMap<Integer, String> receivedCardAccess = new HashMap<>();


        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT userid, cardname FROM cardshare WHERE receiveduser=?");
            statement.setInt(1, uid);

            ResultSet cardAccess = statement.executeQuery();



            while(cardAccess.next()){
                int userid = cardAccess.getInt("userid");
                String cardname = cardAccess.getString("cardname");
                receivedCardAccess.put(userid, cardname);
            }




        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return receivedCardAccess;
    }
}
