package dao;

import platform.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.HashMap;

/**
 * Created by 187z on 6/6/2016.
 */
public class userDAO extends baseDAO {

    public boolean isRegistered(User user) {


        boolean isRegistered = true;

        String uname = user.getUsername();
        String passwd = user.getPassword();

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT userid FROM user WHERE username=? AND password=?");

            statement.setString(1, uname);
            statement.setString(2, passwd);

            System.out.println(statement.toString()); // DEBUG
            ResultSet sqlresult = statement.executeQuery();


            if (!sqlresult.isBeforeFirst()){
                System.out.println("No records found!");
                isRegistered = false;
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return isRegistered;
    }

    public boolean isRegisteredUID(int uid) {


        boolean isRegistered = true;
        int GetUid = uid;

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT username FROM user WHERE userid=?");

            statement.setInt(1, GetUid);

            System.out.println(statement.toString()); // DEBUG
            ResultSet sqlresult = statement.executeQuery();


            if (!sqlresult.isBeforeFirst()){
                System.out.println("No records found!");
                isRegistered = false;
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return isRegistered;
    }

    public boolean equalsPassword(int uid, String passwd) {
        boolean isPassword = true;

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT username FROM user WHERE userid=? AND password=?");
            statement.setInt(1, uid);
            statement.setString(2, passwd);

            System.out.println(statement.toString()); // DEBUG
            ResultSet sqlresult = statement.executeQuery();


            if (!sqlresult.isBeforeFirst()){
                System.out.println("No records found!");
                isPassword = false;
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return isPassword;
    }

    public String getName(int uid) {
        String name = null;

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT username FROM user WHERE userid=?");
            statement.setInt(1, uid);

            System.out.println(statement.toString()); // DEBUG
            ResultSet sqlresult = statement.executeQuery();
            sqlresult.next();
            name = sqlresult.getString("username");

        }catch (SQLException sqle) { sqle.printStackTrace(); }

        return name;
    }

    public String getAvatarURL(int uid) {
                String avatar = null;

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT avatar FROM user WHERE userid=?");
            statement.setInt(1, uid);

            System.out.println(statement.toString()); // DEBUG
            ResultSet sqlresult = statement.executeQuery();
            sqlresult.next();
            avatar = sqlresult.getString("avatar");

        }catch (SQLException sqle) { sqle.printStackTrace(); }

        return avatar;
    }

    public User registerUser(User user) {

        try (Connection con = super.getConnection()) {

            String uname = user.getUsername();
            String passwd = user.getPassword();
            String avatar = "https://api.adorable.io/avatars/128/"+uname+"@adorable.io.png";

            PreparedStatement statement = con.prepareStatement("INSERT INTO user (username,password,avatar) VALUES (?,?,?) ");
            statement.setString(1, uname);
            statement.setString(2, passwd);
            statement.setString(3, avatar);

            statement.executeUpdate();
            System.out.println("User "+uname+" added!");


        }catch (SQLException sqle) { sqle.printStackTrace(); }

        return user;
    }

    public void addDataStore(User user) {

        try (Connection con = super.getConnection()) {

            String uname = user.getUsername();
            String passwd = user.getPassword();

            PreparedStatement statement = con.prepareStatement("SELECT userid FROM user WHERE username=? AND password=?");
            statement.setString(1, uname);
            statement.setString(2, passwd);

            ResultSet sqlresult = statement.executeQuery();
            sqlresult.next();
            int uid = (Integer) sqlresult.getObject("userid");

            PreparedStatement addds = con.prepareStatement("INSERT INTO datastore (userid) VALUES (?) ");
            addds.setInt(1, uid);
            addds.executeUpdate();
            System.out.println("Datastore added!");

            PreparedStatement addcd = con.prepareStatement("INSERT INTO cards (userid,cardname) VALUES (?,'FamilyCard'),(?,'BusinessCard'),(?,'UnknownCard') ");
            addcd.setInt(1, uid);
            addcd.setInt(2, uid);
            addcd.setInt(3, uid);
            addcd.executeUpdate();
            System.out.println("Cards added!");


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }


    public int getUID(User user) {
        int uid = 0;

        try (Connection con = super.getConnection()) {

            String uname = user.getUsername();
            String passwd = user.getPassword();

            PreparedStatement statement = con.prepareStatement("SELECT userid FROM user WHERE username=? AND password=?");
            statement.setString(1, uname);
            statement.setString(2, passwd);

            ResultSet sqlresult = statement.executeQuery();
            sqlresult.next();
            uid = (Integer) sqlresult.getObject("userid");



        }catch (SQLException sqle) { sqle.printStackTrace(); }

        return uid;
    }

    public HashMap<Integer, String> selectAllUsers() {
        HashMap<Integer, String> users = new HashMap();


        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT userid, username FROM user");

            statement.toString(); // DEBUG
            ResultSet sqlresult = statement.executeQuery();

            while(sqlresult.next()) {
                int userid = sqlresult.getInt("userid");
                String username = sqlresult.getString("username");
                users.put(userid, username );
            }

        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return users;
    }


}
