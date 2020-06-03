package ru.geekbrains.artemk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FirstPage", urlPatterns = "/first-ee-app/*")
public class FirstPage extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(FirstPage.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Get request firstpage");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Get request firstpage");

        if (resp.getStatus()==403||resp.getStatus()==404){
            resp.sendRedirect(req.getContextPath() + "/Page404_403");
        }
    }
}
