
ASINCRONO = {};

 /*--------------------------------------------------------------------------------*/
 
 ASINCRONO.cargarAJAX = function(laurl) {

    //AJAX
    var xhr = new XMLHttpRequest();
    xhr.open("GET", laurl);
    xhr.onreadystatechange = function () {
        if( xhr.readyState === 4 ){
            if( xhr.status === 200 ){
           
                var panelito = document.querySelector("#resulAJAX");
                panelito.innerHTML = xhr.responseText;
             /// PANEL_MENSAJES
        }else{
            var panelito = document.querySelector("#resulAJAX");
            panelito.innerHTML = "Error cargarAJAX()" + xhr.status + '<br/>'; 
                }
            }
        };


        xhr.send();
 };
/*--------------------------------------------------------------------------------*/

ASINCRONO.consultar = function(laurl) {

    //AJAX
    var xhr = new XMLHttpRequest();
    xhr.open("GET", laurl);
    xhr.onreadystatechange = function () {
        if( xhr.readyState === 4 ){
            if( xhr.status === 200 ){
           
                var panelito = document.querySelector("#users");
                panelito.innerHTML = xhr.responseText;
             /// PANEL_MENSAJES
        }else{
            var panelito = document.querySelector("#users");
            panelito.innerHTML = "Error consultar()" + xhr.status + '<br/>'; 
                }
            }
        };


        xhr.send();
 };
 /*--------------------------------------------------------------------------------*/

 ASINCRONO.enviar = function(){
    
    var parametro_nombre = document.querySelector('#txtNombre').value;
    var parametro_apellido = document.querySelector('#txtApellido').value;
    
    var xhr = new XMLHttpRequest();           /* instancio la clase XMLHttpRequest que verifica las reglas del estandar 
                                                 construyo el Objeto Ajax */
    
    xhr.open('GET','UsuarioServer?&nombre='+ parametro_nombre + '&apellido=' + parametro_apellido );   /* método GET para hacer una consulta */
    xhr.onreadystatechange = function () {    /* el estado cambia por 1 2 3 o 4    */
        if( xhr.readyState === 4 ){           /* si termino la transferencia */
            if( xhr.status === 200 ){         /* RFC 2616 code standard, si terminó OK o no */

                var panelito = document.querySelector("#panel_salida");      /* creo una variable para poner la respuesta en el Html */
                panelito.innerHTML = xhr.responseText;

        }else{
            var panelito = document.querySelector("#panel_salida");
            panelito.innerHTML = "Error enviar()" + xhr.status + '<br/>'; 
                }
            }
        };
        xhr.send();     /* es el que activa el envío AYAX */
 };
/*--------------------------------------------------------------------------------*/
ASINCRONO.borrar = function () {
        var panelito = document.querySelector("#panel_salida");
            panelito.innerHTML = "Borrado" ; 
};
/*--------------------------------------------------------------------------------*/
ASINCRONO.calcularDiv = function() {
    
    var parametro_numero = document.querySelector('#minumero').value;
    //AJAX
    var xhr = new XMLHttpRequest();
    xhr.open("GET", 'Divisores?&nro='+parametro_numero);
  

  
    xhr.onreadystatechange = function () {
        if( xhr.readyState === 4 ){
          
                /*     alert( "pasa por readystate: " );  */
          
            if( xhr.status === 200 ){

              
                var panelito = document.querySelector("#panel_salida");
                panelito.innerHTML = xhr.responseText;
             /// PANEL_MENSAJES
        }else{
            var panelito = document.querySelector("#panel_salida");
            panelito.innerHTML = "Error calcularDiv()" + xhr.status + '<br/>'; 
                }
            }
        };
        xhr.send();
 };
/*--------------------------------------------------------------------------------*/
ASINCRONO.buscarGem = function() {
    
    var parametro_numero = document.querySelector('#minumero').value;
    //AJAX
    var xhr = new XMLHttpRequest();
    xhr.open("GET", 'PrimosGemelos?&nro='+parametro_numero);
    xhr.onreadystatechange = function () {
        if( xhr.readyState === 4 ){
            if( xhr.status === 200 ){
                //alert( xhr.responseText );
                var panelito = document.querySelector("#panel_salida");
                panelito.innerHTML = xhr.responseText;
             /// PANEL_MENSAJES
        }else{
            var panelito = document.querySelector("#panel_salida");
            panelito.innerHTML = "Error buscarGem()" + xhr.status + '<br/>'; 
                }
            }
        };
        xhr.send();
 };
/*--------------------------------------------------------------------------------*/
ASINCRONO.contarPrim = function() {
    
    var parametro_numero = document.querySelector('#minumero').value;
    //AJAX
    var xhr = new XMLHttpRequest();
    xhr.open("GET", 'ContarPrimos?&nro='+parametro_numero);
    xhr.onreadystatechange = function () {
        if( xhr.readyState === 4 ){
            if( xhr.status === 200 ){
                //alert( xhr.responseText );
                var panelito = document.querySelector("#panel_salida");
                panelito.innerHTML = xhr.responseText;
             /// PANEL_MENSAJES
        }else{
            var panelito = document.querySelector("#panel_salida");
            panelito.innerHTML = "Error contarPrim()" + xhr.status + '<br/>'; 
                }
            }
        };
        xhr.send();
 };
/*--------------------------------------------------------------------------------*/
ASINCRONO.conjeturaSirac = function() {
    
    var parametro_numero = document.querySelector('#minumero').value;
    //AJAX
    var xhr = new XMLHttpRequest();
    xhr.open("GET", 'Siracusa?&nro='+parametro_numero);
  
    xhr.onreadystatechange = function () {
        if( xhr.readyState === 4 ){
            if( xhr.status === 200 ){
                //alert( xhr.responseText );
                var panelito = document.querySelector("#panel_salida");

                panelito.innerHTML = xhr.responseText;
             /// PANEL_MENSAJES
        }else{
            var panelito = document.querySelector("#panel_salida");
            panelito.innerHTML = "Error conjeturaSirac()" + xhr.status + '<br/>'; 
                }
            }
        };
        xhr.send();
 };
/*--------------------------------------------------------------------------------*/
