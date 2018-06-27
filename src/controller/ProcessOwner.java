package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Certification;
import entity.Education;
import entity.Owner;

/**
 * Servlet implementation class ProcessOwner
 */
@WebServlet("/ProcessOwner")
public class ProcessOwner extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessOwner() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String bio = request.getParameter("bio");
		String email = request.getParameter("email");
		
		String inst_name = request.getParameter("inst_name");
		String year_of_passing = request.getParameter("yop");
		Integer yop = null, cert_year = null;
		
		Education educationdetails = null;
		Certification certdetails = null;		
		
		Owner owner = new Owner();
		owner.setOwnerName(name);
		owner.setOwneremail(email);
		owner.setOwnerBio(bio);
		
		if(!(year_of_passing == "" || year_of_passing == null)) {
			yop = Integer.parseInt(year_of_passing);
			educationdetails = new Education(inst_name, yop);
			owner.setOwnerEducation(educationdetails);
		}
		
		String cert_name = request.getParameter("cert_name");
		String cert_provider = request.getParameter("cert_provider");
		String cert_url = request.getParameter("cert_url");
		String certification_year = request.getParameter("cert_year");
		
		if(!(certification_year == "" || certification_year == null)) {
			cert_year = Integer.parseInt(certification_year);
			certdetails = new Certification(cert_url, cert_name, cert_provider, cert_year);
			owner.setOwnerCertifications(certdetails);
		}
		
		System.out.println("User details from post: Name = " + name);
		System.out.println("Bio = " + bio);
		System.out.println("Email = " + email);
		
		PrintWriter out = response.getWriter();
		out.println("<a href='Login.html'>Logout</a><br><h4> Welcome "+owner.getOwnerName()+"!</h4><hr><br>");
		out.print(owner);
		
	}

}
