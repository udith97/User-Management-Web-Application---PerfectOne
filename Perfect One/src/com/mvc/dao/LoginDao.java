/*
 * package com.mvc.dao;
 * 
 * import java.sql.Connection; import java.sql.ResultSet; import
 * java.sql.SQLException; import java.sql.Statement;
 * 
 * import com.mvc.bean.LoginBean; import com.mvc.util.DBConnection;
 * 
 * public class LoginDao { public String authenticateUser(LoginBean loginBean) {
 * 
 * String userName = loginBean.getUserName(); // Keeping user entered values in
 * temporary variables. String password = loginBean.getPassword();
 * 
 * Connection con = null; Statement statement = null; ResultSet resultSet =
 * null;
 * 
 * String userNameDB = ""; String passwordDB = "";
 * 
 * try { con = DBConnection.createConnection(); // establishing connection
 * statement = con.createStatement(); // Statement is used to write queries.
 * Read more about it. resultSet =
 * statement.executeQuery("select userName,password from users"); // Here table
 * name is users and // userName,password are // columns. fetching all the //
 * records and storing in a // resultSet.
 * 
 * while (resultSet.next()) // Until next row is present otherwise it return
 * false { userNameDB = resultSet.getString("userName"); // fetch the values
 * present in database passwordDB = resultSet.getString("password");
 * 
 * if (userName.equals(userNameDB) && password.equals(passwordDB)) { return
 * "SUCCESS"; //// If the user entered values are already present in database,
 * which means //// user has already registered so I will return SUCCESS
 * message. } } } catch (SQLException e) { e.printStackTrace(); } return
 * "Invalid user credentials"; // Just returning appropriate message otherwise }
 * }
 */

package com.mvc.dao;
 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 

import com.mvc.bean.User;
import com.mvc.util.DBConnection;
 
public class LoginDao {
 
public String authenticateUser(User user)
{
    String userName = user.getUserName();
    String password = user.getPassword();
 
    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;
 
    String userNameDB = "";
    String passwordDB = "";
    String roleDB = "";
 
    try
    {
        con = DBConnection.createConnection();
        statement = con.createStatement();
        resultSet = statement.executeQuery("select username,password,role from users");
 
        while(resultSet.next())
        {
            userNameDB = resultSet.getString("username");
            passwordDB = resultSet.getString("password");
            roleDB = resultSet.getString("role");
 
            if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("Admin"))
            return "Admin_Role";
            else if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("Editor"))
            return "Editor_Role";
            else if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("User"))
            return "User_Role";
            else if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("Finance"))
                return "Finance_Role";
        }
    }
    catch(SQLException e)
    {
        e.printStackTrace();
    }
    return "Invalid user credentials";
}
}