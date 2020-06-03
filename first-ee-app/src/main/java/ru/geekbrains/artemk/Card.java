package ru.geekbrains.artemk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Card", urlPatterns = "card")
public class Card extends HttpServlet {
    private Logger logger = LoggerFactory.getLogger(Card.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Get request card");

        resp.getWriter().println("Карта:");
        resp.getWriter().println("<h1>new request GET to card</h1>");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Get request card");

        resp.getWriter().println("Карта:");
        resp.getWriter().println("<h1>new request GET to card</h1>");
    }
}
