function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.cod.value ))
    Mensaje = Mensaje + 'Verifique el C�digo \n';
  if(EsVacio( f.descripcion.value ))
    Mensaje = Mensaje + 'Verifique la Descripci�n \n';
  if(EsVacio( f.region.value ))
    Mensaje = Mensaje + 'Verifique la Regi�n \n';

  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}
