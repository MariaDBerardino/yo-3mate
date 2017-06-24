/**
 *
 * @author marilu
 */
package appsServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Siracusa", urlPatterns = {"Siracusa"})
public class Siracusa extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            /* AQUI EMPIEZA MI CODIGO JAVA */   
            
            long resto; long n; long x; long contador = 0;
            String  respuesta;             
            String elnro = request.getParameter("nro");
            
            n = Long.parseLong(elnro);
            x = n;
            respuesta=elnro + "; ";
            
            while (x > 1) {
                resto = x % 2 ;
                if (resto == 0){
                x = x/2 ;} else {
                x = 3*x + 1;}
                
                contador += 1;
                respuesta += " " + x + " ; ";
            }
           
            response.getWriter().print("Serie: " + "<br>" + respuesta + "<br>" + "<br>" + "n terminos: " +  contador );
            
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
