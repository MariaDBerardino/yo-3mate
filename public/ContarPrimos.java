/**
 *
 * @author marilu
 */

package appsServlets;

import java.io.IOException;
import static java.lang.Math.abs;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ContarPrimos", urlPatterns = {"/ContarPrimos"})
public class ContarPrimos extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
      /* AQUI EMPIEZA MI CODIGO JAVA */      
      
            String elnro = request.getParameter("nro");
            String respuesta ;

            long nrohasta;   int esprimo = 1;             
            long redondeo; long resto; double modulo; 
            double raiz; long cantidad = 3; long raizEnt ; long j;
        
            respuesta = "primo: 2" + "<br>" + "primo: 3" + "<br>" + "primo: 7" + "<br>"   ;
            nrohasta =  Long.parseLong(elnro);
            modulo = abs(nrohasta);        
        
        for (long desde = 9; desde <= modulo; desde ++ ){
            raiz = Math.sqrt(desde);
            raizEnt =  Math.round(raiz); 
            j=3;
            resto = desde % 2;
            
            if ( resto == 0 ) {
                    esprimo = 0 ; 
                } else {
               
 
            }    
            while ( resto != 0 && j <= raizEnt) {

                resto = desde % j;
                if ( resto == 0 ) {
                        esprimo = 0 ; } 
                j += 1;
            }
            if ( esprimo == 1 ) {
                cantidad += 1 ;
                respuesta += "primo: " + desde + "<br>";
                }else{
                esprimo = 1; }                
            }

            respuesta += "<br>" + " total de primos hasta el numero   " + nrohasta + ": <br>" + cantidad + "<br>" + "<br>"+ "<br>"+ "<br>" ;
            response.getWriter().print(respuesta);        
        
    }


   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    }

 


}
