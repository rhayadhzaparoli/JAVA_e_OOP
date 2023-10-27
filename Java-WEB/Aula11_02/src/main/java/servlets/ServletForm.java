package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletForm
 */
@WebServlet("/Form")
public class ServletForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		// configura padrao do tipo de resposta
		response.setContentType("text/html; charset=UTF-8");
		
		// dentro do try monta o html
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE HTML>");
			out.println("<html>");
			out.println("<head><title>FORM HTML com Servlet</title></head>");
			out.println("<body>");
			out.println("<h2>FORM para receber dados do usuario</h2>");


			//criacao do form
			out.println("<form action='' method='get'>");
			out.println("<label for='nome'>Nome:</label>");
			out.println("<input type='text' id='nome' name='txtNome' required><br>");
			out.println("<label for='email'>Email:</label>");
			out.println("<input type='email' id='email' name='txtEmail' required><br>");
			out.println("<input type='submit' value='Enviar Dados'>");
			out.println("</form>");
			
			// parametro para recuperacao do 'name'
			String nome = request.getParameter("txtNome");
			String email = request.getParameter("txtEmail");
			
			// exibicao deles/dados
			out.println(String.format("<h3> Olá, %s</3>", nome));
			out.println(String.format("<h3> seu email é %s</3>", email));
			
			out.println("</body>");
			out.println("</html>");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
