package ru.geekbrains.artemk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Page404_403", urlPatterns = "Page404_403")
public class Page404_403 extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(Page404_403.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Get request 404");

        resp.getWriter().println("Error : 404");
        resp.getWriter().println("<h1>new request GET to 404</h1>");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Get request 404");

        resp.getWriter().println("Error: 404");
        resp.getWriter().println("<h1>new request GET to 403</h1>");
    }
}
