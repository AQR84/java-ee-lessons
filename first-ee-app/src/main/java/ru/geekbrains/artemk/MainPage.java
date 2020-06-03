package ru.geekbrains.artemk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MainPage", urlPatterns = "/mainpage")
public class MainPage extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(MainPage.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Get request main page");

        resp.getWriter().println("Главная страница:");
        resp.getWriter().println("<h1>new request GET to main page</h1>");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Get request main page");

        resp.getWriter().println("Главная страница:");
        resp.getWriter().println("<h1>new request GET to main page</h1>");
    }
}
