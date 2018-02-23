package pl.coderslab.collection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_04")
public class Servlet_04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		int number;
		for (int i = 0; i < 10; i++) {
			number = random.nextInt(100);
			list.add(number);
		}
		response.getWriter().append("<h1>Lista</h1>" + "<br>");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer num = it.next();
			response.getWriter().println(num+"<br>");
		}
		response.getWriter().append("<h1>Posortowana lista</h1>" + "<br>");
		Collections.sort(list);
		it = list.iterator();
		while (it.hasNext()) {
			Integer num2 = it.next();
			response.getWriter().println(num2 + "<br>");
		}
		

	}

}
