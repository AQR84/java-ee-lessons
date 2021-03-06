package ru.geekbrains.artemk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.soap.Name;
import java.io.IOException;

@WebServlet(name = "Product", urlPatterns = "/product")
public class Product extends HttpServlet {
    private Logger logger = LoggerFactory.getLogger(Product.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Get request product");

        resp.getWriter().println("Продукт:");
        resp.getWriter().println("<h1>new request GET to product</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Get request product");

        resp.getWriter().println("Продукт:");
        resp.getWriter().println("<h1>new request GET to product</h1>");
    }
}
