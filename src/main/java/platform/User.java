package platform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 187z on 6/6/2016.
 */
public class User {
    private String username;
    private String password;
    private int uid;

    private HashMap<Integer, String> datstore = new HashMap<>();

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
    public int getUID(){
        return uid;
    }
    public HashMap<Integer, String> myData() { return datstore; }

    // Setters
    public void setUID(int dbuid){ uid = dbuid ; }
    public void setDataStore(HashMap ds){ datstore = ds; }

}