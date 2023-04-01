package org.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String name = req.getParameter("name");
        resp.getOutputStream().println(String.format("<h1>Hello %s</h1>", name));
        req.getServletContext().getRealPath("/hello");
        out.println(String.format("""
                   <form action="hello" mathod="POST">
                   <input type="text name="name">
                   <input type="submit">
                   </form>
                   """));
    }
}
