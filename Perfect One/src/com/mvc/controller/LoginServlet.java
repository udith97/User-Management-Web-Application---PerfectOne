/*
 * package com.mvc.controller;
 * 
 * import java.io.IOException; import javax.servlet.ServletException; import
 * javax.servlet.http.HttpServlet; import javax.servlet.http.HttpServletRequest;
 * import javax.servlet.http.HttpServletResponse; import
 * javax.servlet.http.HttpSession;
 * 
 * import com.mvc.bean.LoginBean; import com.mvc.dao.LoginDao;
 * 
 * import javax.servlet.http.HttpServlet;
 * 
 * public class LoginServlet extends HttpServlet { private static final long
 * serialVersionUID = 1L;
 * 
 * public LoginServlet() { }
 * 
 * protected void doPost(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException {
 * 
 * // Here username and password are the names which I have given in the input
 * box // in Login.jsp page. Here I am retrieving the values entered by the user
 * and // keeping in instance variables for further use.
 * 
 * String userName = request.getParameter("username"); String password =
 * request.getParameter("password");
 * 
 * LoginBean loginBean = new LoginBean(); // creating object for LoginBean
 * class, which is a normal java class, // contains just setters and getters.
 * Bean classes are efficiently used // in java to access user information
 * wherever required in the // application.
 * 
 * loginBean.setUserName(userName); // setting the username and password through
 * the loginBean object then only you // can get it in future.
 * loginBean.setPassword(password);
 * 
 * LoginDao loginDao = new LoginDao(); // creating object for LoginDao. This
 * class contains main logic of the // application.
 * 
 * String userValidate = loginDao.authenticateUser(loginBean); // Calling
 * authenticateUser function
 * 
 * if (userValidate.equals("SUCCESS")) // If function returns success string
 * then user will be rooted to Home page { request.setAttribute("userName",
 * userName); // with setAttribute() you can define a "key" and value pair so //
 * that you can get it in future using getAttribute("key")
 * request.getRequestDispatcher("/Home.jsp").forward(request, response);//
 * RequestDispatcher is used to send // the control to the invoked page. } else
 * { request.setAttribute("errMessage", userValidate); // If authenticateUser()
 * function returnsother than // SUCCESS string it will be sent to Login page
 * again. // Here the error message returned from function has // been stored in
 * a errMessage key. request.getRequestDispatcher("/Login.jsp").forward(request,
 * response);// forwarding the request } }
 * 
 * }
 */

package com.mvc.controller;
import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
import com.mvc.bean.User;
import com.mvc.dao.LoginDao;
 
public class LoginServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
 
public LoginServlet() {
}
 
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
    String userName = request.getParameter("username");
    String password = request.getParameter("password");
 
    User user = new User();
 
    user.setUserName(userName);
    user.setPassword(password);
 
    LoginDao loginDao = new LoginDao();
 
    try
    {
        String userValidate = loginDao.authenticateUser(user);
 
        if(userValidate.equals("Admin_Role"))
        {
            System.out.println("Admin's Home");
 
            HttpSession session = request.getSession(); //Creating a session
            session.setAttribute("Admin", userName); //setting session attribute
            request.setAttribute("userName", userName);
 
            request.getRequestDispatcher("/AdminPanel.jsp").forward(request, response);
        }
        else if(userValidate.equals("Editor_Role"))
        {
            System.out.println("Editor's Home");
 
            HttpSession session = request.getSession();
            session.setAttribute("Editor", userName);
            request.setAttribute("userName", userName);
 
            request.getRequestDispatcher("/EditorPanel.jsp").forward(request, response);
        }
        else if(userValidate.equals("User_Role"))
        {
            System.out.println("User's Home");
 
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(10*60);
            //session.setAttribute("User", userName);
            request.setAttribute("userName", userName);
 
            request.getRequestDispatcher("/Home.jsp").forward(request, response);
        }
        else if(userValidate.equals("Finance_Role"))
        {
            System.out.println("Finance Home");
 
            HttpSession session = request.getSession();
            session.setAttribute("Finance", userName);
            request.setAttribute("userName", userName);
 
            request.getRequestDispatcher("/FinancePanel.jsp").forward(request, response);
        }
        else
        {
            System.out.println("Error message = "+userValidate);
            request.setAttribute("errMessage", userValidate);
 
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        }
    }
    catch (IOException e1)
    {
        e1.printStackTrace();
    }
    catch (Exception e2)
    {
        e2.printStackTrace();
    }
} //End of doPost()
}