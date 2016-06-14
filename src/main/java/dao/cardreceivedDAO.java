package dao;

import platform.CardAccess;
import platform.User;

import javax.smartcardio.Card;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 187z on 6/8/2016.
 */
public class cardreceivedDAO extends baseDAO {

    public ArrayList cardAccess(int uid) {
//        HashMap<Integer, ArrayList> receivedCardAccess = new HashMap<>();
        ArrayList<CardAccess> data = new ArrayList<>();


        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT userid, cardname FROM Cardshare WHERE receiveduser=?");
            statement.setInt(1, uid);

            ResultSet cardAccess = statement.executeQuery();

            while(cardAccess.next()){
                int userid = cardAccess.getInt("userid");
                String cardname = cardAccess.getString("cardname");

                CardAccess newcard = new CardAccess(userid, cardname);
                data.add(newcard);
            }




        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return data;
    }

    public String cardShareCount(int uid, String cn) {
        int CSC = 0;
        String CSCF = "0";

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT count(userid) AS total FROM Cardshare WHERE userid=? AND cardname=?");
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
