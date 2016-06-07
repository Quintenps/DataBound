package platform;

import dao.datastoreDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by 187z on 6/7/2016.
 */
public class DataStore extends HttpServlet {
    private dao.datastoreDAO datastoredao;
    ArrayList<String> postedData = new ArrayList<>();

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


        addtoList(firstname);
        addtoList(middlename);
        addtoList(lastname);
        addtoList(gender);
        addtoList(dateofbirth);
        addtoList(country);
        addtoList(town);
        addtoList(facebook);
        addtoList(twitter);
        addtoList(skype);
        addtoList(emailpersonal);
        addtoList(emailbusiness);
        addtoList(website);

        for(String item:postedData){
            datastoredao.updateData(item, (Integer)req.getSession().getAttribute("uid"));
        }


        RequestDispatcher rd = req.getRequestDispatcher("/portal/datastore.jsp");



        if(2> 1){
            req.setAttribute("msg","Data saved successfully!");

        }

        else { req.setAttribute("msg","Something went wrong."); rd = req.getRequestDispatcher("/portal/datastore.jsp"); }

        rd.forward(req, resp);


    }

    public void init()  throws ServletException{
        datastoredao = new datastoreDAO();
    }
}
