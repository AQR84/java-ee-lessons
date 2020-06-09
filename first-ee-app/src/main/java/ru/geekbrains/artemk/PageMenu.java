package ru.geekbrains.artemk;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PageMenu", urlPatterns = "/pagemenu")
public class PageMenu extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(new StringBuilder().append("<a href=\"").append(req.getContextPath()).append("/mainpage\">Главная страница</a>").toString());
        resp.getWriter().println(new StringBuilder().append("<a href=\"").append(req.getContextPath()).append("/catalog\">Каталог</a>").toString());
        resp.getWriter().println(new StringBuilder().append("<a href=\"").append(req.getContextPath()).append("/order\">Заказ</a>").toString());
        resp.getWriter().println(new StringBuilder().append("<a href=\"").append(req.getContextPath()).append("/card\">Карта</a>").toString());
        resp.getWriter().println(new StringBuilder().append("<a href=\"").append(req.getContextPath()).append("/product\">Товар</a>").toString());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
