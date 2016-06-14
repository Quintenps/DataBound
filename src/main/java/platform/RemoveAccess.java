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

/**
 * Created by 187z on 6/14/2016.
 */
public class RemoveAccess extends HttpServlet {
    private dao.cardsendDAO cardsenddao;
    private dao.userDAO userdao;
    private dao.MessageDAO msgdao;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        int receiveruid = Integer.parseInt(req.getParameter("uid"));
        String cardname = req.getParameter("cn");
        int sesid = Integer.parseInt(req.getSession().getAttribute("uid").toString());

        RequestDispatcher rd = req.getRequestDispatcher("/portal/cardssent.jsp");

        if(cardsenddao.removeCard(receiveruid, sesid, cardname)){
            req.setAttribute("headermsg","Success!");
            req.setAttribute("bodymsg","Card has been removed!");
            req.setAttribute("status","positive");
            msgdao.newMsg("Card "+cardname+" has been removed from "+userdao.getName(receiveruid),(Integer) req.getSession().getAttribute("uid"),(Integer) req.getSession().getAttribute("uid"));
            System.out.println("Card "+cardname+" has been removed from "+userdao.getName(receiveruid)+" "+ req.getSession().getAttribute("uid")+" "+req.getSession().getAttribute("uid"));
        }
        else {req.setAttribute("status","negative");req.setAttribute("headermsg","Something went wrong"); req.setAttribute("bodymsg","Something went wrong."); rd = req.getRequestDispatcher("/portal/cardssent.jsp"); }



        rd.forward(req, resp);


    }

    public void init()  throws ServletException{
        cardsenddao = new cardsendDAO();
        userdao = new userDAO();
        msgdao = new MessageDAO();
    }
}

