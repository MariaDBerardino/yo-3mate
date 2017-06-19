/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
ASINCRONO = {};
ASINCRONO.consultar = function(laurl) {

    //AJAX
    var xhr = new XMLHttpRequest();
    xhr.open("GET", laurl);
    xhr.onreadystatechange = function () {
        if( xhr.readyState === 4 ){
            if( xhr.status === 200 ){
                //alert( xhr.responseText );
                var panelito = document.querySelector("#users");
                panelito.innerHTML = xhr.responseText;
             /// PANEL_MENSAJES
        }else{
            var panelito = document.querySelector("#users");
            panelito.innerHTML = "Error" ; 
                }
            }
        };


        xhr.send();
 };
//alert("Funciona el javascript para ajax");
ASINCRONO.borrar = function () {
        var panelito = document.querySelector("#resul");
            panelito.innerHTML = "Borrado" ; 
};
ASINCRONO.division = function(laurl) {

    //AJAX
    var xhr = new XMLHttpRequest();
    xhr.open("GET", laurl);
    xhr.onreadystatechange = function () {
        if( xhr.readyState === 4 ){
            if( xhr.status === 200 ){
                //alert( xhr.responseText );
                var panelito = document.querySelector("#resul");
                panelito.innerHTML = xhr.responseText;
             /// PANEL_MENSAJES
        }else{
            var panelito = document.querySelector("#resul");
            panelito.innerHTML = "Error" ; 
                }
            }
        };


        xhr.send();
 };