package platform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by 187z on 6/6/2016.
 */
public class User {
    private String username;
    private String password;

    public User(String uname, String pw){
        username = uname;
        password = pw;
    }


    // Getters
    public String getUsername(){
        return username.toString();
    }
    public boolean checkPassword(String pw) {
        return pw.equals(password);
    }
    public String getPassword(){
        return password.toString();
    }

}