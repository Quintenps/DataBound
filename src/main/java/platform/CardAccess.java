package platform;

/**
 * Created by 187z on 6/14/2016.
 */
public class CardAccess {
    private int uid;
    private String cardname;

    public CardAccess(int id, String cn){
        uid = id;
        cardname = cn;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
