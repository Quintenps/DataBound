package dao;
import com.mysql.jdbc.StringUtils;
import platform.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by 187z on 6/7/2016.
 */
public class cardDAO extends baseDAO {

    public void updateFirstName(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String cardname = cn; String datafield = df;
            int sessionid = sesid;

            if (!datafield.equals("") || !datafield.equals(null)) {
                PreparedStatement statement = con.prepareStatement("UPDATE cards SET firstname=? WHERE userid=? AND cardname=?");
                statement.setString(1, datafield);
                statement.setInt(2, sessionid); statement.setString(3, cardname);
                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateMiddleName(String cn, String df, int sesid) throws NullPointerException {

        try (Connection con = super.getConnection()) {

            String cardname = cn;
            String datafield = df;
            int sessionid = sesid;

            if (datafield != null || !datafield.isEmpty() || datafield.length() != 0 || !datafield.equals("") || org.apache.commons.lang3.StringUtils.isBlank(datafield)) {
                System.out.println("Hey!");
                PreparedStatement statement = con.prepareStatement("UPDATE cards SET middlename=? WHERE userid=? AND cardname=?");
                statement.setString(1, datafield);
                statement.setInt(2, sessionid); statement.setString(3, cardname);
                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }

        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateLastName(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String cardname = cn; String datafield = df;
            int sessionid = sesid;

            if (!datafield.equals("") || !datafield.equals(null)) {
                PreparedStatement statement = con.prepareStatement("UPDATE cards SET lastname=? WHERE userid=? AND cardname=?");
                statement.setString(1, datafield);
                statement.setInt(2, sessionid); statement.setString(3, cardname);
                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }

        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateGender(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String cardname = cn; String datafield = df;
            int sessionid = sesid;

            if (!datafield.equals("") || !datafield.equals(null)) {
                PreparedStatement statement = con.prepareStatement("UPDATE cards SET gender=? WHERE userid=? AND cardname=?");
                statement.setString(1, datafield);
                statement.setInt(2, sessionid); statement.setString(3, cardname);
                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateDateOfBirth(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String cardname = cn; String datafield = df;
            int sessionid = sesid;

            if (!datafield.equals("") || !datafield.equals(null)) {
                PreparedStatement statement = con.prepareStatement("UPDATE cards SET dateofbirth=? WHERE userid=? AND cardname=?");
                statement.setString(1, datafield);
                statement.setInt(2, sessionid); statement.setString(3, cardname);
                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateCountry(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String cardname = cn; String datafield = df;
            int sessionid = sesid;

            if (!datafield.equals("") || !datafield.equals(null)) {
                PreparedStatement statement = con.prepareStatement("UPDATE cards SET country=? WHERE userid=? AND cardname=?");
                statement.setString(1, datafield);
                statement.setInt(2, sessionid); statement.setString(3, cardname);
                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateCity(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String cardname = cn; String datafield = df;
            int sessionid = sesid;

            if (!datafield.equals("") || !datafield.equals(null)) {
                PreparedStatement statement = con.prepareStatement("UPDATE cards SET city=? WHERE userid=? AND cardname=?");
                statement.setString(1, datafield);
                statement.setInt(2, sessionid); statement.setString(3, cardname);
                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateTown(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String cardname = cn; String datafield = df;
            int sessionid = sesid;

            if (!datafield.equals("") || !datafield.equals(null)) {
                PreparedStatement statement = con.prepareStatement("UPDATE cards SET town=? WHERE userid=? AND cardname=?");
                statement.setString(1, datafield);
                statement.setInt(2, sessionid); statement.setString(3, cardname);
                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateFacebook(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String cardname = cn; String datafield = df;
            int sessionid = sesid;

            if (!datafield.equals("") || !datafield.equals(null)) {
                PreparedStatement statement = con.prepareStatement("UPDATE cards SET facebook=? WHERE userid=? AND cardname=?");
                statement.setString(1, datafield);
                statement.setInt(2, sessionid); statement.setString(3, cardname);
                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateTwitter(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String cardname = cn; String datafield = df;
            int sessionid = sesid;

            if (!datafield.equals("") || !datafield.equals(null)) {
                PreparedStatement statement = con.prepareStatement("UPDATE cards SET twitter=? WHERE userid=? AND cardname=?");
                statement.setString(1, datafield);
                statement.setInt(2, sessionid); statement.setString(3, cardname);
                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateSkype(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String cardname = cn; String datafield = df;
            int sessionid = sesid;

            if (!datafield.equals("") || !datafield.equals(null)) {
                PreparedStatement statement = con.prepareStatement("UPDATE cards SET skype=? WHERE userid=? AND cardname=?");
                statement.setString(1, datafield);
                statement.setInt(2, sessionid); statement.setString(3, cardname);
                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateEmailPersonal(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String cardname = cn; String datafield = df;
            int sessionid = sesid;

            if (!datafield.equals("") || !datafield.equals(null)) {
                PreparedStatement statement = con.prepareStatement("UPDATE cards SET emailpersonal=? WHERE userid=? AND cardname=?");
                statement.setString(1, datafield);
                statement.setInt(2, sessionid); statement.setString(3, cardname);
                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateEmailBusiness(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String cardname = cn; String datafield = df;
            int sessionid = sesid;

            if (!datafield.equals("") || !datafield.equals(null)) {
                PreparedStatement statement = con.prepareStatement("UPDATE cards SET emailbusiness=? WHERE userid=? AND cardname=?");
                statement.setString(1, datafield);
                statement.setInt(2, sessionid); statement.setString(3, cardname);
                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }
    public void updateWebsite(String cn, String df, int sesid) {

        try (Connection con = super.getConnection()) {

            String cardname = cn; String datafield = df;
            int sessionid = sesid;

            if (!datafield.equals("") || !datafield.equals(null)) {
                PreparedStatement statement = con.prepareStatement("UPDATE cards SET website=? WHERE userid=? AND cardname=?");
                statement.setString(1, datafield);
                statement.setInt(2, sessionid); statement.setString(3, cardname);
                System.out.println(statement.executeUpdate());
                System.out.println("Cards updated!");
            }


        }catch (SQLException | NullPointerException e) { e.printStackTrace(); }
    }

}
