package mypackage2;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class EnntradaForma extends ActionForm 
{
  String clave;
  String idusuario;

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
if ((idusuario == null) || (idusuario.length() < 1))
errors.add("idusuario", new ActionError("error.idusuario.required"));
if ((clave == null) || (clave.length() < 1))
errors.add("clave", new ActionError("error.clave.required")); 
return errors;
}


  public String getClave()
  {
    return clave;
  }

  public void setClave(String newClave)
  {
    clave = newClave;
  }

  public String getIdusuario()
  {
    return idusuario;
  }

  public void setIdusuario(String newIdusuario)
  {
    idusuario = newIdusuario;
  }
}