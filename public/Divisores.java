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


@WebServlet(name = "Divisores", urlPatterns = {"Divisores"})
public class Divisores extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String elnro = request.getParameter("nro");
            String respuesta ;
            
            long redondeo; long resto; double modulo;
            double raiz; long primo; long neg; int esprimo;
        
 /* AQUI EMPIEZA MI CODIGO JAVA */   
 
        primo =  Long.parseLong(elnro) ;
        modulo = abs(primo);
        raiz = Math.sqrt(modulo);
        redondeo =  Math.round(raiz) + 1;
        resto = primo % 2;
        esprimo=1;
        
        respuesta =  "     Divisores de " + primo + "<br>" + "<br>";        
        
        if ( resto == 0 ) 
            {
                for (int j = 2 ; j <= redondeo ; j = j + 1 ) 
                       {
                        resto = primo % j ;
                        if ( resto == 0 ) 
                            {
                                neg = (-1) * j ;
                                respuesta += ( "           " + j + ";  " + primo/j +
                                   "; " + neg + "; " + primo/neg + "; " +  "<br> ");
                                esprimo=0;
                            }
                 }  
            }
             else 
                 {
                  for (int j = 3 ; j <= redondeo ; j = j + 2 ) 
                       {
                        resto = primo % j ;
                        if ( resto == 0 ) 
                            {
                                neg = -1 * j;
                                respuesta += "           " + j + ";  " + primo/j +
                                   "; " + neg + "; " + primo/neg + "; " +  "<br> ";
                                esprimo=0;
                            }
                        }  
                 }
            if (esprimo == 1) {    
                respuesta +=  "<br> " + primo + "  es primo  ";
            }       
            response.getWriter().print(respuesta);
    }

        
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


    }

}
