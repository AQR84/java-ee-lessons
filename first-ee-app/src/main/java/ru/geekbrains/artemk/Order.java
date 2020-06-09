package ru.geekbrains.artemk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Order", urlPatterns = "/order")
public class Order extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(Order.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Get request order");
        getServletContext().getRequestDispatcher("/pagemenu").include(req, resp);

        resp.getWriter().println("<br><br>Заказ:<br>");
        resp.getWriter().println("<h1>new request GET to order</h1>");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
