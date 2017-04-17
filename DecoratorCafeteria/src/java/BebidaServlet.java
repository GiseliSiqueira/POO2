
import cafeteria.dominio.Bebida;
import cafeteria.dominio.Capuccino;
import cafeteria.dominio.Expresso;
import cafeteria.dominio.adicionais.Chocolate;
import cafeteria.dominio.adicionais.Creme;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BebidaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {

            Bebida bebida = null;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Cafeteria</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Café selecionado!</h1>");

            String tipo_bebida = request.getParameter("tipo_bebida");
            if (tipo_bebida.equalsIgnoreCase("Expresso")) {
                bebida = new Expresso();
            } else if (tipo_bebida.equalsIgnoreCase("Capuccino")) {
                bebida = new Capuccino();
            }

            if (request.getParameterMap() != null) {
                if (request.getParameterMap().containsKey("Creme")) {
                    bebida = new Creme(bebida);
                }
                if (request.getParameterMap().containsKey("Chocolate")) {
                    bebida = new Chocolate(bebida);
                }
            }

            out.println("Custo Total " + bebida.cost());
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Bebida Servlet";
    }

}
