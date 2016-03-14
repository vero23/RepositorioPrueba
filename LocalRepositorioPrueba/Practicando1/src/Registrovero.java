

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registrovero
 */
@WebServlet("/Registrovero")
public class Registrovero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrovero() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String correo= request.getParameter("txtcorreo");
		String clave= request.getParameter("txtclave");
		String sexo= request.getParameter("rdsexo");
		String carrera= request.getParameter("carrera");
		String intereses[]= request.getParameterValues("chintereses");
		String leng= request.getParameter("lenguajes");
		String mensaje= request.getParameter("txamensaje");
		
		//imprimir en el mismo servlet
		PrintWriter out= response.getWriter();
		out.print("<p>Correo: "+correo+"</p>");
		out.print("<p>Clave: "+clave+"</p>");
		out.print("<p>Sexo: "+sexo+"</p>");
		out.print("<p>Carrera: "+carrera+"</p>");
		
		for (int i = 0; i < intereses.length; i++) {
			out.print("<p>Interes "+(i+1) +": "+intereses[i]+"</p>");
		}
		
		out.print("<p>Lenguaje: "+leng+"</p>");
		out.print("<p>Su mensaje es: "+mensaje+"</p>");
		
	}

}
