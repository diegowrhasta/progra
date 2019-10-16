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

public class update_dudeAction extends Action 
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
    update_dudeForm update_dudeForm = (update_dudeForm) form;
    String id = update_dudeForm.getId();
    String name = update_dudeForm.getName();
    String region_id = update_dudeForm.getRegion_id();
    System.out.println("id: "+id+" name: "+name+" region: "+region_id);
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    try
    { 
    String cadena = "update s_dept set name="+name+", region_id="+region_id+" where id="+id; 
    System.out.println(cadena);
         int a = conn.InsertaDatos(cadena);
         System.out.println("GOOD");
         return mapping.findForward("success");
	      }
	
        catch(Exception e)
       {
          e.printStackTrace();
          return (mapping.findForward("success"));
       }
       
    finally
    {
      conn.closeConnection();	
    }
  }
}