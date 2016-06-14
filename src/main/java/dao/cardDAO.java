package dao;
import com.mysql.jdbc.StringUtils;
import platform.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * Created by 187z on 6/7/2016.
 */
public class cardDAO extends baseDAO {

    public void updateFirstName(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            if(df == null){
                PreparedStatement statement = con.prepareStatement("UPDATE Cards set firstname=NULL WHERE userid=? AND cardname=?");
                statement.setInt(1, sesid);
                statement.setString(2, cn);
                statement.executeUpdate();
            }

            else if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Cards SET firstname=? WHERE userid=? AND cardname=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.setString(3, cn);
                statement.executeUpdate();
                System.out.println("Card succesfully updated! Applied '"+ df +"' to "+ cn +" on userid "+ sesid );
            }



        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateMiddleName(String cn, String df, int sesid) throws NullPointerException {

        try (Connection con = super.getConnection()) {

            if(df == null){
                PreparedStatement statement = con.prepareStatement("UPDATE Cards set middlename=NULL WHERE userid=? AND cardname=?");
                statement.setInt(1, sesid);
                statement.setString(2, cn);
                statement.executeUpdate();
            }

            else if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Cards SET middlename=? WHERE userid=? AND cardname=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.setString(3, cn);
                statement.executeUpdate();
                System.out.println("Card succesfully updated! Applied '"+ df +"' to "+ cn +" on userid "+ sesid );
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateLastName(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            if(df == null){
                PreparedStatement statement = con.prepareStatement("UPDATE Cards set lastname=NULL WHERE userid=? AND cardname=?");
                statement.setInt(1, sesid);
                statement.setString(2, cn);
                statement.executeUpdate();
            }

            else if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Cards SET lastname=? WHERE userid=? AND cardname=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.setString(3, cn);
                statement.executeUpdate();
                System.out.println("Card succesfully updated! Applied '"+ df +"' to "+ cn +" on userid "+ sesid );
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateGender(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            if(df == null){
                PreparedStatement statement = con.prepareStatement("UPDATE Cards set gender=NULL WHERE userid=? AND cardname=?");
                statement.setInt(1, sesid);
                statement.setString(2, cn);
                statement.executeUpdate();
            }

            else if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Cards SET gender=? WHERE userid=? AND cardname=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.setString(3, cn);
                statement.executeUpdate();
                System.out.println("Card succesfully updated! Applied '"+ df +"' to "+ cn +" on userid "+ sesid );
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateDateOfBirth(String cn, String df, int sesid) {

            try (Connection con = super.getConnection()) {

                if(df == null){
                    PreparedStatement statement = con.prepareStatement("UPDATE Cards set dateofbirth=NULL WHERE userid=? AND cardname=?");
                    statement.setInt(1, sesid);
                    statement.setString(2, cn);
                    statement.executeUpdate();
                }

                else if (!df.equals("")) {
                    PreparedStatement statement = con.prepareStatement("UPDATE Cards SET dateofbirth=? WHERE userid=? AND cardname=?");
                    statement.setString(1, df);
                    statement.setInt(2, sesid);
                    statement.setString(3, cn);
                    statement.executeUpdate();
                    System.out.println("Card succesfully updated! Applied '"+ df +"' to "+ cn +" on userid "+ sesid );
                }



        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateCountry(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            if(df == null){
                PreparedStatement statement = con.prepareStatement("UPDATE Cards set country=NULL WHERE userid=? AND cardname=?");
                statement.setInt(1, sesid);
                statement.setString(2, cn);
                statement.executeUpdate();
            }

            else if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Cards SET country=? WHERE userid=? AND cardname=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.setString(3, cn);
                statement.executeUpdate();
                System.out.println("Card succesfully updated! Applied '"+ df +"' to "+ cn +" on userid "+ sesid );
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateCity(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            if(df == null){
                PreparedStatement statement = con.prepareStatement("UPDATE Cards set city=NULL WHERE userid=? AND cardname=?");
                statement.setInt(1, sesid);
                statement.setString(2, cn);
                statement.executeUpdate();
            }

            else if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Cards SET city=? WHERE userid=? AND cardname=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.setString(3, cn);
                statement.executeUpdate();
                System.out.println("Card succesfully updated! Applied '"+ df +"' to "+ cn +" on userid "+ sesid );
            }



        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateTown(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            if(df == null){
                PreparedStatement statement = con.prepareStatement("UPDATE Cards set town=NULL WHERE userid=? AND cardname=?");
                statement.setInt(1, sesid);
                statement.setString(2, cn);
                statement.executeUpdate();
            }

            else if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Cards SET town=? WHERE userid=? AND cardname=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.setString(3, cn);
                statement.executeUpdate();
                System.out.println("Card succesfully updated! Applied '"+ df +"' to "+ cn +" on userid "+ sesid );
            }



        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateFacebook(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            if(df == null){
                PreparedStatement statement = con.prepareStatement("UPDATE Cards set facebook=NULL WHERE userid=? AND cardname=?");
                statement.setInt(1, sesid);
                statement.setString(2, cn);
                statement.executeUpdate();
            }

            else if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Cards SET facebook=? WHERE userid=? AND cardname=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.setString(3, cn);
                statement.executeUpdate();
                System.out.println("Card succesfully updated! Applied '"+ df +"' to "+ cn +" on userid "+ sesid );
            }



        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateTwitter(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            if(df == null){
                PreparedStatement statement = con.prepareStatement("UPDATE Cards set twitter=NULL WHERE userid=? AND cardname=?");
                statement.setInt(1, sesid);
                statement.setString(2, cn);
                statement.executeUpdate();
            }

            else if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Cards SET twitter=? WHERE userid=? AND cardname=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.setString(3, cn);
                statement.executeUpdate();
                System.out.println("Card succesfully updated! Applied '"+ df +"' to "+ cn +" on userid "+ sesid );
            }



        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateSkype(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            if(df == null){
                PreparedStatement statement = con.prepareStatement("UPDATE Cards set skype=NULL WHERE userid=? AND cardname=?");
                statement.setInt(1, sesid);
                statement.setString(2, cn);
                statement.executeUpdate();
            }

            else if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Cards SET skype=? WHERE userid=? AND cardname=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.setString(3, cn);
                statement.executeUpdate();
                System.out.println("Card succesfully updated! Applied '"+ df +"' to "+ cn +" on userid "+ sesid );
            }



        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateEmailPersonal(String cn, String df, int sesid) {


            try (Connection con = super.getConnection()) {

                if(df == null){
                    PreparedStatement statement = con.prepareStatement("UPDATE Cards set emailpersonal=NULL WHERE userid=? AND cardname=?");
                    statement.setInt(1, sesid);
                    statement.setString(2, cn);
                    statement.executeUpdate();
                }

                else if (!df.equals("")) {
                    PreparedStatement statement = con.prepareStatement("UPDATE Cards SET emailpersonal=? WHERE userid=? AND cardname=?");
                    statement.setString(1, df);
                    statement.setInt(2, sesid);
                    statement.setString(3, cn);
                    statement.executeUpdate();
                    System.out.println("Card succesfully updated! Applied '"+ df +"' to "+ cn +" on userid "+ sesid );
                }



        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateEmailBusiness(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            if(df == null){
                PreparedStatement statement = con.prepareStatement("UPDATE Cards set emailbusiness=NULL WHERE userid=? AND cardname=?");
                statement.setInt(1, sesid);
                statement.setString(2, cn);
                statement.executeUpdate();
            }

            else if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Cards SET emailbusiness=? WHERE userid=? AND cardname=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.setString(3, cn);
                statement.executeUpdate();
                System.out.println("Card succesfully updated! Applied '"+ df +"' to "+ cn +" on userid "+ sesid );
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateWebsite(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            if(df == null){
                PreparedStatement statement = con.prepareStatement("UPDATE Cards set website=NULL WHERE userid=? AND cardname=?");
                statement.setInt(1, sesid);
                statement.setString(2, cn);
                statement.executeUpdate();
            }

            else if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Cards SET website=? WHERE userid=? AND cardname=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.setString(3, cn);
                statement.executeUpdate();
                System.out.println("Card succesfully updated! Applied '"+ df +"' to "+ cn +" on userid "+ sesid );
            }



        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }


    public HashMap<Integer, String> selectAllData(User user, String cn) {
        HashMap<Integer, String> datafields = new HashMap();
        int uid = user.getUID();
        String cardname = cn;

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT * FROM Cards WHERE userid=? AND cardname=?");
            statement.setInt(1, uid);
            statement.setString(2, cn);

            System.out.println(statement.toString()); // DEBUG
            ResultSet sqlresult = statement.executeQuery();

            while(sqlresult.next()) {
                String firstname = sqlresult.getString("firstname");
                String middlename = sqlresult.getString("middlename");
                String lastname = sqlresult.getString("lastname");
                String gender = sqlresult.getString("gender");
                String dateofbirth = sqlresult.getString("dateofbirth");
                String country = sqlresult.getString("country");
                String city = sqlresult.getString("city");
                String town = sqlresult.getString("town");
                String facebook = sqlresult.getString("facebook");
                String twitter = sqlresult.getString("twitter");
                String skype = sqlresult.getString("skype");
                String emailpersonal = sqlresult.getString("emailpersonal");
                String emailbusiness = sqlresult.getString("emailbusiness");
                String website = sqlresult.getString("website");

                datafields.put(1, firstname);
                datafields.put(2, middlename);
                datafields.put(3, lastname);
                datafields.put(4, gender);
                datafields.put(5, dateofbirth);
                datafields.put(6, country);
                datafields.put(7, city);
                datafields.put(8, town);
                datafields.put(9, facebook);
                datafields.put(10, twitter);
                datafields.put(11, skype);
                datafields.put(12, emailpersonal);
                datafields.put(13, emailbusiness);
                datafields.put(14, website);
            }

        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return datafields;
    }

    public HashMap<Integer, String> selectAllDataByUID(int uid, String cn) {
        HashMap<Integer, String> datafields = new HashMap();

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT * FROM Cards WHERE userid=? AND cardname=?");
            statement.setInt(1, uid);
            statement.setString(2, cn);

            statement.toString(); // DEBUG
            ResultSet sqlresult = statement.executeQuery();

            while(sqlresult.next()) {
                String firstname = sqlresult.getString("firstname");
                String middlename = sqlresult.getString("middlename");
                String lastname = sqlresult.getString("lastname");
                String gender = sqlresult.getString("gender");
                String dateofbirth = sqlresult.getString("dateofbirth");
                String country = sqlresult.getString("country");
                String city = sqlresult.getString("city");
                String town = sqlresult.getString("town");
                String facebook = sqlresult.getString("facebook");
                String twitter = sqlresult.getString("twitter");
                String skype = sqlresult.getString("skype");
                String emailpersonal = sqlresult.getString("emailpersonal");
                String emailbusiness = sqlresult.getString("emailbusiness");
                String website = sqlresult.getString("website");

                datafields.put(1, firstname);
                datafields.put(2, middlename);
                datafields.put(3, lastname);
                datafields.put(4, gender);
                datafields.put(5, dateofbirth);
                datafields.put(6, country);
                datafields.put(7, city);
                datafields.put(8, town);
                datafields.put(9, facebook);
                datafields.put(10, twitter);
                datafields.put(11, skype);
                datafields.put(12, emailpersonal);
                datafields.put(13, emailbusiness);
                datafields.put(14, website);
            }

        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return datafields;
    }

    public int totalSharedCards(int userid) {
        int total = 0;

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT count(userid) as total FROM Cardshare WHERE userid=?");
            statement.setInt(1, userid);
            System.out.println(statement.toString()); // DEBUG
            ResultSet sqlresult = statement.executeQuery();
            sqlresult.next();
            total = sqlresult.getInt("total");


        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return total;
    }

    public int totalReceivedCards(int userid) {
        int total = 0;

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT count(receiveduser) as total FROM Cardshare WHERE receiveduser=?");
            statement.setInt(1, userid);
            System.out.println(statement.toString()); // DEBUG
            ResultSet sqlresult = statement.executeQuery();
            sqlresult.next();
            total = sqlresult.getInt("total");


        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return total;
    }

}
