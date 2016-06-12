package platform;

import dao.MessageDAO;
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
    private dao.MessageDAO msgdao;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        int receiveruid = Integer.parseInt(req.getParameter("receiveruid"));
        String cardname = req.getParameter("cardname");
        int sesid = Integer.parseInt(req.getSession().getAttribute("uid").toString());
        RequestDispatcher rd = req.getRequestDispatcher("/portal/cards.jsp");

        if(userdao.isRegisteredUID(receiveruid)){
            cardsenddao.sendCard(sesid, cardname, receiveruid);
            req.setAttribute("headermsg","Success!");
            req.setAttribute("bodymsg","Data saved successfully!");
            req.setAttribute("status","positive");
            msgdao.newMsg("Card "+cardname+" has been shared with "+userdao.getName(receiveruid),(Integer) req.getSession().getAttribute("uid"),(Integer) req.getSession().getAttribute("uid"));
        }
        else {req.setAttribute("status","negative");req.setAttribute("headermsg","Something went wrong"); req.setAttribute("bodymsg","Something went wrong. Please doublecheck the user ID."); rd = req.getRequestDispatcher("/portal/cards.jsp"); }



        rd.forward(req, resp);


    }

    public void init()  throws ServletException{
        cardsenddao = new cardsendDAO();
        userdao = new userDAO();
        msgdao = new MessageDAO();
    }
}
