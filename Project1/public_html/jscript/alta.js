function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.cod.value ))
    Mensaje = Mensaje + 'Verifique el Código \n';
  if(EsVacio( f.descripcion.value ))
    Mensaje = Mensaje + 'Verifique la Descripción \n';
  if(EsVacio( f.region.value ))
    Mensaje = Mensaje + 'Verifique la Región \n';

  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}
