package com.oc.servlets;

//import com.oc.bean.BeanException;
//import com.oc.bean.User;
//import com.oc.dao.DaoException;
//import com.oc.dao.DaoFactory;
//import com.oc.dao.UserDao;
//import com.oc.service.RegistrationForm;

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

@WebServlet("/RegisterCheck")
public class RegisterCheck extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao;
//
//    public void init() throws ServletException{
//        DaoFactory daoFactory = DaoFactory.getInstance();
//        this.userDao = daoFactory.getUserDao();
//    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        UserDao userDao = context.getBean(UserDao.class);
        User user = new User();

        user.setPseudo(request.getParameter("pseudo"));
        user.setPassword(request.getParameter("password"));

        user.setName(request.getParameter("name"));
        user.setFirstname(request.getParameter("firstname"));
        user.setSex(Boolean.parseBoolean(request.getParameter("sex")));
        user.setAddress(request.getParameter("address"));

        user.setZip(Integer.parseInt(request.getParameter("ZIP")));
        user.setMail(request.getParameter("mail"));
        user.setPhone(Integer.parseInt(request.getParameter("phone")));

        userDao.save(user);
        context.close();
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/view/registerCheck.jsp").forward(request,response);
    }
}
