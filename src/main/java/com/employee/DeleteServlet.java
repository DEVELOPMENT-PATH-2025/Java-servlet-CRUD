package com.employee;

import java.io.IOException;
import jakarta.servlet.ServletException;
import  jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")

public class DeleteServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String sid = req.getParameter("id");
        int id = Integer.parseInt(sid);
        EmployeeDAO.delete(id);
        res.sendRedirect("ViewServlet");
    }
}