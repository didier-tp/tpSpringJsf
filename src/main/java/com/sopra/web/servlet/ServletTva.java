package com.sopra.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sopra.web.data.CalculTva;

/**
 * Servlet implementation class ServletTva
 */
@WebServlet("/ServletTva")
public class ServletTva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTva() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sHt = request.getParameter("ht");
		String sTaux = request.getParameter("taux");
		double ht=Double.parseDouble(sHt);
		double taux=Double.parseDouble(sTaux);
		CalculTva calculTvaObj= new CalculTva();
		calculTvaObj.setHt(ht);
		calculTvaObj.setTaux(taux);
		calculTvaObj.setTva(ht * taux / 100);
		calculTvaObj.setTtc(ht+calculTvaObj.getTva());
		//création de l'objet de redirection:
		RequestDispatcher rd = this.getServletContext()
				.getRequestDispatcher("/" + "affTva.jsp");
		//stocker dans request un access à calculTva
		//ulterieurement accessible dans page jsp:
		request.setAttribute("calculTva", calculTvaObj);
		//ou bien
		// HttpSession session = request.getSession();
		// session.setAttribute("calculTva", calculTvaObj);
		
		//redirection (coté serveur) du servlet vers page jsp:
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
