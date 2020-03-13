package com.oc.servlets;

import com.oc.dao.UserDao;
import com.oc.model.User;
import com.oc.service.RegistrationForm;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ToposCheck")
public class ToposCheck extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
////        UserDao userDao = context.getBean(UserDao.class);
////
////        RegistrationForm registrationForm = new RegistrationForm();
////        User user = registrationForm.createUser(request);
////        userDao.save(user);
//        context.close();
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/view/toposCheck.jsp").forward(request,response);
    }
}
