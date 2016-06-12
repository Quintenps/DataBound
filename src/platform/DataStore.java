package platform;

import dao.MessageDAO;
import dao.datastoreDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * Created by 187z on 6/7/2016.
 */
public class DataStore extends HttpServlet {
    private dao.datastoreDAO datastoredao;
    private dao.MessageDAO messagedao;

    ArrayList<String> postedData = new ArrayList<>();
    HashMap<Integer, String> hmap = new HashMap<>();

    public void addtoList(String add){
        if (!add.equals("")) {
            postedData.add(add);
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {


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
            if (mentry.getValue() != null || !mentry.getValue().toString().isEmpty()) {
                if ((Integer) mentry.getKey() == 1) {
                    datastoredao.updateFirstName((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 2) {
                    datastoredao.updateMiddleName((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 3) {
                    datastoredao.updateLastName((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 4) {
                    datastoredao.updateGender((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 5) {
                    datastoredao.updateDateOfBirth((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 6) {
                    datastoredao.updateCountry((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 7) {
                    datastoredao.updateCity((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 8) {
                    datastoredao.updateTown((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 9) {
                    datastoredao.updateFacebook((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 10) {
                    datastoredao.updateTwitter((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 11) {
                    datastoredao.updateSkype((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 12) {
                    datastoredao.updateEmailPersonal((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 13) {
                    datastoredao.updateEmailBusiness((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
                if ((Integer) mentry.getKey() == 14) {
                    datastoredao.updateWebsite((String) mentry.getValue(), (Integer) req.getSession().getAttribute("uid"));
                }
            }

        }

        RequestDispatcher rd = req.getRequestDispatcher("/portal/datastore.jsp");



        if(2> 1){
            req.setAttribute("headermsg","Success!");
            req.setAttribute("bodymsg","Data saved successfully!");
            messagedao.newMsg("Datastore has been updated",(Integer) req.getSession().getAttribute("uid"),(Integer) req.getSession().getAttribute("uid"));

        }

        else { req.setAttribute("msg","Something went wrong."); rd = req.getRequestDispatcher("/portal/datastore.jsp"); }

        rd.forward(req, resp);


    }

    public void init()  throws ServletException{
        datastoredao = new datastoreDAO();
        messagedao = new MessageDAO();
    }
}
