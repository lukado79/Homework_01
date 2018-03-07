
package pl.coderslab.collection;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_01")
public class Servlet_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		File file = new File("/home/lukado/workspace/Homework_01/oop.txt");
		Scanner scan = new Scanner(file);
		 response.setContentType("text/html");
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			response.getWriter().append("<h5>" + line + "</h5><br>");
		}

	}

}
