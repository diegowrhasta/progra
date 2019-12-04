package mypackage1;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import oracle.jdbc.*;
import java.util.*;


public class LoginAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
{
  System.out.println("validating user"); 
  LoginForm loginForm = (LoginForm) form;
  String userid = loginForm.getUserid();
  String password = loginForm.getPassword();
  request.getSession().setAttribute("usuario",userid);
    ConnectDB conn =new ConnectDB ();
    ResultSet rsConsulta = null;
    try
    {
    String cadena="select * from s_emp where userid='"+userid+"'";
    System.out.println(cadena);
    rsConsulta = conn.getData(cadena);
    if (rsConsulta.next() && userid.equals(password)){
       System.out.println(rsConsulta);
       return mapping.findForward("success");
    }
    else{
       return mapping.findForward("failure");
    }
    }
    catch(Exception e)
    {
      e.printStackTrace();
      return (mapping.findForward("failure"));
    }
    finally
    {
    conn.closeConnection();	
    }
  }
}