package guestfunctions;

/**
 * Created by 187z on 6/6/2016.
 */

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import dao.userDAO;
import platform.User;

public class RegisterServlet extends HttpServlet {
    private dao.userDAO userdao;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String passwd = req.getParameter("password");


        RequestDispatcher rd = null;


        User u = new User(username,passwd);

        if(!userdao.isRegistered(u)){
            userdao.registerUser(u);
            userdao.addDataStore(u);
            req.setAttribute("headermsg","Success");
            req.setAttribute("bodymsg","You have succesfully been registered. You can now login.");
            req.setAttribute("status","positive");
            rd = req.getRequestDispatcher("/login.jsp");
        }
        else {
            req.setAttribute("headermsg","Error");
            req.setAttribute("bodymsg","User already registered");
            req.setAttribute("status","negative");

            rd = req.getRequestDispatcher("/register.jsp");
        }

        rd.forward(req, resp);


    }

    public void init()  throws ServletException{
        userdao = new userDAO();
    }
}
