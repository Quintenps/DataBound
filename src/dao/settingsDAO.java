package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * Created by 187z on 6/12/2016.
 */
public class settingsDAO extends baseDAO {
    private userDAO userdao = new userDAO();


    public void updatePasswd(String curPasswd, String newPasswd, int sesid) {

        try (Connection con = super.getConnection()) {
            if (!curPasswd.equals(newPasswd) || newPasswd != null || !userdao.equalsPassword(sesid, curPasswd)) {
                PreparedStatement statement = con.prepareStatement("UPDATE user SET password=? WHERE userid=?");
                statement.setString(1, newPasswd);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Password has been updated!");
            }
            else{System.out.println("Password did not update!");}

        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }

    public void updateNickName(String nickname, int sesid) {

        try (Connection con = super.getConnection()) {
            if (!nickname.equals("") || nickname != null  || !nickname.isEmpty()) {
                PreparedStatement statement = con.prepareStatement("UPDATE user SET username=? WHERE userid=?");
                statement.setString(1, nickname);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Username has been updated!");
            }
            else{System.out.println("Username did not update!");}

        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }

    public void updateAvatar(String avatarurl, int sesid) {
        String[] imageTypes = {".png",".jpg",".gif"};

        try (Connection con = super.getConnection()) {
            if (!avatarurl.equals("") || avatarurl != null || avatarurl.equals(null) || !avatarurl.isEmpty() ) {
                PreparedStatement statement = con.prepareStatement("UPDATE user SET avatar=? WHERE userid=?");
                statement.setString(1, avatarurl);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Avatar has been updated!");
            }
            else{System.out.println("Avatar did not update!");}

        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }



}
