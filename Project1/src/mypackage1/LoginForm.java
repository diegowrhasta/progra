package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class LoginForm extends ActionForm 
{
  String password;
  String userid;

  /**
   * Reset all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   */
  public void reset(ActionMapping mapping, HttpServletRequest request)
  {
    super.reset(mapping, request);
  }

  /**
   * Validate all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   * @return ActionErrors A list of all errors found.
   */
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
{
ActionErrors errors = new ActionErrors();
if ((userid == null) || (userid.length() < 1))
errors.add("userid", new ActionError("error.userid.required"));
if ((password == null) || (password.length() < 1))
errors.add("password", new ActionError("error.password.required")); 
return errors;
}


  public String getPassword()
  {
    return password;
  }

  public void setPassword(String newPassword)
  {
    password = newPassword;
  }

  public String getUserid()
  {
    return userid;
  }

  public void setUserid(String newUserid)
  {
    userid = newUserid;
  }
}