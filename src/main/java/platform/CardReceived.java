package platform;

import java.util.ArrayList;

/**
 * Created by 187z on 6/11/2016.
 */
public class CardReceived {
    private int uid;
    private ArrayList cn = new ArrayList();

    public CardReceived(int userid){
        uid = userid;
    }

    public void addCard(String cardname){
        cn.add(cardname);
    }

    public int getUserID(){
        return uid;
    }

    public ArrayList cn(){
        return cn;
    }



}
