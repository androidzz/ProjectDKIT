//package Command;
//
//import Business.AESCrypt;
//import Business.Customer;
//import DAO.UserDao;
//import Service.UserService;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//public class RegisterCommand implements Command {
//
//    public String execute(HttpServletRequest request, HttpServletResponse response) {
//
//        HttpSession session = request.getSession();
//        String forwardToJsp;
//
//        String firstName = request.getParameter("firstName");
//        String lastName = request.getParameter("lastName");
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//        String encryptedPassword = null;
//        try {
//                 encryptedPassword = AESCrypt.encrypt(password);
//            } catch (Exception ex) {
//                System.out.println("exception in encrypt password register command" + ex.getMessage());
//            }
//        String address = request.getParameter("address");
//
//        UserDao cDao = new UserDao();
//        Customer temp = cDao.findUserByEmail(email);
//
//        if (temp != null) {
//            forwardToJsp = "/existingCustomerError.html";
//        } else if (firstName != null && !lastName.isEmpty() && !email.isEmpty() && !password.isEmpty() && !address.isEmpty()) {
//
//            Customer cc = new Customer(firstName, lastName, email, encryptedPassword, address);
//            cDao.addCustomer(cc);
//            UserService userService = new UserService();
//            Customer userLoggingIn = userService.login(email, encryptedPassword);
//            session.setAttribute("user", userLoggingIn);
//            forwardToJsp = "/registerSuccess.jsp";
//        } else {
//            forwardToJsp = "/error.html";
//        }
//
//        return forwardToJsp;
//    }
//}
