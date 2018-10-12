package ch.heigvd.amt.mvcsimple.presentation;

import ch.heigvd.amt.mvcsimple.business.UserGenerator;
import ch.heigvd.amt.mvcsimple.model.User;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "challengeServlet", urlPatterns = "/challenge")
public class challengeServlet extends HttpServlet {

    @EJB
    UserGenerator generator = new UserGenerator();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String command = request.getParameter("command");

        generator.generateUsers();
        List<User> users = generator.getUsers();
        int counter = generator.getCounter();
        response.getWriter().println("Session beans create : " + counter );
    }

}
