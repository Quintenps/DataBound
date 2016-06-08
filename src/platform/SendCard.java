package platform;

import dao.cardsendDAO;
import dao.userDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * Created by 187z on 6/8/2016.
 */
public class SendCard extends HttpServlet {
    private dao.cardsendDAO cardsenddao;
    private dao.userDAO userdao;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        int receiveruid = Integer.parseInt(req.getParameter("receiveruid"));
        String cardname = req.getParameter("cardname");
        int sesid = Integer.parseInt(req.getSession().getAttribute("uid").toString());

        if(userdao.isRegisteredUID(receiveruid)){
            cardsenddao.sendCard(sesid, cardname, receiveruid);
        }



        RequestDispatcher rd = req.getRequestDispatcher("/portal/datastore.jsp");



        if(2> 1){
            req.setAttribute("headermsg","Success!");
            req.setAttribute("bodymsg","Data saved successfully!");

        }

        else { req.setAttribute("msg","Something went wrong."); rd = req.getRequestDispatcher("/portal/datastore.jsp"); }

        rd.forward(req, resp);


    }

    public void init()  throws ServletException{
        cardsenddao = new cardsendDAO();
        userdao = new userDAO();
    }
}
