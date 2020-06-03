package ru.geekbrains.artemk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="Catalog", urlPatterns = "/catalog")
public class Catalog extends HttpServlet {
    private Logger logger = LoggerFactory.getLogger(Catalog.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Get request catalog");

        resp.getWriter().println("Каталог товаров:");
        resp.getWriter().println("<h1>new request GET to catalog</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Post request catalog");

        resp.getWriter().println("Каталог товаров:");
        resp.getWriter().println("<h1>new request POST to catalog</h1>");
    }
}
