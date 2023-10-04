package com.example.studentcreate;

import java.io.PrintWriter;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/admission")
public class AdmissionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set the content type and get a PrintWriter
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve student admission information from request parameters
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");
        String program = request.getParameter("program");
        String department = request.getParameter("department");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String password = request.getParameter("password");

        // Display the preview of entered information
        out.println("<html><head><title>Admission Preview</title></head><body>");
        out.println("<h1>Admission Preview</h1>");
        out.println("<p>First Name: " + firstName + "</p>");
        out.println("<p>Last Name: " + lastName + "</p>");
        out.println("<p>Age: " + age + "</p>");
        out.println("<p>Program: " + program + "</p>");
        out.println("<p>Department: " + department + "</p>");
        out.println("<p>Phone Number: " + phoneNumber + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Gender: " + gender + "</p>");
        out.println("<p>Address: " + address + "</p>");
        out.println("<p>Password: "+ password +"</p>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Forward the POST request to the doGet method for processing
        doGet(request, response);
    }
}
