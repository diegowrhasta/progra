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
import java.util.ArrayList;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import oracle.jdbc.*;
import java.util.*;

public class SuccessAction extends Action 
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
    SuccessActionForm menu = (SuccessActionForm) form;
    String opcion = menu.getBoton();
    if(opcion.equals("ALTA"))
    {
          Connection cn = null;
          ConnectDB conn = new ConnectDB();
          ResultSet rsConsulta = null;
          try
          {
            cn = conn.conexion;
            String cadena = "select * from s_REGION order by 1";
            rsConsulta = conn.getData(cadena);
            ArrayList items = new ArrayList();
            while (rsConsulta.next())
            {
              ClassDep item = new ClassDep();
              item.setCodigo(rsConsulta.getString("id"));
              item.setDescr(rsConsulta.getString("name"));
              items.add(item);
              System.out.println("Paso ..");
          }  
          request.getSession().setAttribute("ayuda",items);
          return mapping.findForward("alta");
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
    if(opcion.equals("BAJA"))
    {
        Connection cn = null;
        ConnectDB conn = new ConnectDB();
        ResultSet rsConsulta = null;
        String cadena = "select id,name from s_dept order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        try
        {
          while (rsConsulta.next())
        {
          ClassDep item = new ClassDep();
          item.setCodigo(rsConsulta.getString("id"));
          items.add(item);
      }  
      BajaForm f = new BajaForm();
      f.setTabla(items);
      request.getSession().setAttribute("bajas",f);
      return mapping.findForward("baja");
        }
        catch(Exception e)
        {
          e.printStackTrace();
          return (mapping.findForward("failure"));
        }
    }
    else
    {
          Connection cn = null;
          ConnectDB conn = new ConnectDB();
          ResultSet rsConsulta = null;
          try
          {
            cn = conn.conexion;
            String cadena = "select id from s_dept order by 1";
            rsConsulta = conn.getData(cadena);
            ArrayList items = new ArrayList();
            while (rsConsulta.next())
            {
              ClassDep item = new ClassDep();
              item.setCodigo(rsConsulta.getString("id"));
              items.add(item);
              System.out.println("Paso ..");
          }  
          request.getSession().setAttribute("ayuda",items);
          return mapping.findForward("modificacion");
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
}