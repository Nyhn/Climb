package com.oc.servlets;

//import com.oc.bean.BeanException;
//import com.oc.bean.User;
//import com.oc.dao.DaoException;
//import com.oc.dao.DaoFactory;
//import com.oc.dao.UserDao;
//import com.oc.service.ConnectionForm;
//import com.oc.service.RegistrationForm;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LogInCheck")
public class LogInCheck extends HttpServlet {
    private static final long serialVersionUID = 1L;
//    private UserDao userDao;
//
//    public void init() throws ServletException{
//        DaoFactory daoFactory = DaoFactory.getInstance();
//        this.userDao = daoFactory.getUserDao();
//    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        ConnectionForm connectionForm = new ConnectionForm();
//        User user = connectionForm.checkLogin(request);
//        request.setAttribute("user",user);
        this.getServletContext().getRequestDispatcher("/WEB-INF/view/logInCheck.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/view/registerCheck.jsp").forward(request,response);
    }
}
