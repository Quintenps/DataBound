package platform;

import dao.MessageDAO;
import dao.cardsendDAO;
import dao.settingsDAO;
import dao.userDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by 187z on 6/12/2016.
 */
public class Settings extends HttpServlet {
    private dao.cardsendDAO cardsenddao;
    private dao.userDAO userdao;
    private dao.MessageDAO msgdao;
    private dao.settingsDAO settingsdao;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HashMap<Integer, String> hmap = new HashMap<>();

        String avatar = req.getParameter("avatar");
        String currentPassword = req.getParameter("currentPassword");
        String newPassword = req.getParameter("newPassword");
        String nickname = req.getParameter("nickname");

        hmap.put(1, avatar);
        hmap.put(2, newPassword);
        hmap.put(3, nickname);

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
                if ((Integer) mentry.getKey() == 1 && mentry.getValue() != null) {
                    settingsdao.updateAvatar((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 2 && mentry.getValue() != null) {
                    settingsdao.updatePasswd(currentPassword,newPassword,(Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 3 && mentry.getValue() != null) {
                    settingsdao.updateNickName((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }



        }



        int sesid = Integer.parseInt(req.getSession().getAttribute("uid").toString());
        RequestDispatcher rd = req.getRequestDispatcher("/portal/settings.jsp");

        if(2 > 1){
            req.setAttribute("headermsg","Success!");
            req.setAttribute("bodymsg","Profile saved successfully!");
            req.setAttribute("status","positive");
            msgdao.newMsg(userdao.getName(sesid)+" has updated his profile settings ",(Integer) req.getSession().getAttribute("uid"),(Integer) req.getSession().getAttribute("uid"));
        }
        else {req.setAttribute("status","negative");req.setAttribute("headermsg","Something went wrong"); req.setAttribute("bodymsg","Something went wrong. Please doublecheck the user ID."); rd = req.getRequestDispatcher("/portal/cards.jsp"); }



        rd.forward(req, resp);


    }

    public void init()  throws ServletException{
        cardsenddao = new cardsendDAO();
        userdao = new userDAO();
        msgdao = new MessageDAO();
        settingsdao = new settingsDAO();
    }
}