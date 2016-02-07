package Command;

import Business.AESCrypt;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Business.User;
import Service.UserService;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginCommand implements Command {

    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String forwardToJsp;

        //The user wants to log in...
        String email = request.getParameter("email");

        String password = request.getParameter("password");

        if (email != null && password != null) {
            //String encryptedPassword = null;
            //Use the UserServive class to login...
           UserService userService = new UserService();
//            try {
//                 encryptedPassword = AESCrypt.encrypt(password);
//            } catch (Exception ex) {
//                Logger.getLogger(LoginCommand.class.getName()).log(Level.SEVERE, null, ex);
//            }

            User userLoggingIn = userService.login(email, password);

            if (userLoggingIn != null) {
                //If login successful, store the session id for this client...
                HttpSession session = request.getSession();
                String clientSessionId = session.getId();
                session.setAttribute("loggedSessionId", clientSessionId);

                session.setAttribute("user", userLoggingIn);

                forwardToJsp = "/loginSuccess.jsp";
            } else {
                forwardToJsp = "/loginFailure.jsp";
            }
        } else {
            forwardToJsp = "/error.html";
        }

        return forwardToJsp;
    }
}
