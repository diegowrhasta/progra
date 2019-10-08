package mypackage1;

public class ClassDep 
{
  String codigo;
  String descr;

  public ClassDep()
  {
    
  }
  public ClassDep(String codigo, String descr)
  {   
    this.codigo = codigo;
    this.descr = descr;
  }

  public String getCodigo()
  {
    return codigo;
  }

  public void setCodigo(String newCodigo)
  {
    codigo = newCodigo;
  }

  public String getDescr()
  {
    return descr;
  }

  public void setDescr(String newDescr)
  {
    descr = newDescr;
  }
}