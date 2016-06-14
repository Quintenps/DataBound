package platform;

import dao.MessageDAO;
import dao.cardDAO;
import dao.cardDAO;

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

 * Created by 187z on 6/8/2016.
 */
public class Cards extends HttpServlet {
    private dao.cardDAO cardDAO;
    private dao.MessageDAO msgdao;

    HashMap<Integer, String> hmap = new HashMap<>();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String cardname  = req.getParameter("cardname");
        String firstname = req.getParameter("firstname");
        String middlename = req.getParameter("middlename");
        String lastname = req.getParameter("lastname");
        String gender = req.getParameter("gender");
        String dateofbirth = req.getParameter("dateofbirth");
        String country = req.getParameter("country");
        String city = req.getParameter("city");
        String town = req.getParameter("town");

        String facebook = req.getParameter("facebook");
        String twitter = req.getParameter("twitter");
        String skype = req.getParameter("skype");
        String emailpersonal = req.getParameter("emailpersonal");
        String emailbusiness = req.getParameter("emailbusiness");
        String website = req.getParameter("website");

        hmap.put(1, firstname);
        hmap.put(2, middlename);
        hmap.put(3, lastname);
        hmap.put(4, gender);
        hmap.put(5, dateofbirth);
        hmap.put(6, country);
        hmap.put(7, city);
        hmap.put(8, town);
        hmap.put(9, facebook);
        hmap.put(10, twitter);
        hmap.put(11, skype);
        hmap.put(12, emailpersonal);
        hmap.put(13, emailbusiness);
        hmap.put(14, website);

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            if (mentry.getValue() != null || !mentry.equals(null) || !mentry.getValue().equals(null)) {
                if ((Integer) mentry.getKey() == 1) {
                    cardDAO.updateFirstName(cardname,(String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 2) {
                    cardDAO.updateMiddleName(cardname,(String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 3) {
                    cardDAO.updateLastName(cardname,(String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 4) {
                    cardDAO.updateGender(cardname,(String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 5) {
                    cardDAO.updateDateOfBirth(cardname,(String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 6) {
                    cardDAO.updateCountry(cardname,(String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 7) {
                    cardDAO.updateCity(cardname,(String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 8) {
                    cardDAO.updateTown(cardname,(String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 9) {
                    cardDAO.updateFacebook(cardname,(String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 10) {
                    cardDAO.updateTwitter(cardname,(String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 11) {
                    cardDAO.updateSkype(cardname,(String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 12) {
                    cardDAO.updateEmailPersonal(cardname,(String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 13) {
                    cardDAO.updateEmailBusiness(cardname,(String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 14) {
                    cardDAO.updateWebsite(cardname,(String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
            }
            else { return; }

        }

        RequestDispatcher rd = req.getRequestDispatcher("/portal/cards.jsp");


        if(2> 1){
            req.setAttribute("headermsg","Success!");
            req.setAttribute("bodymsg","Data has been applied successfully to the card.");
            req.setAttribute("status","positive");
            msgdao.newMsg("Card "+cardname+" has been updated",(Integer) req.getSession().getAttribute("uid"),(Integer) req.getSession().getAttribute("uid"));
        }

        else {req.setAttribute("headermsg","Error!");
            req.setAttribute("bodymsg","Unfortunately something went wrong!");
            req.setAttribute("status", "negative");
            rd = req.getRequestDispatcher("/portal/datastore.jsp"); }

        rd.forward(req, resp);


    }

    public void init()  throws ServletException{
        cardDAO = new cardDAO();
        msgdao = new MessageDAO();
    }
}
