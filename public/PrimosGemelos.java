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


@WebServlet(name = "PrimosGemelos", urlPatterns = {"/PrimosGemelos"})
public class PrimosGemelos extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
  /* AQUI EMPIEZA MI CODIGO JAVA */ 
            String elnro = request.getParameter("nro");
            String respuesta ;

            long nrohasta;   int esprimo = 1;             
            long redondeo; long resto; double modulo; long dif; long parejas = 2;
            double raiz; long gemelo; long primoanterior = 7; long primonew;
        

    
        respuesta = " pareja: 2 y 3 ; " +  "<br> ";
        respuesta += " pareja: 5 y 7 ; " +  "<br> ";
        
        nrohasta=   Long.parseLong(elnro);
        modulo = abs(nrohasta);
        raiz = Math.sqrt(modulo);
        redondeo =  Math.round(raiz);        
        
        for (long desde = 9; desde <= nrohasta; desde ++ ){

            resto = desde % 2;
            if ( resto == 0 ) {
                        esprimo = 0 ; } 
            long j = 3 ;
                    
            while ( resto != 0 && j <= desde -1) {
                resto = desde % j ;
                if ( resto == 0 ) {
                        esprimo = 0 ; } 
                j += 1;
            }
            if ( esprimo == 1 ) {
                primonew = desde ;
                dif = primonew - primoanterior ;
                if ( dif == 2 ){
                    parejas += 1;
                    respuesta += "pareja: " + primoanterior + " y " + primonew + "; " + "<br> " ;

                        }else{ primoanterior = primonew ;}
                }else{
                esprimo = 1; }                
            }
       respuesta += "<br> " + "cantidad de parejas: " + parejas + "<br> "+ "<br> "+ "<br> "; 
       response.getWriter().print(respuesta);
        
                   
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

} 